package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

class WebUtilsDiffblueTest {
  /**
   * Test {@link WebUtils#encodeFileName(String)}.
   *
   * <p>Method under test: {@link WebUtils#encodeFileName(String)}
   */
  @Test
  @DisplayName("Test encodeFileName(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.encodeFileName(String)"})
  void testEncodeFileName() {
    // Arrange, Act and Assert
    assertEquals("Name", WebUtils.encodeFileName("Name"));
  }

  /**
   * Test {@link WebUtils#clearFullfilenameParam(String)}.
   *
   * <p>Method under test: {@link WebUtils#clearFullfilenameParam(String)}
   */
  @Test
  @DisplayName("Test clearFullfilenameParam(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.clearFullfilenameParam(String)"})
  void testClearFullfilenameParam() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example",
        WebUtils.clearFullfilenameParam("https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplehttps://example.org/exampleUrl%20Str",
        WebUtils.urlEncoderencode("https://example.org/examplehttps://example.org/exampleUrl Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20Strcn.keking.utils.WebUtils",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl Strcn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %2B%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%2B%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn2b5b5d() {
    // Arrange, Act and Assert
    assertEquals("%2B%5B?%5D", WebUtils.urlEncoderencode("+[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %2B%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%2B%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn2b5b5d2() {
    // Arrange, Act and Assert
    assertEquals("%2B%5B=%5D", WebUtils.urlEncoderencode("+[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B?%5DWebUtils}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B?%5Dcn.keking.utils.WebUtils'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5DcnKekingUtilsWebUtils() {
    // Arrange, Act and Assert
    assertEquals(
        "%5B?%5Dcn.keking.utils.WebUtils",
        WebUtils.urlEncoderencode("[?]cn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B=%5DWebUtils}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B=%5Dcn.keking.utils.WebUtils'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5DcnKekingUtilsWebUtils2() {
    // Arrange, Act and Assert
    assertEquals(
        "%5B=%5Dcn.keking.utils.WebUtils",
        WebUtils.urlEncoderencode("[=]cn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B?%5Dhttps://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B?%5Dhttps://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5DhttpsExampleOrgExample() {
    // Arrange, Act and Assert
    assertEquals(
        "%5B?%5Dhttps://example.org/example",
        WebUtils.urlEncoderencode("[?]https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5D", WebUtils.urlEncoderencode("[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d2() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5D", WebUtils.urlEncoderencode("[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B?%5D%2B}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B?%5D%2B'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d2b() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5D%2B", WebUtils.urlEncoderencode("[?]+"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B=%5D%2B}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B=%5D%2B'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d2b2() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5D%2B", WebUtils.urlEncoderencode("[=]+"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B?%5D?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B?%5D?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d3() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5D?", WebUtils.urlEncoderencode("[?]?"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B?%5D/}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B?%5D/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d4() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5D/", WebUtils.urlEncoderencode("[?]/"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code /%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '/%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d5() {
    // Arrange, Act and Assert
    assertEquals("/%5B?%5D", WebUtils.urlEncoderencode("/[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B?%5D%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B?%5D%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d5b5d() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5D%5B?%5D", WebUtils.urlEncoderencode("[?][?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B?%5D%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B?%5D%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d5b5d2() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5D%5B=%5D", WebUtils.urlEncoderencode("[?][=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B=%5D%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B=%5D%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d5b5d3() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5D%5B?%5D", WebUtils.urlEncoderencode("[=][?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B=%5D%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B=%5D%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d5b5d4() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5D%5B=%5D", WebUtils.urlEncoderencode("[=][=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code /%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '/%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d6() {
    // Arrange, Act and Assert
    assertEquals("/%5B=%5D", WebUtils.urlEncoderencode("/[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code %5B=%5D?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return '%5B=%5D?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturn5b5d7() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5D?", WebUtils.urlEncoderencode("[=]?"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code WebUtils%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'cn.keking.utils.WebUtils%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnCnKekingUtilsWebUtils5b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.utils.WebUtils%5B?%5D",
        WebUtils.urlEncoderencode("cn.keking.utils.WebUtils[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code WebUtils%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'cn.keking.utils.WebUtils%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnCnKekingUtilsWebUtils5b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.utils.WebUtils%5B=%5D",
        WebUtils.urlEncoderencode("cn.keking.utils.WebUtils[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code WebUtilsUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'cn.keking.utils.WebUtilsUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnCnKekingUtilsWebUtilsUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.utils.WebUtilsUrl%20Str",
        WebUtils.urlEncoderencode("cn.keking.utils.WebUtilsUrl Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code WebUtilsfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'cn.keking.utils.WebUtilsfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnCnKekingUtilsWebUtilsfile() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.utils.WebUtilsfile:",
        WebUtils.urlEncoderencode("cn.keking.utils.WebUtilsfile:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code file:https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'file:https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFileHttpsExampleOrgExample() {
    // Arrange, Act and Assert
    assertEquals(
        "file:https://example.org/example",
        WebUtils.urlEncoderencode("file:https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%2BUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%2BUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample2BUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%2BUrl%20Str",
        WebUtils.urlEncoderencode("https://example.org/example+Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%2Bfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%2Bfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample2Bfile() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%2Bfile:",
        WebUtils.urlEncoderencode("https://example.org/example+file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%2B%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%2B%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample2b5b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%2B%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/example+[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%2B%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%2B%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample2b5b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%2B%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/example+[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5DUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5DUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5DUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5DUrl%20Str",
        WebUtils.urlEncoderencode("https://example.org/example[?]Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5DUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5DUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5DUrl20Str2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5DUrl%20Str",
        WebUtils.urlEncoderencode("https://example.org/example[=]Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5Dbase64}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5Dbase64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5Dbase64() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5Dbase64",
        WebUtils.urlEncoderencode("https://example.org/example[?]base64"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5Dbase64}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5Dbase64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5Dbase642() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5Dbase64",
        WebUtils.urlEncoderencode("https://example.org/example[=]base64"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5DWebUtils}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5Dcn.keking.utils.WebUtils'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5DcnKekingUtilsWebUtils() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5Dcn.keking.utils.WebUtils",
        WebUtils.urlEncoderencode("https://example.org/example[?]cn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5DWebUtils}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5Dcn.keking.utils.WebUtils'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5DcnKekingUtilsWebUtils2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5Dcn.keking.utils.WebUtils",
        WebUtils.urlEncoderencode("https://example.org/example[=]cn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5Dfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5Dfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5Dfile() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5Dfile:",
        WebUtils.urlEncoderencode("https://example.org/example[?]file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5Dfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5Dfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5Dfile2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5Dfile:",
        WebUtils.urlEncoderencode("https://example.org/example[=]file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5Dfullfilename}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5Dfullfilename'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5Dfullfilename() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5Dfullfilename",
        WebUtils.urlEncoderencode("https://example.org/example[?]fullfilename"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5Dfullfilename}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5Dfullfilename'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5Dfullfilename2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5Dfullfilename",
        WebUtils.urlEncoderencode("https://example.org/example[=]fullfilename"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5Dhttps://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5Dhttps://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5DhttpsExampleOrgExample() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5Dhttps://example.org/example",
        WebUtils.urlEncoderencode("https://example.org/example[?]https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5DurlPath}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5DurlPath'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5DurlPath() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5DurlPath",
        WebUtils.urlEncoderencode("https://example.org/example[?]urlPath"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5DurlPath}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5DurlPath'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5DurlPath2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5DurlPath",
        WebUtils.urlEncoderencode("https://example.org/example[=]urlPath"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/example[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/example[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5D%2B}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5D%2B'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d2b() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5D%2B",
        WebUtils.urlEncoderencode("https://example.org/example[?]+"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5D%2B}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5D%2B'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d2b2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5D%2B",
        WebUtils.urlEncoderencode("https://example.org/example[=]+"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5D?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5D?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d3() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5D?",
        WebUtils.urlEncoderencode("https://example.org/example[?]?"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5D/}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5D/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d4() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5D/",
        WebUtils.urlEncoderencode("https://example.org/example[?]/"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example/%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example/%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d5() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example/%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/example/[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5D%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5D%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d5b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5D%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/example[?][?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5D%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5D%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d5b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5D%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/example[?][=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5D%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5D%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d5b5d3() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5D%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/example[=][?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5D%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5D%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d5b5d4() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5D%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/example[=][=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example/%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example/%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d6() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example/%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/example/[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5D?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5D?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d7() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5D?",
        WebUtils.urlEncoderencode("https://example.org/example[=]?"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B?%5D42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%5B?%5D42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d42() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B?%5D42",
        WebUtils.urlEncoderencode("https://example.org/example[?]42"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example%5B=%5D42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example%5B=%5D42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample5b5d422() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example%5B=%5D42",
        WebUtils.urlEncoderencode("https://example.org/example[=]42"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example42Url%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/example42Url%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample42Url20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example42Url%20Str",
        WebUtils.urlEncoderencode("https://example.org/example42Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example42file:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example42file:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample42file() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example42file:",
        WebUtils.urlEncoderencode("https://example.org/example42file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example42%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example42%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample425b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example42%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/example42[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example42%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example42%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExample425b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example42%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/example42[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example/file:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example/file:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleFile() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example/file:",
        WebUtils.urlEncoderencode("https://example.org/example/file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20Str",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example/Url%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/example/Url%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20Str2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example/Url%20Str",
        WebUtils.urlEncoderencode("https://example.org/example/Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20Str%2B}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20Str%2B'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20Str2b() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20Str%2B",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl Str+"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20Str?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20Str?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20Str3() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20Str?",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl Str?"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20Str%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20Str%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20Str5b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20Str%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl Str[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20Str%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20Str%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20Str5b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20Str%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl Str[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20Str42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20Str42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20Str42() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20Str42",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl Str42"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20StrUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20StrUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20StrUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20StrUrl%20Str",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl StrUrl Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20Strbase64}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20Strbase64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20Strbase64() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20Strbase64",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl Strbase64"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20Strfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20Strfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20Strfile() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20Strfile:",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl Strfile:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20Strfullfilename}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20Strfullfilename'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20Strfullfilename() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20Strfullfilename",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl Strfullfilename"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/exampleUrl%20StrurlPath}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/exampleUrl%20StrurlPath'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExampleUrl20StrurlPath() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/exampleUrl%20StrurlPath",
        WebUtils.urlEncoderencode("https://example.org/exampleUrl StrurlPath"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/examplefile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefile() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:",
        WebUtils.urlEncoderencode("https://example.org/examplefile:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/examplefile:?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefile2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:?",
        WebUtils.urlEncoderencode("https://example.org/examplefile:?"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:%2B}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/examplefile:%2B'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefile2b() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:%2B",
        WebUtils.urlEncoderencode("https://example.org/examplefile:+"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefile:%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefile5b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/examplefile:[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefile:%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefile5b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/examplefile:[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/examplefile:42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefile42() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:42",
        WebUtils.urlEncoderencode("https://example.org/examplefile:42"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:base64}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefile:base64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefileBase64() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:base64",
        WebUtils.urlEncoderencode("https://example.org/examplefile:base64"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:WebUtils}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefile:cn.keking.utils.WebUtils'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefileCnKekingUtilsWebUtils() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:cn.keking.utils.WebUtils",
        WebUtils.urlEncoderencode("https://example.org/examplefile:cn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:file:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'https://example.org/examplefile:file:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefileFile() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:file:",
        WebUtils.urlEncoderencode("https://example.org/examplefile:file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:fullfilename}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefile:fullfilename'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefileFullfilename() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:fullfilename",
        WebUtils.urlEncoderencode("https://example.org/examplefile:fullfilename"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:Url%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefile:Url%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefileUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:Url%20Str",
        WebUtils.urlEncoderencode("https://example.org/examplefile:Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefile:urlPath}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefile:urlPath'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefileUrlPath() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefile:urlPath",
        WebUtils.urlEncoderencode("https://example.org/examplefile:urlPath"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefullfilename%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefullfilename%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefullfilename5b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefullfilename%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/examplefullfilename[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefullfilename%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefullfilename%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefullfilename5b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefullfilename%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/examplefullfilename[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefullfilenameUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefullfilenameUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefullfilenameUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefullfilenameUrl%20Str",
        WebUtils.urlEncoderencode("https://example.org/examplefullfilenameUrl Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplefullfilenamefile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplefullfilenamefile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplefullfilenamefile() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplefullfilenamefile:",
        WebUtils.urlEncoderencode("https://example.org/examplefullfilenamefile:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplehttps://example.org/example%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplehttps://example.org/example%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplehttpsExampleOrgExample5b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplehttps://example.org/example%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/examplehttps://example.org/example[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplehttps://example.org/example%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplehttps://example.org/example%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplehttpsExampleOrgExample5b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplehttps://example.org/example%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/examplehttps://example.org/example[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplehttps://example.org/examplefile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplehttps://example.org/examplefile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplehttpsExampleOrgExamplefile() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplehttps://example.org/examplefile:",
        WebUtils.urlEncoderencode("https://example.org/examplehttps://example.org/examplefile:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code Url%20StrWebUtils}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'Url%20Strcn.keking.utils.WebUtils'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnUrl20StrcnKekingUtilsWebUtils() {
    // Arrange, Act and Assert
    assertEquals(
        "Url%20Strcn.keking.utils.WebUtils",
        WebUtils.urlEncoderencode("Url Strcn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code 42Url Str}.
   *   <li>Then return {@code 42Url%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '42Url Str'; then return '42Url%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_when42UrlStr_thenReturn42Url20Str() {
    // Arrange, Act and Assert
    assertEquals("42Url%20Str", WebUtils.urlEncoderencode("42Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [?]42}.
   *   <li>Then return {@code %5B?%5D42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '[?]42'; then return '%5B?%5D42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_when42_thenReturn5b5d42() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5D42", WebUtils.urlEncoderencode("[?]42"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [=]42}.
   *   <li>Then return {@code %5B=%5D42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '[=]42'; then return '%5B=%5D42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_when42_thenReturn5b5d422() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5D42", WebUtils.urlEncoderencode("[=]42"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code 42[?]}.
   *   <li>Then return {@code 42%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '42[?]'; then return '42%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_when42_thenReturn425b5d() {
    // Arrange, Act and Assert
    assertEquals("42%5B?%5D", WebUtils.urlEncoderencode("42[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code 42[=]}.
   *   <li>Then return {@code 42%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '42[=]'; then return '42%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_when42_thenReturn425b5d2() {
    // Arrange, Act and Assert
    assertEquals("42%5B=%5D", WebUtils.urlEncoderencode("42[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code 42file:}.
   *   <li>Then return {@code 42file:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '42file:'; then return '42file:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_when42file_thenReturn42file() {
    // Arrange, Act and Assert
    assertEquals("42file:", WebUtils.urlEncoderencode("42file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code base64Url Str}.
   *   <li>Then return {@code base64Url%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'base64Url Str'; then return 'base64Url%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenBase64UrlStr_thenReturnBase64Url20Str() {
    // Arrange, Act and Assert
    assertEquals("base64Url%20Str", WebUtils.urlEncoderencode("base64Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [?]base64}.
   *   <li>Then return {@code %5B?%5Dbase64}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '[?]base64'; then return '%5B?%5Dbase64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenBase64_thenReturn5b5Dbase64() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5Dbase64", WebUtils.urlEncoderencode("[?]base64"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [=]base64}.
   *   <li>Then return {@code %5B=%5Dbase64}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '[=]base64'; then return '%5B=%5Dbase64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenBase64_thenReturn5b5Dbase642() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5Dbase64", WebUtils.urlEncoderencode("[=]base64"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code base64[?]}.
   *   <li>Then return {@code base64%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'base64[?]'; then return 'base64%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenBase64_thenReturnBase645b5d() {
    // Arrange, Act and Assert
    assertEquals("base64%5B?%5D", WebUtils.urlEncoderencode("base64[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code base64[=]}.
   *   <li>Then return {@code base64%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'base64[=]'; then return 'base64%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenBase64_thenReturnBase645b5d2() {
    // Arrange, Act and Assert
    assertEquals("base64%5B=%5D", WebUtils.urlEncoderencode("base64[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code base64file:}.
   *   <li>Then return {@code base64file:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'base64file:'; then return 'base64file:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenBase64file_thenReturnBase64file() {
    // Arrange, Act and Assert
    assertEquals("base64file:", WebUtils.urlEncoderencode("base64file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code file:file:}.
   *   <li>Then return {@code file:file:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'file:file:'; then return 'file:file:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFileFile_thenReturnFileFile() {
    // Arrange, Act and Assert
    assertEquals("file:file:", WebUtils.urlEncoderencode("file:file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code file:Url Str}.
   *   <li>Then return {@code file:Url%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'file:Url Str'; then return 'file:Url%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFileUrlStr_thenReturnFileUrl20Str() {
    // Arrange, Act and Assert
    assertEquals("file:Url%20Str", WebUtils.urlEncoderencode("file:Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code +file:}.
   *   <li>Then return {@code %2Bfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '+file:'; then return '%2Bfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFile_thenReturn2Bfile() {
    // Arrange, Act and Assert
    assertEquals("%2Bfile:", WebUtils.urlEncoderencode("+file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [?]file:}.
   *   <li>Then return {@code %5B?%5Dfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '[?]file:'; then return '%5B?%5Dfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFile_thenReturn5b5Dfile() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5Dfile:", WebUtils.urlEncoderencode("[?]file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [=]file:}.
   *   <li>Then return {@code %5B=%5Dfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '[=]file:'; then return '%5B=%5Dfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFile_thenReturn5b5Dfile2() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5Dfile:", WebUtils.urlEncoderencode("[=]file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code /file:}.
   *   <li>Then return {@code /file:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '/file:'; then return '/file:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFile_thenReturnFile() {
    // Arrange, Act and Assert
    assertEquals("/file:", WebUtils.urlEncoderencode("/file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code file:[=]}.
   *   <li>Then return {@code file:%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'file:[=]'; then return 'file:%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFile_thenReturnFile5b5d() {
    // Arrange, Act and Assert
    assertEquals("file:%5B=%5D", WebUtils.urlEncoderencode("file:[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilenameUrl Str}.
   *   <li>Then return {@code fullfilenameUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilenameUrl Str'; then return 'fullfilenameUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenameUrlStr_thenReturnFullfilenameUrl20Str() {
    // Arrange, Act and Assert
    assertEquals("fullfilenameUrl%20Str", WebUtils.urlEncoderencode("fullfilenameUrl Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [?]fullfilename}.
   *   <li>Then return {@code %5B?%5Dfullfilename}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when '[?]fullfilename'; then return '%5B?%5Dfullfilename'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename_thenReturn5b5Dfullfilename() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5Dfullfilename", WebUtils.urlEncoderencode("[?]fullfilename"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [=]fullfilename}.
   *   <li>Then return {@code %5B=%5Dfullfilename}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when '[=]fullfilename'; then return '%5B=%5Dfullfilename'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename_thenReturn5b5Dfullfilename2() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5Dfullfilename", WebUtils.urlEncoderencode("[=]fullfilename"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename[?]}.
   *   <li>Then return {@code fullfilename%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[?]'; then return 'fullfilename%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename_thenReturnFullfilename5b5d() {
    // Arrange, Act and Assert
    assertEquals("fullfilename%5B?%5D", WebUtils.urlEncoderencode("fullfilename[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename[=]}.
   *   <li>Then return {@code fullfilename%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[=]'; then return 'fullfilename%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename_thenReturnFullfilename5b5d2() {
    // Arrange, Act and Assert
    assertEquals("fullfilename%5B=%5D", WebUtils.urlEncoderencode("fullfilename[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilenamefile:}.
   *   <li>Then return {@code fullfilenamefile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilenamefile:'; then return 'fullfilenamefile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenamefile_thenReturnFullfilenamefile() {
    // Arrange, Act and Assert
    assertEquals("fullfilenamefile:", WebUtils.urlEncoderencode("fullfilenamefile:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'https://example.org/example'; then return 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenHttpsExampleOrgExample_thenReturnHttpsExampleOrgExample() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example", WebUtils.urlEncoderencode("https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then return {@code ?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '?'; then return '?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenQuestionMark_thenReturnQuestionMark() {
    // Arrange, Act and Assert
    assertEquals("?", WebUtils.urlEncoderencode("?"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code urlPathUrl Str}.
   *   <li>Then return {@code urlPathUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'urlPathUrl Str'; then return 'urlPathUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlPathUrlStr_thenReturnUrlPathUrl20Str() {
    // Arrange, Act and Assert
    assertEquals("urlPathUrl%20Str", WebUtils.urlEncoderencode("urlPathUrl Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [?]urlPath}.
   *   <li>Then return {@code %5B?%5DurlPath}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '[?]urlPath'; then return '%5B?%5DurlPath'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlPath_thenReturn5b5DurlPath() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5DurlPath", WebUtils.urlEncoderencode("[?]urlPath"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [=]urlPath}.
   *   <li>Then return {@code %5B=%5DurlPath}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '[=]urlPath'; then return '%5B=%5DurlPath'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlPath_thenReturn5b5DurlPath2() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5DurlPath", WebUtils.urlEncoderencode("[=]urlPath"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code urlPath[?]}.
   *   <li>Then return {@code urlPath%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'urlPath[?]'; then return 'urlPath%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlPath_thenReturnUrlPath5b5d() {
    // Arrange, Act and Assert
    assertEquals("urlPath%5B?%5D", WebUtils.urlEncoderencode("urlPath[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code urlPath[=]}.
   *   <li>Then return {@code urlPath%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'urlPath[=]'; then return 'urlPath%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlPath_thenReturnUrlPath5b5d2() {
    // Arrange, Act and Assert
    assertEquals("urlPath%5B=%5D", WebUtils.urlEncoderencode("urlPath[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code urlPathfile:}.
   *   <li>Then return {@code urlPathfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'urlPathfile:'; then return 'urlPathfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlPathfile_thenReturnUrlPathfile() {
    // Arrange, Act and Assert
    assertEquals("urlPathfile:", WebUtils.urlEncoderencode("urlPathfile:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url Str42}.
   *   <li>Then return {@code Url%20Str42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'Url Str42'; then return 'Url%20Str42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStr42_thenReturnUrl20Str42() {
    // Arrange, Act and Assert
    assertEquals("Url%20Str42", WebUtils.urlEncoderencode("Url Str42"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url StrUrl Str}.
   *   <li>Then return {@code Url%20StrUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'Url StrUrl Str'; then return 'Url%20StrUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStrUrlStr_thenReturnUrl20StrUrl20Str() {
    // Arrange, Act and Assert
    assertEquals("Url%20StrUrl%20Str", WebUtils.urlEncoderencode("Url StrUrl Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code +Url Str}.
   *   <li>Then return {@code %2BUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '+Url Str'; then return '%2BUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStr_thenReturn2BUrl20Str() {
    // Arrange, Act and Assert
    assertEquals("%2BUrl%20Str", WebUtils.urlEncoderencode("+Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [?]Url Str}.
   *   <li>Then return {@code %5B?%5DUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '[?]Url Str'; then return '%5B?%5DUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStr_thenReturn5b5DUrl20Str() {
    // Arrange, Act and Assert
    assertEquals("%5B?%5DUrl%20Str", WebUtils.urlEncoderencode("[?]Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code [=]Url Str}.
   *   <li>Then return {@code %5B=%5DUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '[=]Url Str'; then return '%5B=%5DUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStr_thenReturn5b5DUrl20Str2() {
    // Arrange, Act and Assert
    assertEquals("%5B=%5DUrl%20Str", WebUtils.urlEncoderencode("[=]Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url Str}.
   *   <li>Then return {@code Url%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'Url Str'; then return 'Url%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStr_thenReturnUrl20Str() {
    // Arrange, Act and Assert
    assertEquals("Url%20Str", WebUtils.urlEncoderencode("Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code /Url Str}.
   *   <li>Then return {@code /Url%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when '/Url Str'; then return '/Url%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStr_thenReturnUrl20Str2() {
    // Arrange, Act and Assert
    assertEquals("/Url%20Str", WebUtils.urlEncoderencode("/Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url Str+}.
   *   <li>Then return {@code Url%20Str%2B}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'Url Str+'; then return 'Url%20Str%2B'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStr_thenReturnUrl20Str2b() {
    // Arrange, Act and Assert
    assertEquals("Url%20Str%2B", WebUtils.urlEncoderencode("Url Str+"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url Str?}.
   *   <li>Then return {@code Url%20Str?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'Url Str?'; then return 'Url%20Str?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStr_thenReturnUrl20Str3() {
    // Arrange, Act and Assert
    assertEquals("Url%20Str?", WebUtils.urlEncoderencode("Url Str?"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url Str[?]}.
   *   <li>Then return {@code Url%20Str%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'Url Str[?]'; then return 'Url%20Str%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStr_thenReturnUrl20Str5b5d() {
    // Arrange, Act and Assert
    assertEquals("Url%20Str%5B?%5D", WebUtils.urlEncoderencode("Url Str[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url Str[=]}.
   *   <li>Then return {@code Url%20Str%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'Url Str[=]'; then return 'Url%20Str%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStr_thenReturnUrl20Str5b5d2() {
    // Arrange, Act and Assert
    assertEquals("Url%20Str%5B=%5D", WebUtils.urlEncoderencode("Url Str[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url Strbase64}.
   *   <li>Then return {@code Url%20Strbase64}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'Url Strbase64'; then return 'Url%20Strbase64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStrbase64_thenReturnUrl20Strbase64() {
    // Arrange, Act and Assert
    assertEquals("Url%20Strbase64", WebUtils.urlEncoderencode("Url Strbase64"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url Strfile:}.
   *   <li>Then return {@code Url%20Strfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); when 'Url Strfile:'; then return 'Url%20Strfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStrfile_thenReturnUrl20Strfile() {
    // Arrange, Act and Assert
    assertEquals("Url%20Strfile:", WebUtils.urlEncoderencode("Url Strfile:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url Strfullfilename}.
   *   <li>Then return {@code Url%20Strfullfilename}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'Url Strfullfilename'; then return 'Url%20Strfullfilename'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStrfullfilename_thenReturnUrl20Strfullfilename() {
    // Arrange, Act and Assert
    assertEquals("Url%20Strfullfilename", WebUtils.urlEncoderencode("Url Strfullfilename"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code Url StrurlPath}.
   *   <li>Then return {@code Url%20StrurlPath}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'Url StrurlPath'; then return 'Url%20StrurlPath'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenUrlStrurlPath_thenReturnUrl20StrurlPath() {
    // Arrange, Act and Assert
    assertEquals("Url%20StrurlPath", WebUtils.urlEncoderencode("Url StrurlPath"));
  }

  /**
   * Test {@link WebUtils#getUrlParameterReg(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getUrlParameterReg(String, String)}
   */
  @Test
  @DisplayName(
      "Test getUrlParameterReg(String, String); when empty string; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getUrlParameterReg(String, String)"})
  void testGetUrlParameterReg_whenEmptyString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", WebUtils.getUrlParameterReg("", "https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#getUrlParameterReg(String, String)}.
   *
   * <ul>
   *   <li>When {@code foo[?]bar}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getUrlParameterReg(String, String)}
   */
  @Test
  @DisplayName("Test getUrlParameterReg(String, String); when 'foo[?]bar'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getUrlParameterReg(String, String)"})
  void testGetUrlParameterReg_whenFooBar_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.getUrlParameterReg("foo[?]bar", "https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#getUrlParameterReg(String, String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getUrlParameterReg(String, String)}
   */
  @Test
  @DisplayName(
      "Test getUrlParameterReg(String, String); when 'https://example.org/example'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getUrlParameterReg(String, String)"})
  void testGetUrlParameterReg_whenHttpsExampleOrgExample_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals(
        "",
        WebUtils.getUrlParameterReg("https://example.org/example", "https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#getFileNameFromURL(String)}.
   *
   * <ul>
   *   <li>When {@code file:https://example.org/example}.
   *   <li>Then return {@code example}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getFileNameFromURL(String)}
   */
  @Test
  @DisplayName(
      "Test getFileNameFromURL(String); when 'file:https://example.org/example'; then return 'example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getFileNameFromURL(String)"})
  void testGetFileNameFromURL_whenFileHttpsExampleOrgExample_thenReturnExample() {
    // Arrange, Act and Assert
    assertEquals("example", WebUtils.getFileNameFromURL("file:https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#getFileNameFromURL(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code example}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getFileNameFromURL(String)}
   */
  @Test
  @DisplayName(
      "Test getFileNameFromURL(String); when 'https://example.org/example'; then return 'example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getFileNameFromURL(String)"})
  void testGetFileNameFromURL_whenHttpsExampleOrgExample_thenReturnExample() {
    // Arrange, Act and Assert
    assertEquals("example", WebUtils.getFileNameFromURL("https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#getFileNameFromURL(String)}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getFileNameFromURL(String)}
   */
  @Test
  @DisplayName("Test getFileNameFromURL(String); when '?'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getFileNameFromURL(String)"})
  void testGetFileNameFromURL_whenQuestionMark_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", WebUtils.getFileNameFromURL("?"));
  }

  /**
   * Test {@link WebUtils#getFileNameFromMultipartFile(MultipartFile)}.
   *
   * <ul>
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getFileNameFromMultipartFile(MultipartFile)}
   */
  @Test
  @DisplayName("Test getFileNameFromMultipartFile(MultipartFile); then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getFileNameFromMultipartFile(MultipartFile)"})
  void testGetFileNameFromMultipartFile_thenReturnEmptyString() throws IOException {
    // Arrange
    MockMultipartFile file =
        new MockMultipartFile("Name", new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")));

    // Act and Assert
    assertEquals("", WebUtils.getFileNameFromMultipartFile(file));
  }

  /**
   * Test {@link WebUtils#suffixFromUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code example}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#suffixFromUrl(String)}
   */
  @Test
  @DisplayName(
      "Test suffixFromUrl(String); when 'https://example.org/example'; then return 'example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.suffixFromUrl(String)"})
  void testSuffixFromUrl_whenHttpsExampleOrgExample_thenReturnExample() {
    // Arrange, Act and Assert
    assertEquals("example", WebUtils.suffixFromUrl("https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#suffixFromUrl(String)}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#suffixFromUrl(String)}
   */
  @Test
  @DisplayName("Test suffixFromUrl(String); when '?'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.suffixFromUrl(String)"})
  void testSuffixFromUrl_whenQuestionMark_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", WebUtils.suffixFromUrl("?"));
  }

  /**
   * Test {@link WebUtils#encodeUrlFileName(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#encodeUrlFileName(String)}
   */
  @Test
  @DisplayName("Test encodeUrlFileName(String); then return 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.encodeUrlFileName(String)"})
  void testEncodeUrlFileName_thenReturnHttpsExampleOrgExample() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/example", WebUtils.encodeUrlFileName("https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#encodeUrlFileName(String)}.
   *
   * <ul>
   *   <li>When {@code WebUtils}.
   *   <li>Then return {@code WebUtils}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#encodeUrlFileName(String)}
   */
  @Test
  @DisplayName(
      "Test encodeUrlFileName(String); when 'cn.keking.utils.WebUtils'; then return 'cn.keking.utils.WebUtils'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.encodeUrlFileName(String)"})
  void testEncodeUrlFileName_whenCnKekingUtilsWebUtils_thenReturnCnKekingUtilsWebUtils() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.utils.WebUtils", WebUtils.encodeUrlFileName("cn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#encodeUrlFileName(String)}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then return {@code ?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#encodeUrlFileName(String)}
   */
  @Test
  @DisplayName("Test encodeUrlFileName(String); when '?'; then return '?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.encodeUrlFileName(String)"})
  void testEncodeUrlFileName_whenQuestionMark_thenReturnQuestionMark() {
    // Arrange, Act and Assert
    assertEquals("?", WebUtils.encodeUrlFileName("?"));
  }

  /**
   * Test {@link WebUtils#getSourceUrl(ServletRequest)}.
   *
   * <ul>
   *   <li>Given {@code currentUrl}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSourceUrl(ServletRequest)}
   */
  @Test
  @DisplayName("Test getSourceUrl(ServletRequest); given 'currentUrl'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSourceUrl(ServletRequest)"})
  void testGetSourceUrl_givenCurrentUrl() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("currentUrl", "42");

    // Act and Assert
    assertEquals("�", WebUtils.getSourceUrl(request));
  }

  /**
   * Test {@link WebUtils#getSourceUrl(ServletRequest)}.
   *
   * <ul>
   *   <li>Given {@code +}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSourceUrl(ServletRequest)}
   */
  @Test
  @DisplayName("Test getSourceUrl(ServletRequest); given '+'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSourceUrl(ServletRequest)"})
  void testGetSourceUrl_givenPlusSign() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("url", "+");

    // Act and Assert
    assertNull(WebUtils.getSourceUrl(request));
  }

  /**
   * Test {@link WebUtils#getSourceUrl(ServletRequest)}.
   *
   * <ul>
   *   <li>Given space.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code url} and
   *       space.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSourceUrl(ServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getSourceUrl(ServletRequest); given space; when MockHttpServletRequest() addParameter 'url' and space")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSourceUrl(ServletRequest)"})
  void testGetSourceUrl_givenSpace_whenMockHttpServletRequestAddParameterUrlAndSpace() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("url", " ");

    // Act and Assert
    assertNull(WebUtils.getSourceUrl(request));
  }

  /**
   * Test {@link WebUtils#getSourceUrl(ServletRequest)}.
   *
   * <ul>
   *   <li>Given {@code urlPath}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code urlPath}
   *       and {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSourceUrl(ServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getSourceUrl(ServletRequest); given 'urlPath'; when MockHttpServletRequest() addParameter 'urlPath' and '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSourceUrl(ServletRequest)"})
  void testGetSourceUrl_givenUrlPath_whenMockHttpServletRequestAddParameterUrlPathAnd42() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("urlPath", "42");

    // Act and Assert
    assertEquals("�", WebUtils.getSourceUrl(request));
  }

  /**
   * Test {@link WebUtils#getSourceUrl(ServletRequest)}.
   *
   * <ul>
   *   <li>Given {@code urls}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code urls}
   *       and {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSourceUrl(ServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getSourceUrl(ServletRequest); given 'urls'; when MockHttpServletRequest() addParameter 'urls' and '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSourceUrl(ServletRequest)"})
  void testGetSourceUrl_givenUrls_whenMockHttpServletRequestAddParameterUrlsAnd42() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("urls", "42");

    // Act and Assert
    assertEquals("�", WebUtils.getSourceUrl(request));
  }

  /**
   * Test {@link WebUtils#getSourceUrl(ServletRequest)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code url} and
   *       {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSourceUrl(ServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getSourceUrl(ServletRequest); given 'Value'; when MockHttpServletRequest() addParameter 'url' and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSourceUrl(ServletRequest)"})
  void testGetSourceUrl_givenValue_whenMockHttpServletRequestAddParameterUrlAndValue() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("url", "Value");

    // Act and Assert
    assertNull(WebUtils.getSourceUrl(request));
  }

  /**
   * Test {@link WebUtils#getSourceUrl(ServletRequest)}.
   *
   * <ul>
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code url} and
   *       {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSourceUrl(ServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getSourceUrl(ServletRequest); when MockHttpServletRequest() addParameter 'url' and '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSourceUrl(ServletRequest)"})
  void testGetSourceUrl_whenMockHttpServletRequestAddParameterUrlAnd42() {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("url", "42");

    // Act and Assert
    assertEquals("�", WebUtils.getSourceUrl(request));
  }

  /**
   * Test {@link WebUtils#getSourceUrl(ServletRequest)}.
   *
   * <ul>
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSourceUrl(ServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getSourceUrl(ServletRequest); when MockHttpServletRequest(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSourceUrl(ServletRequest)"})
  void testGetSourceUrl_whenMockHttpServletRequest_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.getSourceUrl(new MockHttpServletRequest()));
  }

  /**
   * Test {@link WebUtils#isValidUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#isValidUrl(String)}
   */
  @Test
  @DisplayName("Test isValidUrl(String); when 'https://example.org/example'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WebUtils.isValidUrl(String)"})
  void testIsValidUrl_whenHttpsExampleOrgExample_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(WebUtils.isValidUrl("https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#isValidUrl(String)}.
   *
   * <ul>
   *   <li>When {@code ^((https|http|ftp|rtsp|mms|file)://)}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#isValidUrl(String)}
   */
  @Test
  @DisplayName(
      "Test isValidUrl(String); when '^((https|http|ftp|rtsp|mms|file)://)'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WebUtils.isValidUrl(String)"})
  void testIsValidUrl_whenHttpsHttpFtpRtspMmsFile_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(WebUtils.isValidUrl("^((https|http|ftp|rtsp|mms|file)://)"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl() {
    // Arrange, Act and Assert
    assertEquals("���{�", WebUtils.decodeUrl(" base64"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl2() {
    // Arrange, Act and Assert
    assertEquals("�*.��", WebUtils.decodeUrl(" Source"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl3() {
    // Arrange, Act and Assert
    assertEquals("���=�a", WebUtils.decodeUrl(" urlPath"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl4() {
    // Arrange, Act and Assert
    assertEquals("~�e~)^���", WebUtils.decodeUrl("\nfullfilename"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl5() {
    // Arrange, Act and Assert
    assertEquals("��Oj�", WebUtils.decodeUrl("\nurlPath"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl6() {
    // Arrange, Act and Assert
    assertEquals("J��q�", WebUtils.decodeUrl("Source "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl7() {
    // Arrange, Act and Assert
    assertEquals("~�e~)^���", WebUtils.decodeUrl("fullfilename\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl8() {
    // Arrange, Act and Assert
    assertEquals("��Oj�~", WebUtils.decodeUrl("urlPath "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl9() {
    // Arrange, Act and Assert
    assertEquals("��Oj�", WebUtils.decodeUrl("urlPath\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return replacement character.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '42'; then return replacement character")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_when42_thenReturnReplacementCharacter() {
    // Arrange, Act and Assert
    assertEquals("�", WebUtils.decodeUrl("\n42"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return replacement character.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '42'; then return replacement character")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_when42_thenReturnReplacementCharacter2() {
    // Arrange, Act and Assert
    assertEquals("�", WebUtils.decodeUrl("42\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return replacement character o.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '42'; then return replacement character o")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_when42_thenReturnReplacementCharacterO() {
    // Arrange, Act and Assert
    assertEquals("�o", WebUtils.decodeUrl("42 "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return replacement character replacement character.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when '42'; then return replacement character replacement character")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_when42_thenReturnReplacementCharacterReplacementCharacter() {
    // Arrange, Act and Assert
    assertEquals("��", WebUtils.decodeUrl(" 42"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code base64}.
   *   <li>Then return m replacement character replacement character.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'base64'; then return m replacement character replacement character")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenBase64_thenReturnMReplacementCharacterReplacementCharacter() {
    // Arrange, Act and Assert
    assertEquals("m�\u001e�", WebUtils.decodeUrl("base64"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code base64}.
   *   <li>Then return m replacement character replacement character.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'base64'; then return m replacement character replacement character")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenBase64_thenReturnMReplacementCharacterReplacementCharacter2() {
    // Arrange, Act and Assert
    assertEquals("m�\u001e�", WebUtils.decodeUrl("\nbase64"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code base64}.
   *   <li>Then return m replacement character replacement character.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'base64'; then return m replacement character replacement character")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenBase64_thenReturnMReplacementCharacterReplacementCharacter3() {
    // Arrange, Act and Assert
    assertEquals("m�\u001e�", WebUtils.decodeUrl("base64 "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code base64}.
   *   <li>Then return m replacement character replacement character.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'base64'; then return m replacement character replacement character")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenBase64_thenReturnMReplacementCharacterReplacementCharacter4() {
    // Arrange, Act and Assert
    assertEquals("m�\u001e�", WebUtils.decodeUrl("base64\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code WebUtils}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'cn.keking.utils.WebUtils'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenCnKekingUtilsWebUtils_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" cn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code WebUtils}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'cn.keking.utils.WebUtils'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenCnKekingUtilsWebUtils_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("\ncn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code WebUtils}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'cn.keking.utils.WebUtils'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenCnKekingUtilsWebUtils_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("cn.keking.utils.WebUtils "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code WebUtils}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'cn.keking.utils.WebUtils'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenCnKekingUtilsWebUtils_thenReturnNull4() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("cn.keking.utils.WebUtils\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code file:}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'file:'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenFile_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" file:"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code file:}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'file:'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenFile_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("\nfile:"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code file:}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'file:'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenFile_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("file: "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code file:}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'file:'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenFile_thenReturnNull4() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("file:\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'fullfilename'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenFullfilename_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" fullfilename"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'fullfilename'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenFullfilename_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("fullfilename "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example 42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample42_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example 42"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example 42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example 42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample42_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\n42"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example base64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example base64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleBase64_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example base64"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example base64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example base64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleBase64_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\nbase64"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example WebUtils}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example cn.keking.utils.WebUtils'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleCnKekingUtilsWebUtils_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example cn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example WebUtils}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example cn.keking.utils.WebUtils'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleCnKekingUtilsWebUtils_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\ncn.keking.utils.WebUtils"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example file:}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example file:'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleFile_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example file:"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example file:}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example file:'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleFile_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\nfile:"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example fullfilename}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example fullfilename'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleFullfilename_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example fullfilename"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example fullfilename}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example fullfilename'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleFullfilename_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\nfullfilename"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleHttpsExampleOrgExample_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleHttpsExampleOrgExample_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\nhttps://example.org/example"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example Source}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example Source'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleSource_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example Source"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example Source}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example Source'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleSource_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\nSource"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example url解码异常，接入方法错误未使用BASE64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example url解码异常，接入方法错误未使用BASE64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleUrlBase64_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example url解码异常，接入方法错误未使用BASE64"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example url解码异常，接入方法错误未使用BASE64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example url解码异常，接入方法错误未使用BASE64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleUrlBase64_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\nurl解码异常，接入方法错误未使用BASE64"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example urlPath}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example urlPath'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleUrlPath_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example urlPath"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example urlPath}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/example urlPath'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleUrlPath_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\nurlPath"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull4() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull5() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("\nhttps://example.org/example"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull6() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example  "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull7() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example \n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example +}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example +'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull8() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example +"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example ?}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example ?'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull9() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example ?"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example [=]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example [=]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull10() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example [=]"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example [?]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example [?]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull11() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example [?]"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull12() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\n "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull13() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\n\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example ?}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example ?'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull14() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\n?"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example [=]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example [=]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull15() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\n[=]"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example [?]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example [?]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull16() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example\n[?]"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example+}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example+'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull17() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example+ "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/examplebase64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/examplebase64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExamplebase64_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/examplebase64 "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/examplebase64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/examplebase64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExamplebase64_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/examplebase64\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/examplehttps://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/examplehttps://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExamplehttpsExampleOrgExample_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/examplehttps://example.org/example "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/examplehttps://example.org/example}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/examplehttps://example.org/example'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExamplehttpsExampleOrgExample_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/examplehttps://example.org/example\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code [=]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '[=]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLeftSquareBracketEqualsSignRightSquareBracket_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" [=]"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code [=]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '[=]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLeftSquareBracketEqualsSignRightSquareBracket_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("\n[=]"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code [=]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '[=]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLeftSquareBracketEqualsSignRightSquareBracket_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("[=] "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code [=]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '[=]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLeftSquareBracketEqualsSignRightSquareBracket_thenReturnNull4() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("[=]\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code [?]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '[?]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLeftSquareBracketQuestionMarkRightSquareBracket_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" [?]"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code [?]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '[?]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLeftSquareBracketQuestionMarkRightSquareBracket_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("\n[?]"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code [?]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '[?]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLeftSquareBracketQuestionMarkRightSquareBracket_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("[?] "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code [?]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '[?]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLeftSquareBracketQuestionMarkRightSquareBracket_thenReturnNull4() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("[?]\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When lf lf.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when lf lf; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLfLf_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("\n\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When lf space.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when lf space; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLfSpace_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("\n "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When lf.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when lf; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenLf_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code +}.
   *   <li>Then return replacement character.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '+'; then return replacement character")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenPlusSign_thenReturnReplacementCharacter() {
    // Arrange, Act and Assert
    assertEquals("�", WebUtils.decodeUrl(" +"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code +}.
   *   <li>Then return replacement character.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '+'; then return replacement character")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenPlusSign_thenReturnReplacementCharacter2() {
    // Arrange, Act and Assert
    assertEquals("�", WebUtils.decodeUrl("+ "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '?'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenQuestionMark_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" ?"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '?'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenQuestionMark_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("\n?"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '?'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenQuestionMark_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("? "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code ?}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when '?'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenQuestionMark_thenReturnNull4() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("?\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code Source}.
   *   <li>Then return J replacement character replacement character q.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'Source'; then return J replacement character replacement character q")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenSource_thenReturnJReplacementCharacterReplacementCharacterQ() {
    // Arrange, Act and Assert
    assertEquals("J��q", WebUtils.decodeUrl("\nSource"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code Source}.
   *   <li>Then return J replacement character replacement character q.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'Source'; then return J replacement character replacement character q")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenSource_thenReturnJReplacementCharacterReplacementCharacterQ2() {
    // Arrange, Act and Assert
    assertEquals("J��q", WebUtils.decodeUrl("Source\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When space lf.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when space lf; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenSpaceLf_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" \n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When space space.
   *   <li>Then return replacement character.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when space space; then return replacement character")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenSpaceSpace_thenReturnReplacementCharacter() {
    // Arrange, Act and Assert
    assertEquals("�", WebUtils.decodeUrl("  "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When space.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when space; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenSpace_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code url解码异常，接入方法错误未使用BASE64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'url解码异常，接入方法错误未使用BASE64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenUrlBase64_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" url解码异常，接入方法错误未使用BASE64"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code url解码异常，接入方法错误未使用BASE64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'url解码异常，接入方法错误未使用BASE64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenUrlBase64_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("\nurl解码异常，接入方法错误未使用BASE64"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code url解码异常，接入方法错误未使用BASE64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'url解码异常，接入方法错误未使用BASE64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenUrlBase64_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("url解码异常，接入方法错误未使用BASE64 "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code url解码异常，接入方法错误未使用BASE64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'url解码异常，接入方法错误未使用BASE64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenUrlBase64_thenReturnNull4() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("url解码异常，接入方法错误未使用BASE64\n"));
  }

  /**
   * Test {@link WebUtils#decodeBase64String(String, Charset)}.
   *
   * <ul>
   *   <li>Then return J replacement character replacement character q.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeBase64String(String, Charset)}
   */
  @Test
  @DisplayName(
      "Test decodeBase64String(String, Charset); then return J replacement character replacement character q")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeBase64String(String, Charset)"})
  void testDecodeBase64String_thenReturnJReplacementCharacterReplacementCharacterQ() {
    // Arrange, Act and Assert
    assertEquals(
        "J��q",
        WebUtils.decodeBase64String("Source", Charset.forName(KkFileUtils.DEFAULT_FILE_ENCODING)));
  }

  /**
   * Test {@link WebUtils#decodeBase64String(String, Charset)}.
   *
   * <ul>
   *   <li>When lf.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeBase64String(String, Charset)}
   */
  @Test
  @DisplayName("Test decodeBase64String(String, Charset); when lf; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeBase64String(String, Charset)"})
  void testDecodeBase64String_whenLf_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals(
        "", WebUtils.decodeBase64String("\n", Charset.forName(KkFileUtils.DEFAULT_FILE_ENCODING)));
  }

  /**
   * Test {@link WebUtils#decodeBase64String(String, Charset)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeBase64String(String, Charset)}
   */
  @Test
  @DisplayName("Test decodeBase64String(String, Charset); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeBase64String(String, Charset)"})
  void testDecodeBase64String_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeBase64String("Source", null));
  }

  /**
   * Test {@link WebUtils#decodeBase64String(String, Charset)}.
   *
   * <ul>
   *   <li>When space.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeBase64String(String, Charset)}
   */
  @Test
  @DisplayName("Test decodeBase64String(String, Charset); when space; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeBase64String(String, Charset)"})
  void testDecodeBase64String_whenSpace_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        WebUtils.decodeBase64String(" ", Charset.forName(KkFileUtils.DEFAULT_FILE_ENCODING)));
  }

  /**
   * Test {@link WebUtils#getHost(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then return {@code example.org}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getHost(String)}
   */
  @Test
  @DisplayName(
      "Test getHost(String); when 'https://example.org/example'; then return 'example.org'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getHost(String)"})
  void testGetHost_whenHttpsExampleOrgExample_thenReturnExampleOrg() {
    // Arrange, Act and Assert
    assertEquals("example.org", WebUtils.getHost("https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#getHost(String)}.
   *
   * <ul>
   *   <li>When {@code Url Str}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getHost(String)}
   */
  @Test
  @DisplayName("Test getHost(String); when 'Url Str'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getHost(String)"})
  void testGetHost_whenUrlStr_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.getHost("Url Str"));
  }

  /**
   * Test {@link WebUtils#getSessionAttr(HttpServletRequest, String)}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSessionAttr(HttpServletRequest, String)}
   */
  @Test
  @DisplayName("Test getSessionAttr(HttpServletRequest, String); when 'Key'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSessionAttr(HttpServletRequest, String)"})
  void testGetSessionAttr_whenKey_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.getSessionAttr(new MockHttpServletRequest(), "Key"));
  }

  /**
   * Test {@link WebUtils#getLongSessionAttr(HttpServletRequest, String)}.
   *
   * <ul>
   *   <li>When {@code Key}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getLongSessionAttr(HttpServletRequest, String)}
   */
  @Test
  @DisplayName("Test getLongSessionAttr(HttpServletRequest, String); when 'Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long WebUtils.getLongSessionAttr(HttpServletRequest, String)"})
  void testGetLongSessionAttr_whenKey_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, WebUtils.getLongSessionAttr(new MockHttpServletRequest(), "Key"));
  }
}
