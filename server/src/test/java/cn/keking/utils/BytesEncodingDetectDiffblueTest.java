package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BytesEncodingDetectDiffblueTest {
  /**
   * Test {@link BytesEncodingDetect#BytesEncodingDetect()}.
   *
   * <p>Method under test: default or parameterless constructor of {@link BytesEncodingDetect}
   */
  @Test
  @DisplayName("Test new BytesEncodingDetect()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BytesEncodingDetect.<init>()"})
  void testNewBytesEncodingDetect() {
    // Arrange and Act
    BytesEncodingDetect actualBytesEncodingDetect = new BytesEncodingDetect();

    // Assert
    assertEquals(126, actualBytesEncodingDetect.Big5PFreq.length);
    assertEquals(126, actualBytesEncodingDetect.GBKFreq.length);
    assertEquals(94, actualBytesEncodingDetect.Big5Freq.length);
    assertEquals(94, actualBytesEncodingDetect.EUC_TWFreq.length);
    assertEquals(94, actualBytesEncodingDetect.GBFreq.length);
    assertEquals(94, actualBytesEncodingDetect.JPFreq.length);
    assertEquals(94, actualBytesEncodingDetect.KRFreq.length);
    assertFalse(actualBytesEncodingDetect.debug);
  }

  /**
   * Test {@link BytesEncodingDetect#detectEncoding(byte[])} with {@code rawtext}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#detectEncoding(byte[])}
   */
  @Test
  @DisplayName("Test detectEncoding(byte[]) with 'rawtext'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.detectEncoding(byte[])"})
  void testDetectEncodingWithRawtext() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualDetectEncodingResult =
        new BytesEncodingDetect().detectEncoding("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(22, actualDetectEncodingResult);
  }

  /**
   * Test {@link BytesEncodingDetect#detectEncoding(URL)} with {@code testurl}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#detectEncoding(URL)}
   */
  @Test
  @DisplayName("Test detectEncoding(URL) with 'testurl'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.detectEncoding(URL)"})
  void testDetectEncodingWithTesturl() throws MalformedURLException {
    // Arrange and Act
    int actualDetectEncodingResult =
        new BytesEncodingDetect()
            .detectEncoding(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toUri().toURL());

    // Assert
    assertEquals(-1, actualDetectEncodingResult);
  }

  /**
   * Test {@link BytesEncodingDetect#gb2312_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#gb2312_probability(byte[])}
   */
  @Test
  @DisplayName("Test gb2312_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.gb2312_probability(byte[])"})
  void testGb2312_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualGb2312_probabilityResult =
        new BytesEncodingDetect().gb2312_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(50, actualGb2312_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#gbk_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#gbk_probability(byte[])}
   */
  @Test
  @DisplayName("Test gbk_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.gbk_probability(byte[])"})
  void testGbk_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualGbk_probabilityResult =
        new BytesEncodingDetect().gbk_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(49, actualGbk_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#gb18030_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#gb18030_probability(byte[])}
   */
  @Test
  @DisplayName("Test gb18030_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.gb18030_probability(byte[])"})
  void testGb18030_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualGb18030_probabilityResult =
        new BytesEncodingDetect().gb18030_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(49, actualGb18030_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#hz_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#hz_probability(byte[])}
   */
  @Test
  @DisplayName("Test hz_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.hz_probability(byte[])"})
  void testHz_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualHz_probabilityResult =
        new BytesEncodingDetect().hz_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(0, actualHz_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#big5_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#big5_probability(byte[])}
   */
  @Test
  @DisplayName("Test big5_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.big5_probability(byte[])"})
  void testBig5_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualBig5_probabilityResult =
        new BytesEncodingDetect().big5_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(50, actualBig5_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#big5plus_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#big5plus_probability(byte[])}
   */
  @Test
  @DisplayName("Test big5plus_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.big5plus_probability(byte[])"})
  void testBig5plus_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualBig5plus_probabilityResult =
        new BytesEncodingDetect().big5plus_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(9, actualBig5plus_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#euc_tw_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#euc_tw_probability(byte[])}
   */
  @Test
  @DisplayName("Test euc_tw_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.euc_tw_probability(byte[])"})
  void testEuc_tw_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualEuc_tw_probabilityResult =
        new BytesEncodingDetect().euc_tw_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(50, actualEuc_tw_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#iso_2022_cn_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#iso_2022_cn_probability(byte[])}
   */
  @Test
  @DisplayName("Test iso_2022_cn_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.iso_2022_cn_probability(byte[])"})
  void testIso_2022_cn_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualIso_2022_cn_probabilityResult =
        new BytesEncodingDetect().iso_2022_cn_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(50, actualIso_2022_cn_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#utf8_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#utf8_probability(byte[])}
   */
  @Test
  @DisplayName("Test utf8_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.utf8_probability(byte[])"})
  void testUtf8_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualUtf8_probabilityResult =
        new BytesEncodingDetect().utf8_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(0, actualUtf8_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#utf16_probability(byte[])}.
   *
   * <ul>
   *   <li>When array of {@code byte} with minus one and minus one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BytesEncodingDetect#utf16_probability(byte[])}
   */
  @Test
  @DisplayName(
      "Test utf16_probability(byte[]); when array of byte with minus one and minus one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.utf16_probability(byte[])"})
  void testUtf16_probability_whenArrayOfByteWithMinusOneAndMinusOne_thenReturnZero() {
    // Arrange and Act
    int actualUtf16_probabilityResult =
        new BytesEncodingDetect().utf16_probability(new byte[] {-1, -1});

    // Assert
    assertEquals(0, actualUtf16_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#utf16_probability(byte[])}.
   *
   * <ul>
   *   <li>When array of {@code byte} with minus one and minus two.
   * </ul>
   *
   * <p>Method under test: {@link BytesEncodingDetect#utf16_probability(byte[])}
   */
  @Test
  @DisplayName("Test utf16_probability(byte[]); when array of byte with minus one and minus two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.utf16_probability(byte[])"})
  void testUtf16_probability_whenArrayOfByteWithMinusOneAndMinusTwo() {
    // Arrange and Act
    int actualUtf16_probabilityResult =
        new BytesEncodingDetect().utf16_probability(new byte[] {-1, -2});

    // Assert
    assertEquals(100, actualUtf16_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#utf16_probability(byte[])}.
   *
   * <ul>
   *   <li>When array of {@code byte} with minus two and minus one.
   * </ul>
   *
   * <p>Method under test: {@link BytesEncodingDetect#utf16_probability(byte[])}
   */
  @Test
  @DisplayName("Test utf16_probability(byte[]); when array of byte with minus two and minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.utf16_probability(byte[])"})
  void testUtf16_probability_whenArrayOfByteWithMinusTwoAndMinusOne() {
    // Arrange and Act
    int actualUtf16_probabilityResult =
        new BytesEncodingDetect().utf16_probability(new byte[] {-2, -1});

    // Assert
    assertEquals(100, actualUtf16_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#utf16_probability(byte[])}.
   *
   * <ul>
   *   <li>When array of {@code byte} with minus two and minus two.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BytesEncodingDetect#utf16_probability(byte[])}
   */
  @Test
  @DisplayName(
      "Test utf16_probability(byte[]); when array of byte with minus two and minus two; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.utf16_probability(byte[])"})
  void testUtf16_probability_whenArrayOfByteWithMinusTwoAndMinusTwo_thenReturnZero() {
    // Arrange and Act
    int actualUtf16_probabilityResult =
        new BytesEncodingDetect().utf16_probability(new byte[] {-2, -2});

    // Assert
    assertEquals(0, actualUtf16_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#utf16_probability(byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BytesEncodingDetect#utf16_probability(byte[])}
   */
  @Test
  @DisplayName("Test utf16_probability(byte[]); when 'AXAXAXAX' Bytes is 'UTF-8'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.utf16_probability(byte[])"})
  void testUtf16_probability_whenAxaxaxaxBytesIsUtf8_thenReturnZero()
      throws UnsupportedEncodingException {
    // Arrange and Act
    int actualUtf16_probabilityResult =
        new BytesEncodingDetect().utf16_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(0, actualUtf16_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#ascii_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#ascii_probability(byte[])}
   */
  @Test
  @DisplayName("Test ascii_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.ascii_probability(byte[])"})
  void testAscii_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualAscii_probabilityResult =
        new BytesEncodingDetect().ascii_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(75, actualAscii_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#euc_kr_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#euc_kr_probability(byte[])}
   */
  @Test
  @DisplayName("Test euc_kr_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.euc_kr_probability(byte[])"})
  void testEuc_kr_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualEuc_kr_probabilityResult =
        new BytesEncodingDetect().euc_kr_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(50, actualEuc_kr_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#cp949_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#cp949_probability(byte[])}
   */
  @Test
  @DisplayName("Test cp949_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.cp949_probability(byte[])"})
  void testCp949_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualCp949_probabilityResult =
        new BytesEncodingDetect().cp949_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(50, actualCp949_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#iso_2022_kr_probability(byte[])}.
   *
   * <ul>
   *   <li>When array of {@code byte} with twenty-seven and twenty-seven.
   * </ul>
   *
   * <p>Method under test: {@link BytesEncodingDetect#iso_2022_kr_probability(byte[])}
   */
  @Test
  @DisplayName(
      "Test iso_2022_kr_probability(byte[]); when array of byte with twenty-seven and twenty-seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.iso_2022_kr_probability(byte[])"})
  void testIso_2022_kr_probability_whenArrayOfByteWithTwentySevenAndTwentySeven() {
    // Arrange and Act
    int actualIso_2022_kr_probabilityResult =
        new BytesEncodingDetect()
            .iso_2022_kr_probability(
                new byte[] {
                  27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27
                });

    // Assert
    assertEquals(0, actualIso_2022_kr_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#iso_2022_kr_probability(byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link BytesEncodingDetect#iso_2022_kr_probability(byte[])}
   */
  @Test
  @DisplayName("Test iso_2022_kr_probability(byte[]); when 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.iso_2022_kr_probability(byte[])"})
  void testIso_2022_kr_probability_whenAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualIso_2022_kr_probabilityResult =
        new BytesEncodingDetect().iso_2022_kr_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(0, actualIso_2022_kr_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#euc_jp_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#euc_jp_probability(byte[])}
   */
  @Test
  @DisplayName("Test euc_jp_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.euc_jp_probability(byte[])"})
  void testEuc_jp_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualEuc_jp_probabilityResult =
        new BytesEncodingDetect().euc_jp_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(50, actualEuc_jp_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#iso_2022_jp_probability(byte[])}.
   *
   * <ul>
   *   <li>When array of {@code byte} with twenty-seven and twenty-seven.
   * </ul>
   *
   * <p>Method under test: {@link BytesEncodingDetect#iso_2022_jp_probability(byte[])}
   */
  @Test
  @DisplayName(
      "Test iso_2022_jp_probability(byte[]); when array of byte with twenty-seven and twenty-seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.iso_2022_jp_probability(byte[])"})
  void testIso_2022_jp_probability_whenArrayOfByteWithTwentySevenAndTwentySeven() {
    // Arrange and Act
    int actualIso_2022_jp_probabilityResult =
        new BytesEncodingDetect()
            .iso_2022_jp_probability(
                new byte[] {
                  27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27, 27
                });

    // Assert
    assertEquals(0, actualIso_2022_jp_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#iso_2022_jp_probability(byte[])}.
   *
   * <ul>
   *   <li>When {@code AXAXAXAX} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link BytesEncodingDetect#iso_2022_jp_probability(byte[])}
   */
  @Test
  @DisplayName("Test iso_2022_jp_probability(byte[]); when 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.iso_2022_jp_probability(byte[])"})
  void testIso_2022_jp_probability_whenAxaxaxaxBytesIsUtf8() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualIso_2022_jp_probabilityResult =
        new BytesEncodingDetect().iso_2022_jp_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(0, actualIso_2022_jp_probabilityResult);
  }

  /**
   * Test {@link BytesEncodingDetect#sjis_probability(byte[])}.
   *
   * <p>Method under test: {@link BytesEncodingDetect#sjis_probability(byte[])}
   */
  @Test
  @DisplayName("Test sjis_probability(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BytesEncodingDetect.sjis_probability(byte[])"})
  void testSjis_probability() throws UnsupportedEncodingException {
    // Arrange and Act
    int actualSjis_probabilityResult =
        new BytesEncodingDetect().sjis_probability("AXAXAXAX".getBytes("UTF-8"));

    // Assert
    assertEquals(49, actualSjis_probabilityResult);
  }
}
