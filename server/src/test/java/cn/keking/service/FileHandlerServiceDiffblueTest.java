package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.cache.CacheService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import cn.keking.service.impl.SimTextFilePreviewImplFactory;
import cn.keking.utils.FtpUtilsFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
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
   *   <li>Then return {@code ftp://localhost/test/file.txt}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getConvertedFile(String)}
   */
  @Test
  @DisplayName("Test getConvertedFile(String); then return 'ftp://localhost/test/file.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getConvertedFile(String)"})
  void testGetConvertedFile_thenReturnFtpLocalhostTestFileTxt() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    when(cacheService.getPDFCache(Mockito.<String>any()))
        .thenReturn(FtpUtilsFactory.createValidFtpUrl());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);

    // Act
    String actualConvertedFile =
        fileHandlerService.getConvertedFile(FtpUtilsFactory.createValidFtpUrl());

    // Assert
    verify(cacheService).getPDFCache("ftp://localhost/test/file.txt");
    assertEquals("ftp://localhost/test/file.txt", actualConvertedFile);
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
    verify(cacheService).getPDFCache("ftp://localhost/test/file.txt");
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
  @MethodsUnderTest({"Integer FileHandlerService.getPdf2jpgCache(String)"})
  void testGetPdf2jpgCache_thenReturnIntValueIsOne() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    when(cacheService.getPdfImageCache(Mockito.<String>any())).thenReturn(1);
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);

    // Act
    Integer actualPdf2jpgCache =
        fileHandlerService.getPdf2jpgCache(FtpUtilsFactory.createValidFtpUrl());

    // Assert
    verify(cacheService).getPdfImageCache("ftp://localhost/test/file.txt");
    assertEquals(1, actualPdf2jpgCache.intValue());
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
  @MethodsUnderTest({"Integer FileHandlerService.getPdf2jpgCache(String)"})
  void testGetPdf2jpgCache_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getPdfImageCache(Mockito.<String>any()))
        .thenThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.getPdf2jpgCache(FtpUtilsFactory.createValidFtpUrl()));
    verify(cacheService).getPdfImageCache("ftp://localhost/test/file.txt");
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
   *   <li>Then calls {@link CacheServiceJDKImpl#putPDFCache(String, String)}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#addConvertedFile(String, String)}
   */
  @Test
  @DisplayName("Test addConvertedFile(String, String); then calls putPDFCache(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.addConvertedFile(String, String)"})
  void testAddConvertedFile_thenCallsPutPDFCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).putPDFCache(Mockito.<String>any(), Mockito.<String>any());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);
    String fileName = FtpUtilsFactory.createValidFtpUrl();

    // Act
    fileHandlerService.addConvertedFile(fileName, FtpUtilsFactory.createValidFtpUrl());

    // Assert
    verify(cacheService)
        .putPDFCache("ftp://localhost/test/file.txt", "ftp://localhost/test/file.txt");
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
    verify(cacheService)
        .putPDFCache("ftp://localhost/test/file.txt", "ftp://localhost/test/file.txt");
  }

  /**
   * Test {@link FileHandlerService#addPdf2jpgCache(String, int)}.
   *
   * <ul>
   *   <li>Then calls {@link CacheServiceJDKImpl#putPdfImageCache(String, int)}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#addPdf2jpgCache(String, int)}
   */
  @Test
  @DisplayName("Test addPdf2jpgCache(String, int); then calls putPdfImageCache(String, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.addPdf2jpgCache(String, int)"})
  void testAddPdf2jpgCache_thenCallsPutPdfImageCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).putPdfImageCache(Mockito.<String>any(), anyInt());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);

    // Act
    fileHandlerService.addPdf2jpgCache(FtpUtilsFactory.createValidFtpUrl(), 10);

    // Assert
    verify(cacheService).putPdfImageCache("ftp://localhost/test/file.txt", 10);
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
    verify(cacheService).putPdfImageCache("ftp://localhost/test/file.txt", 10);
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

    // Act
    List<String> actualImgCache =
        fileHandlerService.getImgCache(FtpUtilsFactory.createValidFtpUrl());

    // Assert
    verify(cacheService).getImgCache("ftp://localhost/test/file.txt");
    assertTrue(actualImgCache.isEmpty());
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
    verify(cacheService).getImgCache("ftp://localhost/test/file.txt");
  }

  /**
   * Test {@link FileHandlerService#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>When {@link ArrayList#ArrayList()} addAll {@link ArrayList#ArrayList()}.
   *   <li>Then calls {@link CacheServiceJDKImpl#putImgCache(String, List)}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#putImgCache(String, List)}
   */
  @Test
  @DisplayName(
      "Test putImgCache(String, List); given ArrayList(); when ArrayList() addAll ArrayList(); then calls putImgCache(String, List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.putImgCache(String, List)"})
  void testPutImgCache_givenArrayList_whenArrayListAddAllArrayList_thenCallsPutImgCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);
    String fileKey = FtpUtilsFactory.createValidFtpUrl();

    ArrayList<String> imgs = new ArrayList<>();
    imgs.add(FtpUtilsFactory.createValidFtpUrl());
    imgs.addAll(new ArrayList<>());
    imgs.add(FtpUtilsFactory.createValidFtpUrl());

    // Act
    fileHandlerService.putImgCache(fileKey, imgs);

    // Assert
    verify(cacheService).putImgCache(eq("ftp://localhost/test/file.txt"), isA(List.class));
  }

  /**
   * Test {@link FileHandlerService#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Given createValidFtpUrl.
   *   <li>When {@link ArrayList#ArrayList()} add createValidFtpUrl.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#putImgCache(String, List)}
   */
  @Test
  @DisplayName(
      "Test putImgCache(String, List); given createValidFtpUrl; when ArrayList() add createValidFtpUrl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.putImgCache(String, List)"})
  void testPutImgCache_givenCreateValidFtpUrl_whenArrayListAddCreateValidFtpUrl() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);
    String fileKey = FtpUtilsFactory.createValidFtpUrl();

    ArrayList<String> imgs = new ArrayList<>();
    imgs.add(FtpUtilsFactory.createValidFtpUrl());

    // Act
    fileHandlerService.putImgCache(fileKey, imgs);

    // Assert
    verify(cacheService).putImgCache(eq("ftp://localhost/test/file.txt"), isA(List.class));
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
    verify(cacheService).putImgCache(eq("ftp://localhost/test/file.txt"), isA(List.class));
  }

  /**
   * Test {@link FileHandlerService#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then calls {@link CacheServiceJDKImpl#putImgCache(String, List)}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#putImgCache(String, List)}
   */
  @Test
  @DisplayName(
      "Test putImgCache(String, List); when ArrayList(); then calls putImgCache(String, List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.putImgCache(String, List)"})
  void testPutImgCache_whenArrayList_thenCallsPutImgCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);
    String fileKey = FtpUtilsFactory.createValidFtpUrl();

    // Act
    fileHandlerService.putImgCache(fileKey, new ArrayList<>());

    // Assert
    verify(cacheService).putImgCache(eq("ftp://localhost/test/file.txt"), isA(List.class));
  }

  /**
   * Test {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@link CacheService} {@link CacheService#getPdfImageCache(String)} return zero.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test pdf2jpg(String, String, String, FileAttribute); given CacheService getPdfImageCache(String) return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FileHandlerService.pdf2jpg(String, String, String, FileAttribute)"})
  void testPdf2jpg_givenCacheServiceGetPdfImageCacheReturnZero() throws Exception {
    // Arrange
    when(cacheService.getPdfImageCache(Mockito.<String>any())).thenReturn(0);
    String fileNameFilePath = FtpUtilsFactory.createValidFtpUrl();
    String pdfFilePath = FtpUtilsFactory.createValidFtpUrl();
    String pdfName = FtpUtilsFactory.createValidFtpUrl();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getUsePasswordCache()).thenReturn(true);
    when(fileAttribute.forceUpdatedCache()).thenReturn(false);
    when(fileAttribute.getFilePassword()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    List<String> actualPdf2jpgResult =
        fileHandlerService.pdf2jpg(fileNameFilePath, pdfFilePath, pdfName, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getFilePassword();
    verify(fileAttribute).getUsePasswordCache();
    verify(cacheService).getPdfImageCache("ftp://localhost/test/file.txt");
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
                SimTextFilePreviewImplFactory.createFileAttribute()));
    verify(cacheService).getPdfImageCache("ftp://localhost/test/file.txt");
  }

  /**
   * Test {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}.
   *
   * <ul>
   *   <li>When {@link FileAttribute} {@link FileAttribute#forceUpdatedCache()} return {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test pdf2jpg(String, String, String, FileAttribute); when FileAttribute forceUpdatedCache() return 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FileHandlerService.pdf2jpg(String, String, String, FileAttribute)"})
  void testPdf2jpg_whenFileAttributeForceUpdatedCacheReturnTrue_thenReturnNull() throws Exception {
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
   *   <li>Then calls {@link CacheServiceJDKImpl#putMediaConvertCache(String, String)}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#addConvertedMedias(String, String)}
   */
  @Test
  @DisplayName(
      "Test addConvertedMedias(String, String); then calls putMediaConvertCache(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.addConvertedMedias(String, String)"})
  void testAddConvertedMedias_thenCallsPutMediaConvertCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing()
        .when(cacheService)
        .putMediaConvertCache(Mockito.<String>any(), Mockito.<String>any());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);
    String fileName = FtpUtilsFactory.createValidFtpUrl();

    // Act
    fileHandlerService.addConvertedMedias(fileName, FtpUtilsFactory.createValidFtpUrl());

    // Assert
    verify(cacheService)
        .putMediaConvertCache("ftp://localhost/test/file.txt", "ftp://localhost/test/file.txt");
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
    verify(cacheService)
        .putMediaConvertCache("ftp://localhost/test/file.txt", "ftp://localhost/test/file.txt");
  }

  /**
   * Test {@link FileHandlerService#getConvertedMedias(String)}.
   *
   * <ul>
   *   <li>Then return {@code ftp://localhost/test/file.txt}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getConvertedMedias(String)}
   */
  @Test
  @DisplayName("Test getConvertedMedias(String); then return 'ftp://localhost/test/file.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getConvertedMedias(String)"})
  void testGetConvertedMedias_thenReturnFtpLocalhostTestFileTxt() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    when(cacheService.getMediaConvertCache(Mockito.<String>any()))
        .thenReturn(FtpUtilsFactory.createValidFtpUrl());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);

    // Act
    String actualConvertedMedias =
        fileHandlerService.getConvertedMedias(FtpUtilsFactory.createValidFtpUrl());

    // Assert
    verify(cacheService).getMediaConvertCache("ftp://localhost/test/file.txt");
    assertEquals("ftp://localhost/test/file.txt", actualConvertedMedias);
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
    verify(cacheService).getMediaConvertCache("ftp://localhost/test/file.txt");
  }
}
