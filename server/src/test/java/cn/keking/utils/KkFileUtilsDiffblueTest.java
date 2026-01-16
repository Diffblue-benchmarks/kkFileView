package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class KkFileUtilsDiffblueTest {
  /**
   * Test {@link KkFileUtils#isIllegalFileName(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isIllegalFileName(String)}
   */
  @Test
  @DisplayName("Test isIllegalFileName(String); when createValidFtpUrl; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isIllegalFileName(String)"})
  void testIsIllegalFileName_whenCreateValidFtpUrl_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.isIllegalFileName(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link KkFileUtils#isIllegalFileName(String)}.
   *
   * <ul>
   *   <li>When {@code ..}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isIllegalFileName(String)}
   */
  @Test
  @DisplayName("Test isIllegalFileName(String); when '..'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isIllegalFileName(String)"})
  void testIsIllegalFileName_whenDotDot_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.isIllegalFileName(".."));
  }

  /**
   * Test {@link KkFileUtils#isInteger(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isInteger(String)}
   */
  @Test
  @DisplayName("Test isInteger(String); when '42'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isInteger(String)"})
  void testIsInteger_when42_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.isInteger("42"));
  }

  /**
   * Test {@link KkFileUtils#isInteger(String)}.
   *
   * <ul>
   *   <li>When {@code 4242}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isInteger(String)}
   */
  @Test
  @DisplayName("Test isInteger(String); when '4242'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isInteger(String)"})
  void testIsInteger_when4242_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.isInteger("4242"));
  }

  /**
   * Test {@link KkFileUtils#isInteger(String)}.
   *
   * <ul>
   *   <li>When {@code 44444}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isInteger(String)}
   */
  @Test
  @DisplayName("Test isInteger(String); when '44444'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isInteger(String)"})
  void testIsInteger_when44444_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.isInteger("44444"));
  }

  /**
   * Test {@link KkFileUtils#isInteger(String)}.
   *
   * <ul>
   *   <li>When {@code 4244444}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isInteger(String)}
   */
  @Test
  @DisplayName("Test isInteger(String); when '4244444'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isInteger(String)"})
  void testIsInteger_when4244444_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.isInteger("4244444"));
  }

  /**
   * Test {@link KkFileUtils#isInteger(String)}.
   *
   * <ul>
   *   <li>When {@code 4444442}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isInteger(String)}
   */
  @Test
  @DisplayName("Test isInteger(String); when '4444442'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isInteger(String)"})
  void testIsInteger_when4444442_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.isInteger("4444442"));
  }

  /**
   * Test {@link KkFileUtils#isInteger(String)}.
   *
   * <ul>
   *   <li>When {@code 4444444444}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isInteger(String)}
   */
  @Test
  @DisplayName("Test isInteger(String); when '4444444444'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isInteger(String)"})
  void testIsInteger_when4444444444_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.isInteger("4444444444"));
  }

  /**
   * Test {@link KkFileUtils#isInteger(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isInteger(String)}
   */
  @Test
  @DisplayName("Test isInteger(String); when createValidFtpUrl; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isInteger(String)"})
  void testIsInteger_whenCreateValidFtpUrl_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.isInteger(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link KkFileUtils#isInteger(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isInteger(String)}
   */
  @Test
  @DisplayName("Test isInteger(String); when empty string; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isInteger(String)"})
  void testIsInteger_whenEmptyString_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.isInteger(""));
  }

  /**
   * Test {@link KkFileUtils#isHttpUrl(URL)}.
   *
   * <p>Method under test: {@link KkFileUtils#isHttpUrl(URL)}
   */
  @Test
  @DisplayName("Test isHttpUrl(URL)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isHttpUrl(URL)"})
  void testIsHttpUrl() throws MalformedURLException {
    // Arrange, Act and Assert
    assertTrue(
        KkFileUtils.isHttpUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL()));
  }

  /**
   * Test {@link KkFileUtils#isFtpUrl(URL)}.
   *
   * <p>Method under test: {@link KkFileUtils#isFtpUrl(URL)}
   */
  @Test
  @DisplayName("Test isFtpUrl(URL)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isFtpUrl(URL)"})
  void testIsFtpUrl() throws MalformedURLException {
    // Arrange, Act and Assert
    assertFalse(
        KkFileUtils.isFtpUrl(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL()));
  }

  /**
   * Test {@link KkFileUtils#deleteFileByName(String)}.
   *
   * <ul>
   *   <li>When createValidFilePath.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#deleteFileByName(String)}
   */
  @Test
  @DisplayName("Test deleteFileByName(String); when createValidFilePath; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.deleteFileByName(String)"})
  void testDeleteFileByName_whenCreateValidFilePath_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.deleteFileByName(EncodingDetectsFactory.createValidFilePath()));
  }

  /**
   * Test {@link KkFileUtils#deleteFileByName(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#deleteFileByName(String)}
   */
  @Test
  @DisplayName("Test deleteFileByName(String); when createValidFtpUrl; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.deleteFileByName(String)"})
  void testDeleteFileByName_whenCreateValidFtpUrl_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.deleteFileByName(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link KkFileUtils#deleteFileByName(String)}.
   *
   * <ul>
   *   <li>When {@code ..}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#deleteFileByName(String)}
   */
  @Test
  @DisplayName("Test deleteFileByName(String); when '..'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.deleteFileByName(String)"})
  void testDeleteFileByName_whenDotDot_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.deleteFileByName(".."));
  }

  /**
   * Test {@link KkFileUtils#htmlEscape(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code ftp://localhost/test/file.txt}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#htmlEscape(String)}
   */
  @Test
  @DisplayName(
      "Test htmlEscape(String); when createValidFtpUrl; then return 'ftp://localhost/test/file.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String KkFileUtils.htmlEscape(String)"})
  void testHtmlEscape_whenCreateValidFtpUrl_thenReturnFtpLocalhostTestFileTxt() {
    // Arrange, Act and Assert
    assertEquals(
        "ftp://localhost/test/file.txt",
        KkFileUtils.htmlEscape(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link KkFileUtils#htmlEscape(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#htmlEscape(String)}
   */
  @Test
  @DisplayName("Test htmlEscape(String); when empty string; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String KkFileUtils.htmlEscape(String)"})
  void testHtmlEscape_whenEmptyString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", KkFileUtils.htmlEscape(""));
  }

  /**
   * Test {@link KkFileUtils#suffixFromFileName(String)}.
   *
   * <p>Method under test: {@link KkFileUtils#suffixFromFileName(String)}
   */
  @Test
  @DisplayName("Test suffixFromFileName(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String KkFileUtils.suffixFromFileName(String)"})
  void testSuffixFromFileName() {
    // Arrange, Act and Assert
    assertEquals("txt", KkFileUtils.suffixFromFileName(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link KkFileUtils#deleteDirectory(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#deleteDirectory(String)}
   */
  @Test
  @DisplayName("Test deleteDirectory(String); when createValidFtpUrl; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.deleteDirectory(String)"})
  void testDeleteDirectory_whenCreateValidFtpUrl_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.deleteDirectory(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link KkFileUtils#deleteDirectory(String)}.
   *
   * <ul>
   *   <li>When {@code Dir../}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#deleteDirectory(String)}
   */
  @Test
  @DisplayName("Test deleteDirectory(String); when 'Dir../'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.deleteDirectory(String)"})
  void testDeleteDirectory_whenDir_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.deleteDirectory("Dir../"));
  }

  /**
   * Test {@link KkFileUtils#isAllowedUpload(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isAllowedUpload(String)}
   */
  @Test
  @DisplayName("Test isAllowedUpload(String); when createValidFtpUrl; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isAllowedUpload(String)"})
  void testIsAllowedUpload_whenCreateValidFtpUrl_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.isAllowedUpload(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link KkFileUtils#isAllowedUpload(String)}.
   *
   * <ul>
   *   <li>When {@code .}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isAllowedUpload(String)}
   */
  @Test
  @DisplayName("Test isAllowedUpload(String); when '.'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isAllowedUpload(String)"})
  void testIsAllowedUpload_whenDot_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.isAllowedUpload("."));
  }

  /**
   * Test {@link KkFileUtils#isExist(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isExist(String)}
   */
  @Test
  @DisplayName("Test isExist(String); when createValidFtpUrl; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isExist(String)"})
  void testIsExist_whenCreateValidFtpUrl_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.isExist(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link KkFileUtils#isExist(String)}.
   *
   * <ul>
   *   <li>When {@code ..}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isExist(String)}
   */
  @Test
  @DisplayName("Test isExist(String); when '..'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isExist(String)"})
  void testIsExist_whenDotDot_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.isExist(".."));
  }
}
