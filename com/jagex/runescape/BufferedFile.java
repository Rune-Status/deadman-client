package com.jagex.runescape;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public final class BufferedFile {

  public static GameString COMMAND_FPS_OFF = GameString.create("::fpsoff");
  public static GameString CHALLENGE_REQ = GameString.create(":chalreq:");
  public static int[] anIntArray574 = new int[14];
  public static GameString aClass94_577 = GameString.create("http:)4)4");
  public static float ambientIntensity;
  public static boolean aBoolean579;
  private long aLong563;
  private final byte[] aByteArray564;
  private int anInt566;
  private long aLong568;
  private long aLong569;
  private long aLong570;
  private long aLong571 = -1L;
  private final byte[] aByteArray572;
  private final FileOnDisk aClass122_573;
  private int anInt575;
  private long aLong576 = -1L;


  public BufferedFile(FileOnDisk var1, int var2, int var3 ) throws IOException {
    try {
      this.aClass122_573 = var1;
      this.aLong568 = this.aLong563 = var1.length(-1);
      this.aByteArray572 = new byte[var3];
      this.aByteArray564 = new byte[var2];
      this.aLong569 = 0L;
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "en.<init>(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
    }
  }

  private void method975(byte var1) throws IOException {
    try {
      int var2 = 56 % ((45 - var1) / 44);
      if (-1L != this.aLong571) {
        if (this.aLong571 != this.aLong570) {
          this.aClass122_573.method1737((byte) -10, this.aLong571);
          this.aLong570 = this.aLong571;
        }

        this.aClass122_573.method1738(127, this.aByteArray572, this.anInt566, 0);
        long var3 = -1L;
        if (~this.aLong576 >= ~this.aLong571
          && ~(this.aLong576 + this.anInt575) < ~this.aLong571) {
          var3 = this.aLong571;
        } else if (this.aLong571 <= this.aLong576 && ~this.aLong576 > ~(
            this.aLong571
          - -this.anInt566)) {
          var3 = this.aLong576;
        }

        this.aLong570 += this.anInt566;
        if (this.aLong563 < this.aLong570) {
          this.aLong563 = this.aLong570;
        }

        long var5 = -1L;
        if (this.aLong576 < this.aLong571 - -this.anInt566
          && this.anInt575 + this.aLong576
            >= this.anInt566 + this.aLong571) {
          var5 = this.aLong571 - -this.anInt566;
        } else if (~(this.aLong576 - -this.anInt575) < ~this.aLong571
          && this.anInt566 + this.aLong571
            >= this.anInt575 + this.aLong576) {
          var5 = this.anInt575 + this.aLong576;
        }

        if (-1L < var3 && ~var5 < ~var3) {
          int var7 = (int) (-var3 + var5);
          ArrayUtils.copy(this.aByteArray572, (int) (var3 - this.aLong571),
              this.aByteArray564,
            (int) (var3 + -this.aLong576), var7);
        }

        this.anInt566 = 0;
        this.aLong571 = -1L;
      }

    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8, "en.C(" + var1 + ')');
    }
  }

  public long method976(int var1 ) {
    try {
      if (var1 != 0) {
        this.method976(19);
      }

      return this.aLong568;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "en.J(" + var1 + ')');
    }
  }

  private File method977(int var1) {
    try {
      if (var1 != 281669816) {
        BufferedFile.method974(true);
      }

      return this.aClass122_573.method1742(-83);
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "en.D(" + var1 + ')');
    }
  }

  public void method978(int var1, byte[] var2,int var3, int var4 )
      throws IOException {
    try {
      try {
        if (var1 - -var3 > var2.length) {
          throw new ArrayIndexOutOfBoundsException(var3 + var1 - var2.length);
        }

        if (-1L != this.aLong571 && this.aLong569 >= this.aLong571
          && this.anInt566 + this.aLong571
            >= var3 + this.aLong569) {
          ArrayUtils.copy(
              this.aByteArray572, (int) (-this.aLong571 + this.aLong569), var2, var1,
            var3);
          this.aLong569 += var3;
          return;
        }

        long var5 = this.aLong569;
        int var8 = var3;
        int var9;
        if (this.aLong576 <= this.aLong569
          && this.aLong576 + this.anInt575 > this.aLong569) {
          var9 = (int) (this.anInt575 - this.aLong569 + this.aLong576);
          if (~var9 < ~var3) {
            var9 = var3;
          }

          ArrayUtils.copy(
              this.aByteArray564, (int) (this.aLong569 - this.aLong576), var2, var1,
            var9);
          var1 += var9;
          var3 -= var9;
          this.aLong569 += var9;
        }

        if (~this.aByteArray564.length > ~var3) {
          this.aClass122_573.method1737((byte) -10, this.aLong569);

          for (this.aLong570 = this.aLong569; 0 < var3; this.aLong569 += var9) {
            var9 = this.aClass122_573.method1739(var1, 0, var3, var2);
            if (0 == ~var9) {
              break;
            }

            this.aLong570 += var9;
            var3 -= var9;
            var1 += var9;
          }
        } else if (~var3 < -1) {
          this.method981(4393);
          var9 = var3;
          if (var3 > this.anInt575) {
            var9 = this.anInt575;
          }

          ArrayUtils.copy(this.aByteArray564, 0, var2, var1, var9);
          var3 -= var9;
          var1 += var9;
          this.aLong569 += var9;
        }

        if (-1L != this.aLong571) {
          if (this.aLong569 < this.aLong571 && ~var3 < -1) {
            var9 = (int) (-this.aLong569 + this.aLong571) + var1;
            if (~(var1 - -var3) > ~var9) {
              var9 = var1 + var3;
            }

            while (var1 < var9) {
              var2[var1++] = 0;
              ++this.aLong569;
              --var3;
            }
          }

          long var16 = -1L;
          long var11 = -1L;
          if (this.anInt566 + this.aLong571 > var5
            && var8 + var5 >= this.anInt566 + this.aLong571) {
            var11 = this.anInt566 + this.aLong571;
          } else if (~this.aLong571 > ~(var8 + var5)
            && ~(this.anInt566 + this.aLong571) <= ~(var8 + var5)) {
            var11 = var8 + var5;
          }

          if (~var5 >= ~this.aLong571
              && ~(var5 - -var8) < ~this.aLong571) {
            var16 = this.aLong571;
          } else if (~var5 <= ~this.aLong571
              && var5 < this.anInt566 + this.aLong571) {
            var16 = var5;
          }

          if (-1L < var16 && var11 > var16) {
            int var13 = (int) (var11 + -var16);
            ArrayUtils.copy(this.aByteArray572, (int) (var16 + -this.aLong571), var2,
              (int) (var16 + -var5) + var1, var13);
            if (this.aLong569 < var11) {
              var3 = (int) (var3 - (-this.aLong569 + var11));
              this.aLong569 = var11;
            }
          }
        }
      } catch (IOException var14) {
        this.aLong570 = -1L;
        throw var14;
      }

      if (var4 < var3) {
        throw new EOFException();
      }
    } catch (RuntimeException var15) {
      throw AbstractGameWorld.cascadeException(var15,
        "en.F(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
    }
  }

  public void close(boolean var1 ) throws IOException {
    try {
      this.method975((byte) -75);
      this.aClass122_573.close(1);
      if (var1) {
        this.aLong569 = 91L;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "en.K(" + var1 + ')');
    }
  }

  private void method981(int var1) throws IOException {
    try {
      this.anInt575 = 0;
      if (var1 != 4393) {
        this.method976(-127);
      }

      if (this.aLong570 != this.aLong569) {
        this.aClass122_573.method1737((byte) -10, this.aLong569);
        this.aLong570 = this.aLong569;
      }

      int var3;
      for (
          this.aLong576 = this.aLong569;
          this.aByteArray564.length > this.anInt575; this.anInt575 += var3) {
        int var2 = this.aByteArray564.length + -this.anInt575;
        if (-200000001 > ~var2) {
          var2 = 200000000;
        }

        var3 = this.aClass122_573.method1739(this.anInt575, 0, var2,
            this.aByteArray564);
        if (0 == ~var3) {
          break;
        }

        this.aLong570 += var3;
      }

    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "en.A(" + var1 + ')');
    }
  }

  public void method982(boolean var1, byte[] var2 ) throws IOException {
    try {
      if (var1) {
        BufferedFile.method979(-72, 3, 3, (byte) -115);
      }

      this.method978(0, var2, var2.length, 0);
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "en.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
    }
  }

  public void write(byte[] var1,int var2, int var3,int var4 )
      throws IOException {
    try {
      try {
        if (~this.aLong568 > ~(var4 + this.aLong569)) {
          this.aLong568 = var4 + this.aLong569;
        }

        if (0L != ~this.aLong571 && (this.aLong571 > this.aLong569
            || ~this.aLong569
            < ~(
          this.anInt566 + this.aLong571))) {
          this.method975((byte) 124);
        }

        if (~this.aLong571 != 0L
          && this.aByteArray572.length + this.aLong571
            < var4 + this.aLong569) {
          int var5 = (int) (this.aByteArray572.length - this.aLong569
              + this.aLong571);
          var4 -= var5;
          ArrayUtils.copy(var1, var2,
              this.aByteArray572, (int) (this.aLong569 + -this.aLong571),
            var5);
          this.aLong569 += var5;
          this.anInt566 = this.aByteArray572.length;
          this.method975((byte) 93);
          var2 += var5;
        }

        if (~this.aByteArray572.length > ~var4) {
          if (~this.aLong569 != ~this.aLong570) {
            this.aClass122_573.method1737((byte) -10, this.aLong569);
            this.aLong570 = this.aLong569;
          }

          this.aClass122_573.method1738(111, var1, var4, var2);
          long var12 = -1L;
          if (this.aLong576 <= this.aLong569
            && ~(this.anInt575 + this.aLong576) < ~this.aLong569) {
            var12 = this.aLong569;
          } else if (~this.aLong569 >= ~this.aLong576
            && ~(var4 + this.aLong569) < ~this.aLong576) {
            var12 = this.aLong576;
          }

          this.aLong570 += var4;
          long var7 = -1L;
          if (this.aLong563 < this.aLong570) {
            this.aLong563 = this.aLong570;
          }

          if (this.aLong569 + var4 > this.aLong576
              && ~(this.aLong569 - -var4) >= ~(
              this.aLong576 - -this.anInt575)) {
            var7 = var4 + this.aLong569;
          } else if (~(this.aLong576 + this.anInt575) < ~this.aLong569
            && this.aLong569 + var4 >= this.anInt575
              + this.aLong576) {
            var7 = this.anInt575 + this.aLong576;
          }

          if (~var12 < 0L && var7 > var12) {
            int var9 = (int) (-var12 + var7);
            ArrayUtils.copy(var1, (int) (-this.aLong569 + var12 + var2),
                this.aByteArray564,
              (int) (-this.aLong576 + var12), var9);
          }

          this.aLong569 += var4;
          return;
        }

        if (0 < var4) {
          if (this.aLong571 == -1L) {
            this.aLong571 = this.aLong569;
          }

          ArrayUtils.copy(var1, var2,
              this.aByteArray572, (int) (this.aLong569 + -this.aLong571),
            var4);
          this.aLong569 += var4;
          if (~this.anInt566 > ~(-this.aLong571 + this.aLong569)) {
            this.anInt566 = (int) (-this.aLong571 + this.aLong569);
          }

          return;
        }
      } catch (IOException var10) {
        this.aLong570 = -1L;
        throw var10;
      }

      if (var3 != -903171152) {
        this.aLong563 = -28L;
      }

    } catch (RuntimeException var11) {
      throw AbstractGameWorld.cascadeException(var11,
        "en.H(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
    }
  }

  public void seek(int var1, long var2 ) throws IOException {
    try {
      if (var2 >= 0L) {
        this.aLong569 = var2;
        if (var1 > -6) {
          this.aLong569 = 89L;
        }

      } else {
        throw new IOException("Invalid seek to " + var2 + " in file " + this
            .method977(281669816));
      }
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5, "en.E(" + var1 + ',' + var2 + ')');
    }
  }

  public static void method974(boolean var0) {
    try {
      BufferedFile.aClass94_577 = null;
      if (var0) {
        BufferedFile.anIntArray574 = null;
        BufferedFile.CHALLENGE_REQ = null;
        BufferedFile.COMMAND_FPS_OFF = null;
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "en.G(" + var0 + ')');
    }
  }

  public static void method979(int var0, int var1, int var2, byte var3) {
    try {
      GameString var4 = RenderAnimation.concat(new GameString[] {
        PlayerAppearance.aClass94_853, SomethingScene.toString(var2), TextureSampler0.aClass94_3268,
        SomethingScene.toString(var0 >> 6), TextureSampler0.aClass94_3268,
        SomethingScene.toString(var1 >> 6), TextureSampler0.aClass94_3268,
        SomethingScene.toString(var0 & 63), TextureSampler0.aClass94_3268,
        SomethingScene.toString(63 & var1)
      });
      var4.method1549(false);
      if (var3 != -4) {
        BufferedFile.aClass94_577 = null;
      }

      FileCacheRequester.handleCommand(var4);
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "en.I(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

}