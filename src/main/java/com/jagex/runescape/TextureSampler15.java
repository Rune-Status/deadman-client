package com.jagex.runescape;

import java.util.Random;

public final class TextureSampler15 extends AbstractTextureSampler {

  public static GameString aClass94_3190 = GameString.create("<img=1>");
  public static GameString aClass94_3192 = GameString.create(" ");
  public static GameString aClass94_3196 = GameString.create("Fps:");
  public static int anInt3198;
  public static int anInt3199;
  public static GameWorld[] aClass44_Sub1Array3201 = new GameWorld[0];
  public static long encodedUsername;
  public static int anInt3205;
  public static GameString aClass94_3206 = GameString.create("Moteur son pr-Bpar-B");
  private int anInt3191 = 2;
  private int anInt3193 = 2048;
  private int anInt3194 = 1;
  private byte[] aByteArray3195 = new byte[512];
  private int anInt3197;
  private short[] aShortArray3200 = new short[512];
  private int anInt3203 = 5;
  private int anInt3204 = 5;


  public TextureSampler15() {
    super(0, true);
  }

  private void method242(byte var1) {
    Random var2 = new Random(this.anInt3197);
      this.aShortArray3200 = new short[512];
      if (var1 == 37) {
        if (this.anInt3193 > 0) {
          for (int var3 = 0; var3 < 512; ++var3) {
            this.aShortArray3200[var3] =
              (short) FloorUnderlay.method1603((byte) 23, this.anInt3193, var2);
          }
        }

      }
  }

  public int[] method154(int var1, byte var2 ) {
    int var4 = 68 % ((30 - var2) / 36);
      int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        int var5 = this.anInt3204 * DummyClass4.anIntArray2999[var1] + 2048;
        int var6 = var5 >> 12;
        int var7 = var6 - -1;

        for (int var15 = 0; var15 < SomethingLight0.anInt1559; ++var15) {
          TextureSampler36.anInt3422 = Integer.MAX_VALUE;
          Keyboard.anInt1914 = Integer.MAX_VALUE;
          LinearHashTable.anInt1042 = Integer.MAX_VALUE;
          AnimationSomething.anInt3589 = Integer.MAX_VALUE;
          int var16 =
              this.anInt3203 * TextureCache.anIntArray2125[var15] + 2048;
          int var17 = var16 >> 12;
          int var18 = 1 + var17;

          int var19;
          for (int var9 = var6 - 1; (var9 <= var7); ++var9) {
            int var13 =
              255 & this.aByteArray3195[((this.anInt3204 <= var9) ? -this.anInt3204 + var9 : var9)
                & 255];

            for (int var8 = var17 + -1; var18 >= var8; ++var8) {
              int var14 = (255 & this.aByteArray3195[
                ((this.anInt3203 <= var8) ? -this.anInt3203 + var8 : var8) + var13 & 255]) * 2;
              int var10 = -(var8 << 12) - (this.aShortArray3200[var14++] - var16);
              int var11 = var5 - (this.aShortArray3200[var14] + (var9 << 12));
              var19 = this.anInt3194;
              int var12;
              if ((var19 == 2 -1)) {
                var12 = var11 * var11 + var10 * var10 >> 12;
              } else {
                if (var19 == 3) {
                  var10 = var10 < 0 ? -var10 : var10;
                  var11 = (var11 >= 1 -1) ? var11 : -var11;
                  var12 = var11 >= var10 ? var11 : var10;
                } else if (var19 == 4) {
                  var10 =
                      (int) (Math.sqrt(
                          (var10 < 0 ? -var10 : var10) / 4096.0F)
                          * 4096.0D);
                  var11 =
                      (int) (Math.sqrt(
                          ((var11 >= 1 -1) ? var11 : -var11) / 4096.0F)
                          * 4096.0D);
                  var12 = var11 + var10;
                  var12 = var12 * var12 >> 12;
                } else if ((var19 == 6 -1)) {
                  var10 *= var10;
                  var11 *= var11;
                  var12 =
                      (int) (Math.sqrt(Math.sqrt(
                          (var11 + var10) / 1.6777216E7F))
                          * 4096.0D);
                } else if (var19 != 2) {
                  var12 = (int) (4096.0D * Math.sqrt(
                      (var11 * var11 + var10 * var10) / 1.6777216E7F));
                } else {
                  var12 =
                      ((var10 >= 1 -1) ? var10 : -var10) - -((var11 < 1 -1) ? -var11
                          : var11);
                }
              }

              if (var12 >= AnimationSomething.anInt3589) {
                if ((var12 < LinearHashTable.anInt1042)) {
                  TextureSampler36.anInt3422 = Keyboard.anInt1914;
                  Keyboard.anInt1914 = LinearHashTable.anInt1042;
                  LinearHashTable.anInt1042 = var12;
                } else if (Keyboard.anInt1914 <= var12) {
                  if (var12 < TextureSampler36.anInt3422) {
                    TextureSampler36.anInt3422 = var12;
                  }
                } else {
                  TextureSampler36.anInt3422 = Keyboard.anInt1914;
                  Keyboard.anInt1914 = var12;
                }
              } else {
                TextureSampler36.anInt3422 = Keyboard.anInt1914;
                Keyboard.anInt1914 = LinearHashTable.anInt1042;
                LinearHashTable.anInt1042 = AnimationSomething.anInt3589;
                AnimationSomething.anInt3589 = var12;
              }
            }
          }

          var19 = this.anInt3191;
          if ((var19 == 1 -1)) {
            var3[var15] = AnimationSomething.anInt3589;
          } else if (var19 != 1) {
            if ((var19 == 4 -1)) {
              var3[var15] = Keyboard.anInt1914;
            } else if (var19 == 4) {
              var3[var15] = TextureSampler36.anInt3422;
            } else if ((var19 == 3 -1)) {
              var3[var15] = LinearHashTable.anInt1042 + -AnimationSomething.anInt3589;
            }
          } else {
            var3[var15] = LinearHashTable.anInt1042;
          }
        }
      }

      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (!var3) {
        this.parseConfig(-122, null, false);
      }

      if ((var1 == 1 -1)) {
        this.anInt3203 = this.anInt3204 = var2.readUnsignedByte();
      } else if ((var1 == 2 -1)) {
        this.anInt3197 = var2.readUnsignedByte();
      } else if (var1 != 2) {
        if ((var1 == 4 -1)) {
          this.anInt3191 = var2.readUnsignedByte();
        } else if (var1 == 4) {
          this.anInt3194 = var2.readUnsignedByte();
        } else if (var1 == 5) {
          this.anInt3203 = var2.readUnsignedByte();
        } else if (var1 == 6) {
          this.anInt3204 = var2.readUnsignedByte();
        }
      } else {
        this.anInt3193 = var2.readUnsignedShort();
      }
  }

  public void method158(int var1 ) {
    if (var1 != 16251) {
        TextureSampler15.aClass44_Sub1Array3201 = null;
      }

      this.aByteArray3195 = GZipDecompressor.method1123(var1 ^ 16727940,
          this.anInt3197);
      this.method242((byte) 37);
  }

  public static int getLanguageForTag(GameString var0) {
    for (int i = 0; (i < TextureSampler4.LANGUAGES.length); ++i) {
        if (TextureSampler4.LANGUAGES[i].method1531(var0)) {
          return i;
        }
      }

      return -1;
  }

  public static void method244(int var0, int var1, int var2, int var3, int var4) {
    int var5;
      if ((var1 <= var3)) {
        for (var5 = var1; var5 < var3; ++var5) {
          DummyClass35.anIntArrayArray663[var5][var2] = var4;
        }
      } else {
        for (var5 = var3; (var5 < var1); ++var5) {
          DummyClass35.anIntArrayArray663[var5][var2] = var4;
        }
      }

      if (var0 != 2) {
        TextureSampler15.anInt3198 = -110;
      }
  }

  public static void method245(int var0) {
    TextureSampler15.aClass44_Sub1Array3201 = null;
      TextureSampler15.aClass94_3192 = null;
      TextureSampler15.aClass94_3206 = null;
      if (var0 != 0) {
        TextureSampler15.method245(111);
      }

      TextureSampler15.aClass94_3190 = null;
      TextureSampler15.aClass94_3196 = null;
  }

}
