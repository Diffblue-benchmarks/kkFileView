package cn.keking.service.cache.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

@ExtendWith(MockitoExtension.class)
class CacheServiceRocksDBImplDiffblueTest {
  @InjectMocks private CacheServiceRocksDBImpl cacheServiceRocksDBImpl;

  @Mock private RocksDB rocksDB;

  /**
   * Test {@link CacheServiceRocksDBImpl#putPDFCache(String, String)}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} throw {@link
   *       RocksDBException#RocksDBException(String)} with {@code converted-preview-pdf-file}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putPDFCache(String, String)}
   */
  @Test
  @DisplayName(
      "Test putPDFCache(String, String); given RocksDB get(byte[]) throw RocksDBException(String) with 'converted-preview-pdf-file'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putPDFCache(String, String)"})
  void testPutPDFCache_givenRocksDBGetThrowRocksDBExceptionWithConvertedPreviewPdfFile()
      throws RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-pdf-file"));

    // Act
    cacheServiceRocksDBImpl.putPDFCache("Key", "42");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putPDFCache(String, String)}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#put(byte[], byte[])} does nothing.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putPDFCache(String, String)}
   */
  @Test
  @DisplayName("Test putPDFCache(String, String); given RocksDB put(byte[], byte[]) does nothing")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putPDFCache(String, String)"})
  void testPutPDFCache_givenRocksDBPutDoesNothing()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    cacheServiceRocksDBImpl.putPDFCache("Key", "42");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putPDFCache(String, String)}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#put(byte[], byte[])} throw {@link
   *       RocksDBException#RocksDBException(String)} with {@code converted-preview-pdf-file}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putPDFCache(String, String)}
   */
  @Test
  @DisplayName(
      "Test putPDFCache(String, String); given RocksDB put(byte[], byte[]) throw RocksDBException(String) with 'converted-preview-pdf-file'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putPDFCache(String, String)"})
  void testPutPDFCache_givenRocksDBPutThrowRocksDBExceptionWithConvertedPreviewPdfFile()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doThrow(new RocksDBException("converted-preview-pdf-file"))
        .when(rocksDB)
        .put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    cacheServiceRocksDBImpl.putPDFCache("Key", "42");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>When {@link ArrayList#ArrayList()} addAll {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putImgCache(String, List)}
   */
  @Test
  @DisplayName(
      "Test putImgCache(String, List); given ArrayList(); when ArrayList() addAll ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putImgCache(String, List)"})
  void testPutImgCache_givenArrayList_whenArrayListAddAllArrayList()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doThrow(new RocksDBException("converted-preview-imgs-file"))
        .when(rocksDB)
        .put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    ArrayList<String> value = new ArrayList<>();
    value.addAll(new ArrayList<>());
    value.add("Put into RocksDB Exception");

    // Act
    cacheServiceRocksDBImpl.putImgCache("Key", value);

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Given {@code converted-preview-imgs-file}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putImgCache(String, List)}
   */
  @Test
  @DisplayName("Test putImgCache(String, List); given 'converted-preview-imgs-file'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putImgCache(String, List)"})
  void testPutImgCache_givenConvertedPreviewImgsFile()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    ArrayList<String> value = new ArrayList<>();
    value.add("converted-preview-imgs-file");

    // Act
    cacheServiceRocksDBImpl.putImgCache("Key", value);

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Given {@code Get from RocksDB Exception}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putImgCache(String, List)}
   */
  @Test
  @DisplayName("Test putImgCache(String, List); given 'Get from RocksDB Exception'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putImgCache(String, List)"})
  void testPutImgCache_givenGetFromRocksDBException()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    ArrayList<String> value = new ArrayList<>();
    value.add("Get from RocksDB Exception");
    value.add("converted-preview-imgs-file");

    // Act
    cacheServiceRocksDBImpl.putImgCache("Key", value);

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} throw {@link
   *       RocksDBException#RocksDBException(String)} with {@code converted-preview-imgs-file}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putImgCache(String, List)}
   */
  @Test
  @DisplayName(
      "Test putImgCache(String, List); given RocksDB get(byte[]) throw RocksDBException(String) with 'converted-preview-imgs-file'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putImgCache(String, List)"})
  void testPutImgCache_givenRocksDBGetThrowRocksDBExceptionWithConvertedPreviewImgsFile()
      throws RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-imgs-file"));

    // Act
    cacheServiceRocksDBImpl.putImgCache("Key", new ArrayList<>());

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#put(byte[], byte[])} does nothing.
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putImgCache(String, List)}
   */
  @Test
  @DisplayName(
      "Test putImgCache(String, List); given RocksDB put(byte[], byte[]) does nothing; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putImgCache(String, List)"})
  void testPutImgCache_givenRocksDBPutDoesNothing_whenArrayList()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    cacheServiceRocksDBImpl.putImgCache("Key", new ArrayList<>());

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#put(byte[], byte[])} throw {@link
   *       RocksDBException#RocksDBException(String)} with {@code converted-preview-imgs-file}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putImgCache(String, List)}
   */
  @Test
  @DisplayName(
      "Test putImgCache(String, List); given RocksDB put(byte[], byte[]) throw RocksDBException(String) with 'converted-preview-imgs-file'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putImgCache(String, List)"})
  void testPutImgCache_givenRocksDBPutThrowRocksDBExceptionWithConvertedPreviewImgsFile()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doThrow(new RocksDBException("converted-preview-imgs-file"))
        .when(rocksDB)
        .put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    cacheServiceRocksDBImpl.putImgCache("Key", new ArrayList<>());

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getPDFCache(String)} with {@code String}.
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getPDFCache(String)}
   */
  @Test
  @DisplayName("Test getPDFCache(String) with 'String'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CacheServiceRocksDBImpl.getPDFCache(String)"})
  void testGetPDFCacheWithString() throws RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-pdf-file"));

    // Act
    String actualPDFCache = cacheServiceRocksDBImpl.getPDFCache("Key");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertEquals("", actualPDFCache);
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getPDFCache(String)} with {@code String}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} return {@code AXAXAXAX} Bytes is {@code
   *       UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getPDFCache(String)}
   */
  @Test
  @DisplayName(
      "Test getPDFCache(String) with 'String'; given RocksDB get(byte[]) return 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CacheServiceRocksDBImpl.getPDFCache(String)"})
  void testGetPDFCacheWithString_givenRocksDBGetReturnAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    String actualPDFCache = cacheServiceRocksDBImpl.getPDFCache("Key");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertEquals("", actualPDFCache);
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getPDFCache()}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} return {@code AXAXAXAX} Bytes is {@code
   *       UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getPDFCache()}
   */
  @Test
  @DisplayName("Test getPDFCache(); given RocksDB get(byte[]) return 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CacheServiceRocksDBImpl.getPDFCache()"})
  void testGetPDFCache_givenRocksDBGetReturnAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    Map<String, String> actualPDFCache = cacheServiceRocksDBImpl.getPDFCache();

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertTrue(actualPDFCache.isEmpty());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getPDFCache()}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} throw {@link
   *       RocksDBException#RocksDBException(String)} with {@code converted-preview-pdf-file}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getPDFCache()}
   */
  @Test
  @DisplayName(
      "Test getPDFCache(); given RocksDB get(byte[]) throw RocksDBException(String) with 'converted-preview-pdf-file'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CacheServiceRocksDBImpl.getPDFCache()"})
  void testGetPDFCache_givenRocksDBGetThrowRocksDBExceptionWithConvertedPreviewPdfFile()
      throws RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-pdf-file"));

    // Act
    Map<String, String> actualPDFCache = cacheServiceRocksDBImpl.getPDFCache();

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertTrue(actualPDFCache.isEmpty());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getImgCache(String)} with {@code String}.
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getImgCache(String)}
   */
  @Test
  @DisplayName("Test getImgCache(String) with 'String'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CacheServiceRocksDBImpl.getImgCache(String)"})
  void testGetImgCacheWithString() throws RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-imgs-file"));

    // Act
    List<String> actualImgCache = cacheServiceRocksDBImpl.getImgCache("Key");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertTrue(actualImgCache.isEmpty());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getImgCache(String)} with {@code String}.
   *
   * <ul>
   *   <li>Given {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getImgCache(String)}
   */
  @Test
  @DisplayName("Test getImgCache(String) with 'String'; given 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CacheServiceRocksDBImpl.getImgCache(String)"})
  void testGetImgCacheWithString_givenA() throws RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenReturn(new byte[] {'A', -1, 'A', 'X', 'A', 'X', 'A', -1});

    // Act
    List<String> actualImgCache = cacheServiceRocksDBImpl.getImgCache("Key");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertTrue(actualImgCache.isEmpty());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getImgCache(String)} with {@code String}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} return {@code AXAXAXAX} Bytes is {@code
   *       UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getImgCache(String)}
   */
  @Test
  @DisplayName(
      "Test getImgCache(String) with 'String'; given RocksDB get(byte[]) return 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CacheServiceRocksDBImpl.getImgCache(String)"})
  void testGetImgCacheWithString_givenRocksDBGetReturnAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    List<String> actualImgCache = cacheServiceRocksDBImpl.getImgCache("Key");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertTrue(actualImgCache.isEmpty());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getImgCache()}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} return {@code AXAXAXAX} Bytes is {@code
   *       UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getImgCache()}
   */
  @Test
  @DisplayName("Test getImgCache(); given RocksDB get(byte[]) return 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CacheServiceRocksDBImpl.getImgCache()"})
  void testGetImgCache_givenRocksDBGetReturnAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    Map<String, List<String>> actualImgCache = cacheServiceRocksDBImpl.getImgCache();

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertTrue(actualImgCache.isEmpty());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getImgCache()}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} throw {@link
   *       RocksDBException#RocksDBException(String)} with {@code converted-preview-imgs-file}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getImgCache()}
   */
  @Test
  @DisplayName(
      "Test getImgCache(); given RocksDB get(byte[]) throw RocksDBException(String) with 'converted-preview-imgs-file'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CacheServiceRocksDBImpl.getImgCache()"})
  void testGetImgCache_givenRocksDBGetThrowRocksDBExceptionWithConvertedPreviewImgsFile()
      throws RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-imgs-file"));

    // Act
    Map<String, List<String>> actualImgCache = cacheServiceRocksDBImpl.getImgCache();

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertTrue(actualImgCache.isEmpty());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getPdfImageCache(String)}.
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getPdfImageCache(String)}
   */
  @Test
  @DisplayName("Test getPdfImageCache(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer CacheServiceRocksDBImpl.getPdfImageCache(String)"})
  void testGetPdfImageCache() throws RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-pdfimgs-file"));

    // Act
    Integer actualPdfImageCache = cacheServiceRocksDBImpl.getPdfImageCache("Key");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertEquals(0, actualPdfImageCache.intValue());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getPdfImageCache(String)}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} return {@code AXAXAXAX} Bytes is {@code
   *       UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getPdfImageCache(String)}
   */
  @Test
  @DisplayName(
      "Test getPdfImageCache(String); given RocksDB get(byte[]) return 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer CacheServiceRocksDBImpl.getPdfImageCache(String)"})
  void testGetPdfImageCache_givenRocksDBGetReturnAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    Integer actualPdfImageCache = cacheServiceRocksDBImpl.getPdfImageCache("Key");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertEquals(0, actualPdfImageCache.intValue());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putPdfImageCache(String, int)}.
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putPdfImageCache(String, int)}
   */
  @Test
  @DisplayName("Test putPdfImageCache(String, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putPdfImageCache(String, int)"})
  void testPutPdfImageCache() throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doThrow(new RocksDBException("converted-preview-pdfimgs-file"))
        .when(rocksDB)
        .put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    cacheServiceRocksDBImpl.putPdfImageCache("/directory/foo.txt", 10);

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putPdfImageCache(String, int)}.
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putPdfImageCache(String, int)}
   */
  @Test
  @DisplayName("Test putPdfImageCache(String, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putPdfImageCache(String, int)"})
  void testPutPdfImageCache2() throws RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-pdfimgs-file"));

    // Act
    cacheServiceRocksDBImpl.putPdfImageCache("/directory/foo.txt", 10);

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putPdfImageCache(String, int)}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#put(byte[], byte[])} does nothing.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putPdfImageCache(String, int)}
   */
  @Test
  @DisplayName("Test putPdfImageCache(String, int); given RocksDB put(byte[], byte[]) does nothing")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putPdfImageCache(String, int)"})
  void testPutPdfImageCache_givenRocksDBPutDoesNothing()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    cacheServiceRocksDBImpl.putPdfImageCache("/directory/foo.txt", 10);

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putPdfImageCache(String, int)}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#put(byte[], byte[])} throw {@link
   *       RocksDBException#RocksDBException(String)} with {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putPdfImageCache(String, int)}
   */
  @Test
  @DisplayName(
      "Test putPdfImageCache(String, int); given RocksDB put(byte[], byte[]) throw RocksDBException(String) with 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putPdfImageCache(String, int)"})
  void testPutPdfImageCache_givenRocksDBPutThrowRocksDBExceptionWithFoo() throws RocksDBException {
    // Arrange
    doThrow(new RocksDBException("foo"))
        .when(rocksDB)
        .put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenThrow(new RocksDBException("4242foo"));

    // Act
    cacheServiceRocksDBImpl.putPdfImageCache("/directory/foo.txt", 10);

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getMediaConvertCache()}.
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getMediaConvertCache()}
   */
  @Test
  @DisplayName("Test getMediaConvertCache()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CacheServiceRocksDBImpl.getMediaConvertCache()"})
  void testGetMediaConvertCache() throws RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-media-file"));

    // Act
    Map<String, String> actualMediaConvertCache = cacheServiceRocksDBImpl.getMediaConvertCache();

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertTrue(actualMediaConvertCache.isEmpty());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getMediaConvertCache(String)} with {@code String}.
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getMediaConvertCache(String)}
   */
  @Test
  @DisplayName("Test getMediaConvertCache(String) with 'String'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CacheServiceRocksDBImpl.getMediaConvertCache(String)"})
  void testGetMediaConvertCacheWithString() throws RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-media-file"));

    // Act
    String actualMediaConvertCache = cacheServiceRocksDBImpl.getMediaConvertCache("Key");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertEquals("", actualMediaConvertCache);
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getMediaConvertCache(String)} with {@code String}.
   *
   * <ul>
   *   <li>Given {@code A}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getMediaConvertCache(String)}
   */
  @Test
  @DisplayName("Test getMediaConvertCache(String) with 'String'; given 'A'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CacheServiceRocksDBImpl.getMediaConvertCache(String)"})
  void testGetMediaConvertCacheWithString_givenA() throws RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenReturn(new byte[] {0, 'X', 'A', 'X', 'A', 'X', 'A', 'A'});

    // Act
    String actualMediaConvertCache = cacheServiceRocksDBImpl.getMediaConvertCache("Key");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertEquals("", actualMediaConvertCache);
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getMediaConvertCache(String)} with {@code String}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} return {@code AXAXAXAX} Bytes is {@code
   *       UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getMediaConvertCache(String)}
   */
  @Test
  @DisplayName(
      "Test getMediaConvertCache(String) with 'String'; given RocksDB get(byte[]) return 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CacheServiceRocksDBImpl.getMediaConvertCache(String)"})
  void testGetMediaConvertCacheWithString_givenRocksDBGetReturnAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    String actualMediaConvertCache = cacheServiceRocksDBImpl.getMediaConvertCache("Key");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertEquals("", actualMediaConvertCache);
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#getMediaConvertCache()}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#get(byte[])} return {@code AXAXAXAX} Bytes is {@code
   *       UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#getMediaConvertCache()}
   */
  @Test
  @DisplayName(
      "Test getMediaConvertCache(); given RocksDB get(byte[]) return 'AXAXAXAX' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map CacheServiceRocksDBImpl.getMediaConvertCache()"})
  void testGetMediaConvertCache_givenRocksDBGetReturnAxaxaxaxBytesIsUtf8()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    Map<String, String> actualMediaConvertCache = cacheServiceRocksDBImpl.getMediaConvertCache();

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    assertTrue(actualMediaConvertCache.isEmpty());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putMediaConvertCache(String, String)}.
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putMediaConvertCache(String, String)}
   */
  @Test
  @DisplayName("Test putMediaConvertCache(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putMediaConvertCache(String, String)"})
  void testPutMediaConvertCache() throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doThrow(new RocksDBException("converted-preview-media-file"))
        .when(rocksDB)
        .put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    cacheServiceRocksDBImpl.putMediaConvertCache("Key", "42");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putMediaConvertCache(String, String)}.
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putMediaConvertCache(String, String)}
   */
  @Test
  @DisplayName("Test putMediaConvertCache(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putMediaConvertCache(String, String)"})
  void testPutMediaConvertCache2() throws RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any()))
        .thenThrow(new RocksDBException("converted-preview-media-file"));

    // Act
    cacheServiceRocksDBImpl.putMediaConvertCache("Key", "42");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#putMediaConvertCache(String, String)}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#put(byte[], byte[])} does nothing.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#putMediaConvertCache(String, String)}
   */
  @Test
  @DisplayName(
      "Test putMediaConvertCache(String, String); given RocksDB put(byte[], byte[]) does nothing")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.putMediaConvertCache(String, String)"})
  void testPutMediaConvertCache_givenRocksDBPutDoesNothing()
      throws UnsupportedEncodingException, RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
    when(rocksDB.get(Mockito.<byte[]>any())).thenReturn("AXAXAXAX".getBytes("UTF-8"));

    // Act
    cacheServiceRocksDBImpl.putMediaConvertCache("Key", "42");

    // Assert
    verify(rocksDB).get(isA(byte[].class));
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#cleanCache()}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#put(byte[], byte[])} does nothing.
   *   <li>Then calls {@link RocksDB#put(byte[], byte[])}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#cleanCache()}
   */
  @Test
  @DisplayName(
      "Test cleanCache(); given RocksDB put(byte[], byte[]) does nothing; then calls put(byte[], byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.cleanCache()"})
  void testCleanCache_givenRocksDBPutDoesNothing_thenCallsPut() throws RocksDBException {
    // Arrange
    doNothing().when(rocksDB).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());

    // Act
    cacheServiceRocksDBImpl.cleanCache();

    // Assert
    verify(rocksDB, atLeast(1)).put(Mockito.<byte[]>any(), Mockito.<byte[]>any());
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#cleanCache()}.
   *
   * <ul>
   *   <li>Given {@link RocksDB} {@link RocksDB#put(byte[], byte[])} throw {@link
   *       RocksDBException#RocksDBException(String)} with {@code converted-preview-pdf-file}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#cleanCache()}
   */
  @Test
  @DisplayName(
      "Test cleanCache(); given RocksDB put(byte[], byte[]) throw RocksDBException(String) with 'converted-preview-pdf-file'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.cleanCache()"})
  void testCleanCache_givenRocksDBPutThrowRocksDBExceptionWithConvertedPreviewPdfFile()
      throws RocksDBException {
    // Arrange
    doThrow(new RocksDBException("converted-preview-pdf-file"))
        .when(rocksDB)
        .put(Mockito.<byte[]>any(), Mockito.<byte[]>any());

    // Act
    cacheServiceRocksDBImpl.cleanCache();

    // Assert
    verify(rocksDB).put(isA(byte[].class), isA(byte[].class));
  }

  /**
   * Test {@link CacheServiceRocksDBImpl#cleanCache()}.
   *
   * <ul>
   *   <li>Then throw {@link NullPointerException}.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceRocksDBImpl#cleanCache()}
   */
  @Test
  @DisplayName("Test cleanCache(); then throw NullPointerException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CacheServiceRocksDBImpl.cleanCache()"})
  void testCleanCache_thenThrowNullPointerException() {
    // Arrange
    CacheServiceRocksDBImpl cacheServiceRocksDBImpl = new CacheServiceRocksDBImpl();
    cacheServiceRocksDBImpl.addQueueTask(
        "https://example.org/examplecn.keking.service.cache.impl.CacheServiceRocksDBImplconverted-preview"
            + "-imgs-file");

    // Act and Assert
    assertThrows(NullPointerException.class, () -> cacheServiceRocksDBImpl.cleanCache());
  }
}
