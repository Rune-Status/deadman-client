package com.jagex.runescape;

import java.util.Objects;

public final class SomethingInScenePacket202 extends Node {

  private static GameString aClass94_2280 = GameString.create("Starting 3d Library");
  public static GameString aClass94_2269 = GameString.create("lila:");
  public static GameString aClass94_2274 =
    GameString.create("Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");
  public static int anInt2275 = 1;
  public static GameString aClass94_2276 = GameString.create("rot:");
  public static int anInt2281;
  public static GameString aClass94_2267 = SomethingInScenePacket202.aClass94_2280;
  public int anInt2266;
  public int anInt2268;
  public int anInt2270;
  public int anInt2271;
  public int anInt2272;
  public int anInt2273;
  public int anInt2277;
  public int anInt2278;
  public int anInt2279;
  public int anInt2282;
  public int anInt2283;
  public int anInt2284;

  public static void method111(byte var0, int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7, int var8) {
    if (var0 < -47) {
        for (int var9 = 0; DummyClass25.aClass131_1624.anInt1720 > var9; ++var9) {
          if (DummyClass25.aClass131_1624.method1787(var9, (byte) -124)) {
            int var10 =
              -TextureSampler37.anInt3256 + DummyClass25.aClass131_1624.aShortArray1727[var9];
            int var11 = MapScene.anInt65 - (DummyClass25.aClass131_1624.aShortArray1718[var9] - -1
              - DummyClass58.anInt1460);
            int var12 = var1 + (-var1 + var4) * (var10 - var3) / (-var3 + var7);
            int var14 = DummyClass25.aClass131_1624.method1791(var9, 8);
            int var13 = (var8 + -var2) * (var11 - var6) / (var5 + -var6) + var2;
            int var15 = 16777215;
            SomethingFont var16 = null;
            if (var14 == 0) {
              if (AbstractGameWorld.aFloat727 == 3.0D) {
                var16 = Something3d2.aClass33_3019;
              }

              if (AbstractGameWorld.aFloat727 == 4.0D) {
                var16 = SocketStream.aClass33_1238;
              }

              if (AbstractGameWorld.aFloat727 == 6.0D) {
                var16 = DummyClass54.aClass33_1399;
              }

              if (AbstractGameWorld.aFloat727 >= 8.0D) {
                var16 = SomethingTexture1.aClass33_2637;
              }
            }

            if ((var14 == 2 -1)) {
              if (AbstractGameWorld.aFloat727 == 3.0D) {
                var16 = DummyClass54.aClass33_1399;
              }

              if (AbstractGameWorld.aFloat727 == 4.0D) {
                var16 = SomethingTexture1.aClass33_2637;
              }

              if (AbstractGameWorld.aFloat727 == 6.0D) {
                var16 = DummyClass25.aClass33_1626;
              }

              if (AbstractGameWorld.aFloat727 >= 8.0D) {
                var16 = SomethingTexture1.aClass33_2648;
              }
            }

            if (var14 == 2) {
              if (AbstractGameWorld.aFloat727 == 3.0D) {
                var16 = DummyClass25.aClass33_1626;
              }

              var15 = 16755200;
              if (AbstractGameWorld.aFloat727 == 4.0D) {
                var16 = SomethingTexture1.aClass33_2648;
              }

              if (AbstractGameWorld.aFloat727 == 6.0D) {
                var16 = DummyClass12.aClass33_2034;
              }

              if (AbstractGameWorld.aFloat727 >= 8.0D) {
                var16 = CollisionMap.aClass33_1305;
              }
            }

            if (DummyClass25.aClass131_1624.anIntArray1725[var9] != -1) {
              var15 = DummyClass25.aClass131_1624.anIntArray1725[var9];
            }

            if (var16 != null) {
              int var17 = AbstractTextureSampler.aClass3_Sub28_Sub17_2379.method691(
                DummyClass25.aClass131_1624.aClass94Array1721[var9], null,
                DirectImageProducer.aClass94Array2977);
              var13 -= var16.method998() * (var17 + -1) / 2;
              var13 += var16.method1006() / 2;

              for (int var18 = 0; var17 > var18; ++var18) {
                GameString var19 = DirectImageProducer.aClass94Array2977[var18];
                if (-1 + var17 > var18) {
                  var19.method1553(-4 + var19.getLength(), false);
                }

                var16.method1003(var19, var12, var13, var15, true);
                var13 += var16.method998();
              }
            }
          }
        }

      }
  }

  public static void method112(byte var0, byte var1) {
    if (AbstractImageProducer.aByteArrayArrayArray2008 == null) {
        AbstractImageProducer.aByteArrayArrayArray2008 = new byte[4][104][104];
      }

      if (var1 != 55) {
        SomethingInScenePacket202.anInt2281 = -87;
      }

      for (int var2 = 0; var2 < 4; ++var2) {
        for (int var3 = 0; ~var3 > -105; ++var3) {
          for (int var4 = 0; var4 < 104; ++var4) {
            AbstractImageProducer.aByteArrayArrayArray2008[var2][var3][var4] = var0;
          }
        }
      }
  }

  public static void method113(byte var0) {
    SomethingInScenePacket202.aClass94_2274 = null;
      SomethingInScenePacket202.aClass94_2276 = null;
      SomethingInScenePacket202.aClass94_2280 = null;
      SomethingInScenePacket202.aClass94_2267 = null;
      SomethingInScenePacket202.aClass94_2269 = null;
      int var1 = -100 % ((var0 - -43) / 46);
  }

  public static void method114(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7, int var8, int var9) {
    if (var0 != 3) {
        SomethingInScenePacket202.method117((byte) -26);
      }

      if (~var9 == ~var8 && var3 == var7 && var5 == var4 && var1 == var6) {
        SceneNode.method1869((byte) 84, var2, var6, var7, var5, var9);
      } else {
        int var11 = var7;
        int var10 = var9;
        int var12 = var9 * 3;
        int var13 = 3 * var7;
        int var14 = var8 * 3;
        int var15 = var3 * 3;
        int var16 = var4 * 3;
        int var17 = var1 * 3;
        int var18 = var5 + -var16 + var14 + -var9;
        int var19 = -var7 + var6 - (var17 + -var15);
        int var20 = var12 + -var14 + -var14 + var16;
        int var21 = var13 + -var15 + var17 + -var15;
        int var22 = -var12 + var14;
        int var23 = var15 + -var13;

        for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
          int var25 = var24 * var24 >> 12;
          int var26 = var24 * var25 >> 12;
          int var28 = var19 * var26;
          int var29 = var25 * var20;
          int var27 = var18 * var26;
          int var30 = var25 * var21;
          int var31 = var22 * var24;
          int var32 = var23 * var24;
          int var33 = (var31 + (var27 - -var29) >> 12) + var9;
          int var34 = var7 + (var32 + var28 + var30 >> 12);
          SceneNode.method1869((byte) -119, var2, var34, var11, var33, var10);
          var10 = var33;
          var11 = var34;
        }
      }
  }

  public static int method115(boolean var0, int var1) {
    long var2 = Time.getCurrentTimeMillis();
      if (var1 != -1) {
        SomethingInScenePacket202.method116(false, 11);
      }

      for (VariableUpdate var4 = !var0 ?
        (VariableUpdate) ClientScript.variableUpdates.getNext(-123) :
        (VariableUpdate) ClientScript.variableUpdates.getFirst(var1 + 56);
           var4 != null; var4 = (VariableUpdate) ClientScript.variableUpdates.getNext(-64)) {
        if ((4611686018427387903L & var4.timestamp) < var2) {
          if (((4611686018427387904L & var4.timestamp) != 1L -1)) {
            int var5 = (int) var4.key;
            DummyClass5.anIntArray2985[var5] = LightIntensity.variables[var5];
            var4.unlinkNode();
            return var5;
          }

          var4.unlinkNode();
        }
      }

      return -1;
  }

  public static void method116(boolean var0, int var1) {
    int var2 = DummyClass13.anInt2022;
      if (DummyClass45.anInt987 == TextureCache.localPlayer.anInt2819 >> 7
        && ~(TextureCache.localPlayer.anInt2829 >> 7) == ~DummyClass38.anInt733) {
        DummyClass45.anInt987 = 0;
      }

      if (var0) {
        var2 = 1;
      }

      int var3;
      Player var4;
      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for (var3 = 0; var3 < var2; ++var3) {
        if (var0) {
          var4 = TextureCache.localPlayer;
        } else {
          var4 = TextureSampler0.players[DummyClass42.anIntArray887[var3]];
        }

        if (var4 != null && var4.hasConfiguration((byte) 17)) {
          int var5 = var4.getSize();
          int var6;
          if ((var5 == 2 -1)) {
            if ((127 & var4.anInt2819) == 64 && (127 & var4.anInt2829) == 64) {
              var6 = var4.anInt2819 >> 7;
              var7 = var4.anInt2829 >> 7;
              if ((var6 >= 1 -1) && var6 < 104 && (var7 >= 1 -1) && ~var7 > -105) {
                ++DummyClass9.anIntArrayArray4010[var6][var7];
              }
            }
          } else if (
            ((1 & var5) != 0 || ((var4.anInt2819 & 127) == 1 -1) && ((127 & var4.anInt2829) == 1 -1)) && (
              ((1 & var5) != 2 -1) || ((var4.anInt2819 & 127) == 65 -1) && ((127
                  & var4.anInt2829) == 65 -1))) {
            var6 = var4.anInt2819 + -(var5 * 64) >> 7;
            var7 = var4.anInt2829 + -(var5 * 64) >> 7;
            var8 = var4.getSize() + var6;
            if (var8 > 104) {
              var8 = 104;
            }

            if (~var6 > -1) {
              var6 = 0;
            }

            var9 = var7 + var4.getSize();
            if (var7 < 0) {
              var7 = 0;
            }

            if ((var9 > 105 -1)) {
              var9 = 104;
            }

            for (var10 = var6; ~var10 > ~var8; ++var10) {
              for (var11 = var7; var11 < var9; ++var11) {
                ++DummyClass9.anIntArrayArray4010[var10][var11];
              }
            }
          }
        }
      }

      if (var1 == 670232012) {
        label226:
        for (var3 = 0; var2 > var3; ++var3) {
          long var16;
          if (var0) {
            var4 = TextureCache.localPlayer;
            var16 = 8791798054912L;
          } else {
            var4 = TextureSampler0.players[DummyClass42.anIntArray887[var3]];
            var16 = (long) DummyClass42.anIntArray887[var3] << 32;
          }

          if (var4 != null && var4.hasConfiguration((byte) 17)) {
            var4.aBoolean3968 =
              (Widget.aBoolean236 && (DummyClass13.anInt2022 > 201 -1) ||
                  DummyClass13.anInt2022 > 50)
                && !var0 && var4.anInt2764 == Objects
                  .requireNonNull(var4.getRenderAnimationId(false)).anInt368;

            var7 = var4.getSize();
            if ((var7 == 2 -1)) {
              if ((127 & var4.anInt2819) == 64 && (127 & var4.anInt2829) == 64) {
                var8 = var4.anInt2819 >> 7;
                var9 = var4.anInt2829 >> 7;
                if (~var8 > -1 || var8 >= 104 || ~var9 > -1 || var9 >= 104) {
                  continue;
                }

                if ((DummyClass9.anIntArrayArray4010[var8][var9] > 2 -1)) {
                  --DummyClass9.anIntArrayArray4010[var8][var9];
                  continue;
                }
              }
            } else if (
              ((1 & var7) == 1 -1) && ((127 & var4.anInt2819) == 1 -1) && (var4.anInt2829 & 127) == 0
                || (1 & var7) == 1 && ((127 & var4.anInt2819) == 65 -1)
                && (var4.anInt2829 & 127) == 0) {
              var8 = var4.anInt2819 + -(64 * var7) >> 7;
              var10 = var7 + var8;
              var9 = -(var7 * 64) + var4.anInt2829 >> 7;
              if (var10 > 104) {
                var10 = 104;
              }

              if (var8 < 0) {
                var8 = 0;
              }

              var11 = var7 + var9;
              if (~var9 > -1) {
                var9 = 0;
              }

              boolean var12 = true;
              if (var11 > 104) {
                var11 = 104;
              }

              int var13;
              int var14;
              for (var13 = var8; ~var13 > ~var10; ++var13) {
                for (var14 = var9; var11 > var14; ++var14) {
                  if (~DummyClass9.anIntArrayArray4010[var13][var14] >= -2) {
                    var12 = false;
                    break;
                  }
                }
              }

              if (var12) {
                var13 = var8;

                while (true) {
                  if (~var13 <= ~var10) {
                    continue label226;
                  }

                  for (var14 = var9; var11 > var14; ++var14) {
                    --DummyClass9.anIntArrayArray4010[var13][var14];
                  }

                  ++var13;
                }
              }
            }

            if (var4.anObject2796 != null && ~AbstractGameWorld.updateCycle <= ~var4.anInt2797
              && var4.anInt2778 > AbstractGameWorld.updateCycle) {
              var4.aBoolean3968 = false;
              var4.anInt2831 =
                BufferData.method1736(GameWorldSomething.currentPlane, 1, var4.anInt2819,
                  var4.anInt2829);
              TextureSampler28.method292(GameWorldSomething.currentPlane, var4.anInt2819,
                var4.anInt2829, var4.anInt2831, var4, var4.rotationY, var16, var4.anInt2788,
                var4.anInt2777, var4.anInt2818, var4.anInt2817);
            } else {
              var4.anInt2831 =
                BufferData.method1736(GameWorldSomething.currentPlane, 1, var4.anInt2819,
                  var4.anInt2829);
              DummyClass29.addNodeToSceneGraph(GameWorldSomething.currentPlane, var4.anInt2819,
                var4.anInt2829, var4.anInt2831, 64 * (var7 - 1) + 60, var4, var4.rotationY, var16,
                var4.aBoolean2810);
            }
          }
        }

      }
  }

  public static void method117(byte var0) {
    if (SomethingQuickChat2.anInt3536 < 0) {
        TextureSampler13.anInt3362 = -1;
        SomethingQuickChat2.anInt3536 = 0;
        ProceduralTexture.anInt1150 = -1;
      }

      if (SomethingQuickChat2.anInt3536 > DummyClass30.anInt455) {
        TextureSampler13.anInt3362 = -1;
        SomethingQuickChat2.anInt3536 = DummyClass30.anInt455;
        ProceduralTexture.anInt1150 = -1;
      }

      if (var0 != 87) {
        SomethingInScenePacket202.aClass94_2280 = null;
      }

      if (SpawnedGameObject.anInt2251 < 0) {
        ProceduralTexture.anInt1150 = -1;
        TextureSampler13.anInt3362 = -1;
        SpawnedGameObject.anInt2251 = 0;
      }

      if (DummyClass58.anInt1460 < SpawnedGameObject.anInt2251) {
        SpawnedGameObject.anInt2251 = DummyClass58.anInt1460;
        TextureSampler13.anInt3362 = -1;
        ProceduralTexture.anInt1150 = -1;
      }
  }

}
