package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
import org.springframework.mock.web.MockHttpServletRequest;

@ExtendWith(MockitoExtension.class)
class FileHandlerServiceDiffblueTest {
  @Mock private CacheService cacheService;

  @InjectMocks private FileHandlerService fileHandlerService;

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
    when(cacheService.getPDFCache(Mockito.<String>any())).thenReturn("Pdf Cache");

    // Act
    String actualConvertedFile = fileHandlerService.getConvertedFile("Key");

    // Assert
    verify(cacheService).getPDFCache("Key");
    assertEquals("Pdf Cache", actualConvertedFile);
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
  void testGetConvertedFile_thenReturnPdfCache2() {
    // Arrange
    when(cacheService.getPDFCache(Mockito.<String>any())).thenReturn("Pdf Cache");

    // Act
    String actualConvertedFile = fileHandlerService.getConvertedFile("Key");

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
  void testGetConvertedFile_thenThrowEncryptedDocumentException2() {
    // Arrange
    when(cacheService.getPDFCache(Mockito.<String>any()))
        .thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class, () -> fileHandlerService.getConvertedFile("Key"));
    verify(cacheService).getPDFCache("Key");
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
   * Test {@link FileHandlerService#getFileNameFromPath(String)}.
   *
   * <p>Method under test: {@link FileHandlerService#getFileNameFromPath(String)}
   */
  @Test
  @DisplayName("Test getFileNameFromPath(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getFileNameFromPath(String)"})
  void testGetFileNameFromPath2() {
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
  void testAddConvertedFile_thenCallsPutPDFCache2() {
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
  void testAddConvertedFile_thenThrowEncryptedDocumentException2() {
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
   *   <li>Given {@link CacheService} {@link CacheService#putPdfImageCache(String, int)} does
   *       nothing.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#addPdf2jpgCache(String, int)}
   */
  @Test
  @DisplayName(
      "Test addPdf2jpgCache(String, int); given CacheService putPdfImageCache(String, int) does nothing")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.addPdf2jpgCache(String, int)"})
  void testAddPdf2jpgCache_givenCacheServicePutPdfImageCacheDoesNothing() {
    // Arrange
    doNothing().when(cacheService).putPdfImageCache(Mockito.<String>any(), anyInt());

    // Act
    fileHandlerService.addPdf2jpgCache("/directory/foo.txt", 10);

    // Assert
    verify(cacheService).putPdfImageCache("/directory/foo.txt", 10);
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
  void testAddPdf2jpgCache_thenThrowEncryptedDocumentException2() {
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
   *   <li>Given {@link CacheService} {@link CacheService#getImgCache(String)} return {@link
   *       ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getImgCache(String)}
   */
  @Test
  @DisplayName(
      "Test getImgCache(String); given CacheService getImgCache(String) return ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FileHandlerService.getImgCache(String)"})
  void testGetImgCache_givenCacheServiceGetImgCacheReturnArrayList_thenReturnEmpty() {
    // Arrange
    when(cacheService.getImgCache(Mockito.<String>any())).thenReturn(new ArrayList<>());

    // Act
    List<String> actualImgCache = fileHandlerService.getImgCache("Compress File Key");

    // Assert
    verify(cacheService).getImgCache("Compress File Key");
    assertTrue(actualImgCache.isEmpty());
  }

  /**
   * Test {@link FileHandlerService#getImgCache(String)}.
   *
   * <ul>
   *   <li>Given {@link FileHandlerService#FileHandlerService(CacheService)} with cacheService is
   *       {@link CacheServiceJDKImpl} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getImgCache(String)}
   */
  @Test
  @DisplayName(
      "Test getImgCache(String); given FileHandlerService(CacheService) with cacheService is CacheServiceJDKImpl (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List FileHandlerService.getImgCache(String)"})
  void testGetImgCache_givenFileHandlerServiceWithCacheServiceIsCacheServiceJDKImpl() {
    // Arrange, Act and Assert
    assertTrue(new FileHandlerService(new CacheServiceJDKImpl()).getImgCache("").isEmpty());
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
   * Test {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}.
   *
   * <ul>
   *   <li>Then return OriginFilePath is {@code C:/temp/test-files/\[}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getFileAttribute(String, HttpServletRequest); then return OriginFilePath is 'C:/temp/test-files/\\['")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileAttribute FileHandlerService.getFileAttribute(String, HttpServletRequest)"
  })
  void testGetFileAttribute_thenReturnOriginFilePathIsCTempTestFiles() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());

    // Act
    FileAttribute actualFileAttribute =
        fileHandlerService.getFileAttribute("[?]", new MockHttpServletRequest());

    // Assert
    assertEquals("C:/temp/test-files/\\[", actualFileAttribute.getOriginFilePath());
    assertEquals("C:/temp/test-files/\\[", actualFileAttribute.getOutFilePath());
    assertEquals("[", actualFileAttribute.getCacheName());
    assertEquals("[", actualFileAttribute.getName());
    assertEquals("[", actualFileAttribute.getSuffix());
    assertEquals("[?]", actualFileAttribute.getUrl());
  }

  /**
   * Test {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}.
   *
   * <ul>
   *   <li>Then return OriginFilePath is {@code C:/temp/test-files/\[&]}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getFileAttribute(String, HttpServletRequest); then return OriginFilePath is 'C:/temp/test-files/\\[&]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileAttribute FileHandlerService.getFileAttribute(String, HttpServletRequest)"
  })
  void testGetFileAttribute_thenReturnOriginFilePathIsCTempTestFiles2() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());

    // Act
    FileAttribute actualFileAttribute =
        fileHandlerService.getFileAttribute("[&]", new MockHttpServletRequest());

    // Assert
    assertEquals("C:/temp/test-files/\\[&]", actualFileAttribute.getOriginFilePath());
    assertEquals("C:/temp/test-files/\\[&]", actualFileAttribute.getOutFilePath());
    assertEquals("[&]", actualFileAttribute.getCacheName());
    assertEquals("[&]", actualFileAttribute.getName());
    assertEquals("[&]", actualFileAttribute.getSuffix());
    assertEquals("[&]", actualFileAttribute.getUrl());
  }

  /**
   * Test {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}.
   *
   * <ul>
   *   <li>Then return OriginFilePath is {@code C:/temp/test-files/\]}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getFileAttribute(String, HttpServletRequest); then return OriginFilePath is 'C:/temp/test-files/\\]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileAttribute FileHandlerService.getFileAttribute(String, HttpServletRequest)"
  })
  void testGetFileAttribute_thenReturnOriginFilePathIsCTempTestFiles3() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());

    // Act
    FileAttribute actualFileAttribute =
        fileHandlerService.getFileAttribute("]", new MockHttpServletRequest());

    // Assert
    assertEquals("C:/temp/test-files/\\]", actualFileAttribute.getOriginFilePath());
    assertEquals("C:/temp/test-files/\\]", actualFileAttribute.getOutFilePath());
    assertEquals("]", actualFileAttribute.getCacheName());
    assertEquals("]", actualFileAttribute.getName());
    assertEquals("]", actualFileAttribute.getSuffix());
    assertEquals("]", actualFileAttribute.getUrl());
  }

  /**
   * Test {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}.
   *
   * <ul>
   *   <li>Then return OriginFilePath is {@code C:/temp/test-files/\charset=gb2312}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getFileAttribute(String, HttpServletRequest)}
   */
  @Test
  @DisplayName(
      "Test getFileAttribute(String, HttpServletRequest); then return OriginFilePath is 'C:/temp/test-files/\\charset=gb2312'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FileAttribute FileHandlerService.getFileAttribute(String, HttpServletRequest)"
  })
  void testGetFileAttribute_thenReturnOriginFilePathIsCTempTestFilesCharsetGb2312() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());

    // Act
    FileAttribute actualFileAttribute =
        fileHandlerService.getFileAttribute("charset=gb2312", new MockHttpServletRequest());

    // Assert
    assertEquals("C:/temp/test-files/\\charset=gb2312", actualFileAttribute.getOriginFilePath());
    assertEquals("C:/temp/test-files/\\charset=gb2312", actualFileAttribute.getOutFilePath());
    assertEquals("charset=gb2312", actualFileAttribute.getCacheName());
    assertEquals("charset=gb2312", actualFileAttribute.getName());
    assertEquals("charset=gb2312", actualFileAttribute.getSuffix());
    assertEquals("charset=gb2312", actualFileAttribute.getUrl());
  }

  /**
   * Test {@link FileHandlerService#addConvertedMedias(String, String)}.
   *
   * <ul>
   *   <li>Given {@link CacheService} {@link CacheService#putMediaConvertCache(String, String)} does
   *       nothing.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#addConvertedMedias(String, String)}
   */
  @Test
  @DisplayName(
      "Test addConvertedMedias(String, String); given CacheService putMediaConvertCache(String, String) does nothing")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.addConvertedMedias(String, String)"})
  void testAddConvertedMedias_givenCacheServicePutMediaConvertCacheDoesNothing() {
    // Arrange
    doNothing()
        .when(cacheService)
        .putMediaConvertCache(Mockito.<String>any(), Mockito.<String>any());

    // Act
    fileHandlerService.addConvertedMedias("foo.txt", "42");

    // Assert
    verify(cacheService).putMediaConvertCache("foo.txt", "42");
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
  void testAddConvertedMedias_thenThrowEncryptedDocumentException2() {
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
  void testGetConvertedMedias_thenReturnMediaConvertCache2() {
    // Arrange
    when(cacheService.getMediaConvertCache(Mockito.<String>any()))
        .thenReturn("Media Convert Cache");

    // Act
    String actualConvertedMedias = fileHandlerService.getConvertedMedias("Key");

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
  void testGetConvertedMedias_thenThrowEncryptedDocumentException2() {
    // Arrange
    when(cacheService.getMediaConvertCache(Mockito.<String>any()))
        .thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class, () -> fileHandlerService.getConvertedMedias("Key"));
    verify(cacheService).getMediaConvertCache("Key");
  }
}
