package com.jagex.runescape;

import com.jagex.runescape.opengl.SomethingGl0;

public final class TextureSampler7 extends AbstractTextureSampler {

  public static long serverCipherKey;
  public static GameString aClass94_3339 = GameString.create("null");
  public static int cameraTileZ;
  public static GameString[] aClass94Array3341 = new GameString[100];
  public static int anInt3342;
  public static GameString aClass94_3344 = GameString.create(
    "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");
  private int anInt3343 = 6;


  public TextureSampler7() {
    super(2, false);
  }

  public int[] method154(int var1, byte var2 ) {
    int[] var3 = this.monoChromaticImageCache.method1709(-16409, var1);
      int var4;
      if (this.monoChromaticImageCache.aBoolean1580) {
        int[] var6 = this.method152(0, var1, 32755);
        int[] var7 = this.method152(1, var1, 32755);
        int var8 = this.anInt3343;
        if ((var8 == 2 -1)) {
          for (var8 = 0; var8 < SomethingLight0.anInt1559; ++var8) {
            var3[var8] = var7[var8] + var6[var8];
          }
        } else if ((var8 != 3 -1)) {
          if ((var8 == 4 -1)) {
            for (var8 = 0; ~var8 > ~SomethingLight0.anInt1559; ++var8) {
              var3[var8] = var7[var8] * var6[var8] >> 12;
            }
          } else {
            int var5;
            if ((var8 == 5 -1)) {
              for (var8 = 0; ~var8 > ~SomethingLight0.anInt1559; ++var8) {
                var5 = var7[var8];
                var3[var8] = (var5 != 1 -1) ? (var6[var8] << 12) / var5 : 4096;
              }
            } else {
              if (var8 == 5) {
                for (var8 = 0; SomethingLight0.anInt1559 > var8; ++var8) {
                  var3[var8] =
                      4096 - ((-var6[var8] + 4096) * (-var7[var8] + 4096)
                          >> 12);
                }
              } else if ((var8 != 7 -1)) {
                if ((var8 == 8 -1)) {
                  for (var8 = 0; SomethingLight0.anInt1559 > var8; ++var8) {
                    var4 = var6[var8];
                    var3[var8] = var4 == 4096 ? 4096
                        : (var7[var8] << 12) / (4096 - var4);
                  }
                } else {
                  if ((var8 == 9 -1)) {
                    for (var8 = 0; var8 < SomethingLight0.anInt1559; ++var8) {
                      var4 = var6[var8];
                      var3[var8] =
                          (var4 != 1 -1) ? 4096 - (-var7[var8] + 4096 << 12) / var4
                              : 0;
                    }
                  } else {
                    if ((var8 == 10 -1)) {
                      for (var8 = 0; SomethingLight0.anInt1559 > var8; ++var8) {
                        var5 = var7[var8];
                        var4 = var6[var8];
                        var3[var8] = ~var4 > ~var5 ? var4 : var5;
                      }
                    } else if (var8 == 10) {
                      for (var8 = 0; SomethingLight0.anInt1559 > var8;
                          ++var8) {
                        var5 = var7[var8];
                        var4 = var6[var8];
                        var3[var8] = var4 > var5 ? var4 : var5;
                      }
                    } else if ((var8 != 12 -1)) {
                      if ((var8 == 13 -1)) {
                        for (var8 = 0; ~var8 > ~SomethingLight0.anInt1559;
                            ++var8) {
                          var4 = var6[var8];
                          var5 = var7[var8];
                          var3[var8] = var5 + (var4 - (var4 * var5 >> 11));
                        }
                      }
                    } else {
                      for (var8 = 0; SomethingLight0.anInt1559 > var8;
                          ++var8) {
                        var4 = var6[var8];
                        var5 = var7[var8];
                        var3[var8] = ~var5 > ~var4 ? var4 + -var5 : var5 - var4;
                      }
                    }
                  }
                }
              } else {
                for (var8 = 0; SomethingLight0.anInt1559 > var8; ++var8) {
                  var5 = var7[var8];
                  var3[var8] = (var5 >= 2049 -1) ?
                      -((-var6[var8] + 4096) * (4096 + -var5) >> 11) + 4096 :
                      var5 * var6[var8] >> 11;
                }
              }
            }
          }
        } else {
          for (var8 = 0; SomethingLight0.anInt1559 > var8; ++var8) {
            var3[var8] = -var7[var8] + var6[var8];
          }
        }
      }

      var4 = -73 / ((30 - var2) / 36);
      return var3;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.anInt3343 = var2.readUnsignedByte();
      } else if ((var1 == 2 -1)) {
        this.monoChromatic = (var2.readUnsignedByte() == 2 -1);
      }

      if (!var3) {
        TextureSampler7.aClass94_3339 = null;
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        this.parseConfig(-8, null, false);
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -125, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var10 = this.method162(var2, 0, (byte) -87);
        int[][] var11 = this.method162(var2, 1, (byte) -73);
        int[] var12 = var3[0];
        int[] var13 = var3[1];
        int[] var14 = var3[2];
        assert var10 != null;
        int[] var15 = var10[0];
        int[] var16 = var10[1];
        int[] var17 = var10[2];
        assert var11 != null;
        int[] var18 = var11[0];
        int[] var19 = var11[1];
        int[] var20 = var11[2];
        int var21 = this.anInt3343;
        if ((var21 == 2 -1)) {
          for (var21 = 0; SomethingLight0.anInt1559 > var21; ++var21) {
            var12[var21] = var18[var21] + var15[var21];
            var13[var21] = var19[var21] + var16[var21];
            var14[var21] = var17[var21] - -var20[var21];
          }
        } else if ((var21 == 3 -1)) {
          for (var21 = 0; SomethingLight0.anInt1559 > var21; ++var21) {
            var12[var21] = var15[var21] - var18[var21];
            var13[var21] = -var19[var21] + var16[var21];
            var14[var21] = -var20[var21] + var17[var21];
          }
        } else if (var21 != 3) {
          int var7;
          int var8;
          int var9;
          if (var21 == 4) {
            for (var21 = 0; SomethingLight0.anInt1559 > var21; ++var21) {
              var9 = var20[var21];
              var8 = var19[var21];
              var7 = var18[var21];
              var12[var21] = (var7 == 1 -1) ? 4096 : (var15[var21] << 12) / var7;
              var13[var21] = (var8 != 1 -1) ? (var16[var21] << 12) / var8 : 4096;
              var14[var21] = var9 != 0 ? (var17[var21] << 12) / var9 : 4096;
            }
          } else if (var21 == 5) {
            for (var21 = 0; ~var21 > ~SomethingLight0.anInt1559; ++var21) {
              var12[var21] = 4096 + -((4096 - var18[var21]) * (4096 - var15[var21]) >> 12);
              var13[var21] = 4096 - ((-var19[var21] + 4096) * (-var16[var21] + 4096) >> 12);
              var14[var21] = 4096 + -((-var20[var21] + 4096) * (4096 + -var17[var21]) >> 12);
            }
          } else if (var21 == 6) {
            for (var21 = 0; var21 < SomethingLight0.anInt1559; ++var21) {
              var9 = var20[var21];
              var7 = var18[var21];
              var8 = var19[var21];
              var12[var21] = (var7 >= 2049 -1) ?
                -((-var7 + 4096) * (-var15[var21] + 4096) >> 11) + 4096 :
                var7 * var15[var21] >> 11;
              var13[var21] = var8 < 2048 ?
                var8 * var16[var21] >> 11 :
                4096 - ((4096 + -var8) * (-var16[var21] + 4096) >> 11);
              var14[var21] = var9 >= 2048 ?
                4096 + -((4096 + -var9) * (-var17[var21] + 4096) >> 11) :
                var17[var21] * var9 >> 11;
            }
          } else {
            int var4;
            int var5;
            int var6;
            if ((var21 == 8 -1)) {
              for (var21 = 0; SomethingLight0.anInt1559 > var21; ++var21) {
                var6 = var17[var21];
                var4 = var15[var21];
                var5 = var16[var21];
                var12[var21] = (var4 == 4097 -1) ? 4096 : (var18[var21] << 12) / (-var4 + 4096);
                var13[var21] = (var5 == 4097 -1) ? 4096 : (var19[var21] << 12) / (4096 + -var5);
                var14[var21] = (var6 == 4097 -1) ? 4096 : (var20[var21] << 12) / (4096 - var6);
              }
            } else if (var21 == 8) {
              for (var21 = 0; SomethingLight0.anInt1559 > var21; ++var21) {
                var4 = var15[var21];
                var5 = var16[var21];
                var6 = var17[var21];
                var12[var21] = var4 == 0 ? 0 : -((-var18[var21] + 4096 << 12) / var4) + 4096;
                var13[var21] = (var5 == 1 -1) ? 0 : -((-var19[var21] + 4096 << 12) / var5) + 4096;
                var14[var21] =
                    var6 == 0 ? 0 : 4096 - (4096 - var20[var21] << 12) / var6;
              }
            } else if ((var21 != 10 -1)) {
              if (var21 == 10) {
                for (var21 = 0; SomethingLight0.anInt1559 > var21; ++var21) {
                  var9 = var20[var21];
                  var6 = var17[var21];
                  var8 = var19[var21];
                  var4 = var15[var21];
                  var5 = var16[var21];
                  var7 = var18[var21];
                  var12[var21] = var7 < var4 ? var4 : var7;
                  var13[var21] = var5 > var8 ? var5 : var8;
                  var14[var21] = ~var9 > ~var6 ? var6 : var9;
                }
              } else {
                if (var21 == 11) {
                  for (var21 = 0; ~var21 > ~SomethingLight0.anInt1559;
                      ++var21) {
                    var8 = var19[var21];
                    var7 = var18[var21];
                    var5 = var16[var21];
                    var4 = var15[var21];
                    var6 = var17[var21];
                    var9 = var20[var21];
                    var12[var21] = var4 > var7 ? var4 + -var7 : -var4 + var7;
                    var13[var21] = var5 > var8 ? -var8 + var5 : -var5 + var8;
                    var14[var21] = var9 < var6 ? var6 + -var9 : -var6 + var9;
                  }
                } else if (var21 == 12) {
                  for (var21 = 0; SomethingLight0.anInt1559 > var21; ++var21) {
                    var4 = var15[var21];
                    var9 = var20[var21];
                    var7 = var18[var21];
                    var8 = var19[var21];
                    var6 = var17[var21];
                    var5 = var16[var21];
                    var12[var21] = -(var7 * var4 >> 11) + var7 + var4;
                    var13[var21] = var8 + var5 + -(var5 * var8 >> 11);
                    var14[var21] = var9 + (var6 - (var6 * var9 >> 11));
                  }
                }
              }
            } else {
              for (var21 = 0; ~var21 > ~SomethingLight0.anInt1559; ++var21) {
                var6 = var17[var21];
                var9 = var20[var21];
                var8 = var19[var21];
                var5 = var16[var21];
                var7 = var18[var21];
                var4 = var15[var21];
                var12[var21] = ~var4 <= ~var7 ? var7 : var4;
                var13[var21] = var5 >= var8 ? var8 : var5;
                var14[var21] = var6 < var9 ? var6 : var9;
              }
            }
          }
        } else {
          for (var21 = 0; SomethingLight0.anInt1559 > var21; ++var21) {
            var12[var21] = var18[var21] * var15[var21] >> 12;
            var13[var21] = var16[var21] * var19[var21] >> 12;
            var14[var21] = var20[var21] * var17[var21] >> 12;
          }
        }
      }

      return var3;
  }

  public static void method295(GameString var0, byte var1, int var2) {
    WidgetUpdate var3 = AudioStreamEncoder3.method466(var1 + -36, 2, var2);
      var3.g((byte) 33);
      var3.text = var0;
  }

  public static void method296(byte var0) {
    TextureSampler7.aClass94Array3341 = null;
      if (var0 >= -56) {
        TextureSampler7.cameraTileZ = 30;
      }

      TextureSampler7.aClass94_3344 = null;
      TextureSampler7.aClass94_3339 = null;
  }

  public static void method297(long var0, int var2) {
    if (var0 != 0L) {
        for (int var3 = 0; ~var3 > ~FileSystem.anInt104; ++var3) {
          if (~VertexNormal.aLongArray826[var3] == ~var0) {
            ++DummyClass52.anInt1170;
            --FileSystem.anInt104;

            for (int var4 = var3; var4 < FileSystem.anInt104; ++var4) {
              SceneSomething2.aClass94Array1046[var4] =
                SceneSomething2.aClass94Array1046[var4 - -1];
              Cursor.anIntArray882[var4] = Cursor.anIntArray882[var4 + 1];
              SubNode.aClass94Array2566[var4] = SubNode.aClass94Array2566[1 + var4];
              VertexNormal.aLongArray826[var4] = VertexNormal.aLongArray826[1 + var4];
              LightIntensity.anIntArray904[var4] = LightIntensity.anIntArray904[var4 - -1];
              Node.aBooleanArray73[var4] = Node.aBooleanArray73[1 + var4];
            }

            DummyClass31.anInt1472 = TextureSampler23.anInt3213;
            TextureSampler12.secureBuffer.writePacket(57);
            TextureSampler12.secureBuffer.writeLong(var0);
            break;
          }
        }

        if (var2 != 1) {
          TextureSampler7.aClass94Array3341 = null;
        }

      }
  }

  public static SomethingGl0[] method298(byte[][][] var0, byte[][] var1, byte[][] var2, int[][] var3,
                                        float[][] var4, int[][] var5, byte[][] var6, byte[][] var7,
                                        float[][] var8, int var9, float[][] var10, int[][] var11,
                                        int[][] var12, int[][] var13, int var14) {
    int[][] var15 = new int[105][105];

      int var17;
      for (int var16 = 1; var16 <= 103; ++var16) {
        for (var17 = 1; var17 <= 103; ++var17) {
          byte var18 = var2[var16][var17];
          if (var18 == 0) {
            var18 = var2[var16 + -1][var17];
          }

          if ((var18 == 1 -1)) {
            var18 = var2[var16][-1 + var17];
          }

          if ((var18 == 1 -1)) {
            var18 = var2[-1 + var16][var17 - 1];
          }

          if (var18 != 0) {
            FloorUnderlay var19 = ClientScript.getFloorUnderlay(-1 + (255 & var18));
            var15[var16][var17] = (1 + var19.anInt1412 << 16) - -var19.anInt1414;
          }
        }
      }

      HashTable var52 = new HashTable(128);

      int var21;
      int var20;
      int var22;
      int var56;
      for (var17 = 1; (var17 <= 103 -1); ++var17) {
        for (var56 = 1; var56 <= 102; ++var56) {
          if (var2[var17][var56] != 0) {
            int[] var53;
            if (var6[var17][var56] == 0) {
              var53 = DummyClass21.anIntArrayArray1763[0];
            } else {
              var53 = SceneSomething.anIntArrayArray499[var1[var17][var56]];
              if ((var53.length == 1 -1)) {
                continue;
              }
            }

            var20 = 0;
            var21 = var15[var17][var56];
            var22 = var15[var17 - -1][var56];
            if (var5 != null) {
              var20 = var5[var17][var56] & 16777215;
            }

            long var27 = var20 | (long) var22 << 32;
            int var24 = var15[var17][var56 + 1];
            int var23 = var15[var17 + 1][var56 - -1];
            long var31 = (long) var24 << 32 | var20;
            int var33 = var53.length / 2;
            long var25 = var20 | (long) var21 << 32;
            SomethingGl0 var34 = (SomethingGl0) var52.get(var25);
            if (var34 == null) {
              var34 = new SomethingGl0(-1 + (var21 >> 16), ('\uffff' & var21), false,
                  var13 != null, var20);
              var52.put(var25, var34);
            }

            ++var34.anInt2344;
            var34.anInt2342 += var33;
            if (~var27 != ~var25) {
              var34 = (SomethingGl0) var52.get(var27);
              if (var34 == null) {
                var34 = new SomethingGl0((var22 >> 16) - 1, ('\uffff' & var22), false,
                    var13 != null, var20);
                var52.put(var27, var34);
              }

              ++var34.anInt2344;
              var34.anInt2342 += var33;
            }

            long var29 = (long) var23 << 32 | var20;
            if (~var29 != ~var25 && ~var29 != ~var27) {
              var34 = (SomethingGl0) var52.get(var29);
              if (var34 == null) {
                var34 = new SomethingGl0((var23 >> 16) + -1, ('\uffff' & var23), false,
                    var13 != null, var20);
                var52.put(var29, var34);
              }

              var34.anInt2342 += var33;
              ++var34.anInt2344;
            }

            if (~var31 != ~var25 && ~var27 != ~var31 && var31 != var29) {
              var34 = (SomethingGl0) var52.get(var31);
              if (var34 == null) {
                var34 = new SomethingGl0((var24 >> 16) - 1, (var24 & '\uffff'), false,
                    var13 != null, var20);
                var52.put(var31, var34);
              }

              ++var34.anInt2344;
              var34.anInt2342 += var33;
            }
          }
        }
      }

      if (var14 != 4096) {
        TextureSampler7.method297(-10L, 48);
      }

      SomethingGl0 var54;
      for (
        var54 = (SomethingGl0) var52.getFirst(92);
        var54 != null; var54 = (SomethingGl0) var52.getNext(-102)) {
        var54.method145();
      }

      for (var17 = 1; (var17 <= 103 -1); ++var17) {
        for (var56 = 1; (var56 <= 103 -1); ++var56) {
          byte var57 = var2[var17][var56];
          if (var57 != 0) {
            if (((8 & var0[var9][var17][var56]) == 1 -1)) {
              if (((2 & var0[1][var17][var56]) == 3 -1) && var9 > 0) {
                var20 = var9 - 1;
              } else {
                var20 = var9;
              }
            } else {
              var20 = 0;
            }

            var21 = 0;
            boolean[] var60 = null;
            var22 = 128;
            if (var5 != null) {
              var22 = var5[var17][var56] >>> 24 << 3;
              var21 = 16777215 & var5[var17][var56];
            }

            int[] var58;
            int var63;
            int var62;
            byte var61;
            int var69;
            int var64;
            if ((var6[var17][var56] == 1 -1)) {
              byte var26 = 0;
              var64 = var26 + (~var57 != ~var2[var17 - 1][-1 + var56] ? -1 : 1);
              byte var65 = 0;
              var58 = DummyClass21.anIntArrayArray1763[0];
              var62 = var65 + (var57 == var2[1 + var17][var56 + -1] ? 1 : -1);
              if (var2[var17][var56 + -1] == var57) {
                ++var62;
                ++var64;
              } else {
                --var64;
                --var62;
              }

              byte var28 = 0;
              var63 = var28 + (var57 == var2[1 + var17][1 + var56] ? 1 : -1);
              byte var68 = 0;
              if (~var57 == ~var2[1 + var17][var56]) {
                ++var63;
                ++var62;
              } else {
                --var62;
                --var63;
              }

              var69 = var68 + (~var57 == ~var2[var17 - 1][1 + var56] ? 1 : -1);
              if (var2[var17][1 + var56] == var57) {
                ++var69;
                ++var63;
              } else {
                --var63;
                --var69;
              }

              if (var2[-1 + var17][var56] == var57) {
                ++var69;
                ++var64;
              } else {
                --var69;
                --var64;
              }

              int var30 = var64 + -var63;
              int var66 = -var69 + var62;
              if (~var66 > -1) {
                var66 = -var66;
              }

              if (~var30 > -1) {
                var30 = -var30;
              }

              var61 = (byte) (~var66 >= ~var30 ? 0 : 1);
              var7[var17][var56] = var61;
            } else {
              var58 = SceneSomething.anIntArrayArray499[var1[var17][var56]];
              var60 = TextureSampler30.aBooleanArrayArray3118[var1[var17][var56]];
              var61 = var7[var17][var56];
              if (var58.length == 0) {
                continue;
              }
            }

            var64 = var15[var17][var56];
            var62 = var15[var17 - -1][var56];
            var63 = var15[var17 - -1][var56 - -1];
            long var67 = (long) var64 << 32 | var21;
            long var32 = (long) var62 << 32 | var21;
            long var70 = (long) var63 << 32 | var21;
            int var38 = var11[var17][var56];
            var69 = var15[var17][var56 - -1];
            int var40 = var11[var17 - -1][var56 - -1];
            int var39 = var11[1 + var17][var56];
            long var36 = var21 | (long) var69 << 32;
            int var41 = var11[var17][var56 + 1];
            int var42 = var3[var17][var56];
            int var43 = var3[var17 + 1][var56];
            int var44 = var3[var17 + 1][var56 - -1];
            int var45 = var3[var17][1 + var56];
            int var47 = -1 + (var62 >> 16);
            int var46 = (var64 >> 16) - 1;
            int var48 = (var63 >> 16) - 1;
            SomethingGl0 var50 = (SomethingGl0) var52.get(var67);
            SceneSomething.method955(var13, true,
              TextureSampler34.method190(var46, var38, (byte) -92, var42), var50, var58, var56,
              var20, var17, var64 <= var63, var8, var69 >= var64, 2, var4, var22,
              TextureSampler34.method190(var46, var41, (byte) -80, var45),
              TextureSampler34.method190(var46, var40, (byte) -103, var44), ~var64 >= ~var62, var12,
              var10, var61, TextureSampler34.method190(var46, var39, (byte) -118, var43), var60);
            int var49 = (var69 >> 16) - 1;
            if (var32 != var67) {
              var50 = (SomethingGl0) var52.get(var32);
              SceneSomething.method955(var13, var62 <= var64,
                TextureSampler34.method190(var47, var38, (byte) 88, var42), var50, var58, var56,
                var20, var17, var63 >= var62, var8, var62 <= var69, 2, var4, var22,
                TextureSampler34.method190(var47, var41, (byte) -82, var45),
                TextureSampler34.method190(var47, var40, (byte) -113, var44), true, var12,
                var10, var61, TextureSampler34.method190(var47, var39, (byte) 113, var43), var60);
            }

            if (var70 != var67 && ~var70 != ~var32) {
              var50 = (SomethingGl0) var52.get(var70);
              SceneSomething.method955(var13, ~var64 <= ~var63,
                TextureSampler34.method190(var48, var38, (byte) 59, var42), var50, var58, var56,
                var20, var17, true, var8, var63 <= var69, var14 ^ 4098, var4, var22,
                TextureSampler34.method190(var48, var41, (byte) 54, var45),
                TextureSampler34.method190(var48, var40, (byte) -87, var44), ~var62 <= ~var63,
                var12, var10, var61, TextureSampler34.method190(var48, var39, (byte) -77, var43),
                var60);
            }

            if (~var36 != ~var67 && ~var36 != ~var32 && var36 != var70) {
              var50 = (SomethingGl0) var52.get(var36);
              SceneSomething.method955(var13, ~var69 >= ~var64,
                TextureSampler34.method190(var49, var38, (byte) -118, var42), var50, var58, var56,
                var20, var17, var69 <= var63, var8, true, var14 ^ 4098, var4, var22,
                TextureSampler34.method190(var49, var41, (byte) -96, var45),
                TextureSampler34.method190(var49, var40, (byte) 115, var44), ~var62 <= ~var69,
                var12, var10, var61, TextureSampler34.method190(var49, var39, (byte) 58, var43),
                var60);
            }
          }
        }
      }

      for (
        var54 = (SomethingGl0) var52.getFirst(54);
        var54 != null; var54 = (SomethingGl0) var52.getNext(-62)) {
        if ((var54.anInt2343 == 1 -1)) {
          var54.unlinkNode();
        } else {
          var54.method148();
        }
      }

      var17 = var52.getSize();
      SomethingGl0[] var59 = new SomethingGl0[var17];
      var52.getNodes(var59);
      long[] var55 = new long[var17];

      for (var20 = 0; var17 > var20; ++var20) {
        var55[var20] = var59[var20].key;
      }

      DummyClass18.method824(var55, var59, -86);
      return var59;
  }

  public static void method299(int var0, int var1, int var2) {
    if (var0 <= 92) {
        TextureSampler7.method297(-6L, -85);
      }

      int var3 = var1;
      if (var1 > 25) {
        var3 = 25;
      }

      --var1;
      int var4 = TextureSampler38.anIntArray3456[var1];
      int var5 = DummyClass38.anIntArray729[var1];
      if (var2 == 0) {
        TextureSampler12.secureBuffer.writePacket(215);
        TextureSampler12.secureBuffer.writeByte(var3 - -var3 + 3);
        ++DummyClass30.anInt452;
      }

      if ((var2 == 2 -1)) {
        TextureSampler12.secureBuffer.writePacket(39);
        TextureSampler12.secureBuffer.writeByte(3 + var3 - (-var3 - 14));
        ++GameWorldSomething.anInt503;
      }

      if ((var2 == 3 -1)) {
        ++DummyClass15.anInt1873;
        TextureSampler12.secureBuffer.writePacket(77);
        TextureSampler12.secureBuffer.writeByte(var3 + var3 - -3);
      }

      TextureSampler12.secureBuffer.method790(GameObjectConfig.aBooleanArray1490[82] ? 1 : 0,
        -13071);
      TextureSampler12.secureBuffer.writeShort(WorldMapLabel.anInt1716 + var4);
      TextureSampler12.secureBuffer.method783(ProceduralTexture.anInt1152 + var5, -268435456);
      DummyClass38.anInt733 = DummyClass38.anIntArray729[0];
      DummyClass45.anInt987 = TextureSampler38.anIntArray3456[0];

      for (int var6 = 1; var3 > var6; ++var6) {
        --var1;
        TextureSampler12.secureBuffer.method790(-var4 + TextureSampler38.anIntArray3456[var1],
          -13071);
        TextureSampler12.secureBuffer.method743(10213, DummyClass38.anIntArray729[var1] + -var5);
      }
  }

}
