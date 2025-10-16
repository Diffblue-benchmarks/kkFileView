package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EncodingDetectsDiffblueTest {
  /**
   * Test {@link EncodingDetects#getJavaEncode(byte[])} with {@code content}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   *   <li>Then return {@code ASCII}.
   * </ul>
   *
   * <p>Method under test: {@link EncodingDetects#getJavaEncode(byte[])}
   */
  @Test
  @DisplayName(
      "Test getJavaEncode(byte[]) with 'content'; when 'AXAXAXAX' Bytes is 'UTF-8'; then return 'ASCII'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String EncodingDetects.getJavaEncode(byte[])"})
  void testGetJavaEncodeWithContent_whenAxaxaxaxBytesIsUtf8_thenReturnAscii()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals("ASCII", EncodingDetects.getJavaEncode("AXAXAXAX".getBytes("UTF-8")));
  }

  /**
   * Test {@link EncodingDetects#getJavaEncode(File)} with {@code file}.
   *
   * <ul>
   *   <li>Then return {@code windows-1252}.
   * </ul>
   *
   * <p>Method under test: {@link EncodingDetects#getJavaEncode(File)}
   */
  @Test
  @DisplayName("Test getJavaEncode(File) with 'file'; then return 'windows-1252'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String EncodingDetects.getJavaEncode(File)"})
  void testGetJavaEncodeWithFile_thenReturnWindows1252() {
    // Arrange, Act and Assert
    assertEquals(
        "windows-1252",
        EncodingDetects.getJavaEncode(
            Paths.get(System.getProperty("java.io.tmpdir"), "").toFile()));
  }
}
