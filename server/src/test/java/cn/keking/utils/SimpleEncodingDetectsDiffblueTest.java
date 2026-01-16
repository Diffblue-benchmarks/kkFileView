package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SimpleEncodingDetectsDiffblueTest {
  /**
   * Test {@link SimpleEncodingDetects#getJavaEncode(byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   *   <li>Then return {@code ASCII}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleEncodingDetects#getJavaEncode(byte[])}
   */
  @Test
  @DisplayName("Test getJavaEncode(byte[]); when 'AXAXAXAX' Bytes is 'UTF-8'; then return 'ASCII'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String SimpleEncodingDetects.getJavaEncode(byte[])"})
  void testGetJavaEncode_whenAxaxaxaxBytesIsUtf8_thenReturnAscii()
      throws UnsupportedEncodingException {
    // Arrange, Act and Assert
    assertEquals("ASCII", SimpleEncodingDetects.getJavaEncode("AXAXAXAX".getBytes("UTF-8")));
  }
}
