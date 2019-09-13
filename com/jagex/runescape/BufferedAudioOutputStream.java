package com.jagex.runescape;

import java.awt.Component;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public final class BufferedAudioOutputStream extends AbstractAudioOutputStream {

  private int bufferSize;
  private SourceDataLine sourceDataLine;
  private boolean soundMax;
  private AudioFormat audioFormat;
  private byte[] buffer;

  public void write() {
    try {
      Synthesizer synthesizer = MidiSystem.getSynthesizer();
      synthesizer.getLatency();
    } catch (MidiUnavailableException e) {
      e.printStackTrace();
    }
    int sampleLen = 256;
    if (GameString.stereo) {
      sampleLen <<= 1;
    }
    for (int i = 0; i < sampleLen; ++i) {
      int sample = this.samples[i];
      if ((sample + 0x800000 & 0xff000000) != 0) {
        sample = 0x7fffff ^ sample >> 31;
      }

      this.buffer[i * 2] = (byte) (sample >> 8);
      this.buffer[i * 2 + 1] = (byte) (sample >> 16);
    }

    this.sourceDataLine.write(this.buffer, 0, sampleLen << 1);
  }

  public void setBufferSize(int bufferSize)
      throws LineUnavailableException {
    try {
      javax.sound.sampled.DataLine.Info var2 =
          new javax.sound.sampled.DataLine.Info(SourceDataLine.class,
              this.audioFormat,
              bufferSize << (!GameString.stereo ? 1 : 2));
      this.sourceDataLine = (SourceDataLine) AudioSystem.getLine(var2);
      this.sourceDataLine.open();
      this.sourceDataLine.start();
      this.bufferSize = bufferSize;
    } catch (LineUnavailableException exception) {
      if (~AbstractMouseWheel.compact(bufferSize, -125) == -2) {
        this.sourceDataLine = null;
        throw exception;
      } else {
        this.setBufferSize(DummyClass53.nearestPo2((byte) 76, bufferSize));
      }
    }
  }

  public void flush() throws LineUnavailableException {
    this.sourceDataLine.flush();
    if (this.soundMax) {
      this.sourceDataLine.close();
      this.sourceDataLine = null;
      javax.sound.sampled.DataLine.Info var1 =
          new javax.sound.sampled.DataLine.Info(SourceDataLine.class,
              this.audioFormat,
              this.bufferSize << (!GameString.stereo ? 1 : 2));
      this.sourceDataLine = (SourceDataLine) AudioSystem.getLine(var1);
      this.sourceDataLine.open();
      this.sourceDataLine.start();
    }

  }

  public int getAmountBufferedSamples() {
    return this.bufferSize - (this.sourceDataLine.available() >> (!GameString.stereo ? 1
        : 2));
  }

  public void close() {
    if (null != this.sourceDataLine) {
      this.sourceDataLine.close();
      this.sourceDataLine = null;
    }
  }

  public void bind(Component var1) {
    Mixer.Info[] var2 = AudioSystem.getMixerInfo();
    if (null != var2) {
      Mixer.Info[] var3 = var2;

      for (int var4 = 0; ~var4 > ~var3.length; ++var4) {
        Mixer.Info var5 = var3[var4];
        if (null != var5) {
          String var6 = var5.getName();
          if (null != var6 && var6.toLowerCase().indexOf("soundmax") >= 0) {
            this.soundMax = true;
          }
        }
      }
    }

    this.audioFormat =
        new AudioFormat(DummyClass60.sampleRate, 16,
            !GameString.stereo ? 1 : 2, true, false);
    this.buffer = new byte[256 << (GameString.stereo ? 2 : 1)];
  }
}