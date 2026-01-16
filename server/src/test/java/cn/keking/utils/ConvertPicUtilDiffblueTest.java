package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConvertPicUtilDiffblueTest {
  /**
   * Test {@link ConvertPicUtil#convertTif2Jpg(String, String, boolean)}.
   *
   * <p>Method under test: {@link ConvertPicUtil#convertTif2Jpg(String, String, boolean)}
   */
  @Test
  @DisplayName("Test convertTif2Jpg(String, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ConvertPicUtil.convertTif2Jpg(String, String, boolean)"})
  void testConvertTif2Jpg() throws Exception {
    // Arrange and Act
    List<String> actualConvertTif2JpgResult =
        ConvertPicUtil.convertTif2Jpg("Str Input File", "Str Output File", true);

    // Assert
    assertNull(actualConvertTif2JpgResult);
  }

  /**
   * Test {@link ConvertPicUtil#convertJpg2Pdf(String, String)}.
   *
   * <ul>
   *   <li>When {@code Bad endianness tag (not 0x4949 or 0x4d4d)}.
   *   <li>Then throw {@link Exception}.
   * </ul>
   *
   * <p>Method under test: {@link ConvertPicUtil#convertJpg2Pdf(String, String)}
   */
  @Test
  @DisplayName(
      "Test convertJpg2Pdf(String, String); when 'Bad endianness tag (not 0x4949 or 0x4d4d)'; then throw Exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ConvertPicUtil.convertJpg2Pdf(String, String)"})
  void testConvertJpg2Pdf_whenBadEndiannessTagNot0x4949Or0x4d4d_thenThrowException()
      throws Exception {
    // Arrange, Act and Assert
    assertThrows(
        Exception.class,
        () ->
            ConvertPicUtil.convertJpg2Pdf(
                "Bad endianness tag (not 0x4949 or 0x4d4d)", "Str Pdf File"));
  }

  /**
   * Test {@link ConvertPicUtil#convertJpg2Pdf(String, String)}.
   *
   * <ul>
   *   <li>When {@code r}.
   *   <li>Then throw {@link Exception}.
   * </ul>
   *
   * <p>Method under test: {@link ConvertPicUtil#convertJpg2Pdf(String, String)}
   */
  @Test
  @DisplayName("Test convertJpg2Pdf(String, String); when 'r'; then throw Exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ConvertPicUtil.convertJpg2Pdf(String, String)"})
  void testConvertJpg2Pdf_whenR_thenThrowException() throws Exception {
    // Arrange, Act and Assert
    assertThrows(Exception.class, () -> ConvertPicUtil.convertJpg2Pdf("r", "Str Pdf File"));
  }

  /**
   * Test {@link ConvertPicUtil#convertJpg2Pdf(String, String)}.
   *
   * <ul>
   *   <li>When {@code Str Jpg File}.
   *   <li>Then throw {@link Exception}.
   * </ul>
   *
   * <p>Method under test: {@link ConvertPicUtil#convertJpg2Pdf(String, String)}
   */
  @Test
  @DisplayName("Test convertJpg2Pdf(String, String); when 'Str Jpg File'; then throw Exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ConvertPicUtil.convertJpg2Pdf(String, String)"})
  void testConvertJpg2Pdf_whenStrJpgFile_thenThrowException() throws Exception {
    // Arrange, Act and Assert
    assertThrows(
        Exception.class, () -> ConvertPicUtil.convertJpg2Pdf("Str Jpg File", "Str Pdf File"));
  }
}
