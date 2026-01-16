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
    when(cacheService.getPDFCache()).thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.listConvertedFiles());
    verify(cacheService).getPDFCache();
  }

  /**
   * Test {@link FileHandlerService#getConvertedFile(String)}.
   *
   * <ul>
   *   <li>Then return {@code Pdf Cache}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getConvertedFile(String)}
   */
  @Test
  @DisplayName("Test getConvertedFile(String); then return 'Pdf Cache'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getConvertedFile(String)"})
  void testGetConvertedFile_thenReturnPdfCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    when(cacheService.getPDFCache(Mockito.<String>any())).thenReturn("Pdf Cache");

    // Act
    String actualConvertedFile = new FileHandlerService(cacheService).getConvertedFile("Key");

    // Assert
    verify(cacheService).getPDFCache("Key");
    assertEquals("Pdf Cache", actualConvertedFile);
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
        .thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class, () -> fileHandlerService.getConvertedFile("Key"));
    verify(cacheService).getPDFCache("Key");
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

    // Act
    Integer actualPdf2jpgCache = new FileHandlerService(cacheService).getPdf2jpgCache("Key");

    // Assert
    verify(cacheService).getPdfImageCache("Key");
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
        .thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.getPdf2jpgCache("Key"));
    verify(cacheService).getPdfImageCache("Key");
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
    // Arrange, Act and Assert
    assertEquals(
        "Path", new FileHandlerService(new CacheServiceJDKImpl()).getFileNameFromPath("Path"));
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

    // Act
    new FileHandlerService(cacheService).addConvertedFile("foo.txt", "42");

    // Assert
    verify(cacheService).putPDFCache("foo.txt", "42");
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
    doThrow(new EncryptedDocumentException("foo"))
        .when(cacheService)
        .putPDFCache(Mockito.<String>any(), Mockito.<String>any());

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.addConvertedFile("foo.txt", "42"));
    verify(cacheService).putPDFCache("foo.txt", "42");
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

    // Act
    new FileHandlerService(cacheService).addPdf2jpgCache("/directory/foo.txt", 10);

    // Assert
    verify(cacheService).putPdfImageCache("/directory/foo.txt", 10);
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
    doThrow(new EncryptedDocumentException("foo"))
        .when(cacheService)
        .putPdfImageCache(Mockito.<String>any(), anyInt());

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.addPdf2jpgCache("/directory/foo.txt", 10));
    verify(cacheService).putPdfImageCache("/directory/foo.txt", 10);
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

    // Act
    List<String> actualImgCache =
        new FileHandlerService(cacheService).getImgCache("Compress File Key");

    // Assert
    verify(cacheService).getImgCache("Compress File Key");
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
        .thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.getImgCache("Compress File Key"));
    verify(cacheService).getImgCache("Compress File Key");
  }

  /**
   * Test {@link FileHandlerService#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then calls {@link CacheServiceJDKImpl#putImgCache(String, List)}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#putImgCache(String, List)}
   */
  @Test
  @DisplayName(
      "Test putImgCache(String, List); given '42'; when ArrayList() add '42'; then calls putImgCache(String, List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.putImgCache(String, List)"})
  void testPutImgCache_given42_whenArrayListAdd42_thenCallsPutImgCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);

    ArrayList<String> imgs = new ArrayList<>();
    imgs.add("42");
    imgs.add("foo");

    // Act
    fileHandlerService.putImgCache("File Key", imgs);

    // Assert
    verify(cacheService).putImgCache(eq("File Key"), isA(List.class));
  }

  /**
   * Test {@link FileHandlerService#putImgCache(String, List)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then calls {@link CacheServiceJDKImpl#putImgCache(String, List)}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#putImgCache(String, List)}
   */
  @Test
  @DisplayName(
      "Test putImgCache(String, List); given 'foo'; when ArrayList() add 'foo'; then calls putImgCache(String, List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.putImgCache(String, List)"})
  void testPutImgCache_givenFoo_whenArrayListAddFoo_thenCallsPutImgCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);

    ArrayList<String> imgs = new ArrayList<>();
    imgs.add("foo");

    // Act
    fileHandlerService.putImgCache("File Key", imgs);

    // Assert
    verify(cacheService).putImgCache(eq("File Key"), isA(List.class));
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
    doThrow(new EncryptedDocumentException("foo"))
        .when(cacheService)
        .putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.putImgCache("File Key", new ArrayList<>()));
    verify(cacheService).putImgCache(eq("File Key"), isA(List.class));
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

    // Act
    fileHandlerService.putImgCache("File Key", new ArrayList<>());

    // Assert
    verify(cacheService).putImgCache(eq("File Key"), isA(List.class));
  }

  /**
   * Test {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@link CacheService} {@link CacheService#getPdfImageCache(String)} return zero.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test pdf2jpg(String, String, String, FileAttribute); given CacheService getPdfImageCache(String) return zero; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FileHandlerService.pdf2jpg(String, String, String, FileAttribute)"})
  void testPdf2jpg_givenCacheServiceGetPdfImageCacheReturnZero_thenReturnNull() throws Exception {
    // Arrange
    when(cacheService.getPdfImageCache(Mockito.<String>any())).thenReturn(0);

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getUsePasswordCache()).thenReturn(true);
    when(fileAttribute.forceUpdatedCache()).thenReturn(false);
    when(fileAttribute.getFilePassword()).thenReturn("iloveyou");

    // Act
    List<String> actualPdf2jpgResult =
        fileHandlerService.pdf2jpg("foo.txt", "/directory/foo.txt", "Pdf Name", fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getFilePassword();
    verify(fileAttribute).getUsePasswordCache();
    verify(cacheService).getPdfImageCache("/directory/foo.txt");
    assertNull(actualPdf2jpgResult);
  }

  /**
   * Test {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@link FileHandlerService#FileHandlerService(CacheService)} with cacheService is
   *       {@link CacheServiceJDKImpl}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test pdf2jpg(String, String, String, FileAttribute); given FileHandlerService(CacheService) with cacheService is CacheServiceJDKImpl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FileHandlerService.pdf2jpg(String, String, String, FileAttribute)"})
  void testPdf2jpg_givenFileHandlerServiceWithCacheServiceIsCacheServiceJDKImpl() throws Exception {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(mock(CacheServiceJDKImpl.class));

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getUsePasswordCache()).thenReturn(true);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getFilePassword()).thenReturn("iloveyou");

    // Act
    List<String> actualPdf2jpgResult =
        fileHandlerService.pdf2jpg("foo.txt", "/directory/foo.txt", "Pdf Name", fileAttribute);

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
        .thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () ->
            fileHandlerService.pdf2jpg(
                "foo.txt", "/directory/foo.txt", "Pdf Name", new FileAttribute()));
    verify(cacheService).getPdfImageCache("/directory/foo.txt");
  }

  /**
   * Test {@link FileHandlerService#getSubString(String, String)}.
   *
   * <ul>
   *   <li>Then return {@code ortedEncodingException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getSubString(String, String)}
   */
  @Test
  @DisplayName("Test getSubString(String, String); then return 'ortedEncodingException'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getSubString(String, String)"})
  void testGetSubString_thenReturnOrtedEncodingException() {
    // Arrange, Act and Assert
    assertEquals(
        "ortedEncodingException",
        FileHandlerService.getSubString("UnsupportedEncodingException", "Pos Str"));
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
    when(cacheService.getMediaConvertCache()).thenThrow(new EncryptedDocumentException("foo"));

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

    // Act
    new FileHandlerService(cacheService).addConvertedMedias("foo.txt", "42");

    // Assert
    verify(cacheService).putMediaConvertCache("foo.txt", "42");
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
    doThrow(new EncryptedDocumentException("foo"))
        .when(cacheService)
        .putMediaConvertCache(Mockito.<String>any(), Mockito.<String>any());

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> fileHandlerService.addConvertedMedias("foo.txt", "42"));
    verify(cacheService).putMediaConvertCache("foo.txt", "42");
  }

  /**
   * Test {@link FileHandlerService#getConvertedMedias(String)}.
   *
   * <ul>
   *   <li>Then return {@code Media Convert Cache}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getConvertedMedias(String)}
   */
  @Test
  @DisplayName("Test getConvertedMedias(String); then return 'Media Convert Cache'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getConvertedMedias(String)"})
  void testGetConvertedMedias_thenReturnMediaConvertCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    when(cacheService.getMediaConvertCache(Mockito.<String>any()))
        .thenReturn("Media Convert Cache");

    // Act
    String actualConvertedMedias = new FileHandlerService(cacheService).getConvertedMedias("Key");

    // Assert
    verify(cacheService).getMediaConvertCache("Key");
    assertEquals("Media Convert Cache", actualConvertedMedias);
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
        .thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class, () -> fileHandlerService.getConvertedMedias("Key"));
    verify(cacheService).getMediaConvertCache("Key");
  }
}
