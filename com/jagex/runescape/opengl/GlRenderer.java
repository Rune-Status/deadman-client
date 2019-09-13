package com.jagex.runescape.opengl;

import com.jagex.runescape.AbstractGameWorld;
import com.jagex.runescape.AudioStreamEncoder3;
import com.jagex.runescape.BlockConfig;
import com.jagex.runescape.DisplayMode;
import com.jagex.runescape.DummyClass17;
import com.jagex.runescape.DummyClass3;
import com.jagex.runescape.DummyClass55;
import com.jagex.runescape.GameString;
import com.jagex.runescape.SomethingQuickChat;
import com.jagex.runescape.TextureSampler33;
import com.jagex.runescape.Unsure;
import com.jogamp.nativewindow.NativeWindowFactory;
import com.jogamp.nativewindow.awt.AWTGraphicsConfiguration;
import com.jogamp.nativewindow.awt.JAWTWindow;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLContext;
import com.jogamp.opengl.GLDrawable;
import com.jogamp.opengl.GLDrawableFactory;
import com.jogamp.opengl.GLException;
import com.jogamp.opengl.GLProfile;
import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import jogamp.newt.awt.NewtFactoryAWT;

public final class GlRenderer {

  private static String aString1785;
  private static String aString1786;
  private static float aFloat1787;
  private static boolean textureMatrixSetup;
  private static int anInt1792;
  private static int anInt1793;
  private static float aFloat1794;
  private static float aFloat1795;
  private static boolean lightingEnabled = true;
  private static float aFloat1797;
  private static boolean viewportSetup;
  private static GLContext GL_CONTEXT;
  private static final float aFloat1801 = 0.09765625F;
  private static int textureId = -1;
  private static boolean depthTestEnabled = true;
  private static int anInt1806;
  private static float[] PROJECTION_MATRIX = new float[16];
  private static int anInt1812;
  private static int anInt1814;
  private static GLDrawable GL_DRAWABLE;
  private static boolean fogEnabled = true;
  private static GameString RADEON_STRING = GameString
      .create("radeon");
  public static int maxTextureUnits;
  public static boolean bigEndian;
  public static int anInt1791;
  public static boolean aBoolean1798 = true;
  public static boolean texture3dSupport;
  public static GL2 GL;
  public static boolean useOpenGlRenderer;
  public static boolean multiSampleSupport;
  public static int anInt1810;
  public static int viewHeight;
  public static boolean vertexBufferSupport;
  public static boolean aBoolean1817;
  public static boolean vertexProgramSupport;
  public static int viewWidth;
  public static boolean cubemapSupport;

  private static GameString method1820(String var0) {
    byte[] var1;
    var1 = var0.getBytes(StandardCharsets.ISO_8859_1);

    return TextureSampler33.createString(var1, 0, var1.length);
  }

  public static void method1821(int var0, int var1, int var2, int var3) {
    GlRenderer
        .method1844(0, 0, GlRenderer.viewWidth, GlRenderer.viewHeight, var0,
            var1, 0.0F, 0.0F, var2, var3);
  }

  public static void method1822() {
    SomethingQuickChat.method551(0, 0, 0);
    GlRenderer.setupViewport();
    GlRenderer.method1856(1);
    GlRenderer.method1847(1);
    GlRenderer.setLightingEnabled(false);
    GlRenderer.setDepthTestEnabled(false);
    GlRenderer.setFogEnabled(false);
    GlRenderer.loadIdentityTextureMatrix();
  }

  public static void loadIdentityTextureMatrix() {
    if (GlRenderer.textureMatrixSetup) {
      GlRenderer.GL.glMatrixMode(5890);
      GlRenderer.GL.glLoadIdentity();
      GlRenderer.GL.glMatrixMode(5888);
      GlRenderer.textureMatrixSetup = false;
    }

  }

  public static void method1824() {
    SomethingQuickChat.method551(0, 0, 0);
    GlRenderer.setupViewport();
    GlRenderer.method1856(0);
    GlRenderer.method1847(0);
    GlRenderer.setLightingEnabled(false);
    GlRenderer.setDepthTestEnabled(false);
    GlRenderer.setFogEnabled(false);
    GlRenderer.loadIdentityTextureMatrix();
  }

  public static void method1825(float var0, float var1) {
    if (!GlRenderer.viewportSetup) {
      if (var0 != GlRenderer.aFloat1797 || var1 != GlRenderer.aFloat1794) {
        GlRenderer.aFloat1797 = var0;
        GlRenderer.aFloat1794 = var1;
        if (var1 == 0.0F) {
          GlRenderer.PROJECTION_MATRIX[10] = GlRenderer.aFloat1787;
          GlRenderer.PROJECTION_MATRIX[14] = GlRenderer.aFloat1795;
        } else {
          float var2 = var0 / (var1 + var0);
          float var3 = var2 * var2;
          float var4 =
              -GlRenderer.aFloat1795 * (1.0F - var2) * (1.0F - var2) / var1;
          GlRenderer.PROJECTION_MATRIX[10] = GlRenderer.aFloat1787 + var4;
          GlRenderer.PROJECTION_MATRIX[14] = GlRenderer.aFloat1795 * var3;
        }

        GlRenderer.GL.glMatrixMode(5889);
        GlRenderer.GL.glLoadMatrixf(GlRenderer.PROJECTION_MATRIX, 0);
        GlRenderer.GL.glMatrixMode(5888);
      }
    }
  }

  public static void swapBuffers() {
    GlRenderer.GL_DRAWABLE.swapBuffers();
  }

  public static void setFogEnabled(boolean var0) {
    if (var0 != GlRenderer.fogEnabled) {
      if (var0) {
        GlRenderer.GL.glEnable(2912);
      } else {
        GlRenderer.GL.glDisable(2912);
      }
      GlRenderer.fogEnabled = var0;
    }
  }

  public static void method1828() {
    SomethingQuickChat.method551(0, 0, 0);
    GlRenderer.setupViewport();
    GlRenderer.method1856(0);
    GlRenderer.method1847(0);
    GlRenderer.setLightingEnabled(false);
    GlRenderer.setDepthTestEnabled(false);
    GlRenderer.setFogEnabled(false);
    GlRenderer.loadIdentityTextureMatrix();
  }

  private static void method1829() {
    GlRenderer.viewportSetup = false;
    GlRenderer.GL.glDisable(3553);
    GlRenderer.textureId = -1;
    GlRenderer.GL.glTexEnvi(8960, 8704, '\u8570');
    GlRenderer.GL.glTexEnvi(8960, '\u8571', 8448);
    GlRenderer.anInt1793 = 0;
    GlRenderer.GL.glTexEnvi(8960, '\u8572', 8448);
    GlRenderer.anInt1792 = 0;
    GlRenderer.GL.glEnable(2896);
    GlRenderer.GL.glEnable(2912);
    GlRenderer.GL.glEnable(2929);
    GlRenderer.lightingEnabled = true;
    GlRenderer.depthTestEnabled = true;
    GlRenderer.fogEnabled = true;
    AbstractGameWorld.method1073(97);
    GlRenderer.GL.glActiveTexture('\u84c1');
    GlRenderer.GL.glTexEnvi(8960, 8704, '\u8570');
    GlRenderer.GL.glTexEnvi(8960, '\u8571', 8448);
    GlRenderer.GL.glTexEnvi(8960, '\u8572', 8448);
    GlRenderer.GL.glActiveTexture('\u84c0');
    GlRenderer.GL.setSwapInterval(0);
    GlRenderer.GL.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
    GlRenderer.GL.glShadeModel(7425);
    GlRenderer.GL.glClearDepth(1.0D);
    GlRenderer.GL.glDepthFunc(515);
    GlRenderer.method1830();
    GlRenderer.GL.glMatrixMode(5890);
    GlRenderer.GL.glLoadIdentity();
    GlRenderer.GL.glPolygonMode(1028, 6914);
    GlRenderer.GL.glEnable(2884);
    GlRenderer.GL.glCullFace(1029);
    GlRenderer.GL.glEnable(3042);
    GlRenderer.GL.glBlendFunc(770, 771);
    GlRenderer.GL.glEnable(3008);
    GlRenderer.GL.glAlphaFunc(516, 0.0F);
    GlRenderer.GL.glEnableClientState('\u8074');
    GlRenderer.GL.glEnableClientState('\u8075');
    GlRenderer.aBoolean1798 = true;
    GlRenderer.GL.glEnableClientState('\u8076');
    GlRenderer.GL.glEnableClientState('\u8078');
    GlRenderer.GL.glMatrixMode(5888);
    GlRenderer.GL.glLoadIdentity();
    GlEnvironment.method1511();
    DummyClass46.method1275();
  }

  public static void method1830() {
    GlRenderer.GL.glDepthMask(true);
  }

  public static void setDepthTestEnabled(boolean var0) {
    if (var0 != GlRenderer.depthTestEnabled) {
      if (var0) {
        GlRenderer.GL.glEnable(2929);
      } else {
        GlRenderer.GL.glDisable(2929);
      }

      GlRenderer.depthTestEnabled = var0;
    }
  }

  public static void method1832(float var0) {
    GlRenderer.method1825(3000.0F, var0 * 1.5F);
  }

  public static void method1833() {
    int[] var0 = new int[2];
    GlRenderer.GL.glGetIntegerv(3073, var0, 0);
    GlRenderer.GL.glGetIntegerv(3074, var0, 1);
    GlRenderer.GL.glDrawBuffer(1026);
    GlRenderer.GL.glReadBuffer(1024);
    GlRenderer.bindTexture(-1);
    GlRenderer.GL.glPushAttrib(8192);
    GlRenderer.GL.glDisable(2912);
    GlRenderer.GL.glDisable(3042);
    GlRenderer.GL.glDisable(2929);
    GlRenderer.GL.glDisable(3008);
    GlRenderer.GL.glRasterPos2i(0, 0);
    GlRenderer.GL
        .glCopyPixels(0, 0, GlRenderer.viewWidth, GlRenderer.viewHeight, 6144);
    GlRenderer.GL.glPopAttrib();
    GlRenderer.GL.glDrawBuffer(var0[0]);
    GlRenderer.GL.glReadBuffer(var0[1]);
  }

  public static void method1834(Canvas var0) {
    try {
      if (!var0.isDisplayable()) {
        return;
      }
      GLCapabilities capabilities = new GLCapabilities(GLProfile.getDefault());
      GLDrawableFactory drawableFactory = GLDrawableFactory
          .getFactory(capabilities.getGLProfile());
      //TODO

      GLDrawable var2 = drawableFactory
          .createOffscreenDrawable(null, capabilities, null, 1024, 1024);
      var2.setRealized(true);
      GLContext var3 = var2.createContext(null);
      var3.makeCurrent();
      var3.release();
      var3.destroy();
      var2.setRealized(false);
    } catch (GLException e) {
      e.printStackTrace();
    }

  }

  public static void resetState() {
    SomethingQuickChat.method551(0, 0, 0);
    GlRenderer.setupViewport();
    GlRenderer.bindTexture(-1);
    GlRenderer.setLightingEnabled(false);
    GlRenderer.setDepthTestEnabled(false);
    GlRenderer.setFogEnabled(false);
    GlRenderer.loadIdentityTextureMatrix();
  }

  private static void setupViewport() {
    if (!GlRenderer.viewportSetup) {
      GlRenderer.GL.glMatrixMode(5889);
      GlRenderer.GL.glLoadIdentity();
      GlRenderer.GL
          .glOrtho(0.0D, GlRenderer.viewWidth, 0.0D, GlRenderer.viewHeight,
              -1.0D, 1.0D);
      GlRenderer.GL
          .glViewport(0, 0, GlRenderer.viewWidth, GlRenderer.viewHeight);
      GlRenderer.GL.glMatrixMode(5888);
      GlRenderer.GL.glLoadIdentity();
      GlRenderer.viewportSetup = true;
    }
  }

  public static void setLightingEnabled(boolean var0) {
    if (var0 != GlRenderer.lightingEnabled) {
      if (var0) {
        GlRenderer.GL.glEnable(2896);
      } else {
        GlRenderer.GL.glDisable(2896);
      }

      GlRenderer.lightingEnabled = var0;
    }
  }

  public static void method1838() {
    GlRenderer.RADEON_STRING = null;
    GlRenderer.aString1786 = null;
    GlRenderer.aString1785 = null;
    GlRenderer.GL = null;
    GlRenderer.GL_DRAWABLE = null;
    GlRenderer.GL_CONTEXT = null;
    GlRenderer.PROJECTION_MATRIX = null;
  }

  public static float method1839() {
    return GlRenderer.aFloat1794;
  }

  private static int getComptability() {
    int var0 = 0;
    GlRenderer.aString1785 = GlRenderer.GL.glGetString(7936);
    GlRenderer.aString1786 = GlRenderer.GL.glGetString(7937);
    String var1 = GlRenderer.aString1785.toLowerCase();
    if (var1.indexOf("microsoft") != -1) {
      var0 |= 1;
    }

    if (var1.indexOf("brian paul") != -1 || var1.indexOf("mesa") != -1) {
      var0 |= 1;
    }

    String var2 = GlRenderer.GL.glGetString(7938);
    String[] var3 = var2.split("[. ]");
    if (var3.length >= 2) {
      try {
        int var4 = Integer.parseInt(var3[0]);
        int var5 = Integer.parseInt(var3[1]);
        GlRenderer.anInt1812 = var4 * 10 + var5;
      } catch (NumberFormatException var11) {
        var0 |= 4;
      }
    } else {
      var0 |= 4;
    }

    if (GlRenderer.anInt1812 < 12) {
      var0 |= 2;
    }

    if (!GlRenderer.GL.isExtensionAvailable("GL_ARB_multitexture")) {
      var0 |= 8;
    }

    if (!GlRenderer.GL.isExtensionAvailable("GL_ARB_texture_env_combine")) {
      var0 |= 32;
    }

    int[] var12 = new int[1];
    GlRenderer.GL.glGetIntegerv('\u84e2', var12, 0);
    GlRenderer.maxTextureUnits = var12[0];
    GlRenderer.GL.glGetIntegerv('\u8871', var12, 0);
    GlRenderer.anInt1814 = var12[0];
    GlRenderer.GL.glGetIntegerv('\u8872', var12, 0);
    GlRenderer.anInt1806 = var12[0];
    if (GlRenderer.maxTextureUnits < 2 || GlRenderer.anInt1814 < 2
        || GlRenderer.anInt1806 < 2) {
      var0 |= 16;
    }

    if (var0 == 0) {
      GlRenderer.bigEndian = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
      GlRenderer.vertexBufferSupport = GlRenderer.GL
          .isExtensionAvailable("GL_ARB_vertex_buffer_object");
      GlRenderer.multiSampleSupport = GlRenderer.GL
          .isExtensionAvailable("GL_ARB_multisample");
      GlRenderer.cubemapSupport = GlRenderer.GL
          .isExtensionAvailable("GL_ARB_texture_cube_map");
      GlRenderer.vertexProgramSupport = GlRenderer.GL
          .isExtensionAvailable("GL_ARB_vertex_program");
      GlRenderer.texture3dSupport = GlRenderer.GL
          .isExtensionAvailable("GL_EXT_texture3D");
      GameString var13 = GlRenderer.method1820(GlRenderer.aString1786)
          .method1534();
      if (var13.indexOf(GlRenderer.RADEON_STRING) != -1) {
        int var6 = 0;
        GameString[] var7 = var13.method1565(32, 40, 47).split(32);

        for (int var8 = 0; var8 < var7.length; ++var8) {
          GameString var9 = var7[var8];
          if (var9.getLength() >= 4 && var9.substring(4, 0, 0)
              .method1543(106)) {
            var6 = var9.substring(4, 0, 0).toInteger();
            break;
          }
        }

        if (var6 >= 7000 && var6 <= 7999) {
          GlRenderer.vertexBufferSupport = false;
        }

        if (var6 >= 7000 && var6 <= 9250) {
          GlRenderer.texture3dSupport = false;
        }

        GlRenderer.aBoolean1817 = GlRenderer.vertexBufferSupport;
      }

      if (GlRenderer.vertexBufferSupport) {
        try {
          int[] var14 = new int[1];
          GlRenderer.GL.glGenBuffers(1, var14, 0);
        } catch (Throwable var10) {
          return -4;
        }
      }

      return 0;
    } else {
      return var0;
    }
  }

  public static void method1841() {
    GlRenderer.GL.glClear(256);
  }

  public static void releaseGlResources() {
    if (GlRenderer.GL != null) {
      DummyClass55.method1609(90);
      GlRenderer.GL = null;
    }

    if (GlRenderer.GL_CONTEXT != null) {
      DummyClass33.method988();

      if (GLContext.getCurrent() == GlRenderer.GL_CONTEXT) {
        GlRenderer.GL_CONTEXT.release();
      }
      GlRenderer.GL_CONTEXT.destroy();
      GlRenderer.GL_CONTEXT = null;
    }

    if (GlRenderer.GL_DRAWABLE != null) {
      GlRenderer.GL_DRAWABLE.setRealized(false);
      GlRenderer.GL_DRAWABLE = null;
    }
    DummyClass46.method1273();
    GlRenderer.useOpenGlRenderer = false;
  }

  public static void translateTexture(float var0, float var1, float var2) {
    GlRenderer.GL.glMatrixMode(5890);
    if (GlRenderer.textureMatrixSetup) {
      GlRenderer.GL.glLoadIdentity();
    }

    GlRenderer.GL.glTranslatef(var0, var1, var2);
    GlRenderer.GL.glMatrixMode(5888);
    GlRenderer.textureMatrixSetup = true;
  }

  public static void method1844(int x, int y, int width, int height, int offX,
      int offY,
      float rotationX, float rotationY, int ratioWidth, int ratioHeight) {
    int left = (x - offX << 8) / ratioWidth;
    int right = (x + width - offX << 8) / ratioWidth;
    int top = (y - offY << 8) / ratioHeight;
    int bottom = (y + height - offY << 8) / ratioHeight;
    GlRenderer.GL.glMatrixMode(5889);
    GlRenderer.GL.glLoadIdentity();
    GlRenderer.setProjectionMatrix(left * GlRenderer.aFloat1801,
        right * GlRenderer.aFloat1801,
        (-bottom) * GlRenderer.aFloat1801, (-top) * GlRenderer.aFloat1801,
        50.0F, 3584F);
    GlRenderer.GL
        .glViewport(x, GlRenderer.viewHeight - y - height, width, height);
    GlRenderer.GL.glMatrixMode(5888);
    GlRenderer.GL.glLoadIdentity();
    GlRenderer.GL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    if (rotationX != 0.0F) {
      GlRenderer.GL.glRotatef(rotationX, 1.0F, 0.0F, 0.0F);
    }

    if (rotationY != 0.0F) {
      GlRenderer.GL.glRotatef(rotationY, 0.0F, 1.0F, 0.0F);
    }

    GlRenderer.viewportSetup = false;
    DummyClass17.screenLowerX = left;
    Unsure.screenUpperX = right;
    DummyClass3.screenUpperY = top;
    BlockConfig.screenLowerY = bottom;
  }

  private static void method1845(boolean var0) {
    if (var0 != GlRenderer.aBoolean1798) {
      if (var0) {
        GlRenderer.GL.glEnableClientState('\u8075');
      } else {
        GlRenderer.GL.glDisableClientState('\u8075');
      }

      GlRenderer.aBoolean1798 = var0;
    }
  }

  public static void method1846() {
    if (DisplayMode.useBumpMaps) {
      GlRenderer.setLightingEnabled(true);
      GlRenderer.method1845(true);
    } else {
      GlRenderer.setLightingEnabled(false);
      GlRenderer.method1845(false);
    }

  }

  public static void method1847(int var0) {
    if (var0 != GlRenderer.anInt1792) {
      if (var0 == 0) {
        GlRenderer.GL.glTexEnvi(8960, '\u8572', 8448);
      }

      if (var0 == 1) {
        GlRenderer.GL.glTexEnvi(8960, '\u8572', 7681);
      }

      if (var0 == 2) {
        GlRenderer.GL.glTexEnvi(8960, '\u8572', 260);
      }

      GlRenderer.anInt1792 = var0;
    }
  }

  private static void setProjectionMatrix(float left, float right, float bot,
      float top,
      float near, float far) {
    float n2 = near * 2.0F;
    GlRenderer.PROJECTION_MATRIX[0] = n2 / (right - left);
    GlRenderer.PROJECTION_MATRIX[1] = 0.0F;
    GlRenderer.PROJECTION_MATRIX[2] = 0.0F;
    GlRenderer.PROJECTION_MATRIX[3] = 0.0F;
    GlRenderer.PROJECTION_MATRIX[4] = 0.0F;
    GlRenderer.PROJECTION_MATRIX[5] = n2 / (top - bot);
    GlRenderer.PROJECTION_MATRIX[6] = 0.0F;
    GlRenderer.PROJECTION_MATRIX[7] = 0.0F;
    GlRenderer.PROJECTION_MATRIX[8] = (right + left) / (right - left);
    GlRenderer.PROJECTION_MATRIX[9] = (top + bot) / (top - bot);
    GlRenderer.PROJECTION_MATRIX[10] = GlRenderer.aFloat1787 =
        -(far + near) / (far - near);
    GlRenderer.PROJECTION_MATRIX[11] = -1.0F;
    GlRenderer.PROJECTION_MATRIX[12] = 0.0F;
    GlRenderer.PROJECTION_MATRIX[13] = 0.0F;
    GlRenderer.PROJECTION_MATRIX[14] = GlRenderer.aFloat1795 =
        -(n2 * far) / (far - near);
    GlRenderer.PROJECTION_MATRIX[15] = 0.0F;
    GlRenderer.GL.glLoadMatrixf(GlRenderer.PROJECTION_MATRIX, 0);
    GlRenderer.aFloat1797 = 0.0F;
    GlRenderer.aFloat1794 = 0.0F;
  }

  public static void clearBuffers(int clearColor) {
    GlRenderer.GL.glClearColor((clearColor >> 16 & 255) / 255.0F,
        (clearColor >> 8 & 255) / 255.0F, (clearColor & 255) / 255.0F, 0.0F);
    GlRenderer.GL.glClear(16640);
    GlRenderer.GL.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
  }

  public static void bindTexture(int var0) {
    if (var0 != GlRenderer.textureId) {
      if (var0 == -1) {
        GlRenderer.GL.glDisable(3553);
      } else {
        if (GlRenderer.textureId == -1) {
          GlRenderer.GL.glEnable(3553);
        }

        GlRenderer.GL.glBindTexture(3553, var0);
      }

      GlRenderer.textureId = var0;
    }
  }

  public static void method1851() {
    GlRenderer.GL.glDepthMask(false);
  }

  public static float method1852() {
    return GlRenderer.aFloat1797;
  }

  public static void bindCanvas(Canvas awtCanvas, int var1) {
    if (!awtCanvas.isDisplayable()) {
      return;
    }
    GLProfile profile = GLProfile.getDefault();
    GLCapabilities capabilities = new GLCapabilities(profile);

    if (var1 > 0) {
      capabilities.setSampleBuffers(true);
      capabilities.setNumSamples(var1);
    }

    GLDrawableFactory drawableFactory =
        GLDrawableFactory.getFactory(profile);

    AWTGraphicsConfiguration awtGraphicsConfiguration = AWTGraphicsConfiguration
        .create(awtCanvas.getGraphicsConfiguration(), capabilities,
            capabilities);
    JAWTWindow nativeWindow = NewtFactoryAWT
        .getNativeWindow(awtCanvas, awtGraphicsConfiguration);
    GLDrawable glDrawable = drawableFactory.createGLDrawable(nativeWindow);
    glDrawable.setRealized(true);
    GlRenderer.GL_DRAWABLE = glDrawable;
    GlRenderer.GL_CONTEXT = acquireGLContext(glDrawable)
        .orElse(null);

    nativeWindow.unlockSurface();
    if (GlRenderer.GL_CONTEXT == null) {
      System.err.println("Failed to acquire context.");
      GlRenderer.releaseGlResources();
      return;
    }
    GlRenderer.GL = (GL2) GlRenderer.GL_CONTEXT.getGL();
    GlRenderer.useOpenGlRenderer = true;
    GlRenderer.viewWidth = awtCanvas.getSize().width;
    GlRenderer.viewHeight = awtCanvas.getSize().height;

    GlRenderer.method1857();
    GlRenderer.method1829();
    GlRenderer.GL.glClear(16384);
    GlRenderer.swapBuffers();
    GlRenderer.GL.glClear(16384);
  }

  private static Optional<GLContext> acquireGLContext(GLDrawable drawable) {
    try {
      GLContext context = drawable.createContext(null);
      int result = context.makeCurrent();
      if (result != 0) {
        return Optional.of(context);
      }
    } catch (GLException e) {
      e.printStackTrace();
    }
    return Optional.empty();
  }

  public static void setViewportDimensions(int var0, int var1) {
    GlRenderer.viewWidth = var0;
    GlRenderer.viewHeight = var1;
    GlRenderer.viewportSetup = false;
  }

  public static void ortho(int var0, int var1, int var2, int far, int var4,
      int var5) {
    int var6 = -var0;
    int var7 = GlRenderer.viewWidth - var0;
    int var8 = -var1;
    int var9 = GlRenderer.viewHeight - var1;
    GlRenderer.GL.glMatrixMode(5889);
    GlRenderer.GL.glLoadIdentity();
    float var10 = var2 / 512.0F;
    float var11 = var10 * (256.0F / var4);
    float var12 = var10 * (256.0F / var5);
    GlRenderer.GL.glOrtho(var6 * var11, var7 * var11,
        (-var9) * var12, (-var8) * var12,
        50 - far,
        3584 - far);
    GlRenderer.GL.glViewport(0, 0, GlRenderer.viewWidth, GlRenderer.viewHeight);
    GlRenderer.GL.glMatrixMode(5888);
    GlRenderer.GL.glLoadIdentity();
    GlRenderer.GL.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    GlRenderer.viewportSetup = false;
  }

  public static void method1856(int var0) {
    // Combine RGB modulate
    if (var0 != GlRenderer.anInt1793) {
      if (var0 == 0) {
        GlRenderer.GL.glTexEnvi(8960, '\u8571', 8448);
      }

      if (var0 == 1) {
        GlRenderer.GL.glTexEnvi(8960, '\u8571', 7681);
      }

      if (var0 == 2) {
        GlRenderer.GL.glTexEnvi(8960, '\u8571', 260);
      }

      if (var0 == 3) {
        GlRenderer.GL.glTexEnvi(8960, '\u8571', '\u84e7');
      }

      if (var0 == 4) {
        GlRenderer.GL.glTexEnvi(8960, '\u8571', '\u8574');
      }

      if (var0 == 5) {
        GlRenderer.GL.glTexEnvi(8960, '\u8571', '\u8575');
      }

      GlRenderer.anInt1793 = var0;
    }
  }

  private static void method1857() {
    int[] var0 = new int[1];
    GlRenderer.GL.glGenTextures(1, var0, 0);
    GlRenderer.anInt1810 = var0[0];
    GlRenderer.GL.glBindTexture(3553, GlRenderer.anInt1810);
    GlRenderer.GL.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121,
        IntBuffer.wrap(new int[]{-1}));
    DummyClass46.setupSceneGl();
    AudioStreamEncoder3.method468(6);
  }

}