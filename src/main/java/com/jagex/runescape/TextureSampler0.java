package com.jagex.runescape;

public final class TextureSampler0 extends AbstractTextureSampler {

  public static int anInt3267;
  public static GameString aClass94_3268 = GameString.create(")1");
  public static Player[] players = new Player[2048];
  public static AbstractIndexedColorSprite[] aClass109Array3270;
  public static long[] aLongArray3271 = new long[500];
  public static boolean[] aBooleanArray3272;
  public static Deque[][][] groundItems = new Deque[4][104][104];
  public static int sunPositionY;
  public static boolean aBoolean3275 = true;
  public static int anInt3277;
  private int anInt3276;


  private TextureSampler0(int var1) {
    super(0, true);
    this.anInt3276 = 4096;

    this.anInt3276 = var1;
  }

  public TextureSampler0() {
    this(4096);
  }

  public int[] method154(int var1, byte var2 ) {
    int[] var4 = this.monoChromaticImageCache.method1709(-16409, var1);
      if (this.monoChromaticImageCache.aBoolean1580) {
        ArrayUtils.fill(var4, 0, SomethingLight0.anInt1559, this.anInt3276);
      }
      return var4;
  }

  public void parseConfig(int var1, Buffer var2, boolean var3 ) {
    if (var1 == 0) {
        this.anInt3276 = (var2.readUnsignedByte() << 12) / 255;
      }
  }

  public static void method273(int[] var0, byte var1, NPC var2, int[] var3, int[] var4) {
    int var5 = 0;
      if (var1 > 81) {
        while (var5 < var4.length) {
          int var6 = var4[var5];
          int var7 = var0[var5];
          int var8 = var3[var5];

          for (int var9 = 0; (var7 != 1 -1)
              && var2.aClass145Array2809.length > var9; ++var9) {
            if ((1 & var7) != 0) {
              if (~var6 == 0) {
                var2.aClass145Array2809[var9] = null;
              } else {
                AnimationSequence var10 = GameClient.method45(var6, (byte) -20);
                Unsure var12 = var2.aClass145Array2809[var9];
                int var11 = var10.anInt1845;
                if (var12 != null) {
                  if (~var6 != ~var12.anInt1890) {
                    if (~var10.anInt1857 <= ~GameClient.method45(var12.anInt1890,
                      (byte) -20).anInt1857) {
                      var12 = var2.aClass145Array2809[var9] = null;
                    }
                  } else if (~var11 == -1) {
                    var12 = var2.aClass145Array2809[var9] = null;
                  } else if (~var11 == -2) {
                    var12.anInt1893 = 0;
                    var12.anInt1894 = 0;
                    var12.anInt1891 = 1;
                    var12.anInt1897 = 0;
                    var12.anInt1900 = var8;
                    SocketStream.method1470(var2.anInt2829, var10, 183921384, var2.anInt2819, false,
                      0);
                  } else if (~var11 == -3) {
                    var12.anInt1894 = 0;
                  }
                }

                if (var12 == null) {
                  var12 = var2.aClass145Array2809[var9] = new Unsure();
                  var12.anInt1891 = 1;
                  var12.anInt1897 = 0;
                  var12.anInt1900 = var8;
                  var12.anInt1890 = var6;
                  var12.anInt1894 = 0;
                  var12.anInt1893 = 0;
                  SocketStream.method1470(var2.anInt2829, var10, 183921384, var2.anInt2819, false,
                    0);
                }
              }
            }

            var7 >>>= 1;
          }

          ++var5;
        }

      }
  }

  public static void method274(int var0) {
    TextureSampler0.players = null;
      if (var0 != -2) {
        TextureSampler0.aClass94_3268 = null;
      }

      TextureSampler0.aClass94_3268 = null;
      TextureSampler0.aBooleanArray3272 = null;
      TextureSampler0.aClass109Array3270 = null;
      TextureSampler0.aLongArray3271 = null;
      TextureSampler0.groundItems = null;
  }

}
