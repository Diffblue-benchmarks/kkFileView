package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OfficeUtilsDiffblueTest {
  /**
   * Test {@link OfficeUtils#isPwdProtected(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeUtils#isPwdProtected(String)}
   */
  @Test
  @DisplayName("Test isPwdProtected(String); when empty string; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OfficeUtils.isPwdProtected(String)"})
  void testIsPwdProtected_whenEmptyString_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(OfficeUtils.isPwdProtected(""));
  }

  /**
   * Test {@link OfficeUtils#isPwdProtected(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeUtils#isPwdProtected(String)}
   */
  @Test
  @DisplayName("Test isPwdProtected(String); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OfficeUtils.isPwdProtected(String)"})
  void testIsPwdProtected_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(OfficeUtils.isPwdProtected(null));
  }

  /**
   * Test {@link OfficeUtils#isPwdProtected(String)}.
   *
   * <ul>
   *   <li>When {@code password}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeUtils#isPwdProtected(String)}
   */
  @Test
  @DisplayName("Test isPwdProtected(String); when 'password'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OfficeUtils.isPwdProtected(String)"})
  void testIsPwdProtected_whenPassword_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(OfficeUtils.isPwdProtected("password"));
  }

  /**
   * Test {@link OfficeUtils#isPwdProtected(String)}.
   *
   * <ul>
   *   <li>When {@code Path}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeUtils#isPwdProtected(String)}
   */
  @Test
  @DisplayName("Test isPwdProtected(String); when 'Path'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OfficeUtils.isPwdProtected(String)"})
  void testIsPwdProtected_whenPath_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(OfficeUtils.isPwdProtected("Path"));
  }

  /**
   * Test {@link OfficeUtils#isCompatible(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link OfficeUtils#isCompatible(String, String)}
   */
  @Test
  @DisplayName("Test isCompatible(String, String); when empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OfficeUtils.isCompatible(String, String)"})
  void testIsCompatible_whenEmptyString() {
    // Arrange, Act and Assert
    assertFalse(OfficeUtils.isCompatible("", "iloveyou"));
  }

  /**
   * Test {@link OfficeUtils#isCompatible(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeUtils#isCompatible(String, String)}
   */
  @Test
  @DisplayName("Test isCompatible(String, String); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OfficeUtils.isCompatible(String, String)"})
  void testIsCompatible_whenNull() {
    // Arrange, Act and Assert
    assertFalse(OfficeUtils.isCompatible(null, "iloveyou"));
  }

  /**
   * Test {@link OfficeUtils#isCompatible(String, String)}.
   *
   * <ul>
   *   <li>When {@code Password}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeUtils#isCompatible(String, String)}
   */
  @Test
  @DisplayName("Test isCompatible(String, String); when 'Password'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OfficeUtils.isCompatible(String, String)"})
  void testIsCompatible_whenPassword() {
    // Arrange, Act and Assert
    assertFalse(OfficeUtils.isCompatible("", "Password"));
  }

  /**
   * Test {@link OfficeUtils#isCompatible(String, String)}.
   *
   * <ul>
   *   <li>When {@code Path}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeUtils#isCompatible(String, String)}
   */
  @Test
  @DisplayName("Test isCompatible(String, String); when 'Path'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OfficeUtils.isCompatible(String, String)"})
  void testIsCompatible_whenPath() {
    // Arrange, Act and Assert
    assertFalse(OfficeUtils.isCompatible("Path", "iloveyou"));
  }
}
