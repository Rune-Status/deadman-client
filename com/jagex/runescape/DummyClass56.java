package com.jagex.runescape;

public final class DummyClass56 {

  public static int spawnSceneY;
  public static Widget aClass11_1453;
  public static GameString[] aClass94Array1454;
  public static GameString aClass94_1455 = GameString.create(" loggt sich aus)3");


  public static void method1645(FileUnpacker var0, FileUnpacker var1, byte var2) {
    try {
      Keyboard.sprites = var1;
      int var4 = (int) (21.0D * Math.random()) - 10;
      ScriptState.configs = var0;
      int var5 = (int) (21.0D * Math.random()) - 10;
      ScriptState.configs.getAmountChildren(34, (byte) 103);
      int var3 = (int) (Math.random() * 21.0D) + -10;
      int var6 = -20 + (int) (41.0D * Math.random());
      AbstractImageProducer.anInt2015 = var6 + var5;
      if (var2 == -67) {
        DummyClass39.anInt740 = var4 + var6;
        TextureCache.anInt2136 = var6 + var3;
      }
    } catch (RuntimeException var7) {
      throw AbstractGameWorld.cascadeException(var7,
        "og.F(" + (var0 != null ? "{...}" : "null") + ',' + (var1 != null ? "{...}" : "null") + ','
          + var2 + ')');
    }
  }

  public static void method1646(boolean var0) {
    try {
      DummyClass56.aClass94_1455 = null;

      DummyClass56.aClass94Array1454 = null;
      DummyClass56.aClass11_1453 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "og.E(" + var0 + ')');
    }
  }

  public static void method1647(byte var0, int var1, int var2, Mobile var3, int var4, int var5,
                               int var6) {
    try {
      if (var0 != 122) {
        DummyClass56.method1648(null, 7);
      }

      AbstractObjectNodeWrapper.method1724(var6, var2, var3.anInt2829, var5, var1, var3.anInt2819,
        (byte) -85, var4);
    } catch (RuntimeException var8) {
      throw AbstractGameWorld.cascadeException(var8,
        "og.A(" + var0 + ',' + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ','
          + var4 + ',' + var5 + ',' + var6 + ')');
    }
  }

  public static void method1648(FileUnpacker var0, int var1) {
    try {
      DummyClass55.aClass153_1420 = var0;
      if (var1 != 255) {
        DummyClass56.spawnSceneY = -56;
      }

    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3,
        "og.B(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
    }
  }

  public static void method1649(int var0, int var1) {
    try {
      if (var1 <= -65) {
        WidgetUpdate var2 = AudioStreamEncoder3.method466(4, 10, var0);
        var2.createIndexedColorSprite(true);
      }
    } catch (RuntimeException var3) {
      throw AbstractGameWorld.cascadeException(var3, "og.C(" + var0 + ',' + var1 + ')');
    }
  }

  public static void method1650(int var0) {
    try {
      Deque.aClass93_939.method1523((byte) -113);
      if (var0 != 21) {
        DummyClass56.aClass11_1453 = null;
      }

    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "og.G(" + var0 + ')');
    }
  }

  public static int method1651(int var0, int var1, int var2) {
    try {
      int var3;
      if (~var2 > ~var1) {
        var3 = var2;
        var2 = var1;
        var1 = var3;
      }

      while (var1 != 0) {
        var3 = var2 % var1;
        var2 = var1;
        var1 = var3;
      }

      if (var0 != 19067) {
        DummyClass56.aClass94Array1454 = null;
      }

      return var2;
    } catch (RuntimeException var4) {
      throw AbstractGameWorld.cascadeException(var4,
        "og.D(" + var0 + ',' + var1 + ',' + var2 + ')');
    }
  }

}
