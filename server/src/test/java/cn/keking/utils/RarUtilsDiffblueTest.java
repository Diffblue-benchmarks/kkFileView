package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RarUtilsDiffblueTest {
  /**
   * Test {@link RarUtils#getUTF8BytesFromGBKString(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return empty array of {@code byte}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#getUTF8BytesFromGBKString(String)}
   */
  @Test
  @DisplayName(
      "Test getUTF8BytesFromGBKString(String); when empty string; then return empty array of byte")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] RarUtils.getUTF8BytesFromGBKString(String)"})
  void testGetUTF8BytesFromGBKString_whenEmptyString_thenReturnEmptyArrayOfByte() {
    // Arrange, Act and Assert
    assertArrayEquals(new byte[] {}, RarUtils.getUTF8BytesFromGBKString(""));
  }

  /**
   * Test {@link RarUtils#getUTF8BytesFromGBKString(String)}.
   *
   * <ul>
   *   <li>When {@code Gbk Str}.
   *   <li>Then return {@code Gbk Str} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#getUTF8BytesFromGBKString(String)}
   */
  @Test
  @DisplayName(
      "Test getUTF8BytesFromGBKString(String); when 'Gbk Str'; then return 'Gbk Str' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"byte[] RarUtils.getUTF8BytesFromGBKString(String)"})
  void testGetUTF8BytesFromGBKString_whenGbkStr_thenReturnGbkStrBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertArrayEquals("Gbk Str".getBytes("UTF-8"), RarUtils.getUTF8BytesFromGBKString("Gbk Str"));
  }

  /**
   * Test {@link RarUtils#getUtf8String(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#getUtf8String(String)}
   */
  @Test
  @DisplayName("Test getUtf8String(String); when empty string; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RarUtils.getUtf8String(String)"})
  void testGetUtf8String_whenEmptyString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", RarUtils.getUtf8String(""));
  }

  /**
   * Test {@link RarUtils#getUtf8String(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#getUtf8String(String)}
   */
  @Test
  @DisplayName("Test getUtf8String(String); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RarUtils.getUtf8String(String)"})
  void testGetUtf8String_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RarUtils.getUtf8String(null));
  }

  /**
   * Test {@link RarUtils#getUtf8String(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then return {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#getUtf8String(String)}
   */
  @Test
  @DisplayName("Test getUtf8String(String); when 'Str'; then return 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RarUtils.getUtf8String(String)"})
  void testGetUtf8String_whenStr_thenReturnStr() {
    // Arrange, Act and Assert
    assertEquals("Str", RarUtils.getUtf8String("Str"));
  }

  /**
   * Test {@link RarUtils#judge(char)}.
   *
   * <ul>
   *   <li>When {@code 0}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#judge(char)}
   */
  @Test
  @DisplayName("Test judge(char); when '0'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RarUtils.judge(char)"})
  void testJudge_when0_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(RarUtils.judge('0'));
  }

  /**
   * Test {@link RarUtils#judge(char)}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#judge(char)}
   */
  @Test
  @DisplayName("Test judge(char); when 'A'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RarUtils.judge(char)"})
  void testJudge_whenA_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(RarUtils.judge('A'));
  }

  /**
   * Test {@link RarUtils#judge(char)}.
   *
   * <ul>
   *   <li>When {@code a}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#judge(char)}
   */
  @Test
  @DisplayName("Test judge(char); when 'a'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RarUtils.judge(char)"})
  void testJudge_whenA_thenReturnTrue2() {
    // Arrange, Act and Assert
    assertTrue(RarUtils.judge('a'));
  }

  /**
   * Test {@link RarUtils#judge(char)}.
   *
   * <ul>
   *   <li>When {@code `}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#judge(char)}
   */
  @Test
  @DisplayName("Test judge(char); when '`'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RarUtils.judge(char)"})
  void testJudge_whenBacktick_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(RarUtils.judge('`'));
  }

  /**
   * Test {@link RarUtils#judge(char)}.
   * <ul>
   *   <li>When {@code {}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RarUtils#judge(char)}
   */
  @Test
  @DisplayName("Test judge(char); when '{'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RarUtils.judge(char)"})
  void testJudge_whenLeftCurlyBracket_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(RarUtils.judge('{'));
  }

  /**
   * Test {@link RarUtils#judge(char)}.
   *
   * <ul>
   *   <li>When {@code /}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#judge(char)}
   */
  @Test
  @DisplayName("Test judge(char); when '/'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RarUtils.judge(char)"})
  void testJudge_whenSlash_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(RarUtils.judge('/'));
  }

  /**
   * Test {@link RarUtils#specialSymbols(String)}.
   *
   * <p>Method under test: {@link RarUtils#specialSymbols(String)}
   */
  @Test
  @DisplayName("Test specialSymbols(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RarUtils.specialSymbols(String)"})
  void testSpecialSymbols() {
    // Arrange, Act and Assert
    assertEquals("Str", RarUtils.specialSymbols("Str"));
  }

  /**
   * Test {@link RarUtils#isMessyCode(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#isMessyCode(String)}
   */
  @Test
  @DisplayName("Test isMessyCode(String); when '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RarUtils.isMessyCode(String)"})
  void testIsMessyCode_when42_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(RarUtils.isMessyCode("42"));
  }

  /**
   * Test {@link RarUtils#isMessyCode(String)}.
   *
   * <ul>
   *   <li>When \s| | | |\+|#|&amp;|=| replacement character |\p{P}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#isMessyCode(String)}
   */
  @Test
  @DisplayName(
      "Test isMessyCode(String); when \\s| | | |\\+|#|&|=| replacement character |\\p{P}; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RarUtils.isMessyCode(String)"})
  void testIsMessyCode_whenSReplacementCharacterPP_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(RarUtils.isMessyCode("\\s|\t|\r|\n|\\+|#|&|=|�|\\p{P}"));
  }

  /**
   * Test {@link RarUtils#isMessyCode(String)}.
   *
   * <ul>
   *   <li>When {@code Str Name}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link RarUtils#isMessyCode(String)}
   */
  @Test
  @DisplayName("Test isMessyCode(String); when 'Str Name'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RarUtils.isMessyCode(String)"})
  void testIsMessyCode_whenStrName_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(RarUtils.isMessyCode("Str Name"));
  }
}
