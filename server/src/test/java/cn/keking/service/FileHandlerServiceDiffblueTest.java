package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.service.cache.CacheService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
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
}
