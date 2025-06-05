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
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
  @Mock
  private CacheService cacheService;

  @InjectMocks
  private FileHandlerService fileHandlerService;

  /**
   * Test {@link FileHandlerService#listConvertedFiles()}.
   * <ul>
   *   <li>Given {@link CacheService} {@link CacheService#getPDFCache()} return {@link HashMap#HashMap()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#listConvertedFiles()}
   */
  @Test
  @DisplayName("Test listConvertedFiles(); given CacheService getPDFCache() return HashMap(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map FileHandlerService.listConvertedFiles()"})
  void testListConvertedFiles_givenCacheServiceGetPDFCacheReturnHashMap_thenReturnEmpty() {
    // Arrange
    when(cacheService.getPDFCache()).thenReturn(new HashMap<>());

    // Act
    Map<String, String> actualListConvertedFilesResult = fileHandlerService.listConvertedFiles();

    // Assert
    verify(cacheService).getPDFCache();
    assertTrue(actualListConvertedFilesResult.isEmpty());
  }

  /**
   * Test {@link FileHandlerService#listConvertedFiles()}.
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#listConvertedFiles()}
   */
  @Test
  @DisplayName("Test listConvertedFiles(); then throw EncryptedDocumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map FileHandlerService.listConvertedFiles()"})
  void testListConvertedFiles_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getPDFCache()).thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.listConvertedFiles());
    verify(cacheService).getPDFCache();
  }

  /**
   * Test {@link FileHandlerService#getConvertedFile(String)}.
   * <ul>
   *   <li>Then return {@code Pdf Cache}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#getConvertedFile(String)}
   */
  @Test
  @DisplayName("Test getConvertedFile(String); then return 'Pdf Cache'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String FileHandlerService.getConvertedFile(String)"})
  void testGetConvertedFile_thenReturnPdfCache() {
    // Arrange
    when(cacheService.getPDFCache(Mockito.<String>any())).thenReturn("Pdf Cache");

    // Act
    String actualConvertedFile = fileHandlerService.getConvertedFile("Key");

    // Assert
    verify(cacheService).getPDFCache(eq("Key"));
    assertEquals("Pdf Cache", actualConvertedFile);
  }

  /**
   * Test {@link FileHandlerService#getConvertedFile(String)}.
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#getConvertedFile(String)}
   */
  @Test
  @DisplayName("Test getConvertedFile(String); then throw EncryptedDocumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String FileHandlerService.getConvertedFile(String)"})
  void testGetConvertedFile_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getPDFCache(Mockito.<String>any())).thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.getConvertedFile("Key"));
    verify(cacheService).getPDFCache(eq("Key"));
  }

  /**
   * Test {@link FileHandlerService#getPdf2jpgCache(String)}.
   * <ul>
   *   <li>Then return intValue is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#getPdf2jpgCache(String)}
   */
  @Test
  @DisplayName("Test getPdf2jpgCache(String); then return intValue is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer FileHandlerService.getPdf2jpgCache(String)"})
  void testGetPdf2jpgCache_thenReturnIntValueIsOne() {
    // Arrange
    when(cacheService.getPdfImageCache(Mockito.<String>any())).thenReturn(1);

    // Act
    Integer actualPdf2jpgCache = fileHandlerService.getPdf2jpgCache("Key");

    // Assert
    verify(cacheService).getPdfImageCache(eq("Key"));
    assertEquals(1, actualPdf2jpgCache.intValue());
  }

  /**
   * Test {@link FileHandlerService#getPdf2jpgCache(String)}.
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#getPdf2jpgCache(String)}
   */
  @Test
  @DisplayName("Test getPdf2jpgCache(String); then throw EncryptedDocumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Integer FileHandlerService.getPdf2jpgCache(String)"})
  void testGetPdf2jpgCache_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getPdfImageCache(Mockito.<String>any())).thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.getPdf2jpgCache("Key"));
    verify(cacheService).getPdfImageCache(eq("Key"));
  }

  /**
   * Test {@link FileHandlerService#getFileNameFromPath(String)}.
   * <p>
   * Method under test: {@link FileHandlerService#getFileNameFromPath(String)}
   */
  @Test
  @DisplayName("Test getFileNameFromPath(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String FileHandlerService.getFileNameFromPath(String)"})
  void testGetFileNameFromPath() {
    // Arrange, Act and Assert
    assertEquals("Path", fileHandlerService.getFileNameFromPath("Path"));
  }

  /**
   * Test {@link FileHandlerService#addConvertedFile(String, String)}.
   * <ul>
   *   <li>Given {@link CacheService} {@link CacheService#putPDFCache(String, String)} does nothing.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#addConvertedFile(String, String)}
   */
  @Test
  @DisplayName("Test addConvertedFile(String, String); given CacheService putPDFCache(String, String) does nothing")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileHandlerService.addConvertedFile(String, String)"})
  void testAddConvertedFile_givenCacheServicePutPDFCacheDoesNothing() {
    // Arrange
    doNothing().when(cacheService).putPDFCache(Mockito.<String>any(), Mockito.<String>any());

    // Act
    fileHandlerService.addConvertedFile("foo.txt", "42");

    // Assert
    verify(cacheService).putPDFCache(eq("foo.txt"), eq("42"));
  }

  /**
   * Test {@link FileHandlerService#addConvertedFile(String, String)}.
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#addConvertedFile(String, String)}
   */
  @Test
  @DisplayName("Test addConvertedFile(String, String); then throw EncryptedDocumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileHandlerService.addConvertedFile(String, String)"})
  void testAddConvertedFile_thenThrowEncryptedDocumentException() {
    // Arrange
    doThrow(new EncryptedDocumentException("foo")).when(cacheService)
        .putPDFCache(Mockito.<String>any(), Mockito.<String>any());

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.addConvertedFile("foo.txt", "42"));
    verify(cacheService).putPDFCache(eq("foo.txt"), eq("42"));
  }

  /**
   * Test {@link FileHandlerService#addPdf2jpgCache(String, int)}.
   * <ul>
   *   <li>Given {@link CacheService} {@link CacheService#putPdfImageCache(String, int)} does nothing.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#addPdf2jpgCache(String, int)}
   */
  @Test
  @DisplayName("Test addPdf2jpgCache(String, int); given CacheService putPdfImageCache(String, int) does nothing")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileHandlerService.addPdf2jpgCache(String, int)"})
  void testAddPdf2jpgCache_givenCacheServicePutPdfImageCacheDoesNothing() {
    // Arrange
    doNothing().when(cacheService).putPdfImageCache(Mockito.<String>any(), anyInt());

    // Act
    fileHandlerService.addPdf2jpgCache("/directory/foo.txt", 10);

    // Assert
    verify(cacheService).putPdfImageCache(eq("/directory/foo.txt"), eq(10));
  }

  /**
   * Test {@link FileHandlerService#addPdf2jpgCache(String, int)}.
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#addPdf2jpgCache(String, int)}
   */
  @Test
  @DisplayName("Test addPdf2jpgCache(String, int); then throw EncryptedDocumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileHandlerService.addPdf2jpgCache(String, int)"})
  void testAddPdf2jpgCache_thenThrowEncryptedDocumentException() {
    // Arrange
    doThrow(new EncryptedDocumentException("foo")).when(cacheService).putPdfImageCache(Mockito.<String>any(), anyInt());

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.addPdf2jpgCache("/directory/foo.txt", 10));
    verify(cacheService).putPdfImageCache(eq("/directory/foo.txt"), eq(10));
  }

  /**
   * Test {@link FileHandlerService#getImgCache(String)}.
   * <ul>
   *   <li>Given {@link CacheService} {@link CacheService#getImgCache(String)} return {@link ArrayList#ArrayList()}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#getImgCache(String)}
   */
  @Test
  @DisplayName("Test getImgCache(String); given CacheService getImgCache(String) return ArrayList(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List FileHandlerService.getImgCache(String)"})
  void testGetImgCache_givenCacheServiceGetImgCacheReturnArrayList_thenReturnEmpty() {
    // Arrange
    when(cacheService.getImgCache(Mockito.<String>any())).thenReturn(new ArrayList<>());

    // Act
    List<String> actualImgCache = fileHandlerService.getImgCache("Compress File Key");

    // Assert
    verify(cacheService).getImgCache(eq("Compress File Key"));
    assertTrue(actualImgCache.isEmpty());
  }

  /**
   * Test {@link FileHandlerService#getImgCache(String)}.
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#getImgCache(String)}
   */
  @Test
  @DisplayName("Test getImgCache(String); then throw EncryptedDocumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List FileHandlerService.getImgCache(String)"})
  void testGetImgCache_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getImgCache(Mockito.<String>any())).thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.getImgCache("Compress File Key"));
    verify(cacheService).getImgCache(eq("Compress File Key"));
  }

  /**
   * Test {@link FileHandlerService#putImgCache(String, List)}.
   * <ul>
   *   <li>Given {@code 42}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#putImgCache(String, List)}
   */
  @Test
  @DisplayName("Test putImgCache(String, List); given '42'; when ArrayList() add '42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileHandlerService.putImgCache(String, List)"})
  void testPutImgCache_given42_whenArrayListAdd42() {
    // Arrange
    doNothing().when(cacheService).putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());

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
   * <ul>
   *   <li>Given {@link CacheService} {@link CacheService#putImgCache(String, List)} does nothing.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#putImgCache(String, List)}
   */
  @Test
  @DisplayName("Test putImgCache(String, List); given CacheService putImgCache(String, List) does nothing; when ArrayList()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileHandlerService.putImgCache(String, List)"})
  void testPutImgCache_givenCacheServicePutImgCacheDoesNothing_whenArrayList() {
    // Arrange
    doNothing().when(cacheService).putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());

    // Act
    fileHandlerService.putImgCache("File Key", new ArrayList<>());

    // Assert
    verify(cacheService).putImgCache(eq("File Key"), isA(List.class));
  }

  /**
   * Test {@link FileHandlerService#putImgCache(String, List)}.
   * <ul>
   *   <li>Given {@code foo}.</li>
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#putImgCache(String, List)}
   */
  @Test
  @DisplayName("Test putImgCache(String, List); given 'foo'; when ArrayList() add 'foo'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileHandlerService.putImgCache(String, List)"})
  void testPutImgCache_givenFoo_whenArrayListAddFoo() {
    // Arrange
    doNothing().when(cacheService).putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());

    ArrayList<String> imgs = new ArrayList<>();
    imgs.add("foo");

    // Act
    fileHandlerService.putImgCache("File Key", imgs);

    // Assert
    verify(cacheService).putImgCache(eq("File Key"), isA(List.class));
  }

  /**
   * Test {@link FileHandlerService#putImgCache(String, List)}.
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#putImgCache(String, List)}
   */
  @Test
  @DisplayName("Test putImgCache(String, List); then throw EncryptedDocumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileHandlerService.putImgCache(String, List)"})
  void testPutImgCache_thenThrowEncryptedDocumentException() {
    // Arrange
    doThrow(new EncryptedDocumentException("foo")).when(cacheService)
        .putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.putImgCache("File Key", new ArrayList<>()));
    verify(cacheService).putImgCache(eq("File Key"), isA(List.class));
  }

  /**
   * Test {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}.
   * <ul>
   *   <li>Given {@code false}.</li>
   *   <li>When {@link FileAttribute#FileAttribute()} UsePasswordCache is {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}
   */
  @Test
  @DisplayName("Test pdf2jpg(String, String, String, FileAttribute); given 'false'; when FileAttribute() UsePasswordCache is 'false'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List FileHandlerService.pdf2jpg(String, String, String, FileAttribute)"})
  void testPdf2jpg_givenFalse_whenFileAttributeUsePasswordCacheIsFalse() throws Exception {
    // Arrange
    when(cacheService.getPdfImageCache(Mockito.<String>any())).thenThrow(new EncryptedDocumentException("foo"));

    FileAttribute fileAttribute = new FileAttribute();
    fileAttribute.setUsePasswordCache(false);
    fileAttribute.setFilePassword(null);

    // Act and Assert
    assertThrows(EncryptedDocumentException.class,
        () -> fileHandlerService.pdf2jpg("foo.txt", "/directory/foo.txt", "Pdf Name", fileAttribute));
    verify(cacheService).getPdfImageCache(eq("/directory/foo.txt"));
  }

  /**
   * Test {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}.
   * <ul>
   *   <li>Given {@code iloveyou}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}
   */
  @Test
  @DisplayName("Test pdf2jpg(String, String, String, FileAttribute); given 'iloveyou'; then return 'null'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List FileHandlerService.pdf2jpg(String, String, String, FileAttribute)"})
  void testPdf2jpg_givenIloveyou_thenReturnNull() throws Exception {
    // Arrange
    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getUsePasswordCache()).thenReturn(true);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getFilePassword()).thenReturn("iloveyou");

    // Act
    List<String> actualPdf2jpgResult = fileHandlerService.pdf2jpg("foo.txt", "/directory/foo.txt", "Pdf Name",
        fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getFilePassword();
    verify(fileAttribute).getUsePasswordCache();
    assertNull(actualPdf2jpgResult);
  }

  /**
   * Test {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}.
   * <ul>
   *   <li>When {@link FileAttribute#FileAttribute()} UsePasswordCache is {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#pdf2jpg(String, String, String, FileAttribute)}
   */
  @Test
  @DisplayName("Test pdf2jpg(String, String, String, FileAttribute); when FileAttribute() UsePasswordCache is 'true'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"List FileHandlerService.pdf2jpg(String, String, String, FileAttribute)"})
  void testPdf2jpg_whenFileAttributeUsePasswordCacheIsTrue() throws Exception {
    // Arrange
    when(cacheService.getPdfImageCache(Mockito.<String>any())).thenThrow(new EncryptedDocumentException("foo"));

    FileAttribute fileAttribute = new FileAttribute();
    fileAttribute.setUsePasswordCache(true);
    fileAttribute.setFilePassword(null);

    // Act and Assert
    assertThrows(EncryptedDocumentException.class,
        () -> fileHandlerService.pdf2jpg("foo.txt", "/directory/foo.txt", "Pdf Name", fileAttribute));
    verify(cacheService).getPdfImageCache(eq("/directory/foo.txt"));
  }

  /**
   * Test {@link FileHandlerService#getSubString(String, String)}.
   * <ul>
   *   <li>Then return {@code ortedEncodingException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#getSubString(String, String)}
   */
  @Test
  @DisplayName("Test getSubString(String, String); then return 'ortedEncodingException'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String FileHandlerService.getSubString(String, String)"})
  void testGetSubString_thenReturnOrtedEncodingException() {
    // Arrange, Act and Assert
    assertEquals("ortedEncodingException", FileHandlerService.getSubString("UnsupportedEncodingException", "Pos Str"));
  }

  /**
   * Test {@link FileHandlerService#listConvertedMedias()}.
   * <ul>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#listConvertedMedias()}
   */
  @Test
  @DisplayName("Test listConvertedMedias(); then return Empty")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map FileHandlerService.listConvertedMedias()"})
  void testListConvertedMedias_thenReturnEmpty() {
    // Arrange
    when(cacheService.getMediaConvertCache()).thenReturn(new HashMap<>());

    // Act
    Map<String, String> actualListConvertedMediasResult = fileHandlerService.listConvertedMedias();

    // Assert
    verify(cacheService).getMediaConvertCache();
    assertTrue(actualListConvertedMediasResult.isEmpty());
  }

  /**
   * Test {@link FileHandlerService#listConvertedMedias()}.
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#listConvertedMedias()}
   */
  @Test
  @DisplayName("Test listConvertedMedias(); then throw EncryptedDocumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map FileHandlerService.listConvertedMedias()"})
  void testListConvertedMedias_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getMediaConvertCache()).thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.listConvertedMedias());
    verify(cacheService).getMediaConvertCache();
  }

  /**
   * Test {@link FileHandlerService#addConvertedMedias(String, String)}.
   * <ul>
   *   <li>Given {@link CacheService} {@link CacheService#putMediaConvertCache(String, String)} does nothing.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#addConvertedMedias(String, String)}
   */
  @Test
  @DisplayName("Test addConvertedMedias(String, String); given CacheService putMediaConvertCache(String, String) does nothing")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileHandlerService.addConvertedMedias(String, String)"})
  void testAddConvertedMedias_givenCacheServicePutMediaConvertCacheDoesNothing() {
    // Arrange
    doNothing().when(cacheService).putMediaConvertCache(Mockito.<String>any(), Mockito.<String>any());

    // Act
    fileHandlerService.addConvertedMedias("foo.txt", "42");

    // Assert
    verify(cacheService).putMediaConvertCache(eq("foo.txt"), eq("42"));
  }

  /**
   * Test {@link FileHandlerService#addConvertedMedias(String, String)}.
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#addConvertedMedias(String, String)}
   */
  @Test
  @DisplayName("Test addConvertedMedias(String, String); then throw EncryptedDocumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void FileHandlerService.addConvertedMedias(String, String)"})
  void testAddConvertedMedias_thenThrowEncryptedDocumentException() {
    // Arrange
    doThrow(new EncryptedDocumentException("foo")).when(cacheService)
        .putMediaConvertCache(Mockito.<String>any(), Mockito.<String>any());

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.addConvertedMedias("foo.txt", "42"));
    verify(cacheService).putMediaConvertCache(eq("foo.txt"), eq("42"));
  }

  /**
   * Test {@link FileHandlerService#getConvertedMedias(String)}.
   * <ul>
   *   <li>Then return {@code Media Convert Cache}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#getConvertedMedias(String)}
   */
  @Test
  @DisplayName("Test getConvertedMedias(String); then return 'Media Convert Cache'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String FileHandlerService.getConvertedMedias(String)"})
  void testGetConvertedMedias_thenReturnMediaConvertCache() {
    // Arrange
    when(cacheService.getMediaConvertCache(Mockito.<String>any())).thenReturn("Media Convert Cache");

    // Act
    String actualConvertedMedias = fileHandlerService.getConvertedMedias("Key");

    // Assert
    verify(cacheService).getMediaConvertCache(eq("Key"));
    assertEquals("Media Convert Cache", actualConvertedMedias);
  }

  /**
   * Test {@link FileHandlerService#getConvertedMedias(String)}.
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileHandlerService#getConvertedMedias(String)}
   */
  @Test
  @DisplayName("Test getConvertedMedias(String); then throw EncryptedDocumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String FileHandlerService.getConvertedMedias(String)"})
  void testGetConvertedMedias_thenThrowEncryptedDocumentException() {
    // Arrange
    when(cacheService.getMediaConvertCache(Mockito.<String>any())).thenThrow(new EncryptedDocumentException("foo"));

    // Act and Assert
    assertThrows(EncryptedDocumentException.class, () -> fileHandlerService.getConvertedMedias("Key"));
    verify(cacheService).getMediaConvertCache(eq("Key"));
  }
}
