package com.jagex.runescape;

import com.jagex.runescape.common.GameString;
import com.jagex.runescape.common.GameStringStatics;
import com.jagex.runescape.node.SubNode;
import com.jagex.runescape.opengl.GlFont;
import com.jagex.runescape.opengl.GlRenderer;

public final class Queue {

  public static FileUnpacker globalQuickchats;
  public static GameString aClass94_334 = GameStringStatics.create("Lade Texturen )2 ");
  private final SubNode root = new SubNode();
  private SubNode iterator;


  public Queue() {
    this.root.nextSubNode = this.root;
      this.root.prevSubNode = this.root;
  }

  public int size() {
    int var2 = 0;
      for (SubNode node = this.root.nextSubNode; node != this.root; ++var2) {
        node = node.nextSubNode;
      }
      return var2;
  }

  public SubNode getFirst() {
    SubNode node = this.root.nextSubNode;
      if (this.root == node) {
        this.iterator = null;
        return null;
      }
      this.iterator = node.nextSubNode;
      return node;
  }

  public SubNode poll() {
    SubNode var2 = this.root.nextSubNode;
      if (this.root == var2) {
        return null;
      }
      var2.unlinkSubNode();
      return var2;
  }

  public SubNode getNext() {
    SubNode var2 = this.iterator;
      if (var2 == this.root) {
        this.iterator = null;
        return null;
      } else {
        this.iterator = var2.nextSubNode;
        return var2;
      }
  }

  public void addLast(SubNode var1 ) {
    if (var1.prevSubNode != null) {
        var1.unlinkSubNode();
      }

      var1.prevSubNode = this.root.prevSubNode;
      var1.nextSubNode = this.root;
      var1.prevSubNode.nextSubNode = var1;
      var1.nextSubNode.prevSubNode = var1;
  }

  public void clear() {
    while (true) {
        SubNode var2 = this.root.nextSubNode;
        if (this.root == var2) {
          this.iterator = null;
          return;
        }

        var2.unlinkSubNode();
      }
  }

  public static void method875(byte var0) {
    int var1 = -102 / ((var0 - 35) / 48);
      Queue.globalQuickchats = null;
      Queue.aClass94_334 = null;
  }

  public static AbstractFont createFont(int var0, byte[] var1) {
    if (var1 != null) {
        if (var0 == -22376) {
          AbstractFont var2;
          if (GlRenderer.useOpenGlRenderer) {
            var2 = new GlFont(var1, Something3dRoot.anIntArray2048,
                GlobalStatics_0.anIntArray2591,
                GroundItem.anIntArray2931, TextureSampler26.anIntArray3076,
                DummyClass5.aByteArrayArray2987);
          } else {
            var2 = new SoftwareFont(var1, Something3dRoot.anIntArray2048,
                GlobalStatics_0.anIntArray2591,
                GroundItem.anIntArray2931, TextureSampler26.anIntArray3076,
                DummyClass5.aByteArrayArray2987);
          }

          DummyClass37.method1035((byte) 106);
          return var2;
        } else {
          return null;
        }
      } else {
        return null;
      }
  }

  public static void method881(int var0, int var1, int var2, int var3, int var4, int var5, int var6,
                              int var7, int var8, int var9) {
    if (var2 <= -65) {
        SpawnedGameObject var10 = null;

        for (SpawnedGameObject var11 =
             (SpawnedGameObject) TextureSampler26.aClass61_3075.getFirst();
             var11 != null; var11 = (SpawnedGameObject) TextureSampler26.aClass61_3075.getNext()) {
          if (var11.anInt2250 == var0 && (var4 == var11.anInt2264) && var11.anInt2248 == var1
            && (var7 == var11.anInt2263)) {
            var10 = var11;
            break;
          }
        }

        if (var10 == null) {
          var10 = new SpawnedGameObject();
          var10.anInt2264 = var4;
          var10.anInt2248 = var1;
          var10.anInt2250 = var0;
          var10.anInt2263 = var7;
          DummyClass22.method1798(72, var10);
          TextureSampler26.aClass61_3075.addLast(var10);
        }

        var10.anInt2262 = var8;
        var10.anInt2261 = var9;
        var10.aliveTime = var5;
        var10.anInt2265 = var6;
        var10.anInt2256 = var3;
      }
  }

  public static void method882(int var0, int var1) {
    TextureSampler36.anInt3423 = 0;
      DummyClass22.anInt1741 = -1;
      SomethingQuickChatK.anInt154 = 1;
      SpotAnimationConfig.anInt546 = var1;
      AreaSoundEffect.aBoolean2311 = false;
      DummyClass55.aClass153_1423 = null;
      TextureSampler8.anInt3463 = var0;
  }

  public static SomethingWorldMapy method884(int var0, byte var1, int var2) {
    SomethingWorldMapy var3 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getFirst();

      for (int var4 = -82 % ((var1 - 11) / 32);
           var3 != null; var3 = (SomethingWorldMapy) DummyClass21.aClass61_1758.getNext()) {
        if (var3.aBoolean3553 && var3.method537(var2, (byte) 97, var0)) {
          return var3;
        }
      }

      return null;
  }

}
