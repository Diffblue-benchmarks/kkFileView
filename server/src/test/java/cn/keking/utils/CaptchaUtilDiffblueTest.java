package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.awt.image.BufferedImage;
import java.awt.image.DirectColorModel;
import java.awt.image.SinglePixelPackedSampleModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CaptchaUtilDiffblueTest {
  /**
   * Test {@link CaptchaUtil#generateCaptchaPic(String)}.
   *
   * <ul>
   *   <li>Then ColorModel return {@link DirectColorModel}.
   * </ul>
   *
   * <p>Method under test: {@link CaptchaUtil#generateCaptchaPic(String)}
   */
  @Test
  @DisplayName("Test generateCaptchaPic(String); then ColorModel return DirectColorModel")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BufferedImage CaptchaUtil.generateCaptchaPic(String)"})
  void testGenerateCaptchaPic_thenColorModelReturnDirectColorModel() {
    // Arrange and Act
    BufferedImage actualGenerateCaptchaPicResult =
        CaptchaUtil.generateCaptchaPic("captchaCode must not be null");

    // Assert
    assertTrue(actualGenerateCaptchaPicResult.getColorModel() instanceof DirectColorModel);
    assertTrue(
        actualGenerateCaptchaPicResult.getSampleModel() instanceof SinglePixelPackedSampleModel);
    assertNull(actualGenerateCaptchaPicResult.getAlphaRaster());
    assertNull(actualGenerateCaptchaPicResult.getPropertyNames());
    assertNull(actualGenerateCaptchaPicResult.getSources());
    assertEquals(0, actualGenerateCaptchaPicResult.getMinTileX());
    assertEquals(0, actualGenerateCaptchaPicResult.getMinTileY());
    assertEquals(0, actualGenerateCaptchaPicResult.getMinX());
    assertEquals(0, actualGenerateCaptchaPicResult.getMinY());
    assertEquals(0, actualGenerateCaptchaPicResult.getTileGridXOffset());
    assertEquals(0, actualGenerateCaptchaPicResult.getTileGridYOffset());
    assertEquals(0.5f, actualGenerateCaptchaPicResult.getAccelerationPriority());
    assertEquals(1, actualGenerateCaptchaPicResult.getNumXTiles());
    assertEquals(1, actualGenerateCaptchaPicResult.getNumYTiles());
    assertEquals(1, actualGenerateCaptchaPicResult.getTransparency());
    assertEquals(1, actualGenerateCaptchaPicResult.getType());
    assertEquals(1, actualGenerateCaptchaPicResult.getWritableTileIndices().length);
    assertEquals(100, actualGenerateCaptchaPicResult.getTileWidth());
    assertEquals(100, actualGenerateCaptchaPicResult.getWidth());
    assertEquals(30, actualGenerateCaptchaPicResult.getHeight());
    assertEquals(30, actualGenerateCaptchaPicResult.getTileHeight());
    assertFalse(actualGenerateCaptchaPicResult.isAlphaPremultiplied());
    assertTrue(actualGenerateCaptchaPicResult.hasTileWriters());
  }
}
