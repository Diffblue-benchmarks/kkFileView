package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UrlEncoderUtilsDiffblueTest {
  /**
   * Test {@link UrlEncoderUtils#hasUrlEncoded(String)}.
   *
   * <ul>
   *   <li>When createValidFtpHost.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link UrlEncoderUtils#hasUrlEncoded(String)}
   */
  @Test
  @DisplayName("Test hasUrlEncoded(String); when createValidFtpHost; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UrlEncoderUtils.hasUrlEncoded(String)"})
  void testHasUrlEncoded_whenCreateValidFtpHost_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(UrlEncoderUtils.hasUrlEncoded(FtpUtilsFactory.createValidFtpHost()));
  }

  /**
   * Test {@link UrlEncoderUtils#hasUrlEncoded(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link UrlEncoderUtils#hasUrlEncoded(String)}
   */
  @Test
  @DisplayName("Test hasUrlEncoded(String); when createValidFtpUrl; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UrlEncoderUtils.hasUrlEncoded(String)"})
  void testHasUrlEncoded_whenCreateValidFtpUrl_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(UrlEncoderUtils.hasUrlEncoded(FtpUtilsFactory.createValidFtpUrl()));
  }
}
