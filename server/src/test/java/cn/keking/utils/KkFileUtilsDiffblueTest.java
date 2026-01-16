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
   * Test {@link KkFileUtils#isIllegalFileName(String)}.
   *
   * <ul>
   *   <li>When {@code foo.txt}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isIllegalFileName(String)}
   */
  @Test
  @DisplayName("Test isIllegalFileName(String); when 'foo.txt'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isIllegalFileName(String)"})
  void testIsIllegalFileName_whenFooTxt_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.isIllegalFileName("foo.txt"));
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
   * Test {@link KkFileUtils#isInteger(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isInteger(String)}
   */
  @Test
  @DisplayName("Test isInteger(String); when 'Str'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isInteger(String)"})
  void testIsInteger_whenStr_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.isInteger("Str"));
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
   *   <li>When {@code ..}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#deleteFileByName(String)}
   */
  @Test
  @DisplayName("Test deleteFileByName(String); when '..'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.deleteFileByName(String)"})
  void testDeleteFileByName_whenDotDot() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.deleteFileByName(".."));
  }

  /**
   * Test {@link KkFileUtils#deleteFileByName(String)}.
   *
   * <ul>
   *   <li>When {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#deleteFileByName(String)}
   */
  @Test
  @DisplayName("Test deleteFileByName(String); when 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.deleteFileByName(String)"})
  void testDeleteFileByName_whenFooTxt() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.deleteFileByName("foo.txt"));
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
   * Test {@link KkFileUtils#htmlEscape(String)}.
   *
   * <ul>
   *   <li>When {@code Input}.
   *   <li>Then return {@code Input}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#htmlEscape(String)}
   */
  @Test
  @DisplayName("Test htmlEscape(String); when 'Input'; then return 'Input'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String KkFileUtils.htmlEscape(String)"})
  void testHtmlEscape_whenInput_thenReturnInput() {
    // Arrange, Act and Assert
    assertEquals("Input", KkFileUtils.htmlEscape("Input"));
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
    assertEquals("txt", KkFileUtils.suffixFromFileName("foo.txt"));
  }

  /**
   * Test {@link KkFileUtils#deleteDirectory(String)}.
   *
   * <ul>
   *   <li>When {@code Dir}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#deleteDirectory(String)}
   */
  @Test
  @DisplayName("Test deleteDirectory(String); when 'Dir'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.deleteDirectory(String)"})
  void testDeleteDirectory_whenDir_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.deleteDirectory("Dir"));
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
  void testDeleteDirectory_whenDir_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.deleteDirectory("Dir../"));
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
   * Test {@link KkFileUtils#isAllowedUpload(String)}.
   *
   * <ul>
   *   <li>When {@code File}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isAllowedUpload(String)}
   */
  @Test
  @DisplayName("Test isAllowedUpload(String); when 'File'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isAllowedUpload(String)"})
  void testIsAllowedUpload_whenFile_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KkFileUtils.isAllowedUpload("File"));
  }

  /**
   * Test {@link KkFileUtils#isExist(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KkFileUtils#isExist(String)}
   */
  @Test
  @DisplayName("Test isExist(String); when '/directory/foo.txt'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KkFileUtils.isExist(String)"})
  void testIsExist_whenDirectoryFooTxt_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KkFileUtils.isExist("/directory/foo.txt"));
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
