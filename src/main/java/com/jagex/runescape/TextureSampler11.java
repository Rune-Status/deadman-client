package com.jagex.runescape;

public final class TextureSampler11 extends AbstractTextureSampler {

  private static GameString aClass94_3247 = GameString.create("flash1:");
  public static int anInt3244;
  public static int anInt3248;
  public static GameString aClass94_3251 = GameString.create("M-Bmoire attribu-Be");
  public static GameString aClass94_3249 = TextureSampler11.aClass94_3247;
  public static GameString aClass94_3246 = TextureSampler11.aClass94_3247;
  private int anInt3245 = 4096;
  private int anInt3250 = 4096;
  private int anInt3252 = 4096;

  public TextureSampler11() {
    super(1, false);
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (-1 == ~var1) {
        this.anInt3252 = var2.readUnsignedShort();
      } else {
        if (var1 == 1) {
          this.anInt3245 = var2.readUnsignedShort();
        } else {
          if (2 == var1) {
            this.anInt3250 = var2.readUnsignedShort();
          }
        }
      }

      if (!var3) {
        TextureSampler11.method266(12);
      }
  }

  public int[][] method166(int var1, int var2 ) {
    if (var1 != -1) {
        TextureSampler11.anInt3244 = -40;
      }

      int[][] var3 = this.triChromaticImageCache
          .method1594((byte) -115, var2);
      if (this.triChromaticImageCache.aBoolean1379) {
        int[][] var4 = this.method162(var2, 0, (byte) -74);
        assert var4 != null;
        int[] var5 = var4[0];
        int[] var6 = var4[1];
        int[] var7 = var4[2];
        int[] var9 = var3[1];
        int[] var8 = var3[0];
        int[] var10 = var3[2];

        for (int var11 = 0; ~var11 > ~SomethingLight0.anInt1559; ++var11) {
          int var12 = var5[var11];
          int var14 = var6[var11];
          int var13 = var7[var11];
          if (~var12 == ~var13 && ~var14 == ~var13) {
            var8[var11] = this.anInt3252 * var12 >> 12;
            var9[var11] = var13 * this.anInt3245 >> 12;
            var10[var11] = var14 * this.anInt3250 >> 12;
          } else {
            var8[var11] = this.anInt3252;
            var9[var11] = this.anInt3245;
            var10[var11] = this.anInt3250;
          }
        }
      }

      return var3;
  }

  public static void method266(int var0) {
    TextureSampler11.aClass94_3249 = null;
      TextureSampler11.aClass94_3247 = null;
      if (var0 == -1443422260) {
        TextureSampler11.aClass94_3246 = null;
        TextureSampler11.aClass94_3251 = null;
      }
  }

}