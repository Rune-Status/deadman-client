package com.jagex.runescape;

public final class SomethingSceneI {

  public static int anInt421;
  public static GameString aClass94_422 = GameString.create("loc");
  public static GameString aClass94_431 = GameString.create("<col=00ff00>");
  public static int anInt433;
  public int anInt420;
  public SceneNode aClass140_423;
  public int anInt424;
  public int anInt425;
  public int anInt426;
  public int anInt427;
  public long aLong428;
  public SceneNode aClass140_429;
  public int anInt430;
  public int anInt432;

  public static void method906(byte var0) {
    try {
      SomethingSceneI.aClass94_422 = null;
      if (var0 != 112) {
        SomethingSceneI.method906((byte) -42);
      }

      SomethingSceneI.aClass94_431 = null;
    } catch (RuntimeException var2) {
      throw AbstractGameWorld.cascadeException(var2, "df.A(" + var0 + ')');
    }
  }

}