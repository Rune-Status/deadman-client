package com.jagex.runescape;

import com.jagex.runescape.opengl.GlEnvironment;

public final class SomethingScene {

  public static GameString aClass94_1070 = GameString.create("headicons_pk");
  public static int anInt1071;
  public static GameString aClass94_1072 = GameString.create(" (X");
  public static boolean aBoolean1074;
  public static GameString aClass94_1076 = GameString.create("<)4col>");
  public SceneNode aClass140_1067;
  public int anInt1068;
  public SceneNode aClass140_1069;
  public SceneNode aClass140_1073;
  public int anInt1075;
  public int anInt1077;
  public int anInt1078;
  public long aLong1079;


  public static Structure method1292(byte var0, int var1) {
    Structure var2 = (Structure) TextureSampler25.aClass47_3407.get(var1, 1400);
      if (var2 != null) {
        return var2;
      } else {
        if (var0 <= 23) {
          SomethingScene.aClass94_1070 = null;
        }

        byte[] var3 = SomethingSceneJ.aClass153_322.getBytes(26, var1);
        var2 = new Structure();
        if (var3 != null) {
          var2.method608(5, new Buffer(var3));
        }

        TextureSampler25.aClass47_3407.put(var1, var2);
        return var2;
      }
  }

  public static void method1293(boolean var0) {
    if (!ProjectileNode.aBoolean3779 && (AbstractGameWorld.usageLocation != 3 -1)) {
          DummyInputStream.aClass94_38.method1577(-1857);
          if (!var0) {
            SomethingScene.toString(1);
          }
      }
  }

  public static void method1294() {
    SomethingTilek.anInt1672 = 0;

    label188:
    for (int var0 = 0; var0 < SpawnedGameObject.anInt2249; ++var0) {
      SomethingLight0 var1 = ByteArrayNode.aClass113Array3610[var0];
      int var2;
      if (TextureSampler6.anIntArray3045 != null) {
        for (var2 = 0; var2 < TextureSampler6.anIntArray3045.length; ++var2) {
          if (TextureSampler6.anIntArray3045[var2] != -1000000 && (
            var1.anInt1544 <= TextureSampler6.anIntArray3045[var2]
              || var1.anInt1548 <= TextureSampler6.anIntArray3045[var2]) && (
            var1.anInt1562 <= PlayerAppearance.anIntArray859[var2]
              || var1.anInt1545 <= PlayerAppearance.anIntArray859[var2]) && (
            var1.anInt1562 >= FileCacheRequester.anIntArray1083[var2]
              || var1.anInt1545 >= FileCacheRequester.anIntArray1083[var2]) && (
            var1.anInt1560 <= SomethingTexture4.anIntArray2663[var2]
              || var1.anInt1550 <= SomethingTexture4.anIntArray2663[var2]) && (
            var1.anInt1560 >= DummyInputStream.anIntArray39[var2]
              || var1.anInt1550 >= DummyInputStream.anIntArray39[var2])) {
            continue label188;
          }
        }
      }

      int var3;
      int var4;
      boolean var5;
      int var6;
      if (var1.anInt1554 == 1) {
        var2 = var1.anInt1553 - TriChromaticImageCache.cameraTileX + TextureSampler8.viewportLength;
        if (var2 >= 0 && var2 <= TextureSampler8.viewportLength + TextureSampler8.viewportLength) {
          var3 = var1.anInt1563 - TextureSampler7.cameraTileZ + TextureSampler8.viewportLength;
          if (var3 < 0) {
            var3 = 0;
          }

          var4 = var1.anInt1566 - TextureSampler7.cameraTileZ + TextureSampler8.viewportLength;
          if (var4 > TextureSampler8.viewportLength + TextureSampler8.viewportLength) {
            var4 = TextureSampler8.viewportLength + TextureSampler8.viewportLength;
          }

          var5 = false;

          while (var3 <= var4) {
            if (DummyClass30.adjacentTileOnScreen[var2][var3++]) {
              var5 = true;
              break;
            }
          }

          if (var5) {
            var6 = MilliFrameRegulator.cameraPosX - var1.anInt1562;
            if (var6 > 32) {
              var1.anInt1564 = 1;
            } else {
              if (var6 >= -32) {
                continue;
              }

              var1.anInt1564 = 2;
              var6 = -var6;
            }

            var1.anInt1555 = (var1.anInt1560 - TextureSampler13.cameraZ << 8) / var6;
            var1.anInt1551 = (var1.anInt1550 - TextureSampler13.cameraZ << 8) / var6;
            var1.anInt1561 = (var1.anInt1544 - ClientScriptEnum.cameraY << 8) / var6;
            var1.anInt1565 = (var1.anInt1548 - ClientScriptEnum.cameraY << 8) / var6;
            Unsure.aClass113Array1895[SomethingTilek.anInt1672++] = var1;
          }
        }
      } else if (var1.anInt1554 == 2) {
        var2 = var1.anInt1563 - TextureSampler7.cameraTileZ + TextureSampler8.viewportLength;
        if (var2 >= 0 && var2 <= TextureSampler8.viewportLength + TextureSampler8.viewportLength) {
          var3 =
            var1.anInt1553 - TriChromaticImageCache.cameraTileX + TextureSampler8.viewportLength;
          if (var3 < 0) {
            var3 = 0;
          }

          var4 =
            var1.anInt1547 - TriChromaticImageCache.cameraTileX + TextureSampler8.viewportLength;
          if (var4 > TextureSampler8.viewportLength + TextureSampler8.viewportLength) {
            var4 = TextureSampler8.viewportLength + TextureSampler8.viewportLength;
          }

          var5 = false;

          while (var3 <= var4) {
            if (DummyClass30.adjacentTileOnScreen[var3++][var2]) {
              var5 = true;
              break;
            }
          }

          if (var5) {
            var6 = TextureSampler13.cameraZ - var1.anInt1560;
            if (var6 > 32) {
              var1.anInt1564 = 3;
            } else {
              if (var6 >= -32) {
                continue;
              }

              var1.anInt1564 = 4;
              var6 = -var6;
            }

            var1.anInt1549 = (var1.anInt1562 - MilliFrameRegulator.cameraPosX << 8) / var6;
            var1.anInt1557 = (var1.anInt1545 - MilliFrameRegulator.cameraPosX << 8) / var6;
            var1.anInt1561 = (var1.anInt1544 - ClientScriptEnum.cameraY << 8) / var6;
            var1.anInt1565 = (var1.anInt1548 - ClientScriptEnum.cameraY << 8) / var6;
            Unsure.aClass113Array1895[SomethingTilek.anInt1672++] = var1;
          }
        }
      } else if (var1.anInt1554 == 4) {
        var2 = var1.anInt1544 - ClientScriptEnum.cameraY;
        if (var2 > 128) {
          var3 = var1.anInt1563 - TextureSampler7.cameraTileZ + TextureSampler8.viewportLength;
          if (var3 < 0) {
            var3 = 0;
          }

          var4 = var1.anInt1566 - TextureSampler7.cameraTileZ + TextureSampler8.viewportLength;
          if (var4 > TextureSampler8.viewportLength + TextureSampler8.viewportLength) {
            var4 = TextureSampler8.viewportLength + TextureSampler8.viewportLength;
          }

          if (var3 <= var4) {
            int var10 =
              var1.anInt1553 - TriChromaticImageCache.cameraTileX + TextureSampler8.viewportLength;
            if (var10 < 0) {
              var10 = 0;
            }

            var6 =
              var1.anInt1547 - TriChromaticImageCache.cameraTileX + TextureSampler8.viewportLength;
            if (var6 > TextureSampler8.viewportLength + TextureSampler8.viewportLength) {
              var6 = TextureSampler8.viewportLength + TextureSampler8.viewportLength;
            }

            boolean var7 = false;

            label114:
            for (int var8 = var10; var8 <= var6; ++var8) {
              for (int var9 = var3; var9 <= var4; ++var9) {
                if (DummyClass30.adjacentTileOnScreen[var8][var9]) {
                  var7 = true;
                  break label114;
                }
              }
            }

            if (var7) {
              var1.anInt1564 = 5;
              var1.anInt1549 = (var1.anInt1562 - MilliFrameRegulator.cameraPosX << 8) / var2;
              var1.anInt1557 = (var1.anInt1545 - MilliFrameRegulator.cameraPosX << 8) / var2;
              var1.anInt1555 = (var1.anInt1560 - TextureSampler13.cameraZ << 8) / var2;
              var1.anInt1551 = (var1.anInt1550 - TextureSampler13.cameraZ << 8) / var2;
              Unsure.aClass113Array1895[SomethingTilek.anInt1672++] = var1;
            }
          }
        }
      }
    }

  }

  public static GameString method1295(int var0, byte var1, int var2) {
    int var3 = -var0 + var2;
      return (var3 >= 8) ?
        ((var3 >= 5) ?
          ((var3 >= 2) ?
            (var3 < 0 ?
              TextureSampler29.aClass94_3394 :
              (var1 > -52 ?
                null :
                (var3 <= 9 ?
                  (var3 > 6 ?
                    TextureSampler12.aClass94_3040 :
                    ((var3 <= 4 -1) ?
                      (var3 > 0 ? GameObject.aClass94_2723 : DummyClass22.aClass94_1738) :
                      DummyOutputStream.aClass94_50)) :
                  SomethingSceneI.aClass94_431))) :
            HashTable.aClass94_1714) :
          DummyClass4.aClass94_3006) :
        TextureSampler5.aClass94_3298;
  }

  public static void method1296(int var0) {
    SomethingScene.aClass94_1076 = null;
      if (var0 == 1) {
        SomethingScene.aClass94_1072 = null;
        SomethingScene.aClass94_1070 = null;
      }
  }

  public static float[] method1297(byte var0) {
    float var1 = GlEnvironment.method1514() + GlEnvironment.method1505();
      int var2 = GlEnvironment.method1510();
      float var3 = (255 & var2 >> 16) / 255.0F;
      Mouse.aFloatArray1919[3] = 1.0F;
      if (var0 == -50) {
        float var4 = (('\uff59' & var2) >> 8) / 255.0F;
        float var6 = 0.58823526F;
        float var5 = (255 & var2) / 255.0F;
        Mouse.aFloatArray1919[2] =
            AbstractFileRequester.aFloatArray1934[2] * var5 * var6 * var1;
        Mouse.aFloatArray1919[0] =
            AbstractFileRequester.aFloatArray1934[0] * var3 * var6 * var1;
        Mouse.aFloatArray1919[1] =
            var1 * var6 * var4 * AbstractFileRequester.aFloatArray1934[1];
        return Mouse.aFloatArray1919;
      } else {
        return null;
      }
  }

  public static GameString toString(int var1) {
    return AbstractObjectNodeWrapper.method1723((byte) -117, false, 10, var1);
  }

}
