package com.jagex.runescape;

import java.util.Arrays;

public final class DummyClass42 {

  private static GameString aClass94_894 = GameString.create("Walk here");
  public static MonoChromaticImageBuffer aClass3_Sub26_884 = new MonoChromaticImageBuffer(0, 0);
  public static Cache aClass47_885 = new Cache(128);
  public static Widget aClass11_886;
  public static int[] anIntArray887 = new int[2048];
  public static GameString aClass94_888 = GameString.create("<col=ffff00>");
  public static int anInt889;
  public static DisplayMode[] aClass106Array890;
  public static GameString aClass94_892 = GameString.create(" )2> <col=ffffff>");
  public static int anInt893;
  public static GameString DEFAULT_WALK_TOOLTIP = DummyClass42.aClass94_894;

  public static int method1186(int var0, int var1) {
    double var2 = (255 & var1 >> 16) / 256.0D;
      double var4 = (255 & var1 >> 8) / 256.0D;
      double var12 = 0.0D;
      double var6 = (255 & var1) / 256.0D;
      double var8 = var2;
      double var14 = var0;
      double var10 = var2;
      if (var2 > var4) {
        var8 = var4;
      }

      if (var6 < var8) {
        var8 = var6;
      }

      if (var4 > var2) {
        var10 = var4;
      }

      if (var6 > var10) {
        var10 = var6;
      }

      double var16 = (var8 + var10) / 2.0D;
      if (var8 != var10) {
        if (var16 < 0.5D) {
          var14 = (-var8 + var10) / (var8 + var10);
        }

        if (var16 >= 0.5D) {
          var14 = (-var8 + var10) / (2.0D - var10 - var8);
        }

        if (var10 == var2) {
          var12 = (var4 - var6) / (-var8 + var10);
        } else if (var4 == var10) {
          var12 = 2.0D + (-var2 + var6) / (var10 - var8);
        } else if (var10 == var6) {
          var12 = 4.0D + (-var4 + var2) / (-var8 + var10);
        }
      }

      int var19 = (int) (var14 * 256.0D);
      int var20 = (int) (256.0D * var16);
      var12 /= 6.0D;
      if (var20 < 0) {
        var20 = 0;
      } else if ((var20 > 256 -1)) {
        var20 = 255;
      }

      int var18 = (int) (var12 * 256.0D);
      if ((var19 >= 1 -1)) {
        if (var19 > 255) {
          var19 = 255;
        }
      } else {
        var19 = 0;
      }

      if (~var20 >= -244) {
        if (~var20 >= -218) {
          if ((var20 > 193 -1)) {
            var19 >>= 2;
          } else if ((var20 > 180 -1)) {
            var19 >>= 1;
          }
        } else {
          var19 >>= 3;
        }
      } else {
        var19 >>= 4;
      }

      return (var18 >> 2 << 10) + (var19 >> 5 << 7) + (var20 >> 1);
  }

  public static void method1187(int var0) {
    if (var0 != 30351) {
        DummyClass42
            .addNodeToSceneGraph(-73, -127, -26, 43, 67, 125, 38, 80, null, -92, true, 27L);
      }

      DummyClass42.DEFAULT_WALK_TOOLTIP = null;
      DummyClass42.aClass94_892 = null;
      DummyClass42.aClass11_886 = null;
      DummyClass42.anIntArray887 = null;
      DummyClass42.aClass94_894 = null;
      DummyClass42.aClass94_888 = null;
      DummyClass42.aClass47_885 = null;
      DummyClass42.aClass106Array890 = null;
      DummyClass42.aClass3_Sub26_884 = null;
  }

  public static void method1188(int var0) {
    Mouse.anIntArray1920 = null;
      DummyClass36.anIntArrayArrayArray2609 = null;
      IntegerNode.anIntArray2469 = null;
      ObjectCache.tileOrientation = null;
      DummyClass18.aByteArrayArrayArray81 = null;
      MouseRecorder.aByteArrayArrayArray1014 = null;
      DummyClass17.tileFloors = null;
      TextureSampler36.floorUnderlayIds = null;
      HashTableIterator.anIntArray1138 = null;
      if (var0 >= -60) {
        DummyClass42.DEFAULT_WALK_TOOLTIP = null;
      }

      AbstractFrameRegulator.anIntArray1695 = null;
      SomethingPacket151.anIntArray2606 = null;
  }

  public static boolean addNodeToSceneGraph(int plane, int var1, int var2, int var3, int var4,
                                           int var5, int var6, int var7, SceneNode var8, int var9,
                                           boolean var10, long var11) {
    boolean var13 = Arrays.deepEquals(AbstractGameWorld.heightMap,
        AbstractObjectNode.othrrHeightMap);
    int var14 = 0;

    int x;
    for (int var15 = var1; var15 < var1 + var3; ++var15) {
      for (x = var2; x < var2 + var4; ++x) {
        if (var15 < 0 || x < 0 || var15 >= SocketStream.sceneWidth
          || x >= TextureSampler17.sceneHeight) {
          return false;
        }

        SceneGraphTile var17 = SomethingTexture1.sceneGraphTiles[plane][var15][x];
        if (var17 != null && var17.anInt2223 >= 5) {
          return false;
        }
      }
    }

    SceneSomething var20 = new SceneSomething();
    var20.aLong498 = var11;
    var20.anInt493 = plane;
    var20.anInt482 = var5;
    var20.anInt484 = var6;
    var20.anInt489 = var7;
    var20.sceneNode = var8;
    var20.anInt496 = var9;
    var20.anInt483 = var1;
    var20.anInt478 = var2;
    var20.anInt495 = var1 + var3 - 1;
    var20.anInt481 = var2 + var4 - 1;

    int y;
    for (x = var1; x < var1 + var3; ++x) {
      for (y = var2; y < var2 + var4; ++y) {
        int var18 = 0;
        if (x > var1) {
          ++var18;
        }

        if (x < var1 + var3 - 1) {
          var18 += 4;
        }

        if (y > var2) {
          var18 += 8;
        }

        if (y < var2 + var4 - 1) {
          var18 += 2;
        }

        for (int var19 = plane; var19 >= 0; --var19) {
          if (SomethingTexture1.sceneGraphTiles[var19][x][y] == null) {
            SomethingTexture1.sceneGraphTiles[var19][x][y] = new SceneGraphTile(var19, x, y);
          }
        }

        SceneGraphTile var22 = SomethingTexture1.sceneGraphTiles[plane][x][y];
        var22.sceneGraphNodes[var22.anInt2223] = var20;
        var22.anIntArray2237[var22.anInt2223] = var18;
        var22.flags |= var18;
        ++var22.anInt2223;
        if (var13 && TextureSampler16.anIntArrayArray3115[x][y] != 0) {
          var14 = TextureSampler16.anIntArrayArray3115[x][y];
        }
      }
    }

    if (var13 && var14 != 0) {
      for (x = var1; x < var1 + var3; ++x) {
        for (y = var2; y < var2 + var4; ++y) {
          if (TextureSampler16.anIntArrayArray3115[x][y] == 0) {
            TextureSampler16.anIntArrayArray3115[x][y] = var14;
          }
        }
      }
    }

    if (var10) {
      AnimationSequence.aClass25Array1868[TextureSampler21.anInt3070++] = var20;
    }

    return true;
  }

}
