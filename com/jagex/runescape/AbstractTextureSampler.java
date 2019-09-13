package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;
import java.awt.Graphics;

public abstract class AbstractTextureSampler extends Node {

  public static int anInt2378;
  public static AbstractFont aClass3_Sub28_Sub17_2379;
  public static GameString COMMAND_SHIFT_CLICK = GameString.create("::shiftclick");
  public static int anInt2383;
  public static int anInt2384;
  public static GameString COMMAND_REPLACE_CANVAS = GameString.create("::replacecanvas");
  public static int[] anIntArray2386 = {1, -1, -1, 1};
  public boolean monoChromatic;
  public TriChromaticImageCache triChromaticImageCache;
  public AbstractTextureSampler[] samplers;
  public int cacheSize;
  public MonoChromaticImageCache monoChromaticImageCache;


  public AbstractTextureSampler(int var1, boolean var2 ) {
    try {
      this.samplers = new AbstractTextureSampler[var1];
      this.monoChromatic = var2;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "j.<init>(" + var1 + ',' + var2 + ')');
    }
  }

  public final int[] method152(int var1, int var2, int var3) {
    try {
      if (var3 != 32755) {
        AbstractTextureSampler.anInt2383 = 121;
      }

      return this.samplers[var1].monoChromatic ?
          this.samplers[var1].method154(var2, (byte) -118) :
          this.samplers[var1].method166(-1, var2)[0];
    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "j.RA(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public int[] method154(int var1, byte var2 ) {
    try {
      throw new IllegalStateException("This operation does not have a monochrome output");
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "j.D(" + var1 + ',' + var2 + ')');
    }
  }

  public int method155(byte var1 ) {
    try {
      if (var1 != 19) {
        this.method152(-80, 116, -73);
      }

      return -1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "j.HA(" + var1 + ')');
    }
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    try {
      if (!var3) {
        this.samplers = null;
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "j.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
    }
  }

  public void method158(int var1 ) {
    try {
      if (var1 != 16251) {
        AbstractTextureSampler.anInt2378 = 12;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "j.P(" + var1 + ')');
    }
  }

  public int method159(int var1 ) {
    try {
      if (var1 != 4) {
        AbstractTextureSampler.drawLoadingBox(null, true);
      }

      return -1;
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "j.GA(" + var1 + ')');
    }
  }

  public final void method160(int var1, int var2, int var3) {
    try {
      if (var3 != 250) {
        this.monoChromaticImageCache = null;
      }

      int var4 = 255 == this.cacheSize ? var1 : this.cacheSize;
      if (this.monoChromatic) {
        this.monoChromaticImageCache = new MonoChromaticImageCache(var4, var1, var2);
      } else {
        this.triChromaticImageCache = new TriChromaticImageCache(var4, var1, var2);
      }

    } catch (RuntimeException var5) {
      throw AbstractGameWorld.cascadeException(var5,
        "j.SA(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public void method161(byte var1 ) {
    try {
      if (var1 != -45) {
        AbstractTextureSampler.anInt2383 = 16;
      }

      if (this.monoChromatic) {
        this.monoChromaticImageCache.method1706(1127165736);
        this.monoChromaticImageCache = null;
      } else {
        this.triChromaticImageCache.method1590((byte) -22);
        this.triChromaticImageCache = null;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "j.BA(" + var1 + ')');
    }
  }

  public final int[][] method162(int var1, int var2, byte var3) {
    try {
      if (var3 > -45) {
        return null;
      } else if (!this.samplers[var2].monoChromatic) {
        return this.samplers[var2].method166(-1, var1);
      } else {
        int[] var4 = this.samplers[var2].method154(var1, (byte) -105);
        int[][] var5 = {var4, var4, var4};
        return var5;
      }
    } catch (RuntimeException var6) {
      throw AbstractGameWorld.cascadeException(var6,
        "j.UA(" + var1 + ',' + var2 + ',' + var3 + ')');
    }
  }

  public int[][] method166(int var1, int var2 ) {
    try {
      if (var1 == -1) {
        throw new IllegalStateException(
            "This operation does not have a colour output");
      } else {
        return null;
      }
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4, "j.T(" + var1 + ',' + var2 + ')');
    }
  }

  public static void method153(int var0) {
    try {
      if (var0 >= 91) {
        MonoChromaticImageBuffer.aClass61_2557 = new Deque();
      }
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "j.QA(" + var0 + ')');
    }
  }

  public static void method156(int var0) {
    try {
      if (var0 != 2) {
        AbstractTextureSampler.method153(18);
      }

      AbstractTextureSampler.anIntArray2386 = null;
      AbstractTextureSampler.COMMAND_REPLACE_CANVAS = null;
      AbstractTextureSampler.COMMAND_SHIFT_CLICK = null;
      AbstractTextureSampler.aClass3_Sub28_Sub17_2379 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "j.PA(" + var0 + ')');
    }
  }

  public static SoftwareFont method163(byte[] var0, int var1) {
    try {
      if (var0 == null) {
        return null;
      } else {
        if (var1 != 25208) {
          AbstractTextureSampler.anInt2378 = 5;
        }

        SoftwareFont var2 =
          new SoftwareFont(var0, Something3dRoot.anIntArray2048, Buffer.anIntArray2591,
            GroundItem.anIntArray2931, TextureSampler26.anIntArray3076,
            DummyClass5.aByteArrayArray2987);
        DummyClass37.method1035((byte) 126);
        return var2;
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
          "j.WA(" + "{...}" + ',' + var1 + ')');
    }
  }

  public static void drawLoadingBox(GameString text, boolean draw) {
    try {
      byte var3 = 4;
      int var4 = var3 + 6;
      int var5 = var3 + 6;
      int var6 = SomethingTilek.p12Font.method680(text, 250);
      int var7 = SomethingTilek.p12Font.method684(text, 250) * 13;
      if (GlRenderer.useOpenGlRenderer) {
        GlUtils.fillQuad(var4 - var3, -var3 + var5, var3 + var6 - -var3,
            var3 + var3 + var7, 0);
        GlUtils.drawQuad(-var3 + var4, -var3 + var5, var6 + var3 - -var3,
            var3 + var7 + var3,
            16777215);
      } else {
        DummyClass47.method1323(var4 - var3, -var3 + var5, var3 + var6 - -var3,
            var3 + var3 + var7,
            0);
        DummyClass47.method1311(var4 + -var3, var5 - var3, var3 + var3 + var6,
            var3 + var3 + var7,
            16777215);
      }

      SomethingTilek.p12Font.draw(text, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
      AbstractSomethingTexture.method1340(var4 + -var3, var6 + (var3 - -var3), (byte) -40,
        -var3 + var5, var3 + var7 + var3);
      if (draw) {
        if (GlRenderer.useOpenGlRenderer) {
          GlRenderer.swapBuffers();
        } else {
          try {
            Graphics graphics = GameCanvas.INSTANCE.getGraphics();
            Something3d.viewImageProducer.draw(0, 0, graphics, 0);
          } catch (Exception var9) {
            GameCanvas.INSTANCE.repaint();
          }
        }
      } else {
        LinearHashTable.method1282(var4, (byte) -97, var5, var7, var6);
      }
    } catch (RuntimeException var10) {
      throw AbstractGameWorld.cascadeException(var10,
        "j.TA(" + draw + ',' + (text != null ? "{...}" : "null") + ')');
    }
  }

  public static void method165(int var0) {
    try {
      DummyClass53.aClass3_Sub28_Sub16_1339 = null;
      TextureSampler27.aClass3_Sub28_Sub16_3099 = null;
      VertexNormal.aClass3_Sub28_Sub16_824 = null;
      if (var0 != -7878) {
        AbstractTextureSampler.drawLoadingBox(null, false);
      }

      DummyClass58.aClass3_Sub28_Sub16_1457 = null;
      MonoChromaticImageBuffer.aClass3_Sub28_Sub16_2560 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "j.VA(" + var0 + ')');
    }
  }

}
