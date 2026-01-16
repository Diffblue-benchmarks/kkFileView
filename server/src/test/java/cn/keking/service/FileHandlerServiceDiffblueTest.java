package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.cache.CacheService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import cn.keking.utils.DownloadUtilsFactory;
import cn.keking.utils.FtpUtilsFactory;
import cn.keking.web.controller.FileControllerFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.poi.EncryptedDocumentException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FileHandlerServiceDiffblueTest {
  @Mock private CacheService cacheService;

  @InjectMocks private FileHandlerService fileHandlerService;

  /**
   * Test {@link FileHandlerService#listConvertedFiles()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#listConvertedFiles()}
   */
  @Test
  @DisplayName("Test listConvertedFiles(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map FileHandlerService.listConvertedFiles()"})
  void testListConvertedFiles_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new FileHandlerService(new CacheServiceJDKImpl()).listConvertedFiles());
  }

  /**
   * Test {@link FileHandlerService#listConvertedFiles()}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#listConvertedFiles()}
   */
  @Test
  @DisplayName("Test listConvertedFiles(); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map FileHandlerService.listConvertedFiles()"})
  void testListConvertedFiles_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getPDFCache())
        .thenThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()));

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.listConvertedFiles());
    verify(cacheService).getPDFCache();
  }

  /**
   * Test {@link FileHandlerService#getConvertedFile(String)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getConvertedFile(String)}
   */
  @Test
  @DisplayName("Test getConvertedFile(String); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getConvertedFile(String)"})
  void testGetConvertedFile_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getPDFCache(Mockito.<String>any()))
        .thenThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.getConvertedFile(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link FileHandlerService#getPdf2jpgCache(String)}.
   *
   * <ul>
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getPdf2jpgCache(String)}
   */
  @Test
  @DisplayName("Test getPdf2jpgCache(String); then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer FileHandlerService.getPdf2jpgCache(String)"})
  void testGetPdf2jpgCache_thenReturnIntValueIsOne() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    when(cacheService.getPdfImageCache(Mockito.<String>any())).thenReturn(1);
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);

    // Act and Assert
    assertEquals(
        1, fileHandlerService.getPdf2jpgCache(FtpUtilsFactory.createValidFtpUrl()).intValue());
  }

  /**
   * Test {@link FileHandlerService#getPdf2jpgCache(String)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getPdf2jpgCache(String)}
   */
  @Test
  @DisplayName("Test getPdf2jpgCache(String); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Integer FileHandlerService.getPdf2jpgCache(String)"})
  void testGetPdf2jpgCache_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getPdfImageCache(Mockito.<String>any()))
        .thenThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.getPdf2jpgCache(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link FileHandlerService#getFileNameFromPath(String)}.
   *
   * <p>Method under test: {@link FileHandlerService#getFileNameFromPath(String)}
   */
  @Test
  @DisplayName("Test getFileNameFromPath(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getFileNameFromPath(String)"})
  void testGetFileNameFromPath() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());

    // Act and Assert
    assertEquals(
        "file.txt", fileHandlerService.getFileNameFromPath(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link FileHandlerService#addConvertedFile(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#addConvertedFile(String, String)}
   */
  @Test
  @DisplayName("Test addConvertedFile(String, String); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.addConvertedFile(String, String)"})
  void testAddConvertedFile_thenThrowEncryptedDocumentException() {
    // Arrange
    doThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()))
        .when(cacheService)
        .putPDFCache(Mockito.<String>any(), Mockito.<String>any());
    String fileName = FtpUtilsFactory.createValidFtpUrl();

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.addConvertedFile(fileName, FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link FileHandlerService#addPdf2jpgCache(String, int)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#addPdf2jpgCache(String, int)}
   */
  @Test
  @DisplayName("Test addPdf2jpgCache(String, int); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.addPdf2jpgCache(String, int)"})
  void testAddPdf2jpgCache_thenThrowEncryptedDocumentException() {
    // Arrange
    doThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()))
        .when(cacheService)
        .putPdfImageCache(Mockito.<String>any(), anyInt());

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.addPdf2jpgCache(FtpUtilsFactory.createValidFtpUrl(), 10));
  }

  /**
   * Test {@link FileHandlerService#getImgCache(String)}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getImgCache(String)}
   */
  @Test
  @DisplayName("Test getImgCache(String); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FileHandlerService.getImgCache(String)"})
  void testGetImgCache_thenReturnEmpty() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    when(cacheService.getImgCache(Mockito.<String>any())).thenReturn(new ArrayList<>());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);

    // Act and Assert
    assertTrue(fileHandlerService.getImgCache(FtpUtilsFactory.createValidFtpUrl()).isEmpty());
  }

  /**
   * Test {@link FileHandlerService#getImgCache(String)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getImgCache(String)}
   */
  @Test
  @DisplayName("Test getImgCache(String); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FileHandlerService.getImgCache(String)"})
  void testGetImgCache_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getImgCache(Mockito.<String>any()))
        .thenThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.getImgCache(FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link FileHandlerService#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#putImgCache(String, List)}
   */
  @Test
  @DisplayName("Test putImgCache(String, List); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.putImgCache(String, List)"})
  void testPutImgCache_thenThrowEncryptedDocumentException() {
    // Arrange
    doThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()))
        .when(cacheService)
        .putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());
    String fileKey = FtpUtilsFactory.createValidFtpUrl();

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.putImgCache(fileKey, new ArrayList<>()));
  }

  /**
   * Test {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test pdf2jpg(String, String, String, FileAttribute); given 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FileHandlerService.pdf2jpg(String, String, String, FileAttribute)"})
  void testPdf2jpg_givenTrue_thenReturnNull() throws Exception {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(mock(CacheServiceJDKImpl.class));
    String fileNameFilePath = FtpUtilsFactory.createValidFtpUrl();
    String pdfFilePath = FtpUtilsFactory.createValidFtpUrl();
    String pdfName = FtpUtilsFactory.createValidFtpUrl();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getUsePasswordCache()).thenReturn(true);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getFilePassword()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    List<String> actualPdf2jpgResult =
        fileHandlerService.pdf2jpg(fileNameFilePath, pdfFilePath, pdfName, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getFilePassword();
    verify(fileAttribute).getUsePasswordCache();
    assertNull(actualPdf2jpgResult);
  }

  /**
   * Test {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test pdf2jpg(String, String, String, FileAttribute); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FileHandlerService.pdf2jpg(String, String, String, FileAttribute)"})
  void testPdf2jpg_thenThrowEncryptedDocumentException() throws Exception {
    // Arrange
    when(cacheService.getPdfImageCache(Mockito.<String>any()))
        .thenThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()));
    String fileNameFilePath = FtpUtilsFactory.createValidFtpUrl();
    String pdfFilePath = FtpUtilsFactory.createValidFtpUrl();
    String pdfName = FtpUtilsFactory.createValidFtpUrl();

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () ->
            fileHandlerService.pdf2jpg(
                fileNameFilePath,
                pdfFilePath,
                pdfName,
                DownloadUtilsFactory.createValidFileAttribute()));
  }

  /**
   * Test {@link FileHandlerService#getSubString(String, String)}.
   *
   * <ul>
   *   <li>When createValidFtpUrl.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getSubString(String, String)}
   */
  @Test
  @DisplayName(
      "Test getSubString(String, String); when createValidFtpUrl; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getSubString(String, String)"})
  void testGetSubString_whenCreateValidFtpUrl_thenReturnEmptyString() {
    // Arrange
    String str = FtpUtilsFactory.createValidFtpUrl();

    // Act and Assert
    assertEquals("", FileHandlerService.getSubString(str, FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}.
   *
   * <ul>
   *   <li>Then return CacheName is {@code [}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}
   */
  @Test
  @DisplayName("Test getFileAttribute(String, HttpServletRequest); then return CacheName is '['")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileAttribute FileHandlerService.getFileAttribute(String, HttpServletRequest)"
  })
  void testGetFileAttribute_thenReturnCacheNameIsLeftSquareBracket() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());

    // Act
    FileAttribute actualFileAttribute =
        fileHandlerService.getFileAttribute(
            "[?]", FileControllerFactory.createHttpServletRequestWithSession());

    // Assert
    assertEquals("[", actualFileAttribute.getCacheName());
    assertEquals("[", actualFileAttribute.getName());
    assertEquals("[", actualFileAttribute.getSuffix());
    assertEquals("[?]", actualFileAttribute.getUrl());
  }

  /**
   * Test {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}.
   *
   * <ul>
   *   <li>Then return CacheName is {@code [}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}
   */
  @Test
  @DisplayName("Test getFileAttribute(String, HttpServletRequest); then return CacheName is '['")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileAttribute FileHandlerService.getFileAttribute(String, HttpServletRequest)"
  })
  void testGetFileAttribute_thenReturnCacheNameIsLeftSquareBracket2() {
    // Arrange and Act
    FileAttribute actualFileAttribute =
        new FileHandlerService(new CacheServiceJDKImpl()).getFileAttribute("[?]", null);

    // Assert
    assertEquals("[", actualFileAttribute.getCacheName());
    assertEquals("[", actualFileAttribute.getName());
    assertEquals("[", actualFileAttribute.getSuffix());
    assertEquals("[?]", actualFileAttribute.getUrl());
  }

  /**
   * Test {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}.
   *
   * <ul>
   *   <li>Then return CacheName is {@code ]}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}
   */
  @Test
  @DisplayName("Test getFileAttribute(String, HttpServletRequest); then return CacheName is ']'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileAttribute FileHandlerService.getFileAttribute(String, HttpServletRequest)"
  })
  void testGetFileAttribute_thenReturnCacheNameIsRightSquareBracket() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());

    // Act
    FileAttribute actualFileAttribute =
        fileHandlerService.getFileAttribute(
            "]", FileControllerFactory.createHttpServletRequestWithSession());

    // Assert
    assertEquals("]", actualFileAttribute.getCacheName());
    assertEquals("]", actualFileAttribute.getName());
    assertEquals("]", actualFileAttribute.getSuffix());
    assertEquals("]", actualFileAttribute.getUrl());
  }

  /**
   * Test {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}.
   *
   * <ul>
   *   <li>When {@code charset=gb2312}.
   *   <li>Then return CacheName is {@code charset=gb2312}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getFileAttribute(String, HttpServletRequest); when 'charset=gb2312'; then return CacheName is 'charset=gb2312'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileAttribute FileHandlerService.getFileAttribute(String, HttpServletRequest)"
  })
  void testGetFileAttribute_whenCharsetGb2312_thenReturnCacheNameIsCharsetGb2312() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());

    // Act
    FileAttribute actualFileAttribute =
        fileHandlerService.getFileAttribute(
            "charset=gb2312", FileControllerFactory.createHttpServletRequestWithSession());

    // Assert
    assertEquals("charset=gb2312", actualFileAttribute.getCacheName());
    assertEquals("charset=gb2312", actualFileAttribute.getName());
    assertEquals("charset=gb2312", actualFileAttribute.getSuffix());
    assertEquals("charset=gb2312", actualFileAttribute.getUrl());
  }

  /**
   * Test {@link FileHandlerService#listConvertedMedias()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#listConvertedMedias()}
   */
  @Test
  @DisplayName("Test listConvertedMedias(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map FileHandlerService.listConvertedMedias()"})
  void testListConvertedMedias_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new FileHandlerService(new CacheServiceJDKImpl()).listConvertedMedias());
  }

  /**
   * Test {@link FileHandlerService#listConvertedMedias()}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#listConvertedMedias()}
   */
  @Test
  @DisplayName("Test listConvertedMedias(); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map FileHandlerService.listConvertedMedias()"})
  void testListConvertedMedias_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getMediaConvertCache())
        .thenThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()));

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.listConvertedMedias());
    verify(cacheService).getMediaConvertCache();
  }

  /**
   * Test {@link FileHandlerService#addConvertedMedias(String, String)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#addConvertedMedias(String, String)}
   */
  @Test
  @DisplayName("Test addConvertedMedias(String, String); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.addConvertedMedias(String, String)"})
  void testAddConvertedMedias_thenThrowEncryptedDocumentException() {
    // Arrange
    doThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()))
        .when(cacheService)
        .putMediaConvertCache(Mockito.<String>any(), Mockito.<String>any());
    String fileName = FtpUtilsFactory.createValidFtpUrl();

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.addConvertedMedias(fileName, FtpUtilsFactory.createValidFtpUrl()));
  }

  /**
   * Test {@link FileHandlerService#getConvertedMedias(String)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getConvertedMedias(String)}
   */
  @Test
  @DisplayName("Test getConvertedMedias(String); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getConvertedMedias(String)"})
  void testGetConvertedMedias_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getMediaConvertCache(Mockito.<String>any()))
        .thenThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.getConvertedMedias(FtpUtilsFactory.createValidFtpUrl()));
  }
}
