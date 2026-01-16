package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import cn.keking.web.controller.FileControllerFactory;
import cn.keking.web.filter.TrustHostFilterFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import org.eclipse.jetty.server.ServletRequestHttpWrapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

class WebUtilsDiffblueTest {
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
   *   <li>Then return {@code fullfilename%5B?%5Dfullfilename}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'fullfilename%5B?%5Dfullfilename'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilename5b5Dfullfilename() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilename%5B?%5Dfullfilename",
        WebUtils.urlEncoderencode("fullfilename[?]fullfilename"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilename%5B?%5Dhttps://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'fullfilename%5B?%5Dhttps://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilename5b5DhttpsExampleOrgExample() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilename%5B?%5Dhttps://example.org/example",
        WebUtils.urlEncoderencode("fullfilename[?]https://example.org/example"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilenamefile:fullfilename}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'fullfilenamefile:fullfilename'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilenamefileFullfilename() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilenamefile:fullfilename",
        WebUtils.urlEncoderencode("fullfilenamefile:fullfilename"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilenamefile:Url%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'fullfilenamefile:Url%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilenamefileUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilenamefile:Url%20Str", WebUtils.urlEncoderencode("fullfilenamefile:Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilenamefullfilename%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'fullfilenamefullfilename%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilenamefullfilename5b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilenamefullfilename%5B?%5D",
        WebUtils.urlEncoderencode("fullfilenamefullfilename[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilenamefullfilename%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'fullfilenamefullfilename%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilenamefullfilename5b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilenamefullfilename%5B=%5D",
        WebUtils.urlEncoderencode("fullfilenamefullfilename[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilenamefullfilenameUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'fullfilenamefullfilenameUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilenamefullfilenameUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilenamefullfilenameUrl%20Str",
        WebUtils.urlEncoderencode("fullfilenamefullfilenameUrl Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilenamefullfilenamefile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName("Test urlEncoderencode(String); then return 'fullfilenamefullfilenamefile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilenamefullfilenamefile() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilenamefullfilenamefile:",
        WebUtils.urlEncoderencode("fullfilenamefullfilenamefile:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilenamehttps://example.org/example%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'fullfilenamehttps://example.org/example%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilenamehttpsExampleOrgExample5b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilenamehttps://example.org/example%5B?%5D",
        WebUtils.urlEncoderencode("fullfilenamehttps://example.org/example[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilenamehttps://example.org/example%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'fullfilenamehttps://example.org/example%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilenamehttpsExampleOrgExample5b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilenamehttps://example.org/example%5B=%5D",
        WebUtils.urlEncoderencode("fullfilenamehttps://example.org/example[=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilenamehttps://example.org/exampleUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'fullfilenamehttps://example.org/exampleUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilenamehttpsExampleOrgExampleUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilenamehttps://example.org/exampleUrl%20Str",
        WebUtils.urlEncoderencode("fullfilenamehttps://example.org/exampleUrl Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code fullfilenamehttps://example.org/examplefile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'fullfilenamehttps://example.org/examplefile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnFullfilenamehttpsExampleOrgExamplefile() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilenamehttps://example.org/examplefile:",
        WebUtils.urlEncoderencode("fullfilenamehttps://example.org/examplefile:"));
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
   *   <li>Then return {@code https://example.org/examplebase64Url%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplebase64Url%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplebase64Url20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplebase64Url%20Str",
        WebUtils.urlEncoderencode("https://example.org/examplebase64Url Str"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplebase64file:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplebase64file:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplebase64file() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplebase64file:",
        WebUtils.urlEncoderencode("https://example.org/examplebase64file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplebase64%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplebase64%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplebase645b5d() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplebase64%5B?%5D",
        WebUtils.urlEncoderencode("https://example.org/examplebase64[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>Then return {@code https://example.org/examplebase64%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); then return 'https://example.org/examplebase64%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_thenReturnHttpsExampleOrgExamplebase645b5d2() {
    // Arrange, Act and Assert
    assertEquals(
        "https://example.org/examplebase64%5B=%5D",
        WebUtils.urlEncoderencode("https://example.org/examplebase64[=]"));
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
   *   <li>When {@code fullfilename[?]42}.
   *   <li>Then return {@code fullfilename%5B?%5D42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[?]42'; then return 'fullfilename%5B?%5D42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename42_thenReturnFullfilename5b5d42() {
    // Arrange, Act and Assert
    assertEquals("fullfilename%5B?%5D42", WebUtils.urlEncoderencode("fullfilename[?]42"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename[?]base64}.
   *   <li>Then return {@code fullfilename%5B?%5Dbase64}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[?]base64'; then return 'fullfilename%5B?%5Dbase64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenameBase64_thenReturnFullfilename5b5Dbase64() {
    // Arrange, Act and Assert
    assertEquals("fullfilename%5B?%5Dbase64", WebUtils.urlEncoderencode("fullfilename[?]base64"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename[?]file:}.
   *   <li>Then return {@code fullfilename%5B?%5Dfile:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[?]file:'; then return 'fullfilename%5B?%5Dfile:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenameFile_thenReturnFullfilename5b5Dfile() {
    // Arrange, Act and Assert
    assertEquals("fullfilename%5B?%5Dfile:", WebUtils.urlEncoderencode("fullfilename[?]file:"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename[?]Url Str}.
   *   <li>Then return {@code fullfilename%5B?%5DUrl%20Str}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[?]Url Str'; then return 'fullfilename%5B?%5DUrl%20Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenameUrlStr_thenReturnFullfilename5b5DUrl20Str() {
    // Arrange, Act and Assert
    assertEquals(
        "fullfilename%5B?%5DUrl%20Str", WebUtils.urlEncoderencode("fullfilename[?]Url Str"));
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
   *   <li>When {@code fullfilename[?]+}.
   *   <li>Then return {@code fullfilename%5B?%5D%2B}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[?]+'; then return 'fullfilename%5B?%5D%2B'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename_thenReturnFullfilename5b5d2b() {
    // Arrange, Act and Assert
    assertEquals("fullfilename%5B?%5D%2B", WebUtils.urlEncoderencode("fullfilename[?]+"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename[?]?}.
   *   <li>Then return {@code fullfilename%5B?%5D?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[?]?'; then return 'fullfilename%5B?%5D?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename_thenReturnFullfilename5b5d3() {
    // Arrange, Act and Assert
    assertEquals("fullfilename%5B?%5D?", WebUtils.urlEncoderencode("fullfilename[?]?"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename[?]/}.
   *   <li>Then return {@code fullfilename%5B?%5D/}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[?]/'; then return 'fullfilename%5B?%5D/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename_thenReturnFullfilename5b5d4() {
    // Arrange, Act and Assert
    assertEquals("fullfilename%5B?%5D/", WebUtils.urlEncoderencode("fullfilename[?]/"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename/[?]}.
   *   <li>Then return {@code fullfilename/%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename/[?]'; then return 'fullfilename/%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename_thenReturnFullfilename5b5d5() {
    // Arrange, Act and Assert
    assertEquals("fullfilename/%5B?%5D", WebUtils.urlEncoderencode("fullfilename/[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename[?][?]}.
   *   <li>Then return {@code fullfilename%5B?%5D%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[?][?]'; then return 'fullfilename%5B?%5D%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename_thenReturnFullfilename5b5d5b5d() {
    // Arrange, Act and Assert
    assertEquals("fullfilename%5B?%5D%5B?%5D", WebUtils.urlEncoderencode("fullfilename[?][?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilename[?][=]}.
   *   <li>Then return {@code fullfilename%5B?%5D%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilename[?][=]'; then return 'fullfilename%5B?%5D%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilename_thenReturnFullfilename5b5d5b5d2() {
    // Arrange, Act and Assert
    assertEquals("fullfilename%5B?%5D%5B=%5D", WebUtils.urlEncoderencode("fullfilename[?][=]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilenamefile:42}.
   *   <li>Then return {@code fullfilenamefile:42}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilenamefile:42'; then return 'fullfilenamefile:42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenamefile42_thenReturnFullfilenamefile42() {
    // Arrange, Act and Assert
    assertEquals("fullfilenamefile:42", WebUtils.urlEncoderencode("fullfilenamefile:42"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilenamefile:base64}.
   *   <li>Then return {@code fullfilenamefile:base64}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilenamefile:base64'; then return 'fullfilenamefile:base64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenamefileBase64_thenReturnFullfilenamefileBase64() {
    // Arrange, Act and Assert
    assertEquals("fullfilenamefile:base64", WebUtils.urlEncoderencode("fullfilenamefile:base64"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilenamefile:file:}.
   *   <li>Then return {@code fullfilenamefile:file:}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilenamefile:file:'; then return 'fullfilenamefile:file:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenamefileFile_thenReturnFullfilenamefileFile() {
    // Arrange, Act and Assert
    assertEquals("fullfilenamefile:file:", WebUtils.urlEncoderencode("fullfilenamefile:file:"));
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
   *   <li>When {@code fullfilenamefile:?}.
   *   <li>Then return {@code fullfilenamefile:?}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilenamefile:?'; then return 'fullfilenamefile:?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenamefile_thenReturnFullfilenamefile2() {
    // Arrange, Act and Assert
    assertEquals("fullfilenamefile:?", WebUtils.urlEncoderencode("fullfilenamefile:?"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilenamefile:+}.
   *   <li>Then return {@code fullfilenamefile:%2B}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilenamefile:+'; then return 'fullfilenamefile:%2B'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenamefile_thenReturnFullfilenamefile2b() {
    // Arrange, Act and Assert
    assertEquals("fullfilenamefile:%2B", WebUtils.urlEncoderencode("fullfilenamefile:+"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilenamefile:[?]}.
   *   <li>Then return {@code fullfilenamefile:%5B?%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilenamefile:[?]'; then return 'fullfilenamefile:%5B?%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenamefile_thenReturnFullfilenamefile5b5d() {
    // Arrange, Act and Assert
    assertEquals("fullfilenamefile:%5B?%5D", WebUtils.urlEncoderencode("fullfilenamefile:[?]"));
  }

  /**
   * Test {@link WebUtils#urlEncoderencode(String)}.
   *
   * <ul>
   *   <li>When {@code fullfilenamefile:[=]}.
   *   <li>Then return {@code fullfilenamefile:%5B=%5D}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#urlEncoderencode(String)}
   */
  @Test
  @DisplayName(
      "Test urlEncoderencode(String); when 'fullfilenamefile:[=]'; then return 'fullfilenamefile:%5B=%5D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.urlEncoderencode(String)"})
  void testUrlEncoderencode_whenFullfilenamefile_thenReturnFullfilenamefile5b5d2() {
    // Arrange, Act and Assert
    assertEquals("fullfilenamefile:%5B=%5D", WebUtils.urlEncoderencode("fullfilenamefile:[=]"));
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
   * Test {@link WebUtils#getUrlParameterReg(String, String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getUrlParameterReg(String, String)}
   */
  @Test
  @DisplayName(
      "Test getUrlParameterReg(String, String); when createValidFtpUrl; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getUrlParameterReg(String, String)"})
  void testGetUrlParameterReg_whenCreateValidFtpUrl_thenReturnEmptyString() {
    // Arrange
    String url = FtpUtilsFactory.createValidFtpUrl();

    // Act and Assert
    assertEquals("", WebUtils.getUrlParameterReg(url, FtpUtilsFactory.createValidFtpUrl()));
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
    assertEquals("", WebUtils.getUrlParameterReg("", FtpUtilsFactory.createValidFtpUrl()));
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
    assertNull(WebUtils.getUrlParameterReg("foo[?]bar", FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link WebUtils#getFileNameFromURL(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code file.txt}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getFileNameFromURL(String)}
   */
  @Test
  @DisplayName("Test getFileNameFromURL(String); when createValidFtpUrl; then return 'file.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getFileNameFromURL(String)"})
  void testGetFileNameFromURL_whenCreateValidFtpUrl_thenReturnFileTxt() {
    // Arrange, Act and Assert
    assertEquals("file.txt", WebUtils.getFileNameFromURL(FtpUtilsFactory.createValidFtpUrl()));
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
   *   <li>Then return {@code file.txt}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getFileNameFromMultipartFile(MultipartFile)}
   */
  @Test
  @DisplayName("Test getFileNameFromMultipartFile(MultipartFile); then return 'file.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getFileNameFromMultipartFile(MultipartFile)"})
  void testGetFileNameFromMultipartFile_thenReturnFileTxt() throws IOException {
    // Arrange
    String name = FtpUtilsFactory.createValidFtpUrl();
    String originalFilename = FtpUtilsFactory.createValidFtpUrl();
    String contentType = FtpUtilsFactory.createValidFtpUrl();

    MockMultipartFile file =
        new MockMultipartFile(
            name,
            originalFilename,
            contentType,
            new ByteArrayInputStream("A/A/A/A/".getBytes("UTF-8")));

    // Act and Assert
    assertEquals("file.txt", WebUtils.getFileNameFromMultipartFile(file));
  }

  /**
   * Test {@link WebUtils#getFileNameFromMultipartFile(MultipartFile)}.
   *
   * <ul>
   *   <li>Then return {@code test-document.txt}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getFileNameFromMultipartFile(MultipartFile)}
   */
  @Test
  @DisplayName("Test getFileNameFromMultipartFile(MultipartFile); then return 'test-document.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getFileNameFromMultipartFile(MultipartFile)"})
  void testGetFileNameFromMultipartFile_thenReturnTestDocumentTxt() {
    // Arrange, Act and Assert
    assertEquals(
        "test-document.txt",
        WebUtils.getFileNameFromMultipartFile(FileControllerFactory.createMultipartFile()));
  }

  /**
   * Test {@link WebUtils#suffixFromUrl(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code txt}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#suffixFromUrl(String)}
   */
  @Test
  @DisplayName("Test suffixFromUrl(String); when createValidFtpUrl; then return 'txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.suffixFromUrl(String)"})
  void testSuffixFromUrl_whenCreateValidFtpUrl_thenReturnTxt() {
    // Arrange, Act and Assert
    assertEquals("txt", WebUtils.suffixFromUrl(FtpUtilsFactory.createValidFtpUrl()));
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
   *   <li>Then return {@code http://localhost/test}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSourceUrl(ServletRequest)}
   */
  @Test
  @DisplayName("Test getSourceUrl(ServletRequest); then return 'http://localhost/test'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSourceUrl(ServletRequest)"})
  void testGetSourceUrl_thenReturnHttpLocalhostTest() {
    // Arrange, Act and Assert
    assertEquals(
        "http://localhost/test",
        WebUtils.getSourceUrl(TrustHostFilterFactory.createServletRequestWithValidUrl()));
  }

  /**
   * Test {@link WebUtils#getSourceUrl(ServletRequest)}.
   *
   * <ul>
   *   <li>When createHttpServletRequestWithSession.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSourceUrl(ServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getSourceUrl(ServletRequest); when createHttpServletRequestWithSession; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSourceUrl(ServletRequest)"})
  void testGetSourceUrl_whenCreateHttpServletRequestWithSession_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.getSourceUrl(FileControllerFactory.createHttpServletRequestWithSession()));
  }

  /**
   * Test {@link WebUtils#isValidUrl(String)}.
   *
   * <ul>
   *   <li>When createValidFtpHost.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#isValidUrl(String)}
   */
  @Test
  @DisplayName("Test isValidUrl(String); when createValidFtpHost; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WebUtils.isValidUrl(String)"})
  void testIsValidUrl_whenCreateValidFtpHost_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(WebUtils.isValidUrl(FtpUtilsFactory.createValidFtpHost()));
  }

  /**
   * Test {@link WebUtils#isValidUrl(String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#isValidUrl(String)}
   */
  @Test
  @DisplayName("Test isValidUrl(String); when createValidFtpUrl; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WebUtils.isValidUrl(String)"})
  void testIsValidUrl_whenCreateValidFtpUrl_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(WebUtils.isValidUrl(FtpUtilsFactory.createValidFtpUrl()));
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
    assertEquals("J��q�", WebUtils.decodeUrl("Source "));
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
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when createValidFtpUrl; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenCreateValidFtpUrl_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(FtpUtilsFactory.createValidFtpUrl()));
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
   *   <li>When {@code https://example.org/example42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample42_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example42 "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample42_thenReturnNull4() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example42\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example42}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example42'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample42_thenReturnNull5() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/example42"));
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
   *   <li>When {@code https://example.org/exampleSource}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/exampleSource'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleSource_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/exampleSource "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/exampleSource}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/exampleSource'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleSource_thenReturnNull4() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/exampleSource\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/exampleSource}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/exampleSource'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleSource_thenReturnNull5() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/exampleSource"));
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull2() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull3() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull4() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull5() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull6() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull7() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull8() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull9() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull10() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull11() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull12() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull13() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull14() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull15() {
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull16() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example+ "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example?}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example?'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull17() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example? "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example?}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example?'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull18() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example?\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example[=]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example[=]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull19() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example[=] "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example[=]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example[=]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull20() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example[=]\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example[?]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example[?]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull21() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example[?] "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example[?]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example[?]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull22() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/example[?]\n"));
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull23() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/example "));
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull24() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/example\n"));
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
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull25() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/example+"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example?}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example?'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull26() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/example?"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example[=]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example[=]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull27() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/example[=]"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example[?]}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName("Test decodeUrl(String); when 'https://example.org/example[?]'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExample_thenReturnNull28() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/example[?]"));
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
  void testDecodeUrl_whenHttpsExampleOrgExamplebase64_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/examplebase64"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/exampleWebUtils}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/examplecn.keking.utils.WebUtils'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExamplecnKekingUtilsWebUtils_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/examplecn.keking.utils.WebUtils "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/exampleWebUtils}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/examplecn.keking.utils.WebUtils'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExamplecnKekingUtilsWebUtils_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/examplecn.keking.utils.WebUtils\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/exampleWebUtils}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/examplecn.keking.utils.WebUtils'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExamplecnKekingUtilsWebUtils_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/examplecn.keking.utils.WebUtils"));
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
  void testDecodeUrl_whenHttpsExampleOrgExamplehttpsExampleOrgExample_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/examplehttps://example.org/example"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/exampleurl解码异常，接入方法错误未使用BASE64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/exampleurl解码异常，接入方法错误未使用BASE64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleurlBase64_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/exampleurl解码异常，接入方法错误未使用BASE64 "));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/exampleurl解码异常，接入方法错误未使用BASE64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/exampleurl解码异常，接入方法错误未使用BASE64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleurlBase64_thenReturnNull2() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl("https://example.org/exampleurl解码异常，接入方法错误未使用BASE64\n"));
  }

  /**
   * Test {@link WebUtils#decodeUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/exampleurl解码异常，接入方法错误未使用BASE64}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeUrl(String)}
   */
  @Test
  @DisplayName(
      "Test decodeUrl(String); when 'https://example.org/exampleurl解码异常，接入方法错误未使用BASE64'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeUrl(String)"})
  void testDecodeUrl_whenHttpsExampleOrgExampleurlBase64_thenReturnNull3() {
    // Arrange, Act and Assert
    assertNull(WebUtils.decodeUrl(" https://example.org/exampleurl解码异常，接入方法错误未使用BASE64"));
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
   *   <li>When createValidFtpUrl.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#decodeBase64String(String, Charset)}
   */
  @Test
  @DisplayName(
      "Test decodeBase64String(String, Charset); when createValidFtpUrl; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.decodeBase64String(String, Charset)"})
  void testDecodeBase64String_whenCreateValidFtpUrl_thenReturnNull() {
    // Arrange
    String source = FtpUtilsFactory.createValidFtpUrl();

    // Act and Assert
    assertNull(
        WebUtils.decodeBase64String(source, Charset.forName(KkFileUtils.DEFAULT_FILE_ENCODING)));
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
    assertNull(WebUtils.decodeBase64String("\n", null));
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
   *   <li>When createValidFtpHost.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getHost(String)}
   */
  @Test
  @DisplayName("Test getHost(String); when createValidFtpHost; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getHost(String)"})
  void testGetHost_whenCreateValidFtpHost_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(WebUtils.getHost(FtpUtilsFactory.createValidFtpHost()));
  }

  /**
   * Test {@link WebUtils#getSessionAttr(HttpServletRequest, String)}.
   *
   * <p>Method under test: {@link WebUtils#getSessionAttr(HttpServletRequest, String)}
   */
  @Test
  @DisplayName("Test getSessionAttr(HttpServletRequest, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSessionAttr(HttpServletRequest, String)"})
  void testGetSessionAttr() {
    // Arrange
    ServletRequestHttpWrapper request =
        new ServletRequestHttpWrapper(TrustHostFilterFactory.createServletRequestWithValidUrl());

    // Act and Assert
    assertNull(WebUtils.getSessionAttr(request, FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link WebUtils#getSessionAttr(HttpServletRequest, String)}.
   *
   * <ul>
   *   <li>When createHttpServletRequestWithSession.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getSessionAttr(HttpServletRequest, String)}
   */
  @Test
  @DisplayName(
      "Test getSessionAttr(HttpServletRequest, String); when createHttpServletRequestWithSession; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String WebUtils.getSessionAttr(HttpServletRequest, String)"})
  void testGetSessionAttr_whenCreateHttpServletRequestWithSession_thenReturnNull() {
    // Arrange
    HttpServletRequest request = FileControllerFactory.createHttpServletRequestWithSession();

    // Act and Assert
    assertNull(WebUtils.getSessionAttr(request, FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link WebUtils#getLongSessionAttr(HttpServletRequest, String)}.
   *
   * <p>Method under test: {@link WebUtils#getLongSessionAttr(HttpServletRequest, String)}
   */
  @Test
  @DisplayName("Test getLongSessionAttr(HttpServletRequest, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long WebUtils.getLongSessionAttr(HttpServletRequest, String)"})
  void testGetLongSessionAttr() {
    // Arrange
    ServletRequestHttpWrapper request =
        new ServletRequestHttpWrapper(TrustHostFilterFactory.createServletRequestWithValidUrl());

    // Act and Assert
    assertEquals(0L, WebUtils.getLongSessionAttr(request, FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link WebUtils#getLongSessionAttr(HttpServletRequest, String)}.
   *
   * <ul>
   *   <li>When createHttpServletRequestWithSession.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link WebUtils#getLongSessionAttr(HttpServletRequest, String)}
   */
  @Test
  @DisplayName(
      "Test getLongSessionAttr(HttpServletRequest, String); when createHttpServletRequestWithSession; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long WebUtils.getLongSessionAttr(HttpServletRequest, String)"})
  void testGetLongSessionAttr_whenCreateHttpServletRequestWithSession_thenReturnZero() {
    // Arrange
    HttpServletRequest request = FileControllerFactory.createHttpServletRequestWithSession();

    // Act and Assert
    assertEquals(0L, WebUtils.getLongSessionAttr(request, FtpUtilsFactory.createValidFtpUrl()));
  }
}
