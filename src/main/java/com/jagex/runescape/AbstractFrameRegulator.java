package com.jagex.runescape;

import com.jagex.runescape.opengl.GlRenderer;
import com.jagex.runescape.opengl.GlUtils;
import com.jagex.runescape.opengl.SomethingLight;

public abstract class AbstractFrameRegulator {

  public static int[] anIntArray1690;
  public static int anInt1691 = -1;
  public static int anInt1692;
  public static int[] keyQueue = new int[128];
  public static GameString aClass94_1694 = GameString.create("document)3cookie=(R");
  public static int[] anIntArray1695;
  public static GameString aClass94_1696 = GameString.create(
    "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

  public abstract int sleep(int var1,int var2,int var3 );

  public abstract void reset(int var1 );

  public static int method1765(int var0, int var1) {
    if (var1 != -1732504441) {
        AbstractFrameRegulator.method1765(97, -97);
      }

      return var0 >>> 7;
  }

  public static void method1766(int var0) {
    AbstractFrameRegulator.anIntArray1695 = null;
      if (var0 != 24241) {
        AbstractFrameRegulator.method1766(84);
      }

      AbstractFrameRegulator.anIntArray1690 = null;
      AbstractFrameRegulator.keyQueue = null;
      AbstractFrameRegulator.aClass94_1694 = null;
      AbstractFrameRegulator.aClass94_1696 = null;
  }

  public static void method1768(int var0, int var1, int var2) {
    if ((Keyboard.anInt1908 > 0)) {
        DummyClass13.method2195(Keyboard.anInt1908, 0);
        Keyboard.anInt1908 = 0;
      }

      short var3 = 256;
      int var4 = 0;
      int var5 = DummyClass47.anInt1092 * var2;
      int var6 = 0;

      for (int var7 = 1; var7 < var3 + -1; ++var7) {
        int var8 = (var3 - var7) * AnimationSomething.anIntArray3592[var7] / var3;
        if (var8 < 0) {
          var8 = 0;
        }

        var4 += var8;

        int var9;
        for (var9 = var8; var9 < 128; ++var9) {
          int var11 = DummyClass47.anIntArray1100[var5++ + var0];
          int var10 = DummyClass2.anIntArray1681[var4++];
          if (var10 == 0) {
            TriChromaticImageCache.aClass3_Sub28_Sub16_Sub2_1381.pixels[var6++] = var11;
          } else {
            int var12 = 18 + var10;
            if ((var12 > 256 -1)) {
              var12 = 255;
            }

            int var13 = 256 - var10 - 18;
            if ((var13 > 256 -1)) {
              var13 = 255;
            }

            var10 = PlayerAppearance.anIntArray861[var10];
            TriChromaticImageCache.aClass3_Sub28_Sub16_Sub2_1381.pixels[var6++] =
                ClientScript.bitAnd(var13 * ClientScript.bitAnd(var11, 16711935)
                    + ClientScript.bitAnd(16711935, var10) * var12, -16711936)
                    - -ClientScript.bitAnd(
                    ClientScript.bitAnd(var10, '\uff00') * var12 - -(
                        ClientScript.bitAnd('\uff00', var11) * var13), 16711680)
                    >> 8;
          }
        }

        for (var9 = 0; var9 < var8; ++var9) {
          TriChromaticImageCache.aClass3_Sub28_Sub16_Sub2_1381.pixels[var6++] =
            DummyClass47.anIntArray1100[var0 + var5++];
        }

        var5 += DummyClass47.anInt1092 + -128;
      }

      if (var1 > 70) {
        if (GlRenderer.useOpenGlRenderer) {
          GlUtils.drawImage(
              TriChromaticImageCache.aClass3_Sub28_Sub16_Sub2_1381.pixels, var0,
              var2,
              TriChromaticImageCache.aClass3_Sub28_Sub16_Sub2_1381.anInt3707,
              TriChromaticImageCache.aClass3_Sub28_Sub16_Sub2_1381.anInt3696);
        } else {
          TriChromaticImageCache.aClass3_Sub28_Sub16_Sub2_1381
              .method635(var0, var2);
        }

      }
  }

  public static void method1769(float[][] var0, byte[][] var1, byte[][] var2, Light[] var3, int var4,
                               int var5, float[][] var6, byte[][] var7, byte[][] var8, int[][] var9,
                               int var10, float[][] var11) {
    for (int var12 = 0; (var12 < var5); ++var12) {
        Light var13 = var3[var12];
        if (var13.anInt704 == var4) {
          int var15 = 0;
          SomethingLight var14 = new SomethingLight();
          int var16 = -var13.anInt698 + (var13.anInt703 >> 7);
          int var17 = -var13.anInt698 + (var13.anInt708 >> 7);
          if ((var17 < 0)) {
            var15 -= var17;
            var17 = 0;
          }

          int var18 = var13.anInt698 + (var13.anInt708 >> 7);
          if (var18 > 103) {
            var18 = 103;
          }

          int var19;
          int var21;
          short var20;
          int var23;
          int var22;
          int var25;
          int var35;
          boolean var32;
          for (var19 = var17; (var18 >= var19); ++var19) {
            var20 = var13.aShortArray706[var15];
            var21 = var16 + (var20 >> 8);
            var22 = -1 + var21 - -(255 & var20);
            if (var22 > 103) {
              var22 = 103;
            }

            if ((var21 < 0)) {
              var21 = 0;
            }

            for (var23 = var21; var23 <= var22; ++var23) {
              int var24 = 255 & var1[var23][var19];
              var25 = 255 & var8[var23][var19];
              boolean var26 = false;
              FloorOverlay var27;
              int[] var29;
              int[] var28;
              if (var24 == 0) {
                if ((var25 == 0)) {
                  continue;
                }

                var27 = TextureSampler10.method350((byte) -103, var25 + -1);
                if ((var27.anInt2103 == -1)) {
                  continue;
                }

                if ((var7[var23][var19] != 0)) {
                  var28 = DummyClass21.anIntArrayArray1763[var7[var23][var19]];
                  var14.anInt651 += 3 * (-2 + (var28.length >> 1));
                  var14.anInt657 += var28.length >> 1;
                  continue;
                }
              } else if ((var25 != 0)) {
                var27 = TextureSampler10.method350((byte) 123, var25 - 1);
                byte var42;
                if (var27.anInt2103 == -1) {
                  var42 = var7[var23][var19];
                  if ((var42 != 0)) {
                    var29 = SceneSomething.anIntArrayArray499[var42];
                    var14.anInt651 += 3 * (-2 + (var29.length >> 1));
                    var14.anInt657 += var29.length >> 1;
                  }
                  continue;
                }

                var42 = var7[var23][var19];
                if (var42 != 0) {
                  var26 = true;
                }
              }

              SceneSomething var40 = AbstractSomethingTexture.method1336(var4, var23, var19);
              if (var40 != null) {
                int var41 = (int) (var40.aLong498 >> 14) & 63;
                if ((var41 == 10 -1)) {
                  var29 = null;
                  int var30 = 3 & (int) (var40.aLong498 >> 20);
                  boolean var31;
                  int var34;
                  short var33;
                  if ((1 & var30) == 0) {
                    var32 = var22 >= 1 + var23;
                    var31 = var23 + -1 >= var21;
                    if (!var31 && ((var19 - -1) <= var18)) {
                      var33 = var13.aShortArray706[1 + var15];
                      var34 = var16 + (var33 >> 8);
                      var35 = var34 + (255 & var33);
                      var31 = var34 < var23 && var23 < var35;
                    }

                    if (!var32 && -1 + var19 >= var17) {
                      var33 = var13.aShortArray706[var15 + -1];
                      var34 = var16 + (var33 >> 8);
                      var35 = var34 - -(var33 & 255);
                      var32 = var23 > var34 && (var23 < var35);
                    }

                    if (var31 && var32) {
                      var29 = DummyClass21.anIntArrayArray1763[0];
                    } else if (var31) {
                      var29 = DummyClass21.anIntArrayArray1763[1];
                    } else if (var32) {
                      var29 = DummyClass21.anIntArrayArray1763[1];
                    }
                  } else {
                    var31 = var21 <= -1 + var23;
                    var32 = ((var23 + 1) <= var22);
                    if (!var31 && -1 + var19 >= var17) {
                      var33 = var13.aShortArray706[-1 + var15];
                      var34 = (var33 >> 8) + var16;
                      var35 = var34 + (255 & var33);
                      var31 = (var34 < var23) && (var23 < var35);
                    }

                    if (!var32 && ((1 + var19) <= var18)) {
                      var33 = var13.aShortArray706[var15 + 1];
                      var34 = (var33 >> 8) + var16;
                      var35 = var34 - -(255 & var33);
                      var32 = (var34 < var23) && var35 > var23;
                    }

                    if (var31 && var32) {
                      var29 = DummyClass21.anIntArrayArray1763[0];
                    } else if (!var31) {
                      if (var32) {
                        var29 = DummyClass21.anIntArrayArray1763[1];
                      }
                    } else {
                      var29 = DummyClass21.anIntArrayArray1763[1];
                    }
                  }

                  if (var29 != null) {
                    var14.anInt651 += 3 * (var29.length >> 1) - 6;
                    var14.anInt657 += var29.length >> 1;
                  }
                  continue;
                }
              }

              if (var26) {
                var29 = SceneSomething.anIntArrayArray499[var7[var23][var19]];
                var28 = DummyClass21.anIntArrayArray1763[var7[var23][var19]];
                var14.anInt651 += (-2 + (var28.length >> 1)) * 3;
                var14.anInt651 += ((var29.length >> 1) - 2) * 3;
                var14.anInt657 += var28.length >> 1;
                var14.anInt657 += var29.length >> 1;
              } else {
                var28 = DummyClass21.anIntArrayArray1763[0];
                var14.anInt651 += (-2 + (var28.length >> 1)) * 3;
                var14.anInt657 += var28.length >> 1;
              }
            }

            ++var15;
          }

          var15 = 0;
          var14.method1020();
          if (((-var13.anInt698 + (var13.anInt708 >> 7)) < 0)) {
            var15 -= -var13.anInt698 + (var13.anInt708 >> 7);
          }

          for (var19 = var17; var19 <= var18; ++var19) {
            var20 = var13.aShortArray706[var15];
            var21 = (var20 >> 8) + var16;
            var22 = -1 + (255 & var20) + var21;
            if ((var22 > 104 -1)) {
              var22 = 103;
            }

            if (var21 < 0) {
              var21 = 0;
            }

            for (var23 = var21; (var23 <= var22); ++var23) {
              int var43 = 255 & var8[var23][var19];
              var25 = 255 & var1[var23][var19];
              byte var38 = var2[var23][var19];
              boolean var39 = false;
              FloorOverlay var46;
              if (var25 == 0) {
                if (var43 == 0) {
                  continue;
                }

                var46 = TextureSampler10.method350((byte) -49, var43 - 1);
                if (var46.anInt2103 == -1) {
                  continue;
                }

                if (var7[var23][var19] != 0) {
                  TextureSampler18.method284(var0, var9, var23, var6, var19,
                      DummyClass21.anIntArrayArray1763[var7[var23][var19]],
                      var14, (byte) -88, var13,
                      var11, var2[var23][var19]);
                  continue;
                }
              } else {
                if ((var43 != 0)) {
                  var46 = TextureSampler10.method350((byte) 113, -1 + var43);
                  if (var46.anInt2103 == -1) {
                    TextureSampler18.method284(var0, var9, var23, var6, var19,
                        SceneSomething.anIntArrayArray499[var7[var23][var19]],
                        var14, (byte) 116,
                        var13, var11, var2[var23][var19]);
                    continue;
                  }

                  byte var48 = var7[var23][var19];
                  if (var48 != 0) {
                    var39 = true;
                  }
                }
              }

              SceneSomething var44 = AbstractSomethingTexture.method1336(var4, var23, var19);
              if (var44 != null) {
                int var49 = (int) (var44.aLong498 >> 14) & 63;
                if (var49 == 9) {
                  int[] var45 = null;
                  int var47 = 3 & (int) (var44.aLong498 >> 20);
                  int var36;
                  boolean var51;
                  short var50;
                  if ((1 & var47) == 0) {
                    var32 = ((-1 + var23) >= var21);
                    var51 = (var22 >= (var23 + 1));
                    if (!var32 && var18 >= var19 - -1) {
                      var50 = var13.aShortArray706[1 + var15];
                      var35 = (var50 >> 8) + var16;
                      var36 = (var50 & 255) + var35;
                      var32 = var23 > var35 && var36 > var23;
                    }

                    if (!var51 && var19 - 1 >= var17) {
                      var50 = var13.aShortArray706[-1 + var15];
                      var35 = var16 + (var50 >> 8);
                      var36 = (255 & var50) + var35;
                      var51 = var35 < var23 && var36 > var23;
                    }

                    if (var32 && var51) {
                      var45 = DummyClass21.anIntArrayArray1763[0];
                    } else if (var32) {
                      var45 = DummyClass21.anIntArrayArray1763[1];
                      var38 = 1;
                    } else if (var51) {
                      var45 = DummyClass21.anIntArrayArray1763[1];
                      var38 = 3;
                    }
                  } else {
                    var32 = var23 - 1 >= var21;
                    var51 = var22 >= 1 + var23;
                    if (!var32 && var17 <= var19 - 1) {
                      var50 = var13.aShortArray706[var15 - 1];
                      var35 = var16 + (var50 >> 8);
                      var36 = (255 & var50) + var35;
                      var32 = var23 > var35 && var36 > var23;
                    }

                    if (!var51 && (var18 >= (var19 + 1))) {
                      var50 = var13.aShortArray706[var15 - -1];
                      var35 = var16 + (var50 >> 8);
                      var36 = (255 & var50) + var35;
                      var51 = var23 > var35 && var36 > var23;
                    }

                    if (var32 && var51) {
                      var45 = DummyClass21.anIntArrayArray1763[0];
                    } else if (!var32) {
                      if (var51) {
                        var45 = DummyClass21.anIntArrayArray1763[1];
                        var38 = 2;
                      }
                    } else {
                      var38 = 0;
                      var45 = DummyClass21.anIntArrayArray1763[1];
                    }
                  }

                  if (var45 != null) {
                    TextureSampler18.method284(var0, var9, var23, var6, var19, var45, var14,
                      (byte) 98, var13, var11, var38);
                  }
                  continue;
                }
              }

              if (var39) {
                TextureSampler18.method284(var0, var9, var23, var6, var19,
                  SceneSomething.anIntArrayArray499[var7[var23][var19]], var14, (byte) 96, var13,
                  var11, var2[var23][var19]);
                TextureSampler18.method284(var0, var9, var23, var6, var19,
                  DummyClass21.anIntArrayArray1763[var7[var23][var19]], var14, (byte) -117, var13,
                  var11, var2[var23][var19]);
              } else {
                TextureSampler18.method284(var0, var9, var23, var6, var19,
                  DummyClass21.anIntArrayArray1763[0], var14, (byte) 61, var13, var11, var38);
              }
            }

            ++var15;
          }

          if ((var14.anInt653 > 0) && var14.anInt655 > 0) {
            var14.method1019();
            var13.aClass37_712 = var14;
          }
        }
      }

      if (var10 != -8771) {
        AbstractFrameRegulator.method1765(-30, -124);
      }
  }

}
