package com.jagex.runescape;

public final class DummyClass14 {

  private static GameString aClass94_1958 =
    GameString.create("Please wait )2 attempting to reestablish)3");
  private static GameString aClass94_1963 = GameString.create("glow2:");
  public static ObjectCache aClass93_1955 = new ObjectCache(64);
  public static int anInt1956;
  public static int anInt1957;
  public static int[] anIntArray1960 = new int[14];
  public static ObjectCache aClass93_1964 = new ObjectCache(5);
  public static ObjectCache aClass93_1965 = new ObjectCache(50);
  public static int titleBackgroundFileId = -1;
  public static FileUnpacker aClass153_1967;
  public static GameString ATTEMPTING_TO_RECONNECT = DummyClass14.aClass94_1958;
  public static GameString aClass94_1961 = DummyClass14.aClass94_1963;
  public static GameString aClass94_1962 = DummyClass14.aClass94_1963;

  public static void method2145(byte var0) {
    try {
      DummyClass14.aClass93_1955 = null;
      DummyClass14.aClass94_1962 = null;
      DummyClass14.ATTEMPTING_TO_RECONNECT = null;
      if (var0 >= -41) {
        DummyClass14.method2147(-28, 103, -37);
      }

      DummyClass14.aClass94_1958 = null;
      DummyClass14.aClass94_1963 = null;
      DummyClass14.anIntArray1960 = null;
      DummyClass14.aClass153_1967 = null;
      DummyClass14.aClass93_1965 = null;
      DummyClass14.aClass94_1961 = null;
      DummyClass14.aClass93_1964 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "vf.A(" + var0 + ')');
    }
  }

  public static void method2146(int var0, int var1, int var2, int var3, SceneNode var4,
                               SceneNode var5, int var6, int var7, long var8) {
    if (var4 != null || var5 != null) {
      SceneSomething2 var10 = new SceneSomething2();
      var10.key = var8;
      var10.positionX = var1 * 128 + 64;
      var10.positionZ = var2 * 128 + 64;
      var10.positionY = var3;
      var10.sceneNode0 = var4;
      var10.sceneNode1 = var5;
      var10.anInt1055 = var6;
      var10.anInt1059 = var7;

      for (int var11 = var0; var11 >= 0; --var11) {
        if (SomethingTexture1.sceneGraphTiles[var11][var1][var2] == null) {
          SomethingTexture1.sceneGraphTiles[var11][var1][var2] =
            new SceneGraphTile(var11, var1, var2);
        }
      }

      SomethingTexture1.sceneGraphTiles[var0][var1][var2].aClass70_2234 = var10;
    }
  }

  public static SceneSomething2 method2147(int var0, int var1, int var2) {
    SceneGraphTile var3 = SomethingTexture1.sceneGraphTiles[var0][var1][var2];
    return var3 == null ? null : var3.aClass70_2234;
  }

  public static GameString method2148(int var0, byte var1) {
    try {
      if (999999999 <= var0) {
        if (var1 != -78) {
          DummyClass14.method2145((byte) -8);
        }

        return DummyHashTable.aClass94_1687;
      } else {
        return SomethingScene.toString(var0);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "vf.C(" + var0 + ',' + var1 + ')');
    }
  }

}