package com.jagex.runescape;

import com.jagex.runescape.common.ArrayUtils;
import com.jagex.runescape.node.Node;

public final class Inventory extends Node {

  public static short[] aShortArray2548;
  public static int anInt2549;
  public static int[] anIntArray2550 = new int[50];
  public static AbstractFrameRegulator frameRateRegulator;
  public int[] ids = {-1};
  public int[] counts = {0};

  public static void method509(int var0, int var1) {
    --TextureSampler25.amountContextActions;
      if (TextureSampler25.amountContextActions != var1) {
        ArrayUtils.copy(GroundItem.aClass94Array2935, var1 + 1, GroundItem.aClass94Array2935, var1,
          -var1 + TextureSampler25.amountContextActions);
        ArrayUtils.copy(DummyClass8.aClass94Array4016, 1 + var1, DummyClass8.aClass94Array4016,
          var1, TextureSampler25.amountContextActions - var1);
        ArrayUtils.method1358(MonoChromaticImageCache.anIntArray1578, 1 + var1,
          MonoChromaticImageCache.anIntArray1578, var1,
          -var1 + TextureSampler25.amountContextActions);
        ArrayUtils.method1361(TextureSampler27.aShortArray3095, 1 + var1,
          TextureSampler27.aShortArray3095, var1, TextureSampler25.amountContextActions - var1);
        ArrayUtils.method1356(TextureSampler0.aLongArray3271, 1 + var1,
          TextureSampler0.aLongArray3271, var1, -var1 + TextureSampler25.amountContextActions);
        ArrayUtils.method1358(DummyClass26.anIntArray1613, var1 + var0, DummyClass26.anIntArray1613,
          var1, -var1 + TextureSampler25.amountContextActions);
        ArrayUtils.method1358(DummyClass32.anIntArray512, 1 + var1, DummyClass32.anIntArray512,
          var1, TextureSampler25.amountContextActions - var1);
      }
  }

  public static void method510(int var0) {
    if (var0 > -73) {
        Inventory.method510(-59);
      }

      Inventory.frameRateRegulator = null;
      Inventory.aShortArray2548 = null;
      Inventory.anIntArray2550 = null;
  }

}
