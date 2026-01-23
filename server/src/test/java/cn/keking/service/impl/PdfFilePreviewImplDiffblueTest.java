package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import cn.keking.service.FileHandlerService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.apache.poi.EncryptedDocumentException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {PdfFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class PdfFilePreviewImplDiffblueTest {
  @MockBean private FileHandlerService fileHandlerService;

  @MockBean private OtherFilePreviewImpl otherFilePreviewImpl;

  @Autowired private PdfFilePreviewImpl pdfFilePreviewImpl;

  /**
   * Test {@link PdfFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@link FileHandlerService}.
   *   <li>When {@code null}.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link PdfFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given FileHandlerService; when 'null'; then ConcurrentModel() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PdfFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_givenFileHandlerService_whenNull_thenConcurrentModelEmpty() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute =
        new FileAttribute(FileType.PICTURE, "Suffix", "Name", "https://example.org/example");
    fileAttribute.setOfficePreviewType("Office Preview Type");
    fileAttribute.setCompressFile(false);
    fileAttribute.setOutFilePath(".");
    fileAttribute.setUsePasswordCache(false);

    // Act and Assert
    assertEquals("pdf", pdfFilePreviewImpl.filePreviewHandle(null, model, fileAttribute));
    assertTrue(model.isEmpty());
  }

  /**
   * Test {@link PdfFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then calls {@link FileAttribute#forceUpdatedCache()}.
   * </ul>
   *
   * <p>Method under test: {@link PdfFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then calls forceUpdatedCache()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PdfFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenCallsForceUpdatedCache() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    PdfFilePreviewImpl pdfFilePreviewImpl =
        new PdfFilePreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getName()).thenReturn("Name");
    when(fileAttribute.getOfficePreviewType()).thenReturn("Office Preview Type");
    when(fileAttribute.getOriginFilePath()).thenReturn("/directory/foo.txt");
    when(fileAttribute.getOutFilePath()).thenReturn("/directory/foo.txt");

    // Act
    String actualFilePreviewHandleResult =
        pdfFilePreviewImpl.filePreviewHandle("https://example.org/example", model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOfficePreviewType();
    verify(fileAttribute).getOriginFilePath();
    verify(fileAttribute).getOutFilePath();
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("pdfUrl"));
    assertEquals("pdf", actualFilePreviewHandleResult);
  }

  /**
   * Test {@link PdfFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PdfFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PdfFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenThrowEncryptedDocumentException() {
    // Arrange
    when(fileHandlerService.listConvertedFiles()).thenThrow(new EncryptedDocumentException("+"));
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute =
        new FileAttribute(FileType.PICTURE, "Suffix", "Name", "https://example.org/example");
    fileAttribute.setOfficePreviewType(OfficeFilePreviewImpl.OFFICE_PREVIEW_TYPE_IMAGE);
    fileAttribute.setCompressFile(false);
    fileAttribute.setOutFilePath(".");
    fileAttribute.setUsePasswordCache(false);

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () ->
            pdfFilePreviewImpl.filePreviewHandle(
                "https://example.org/example", model, fileAttribute));
    verify(fileHandlerService).listConvertedFiles();
  }

  /**
   * Test {@link PdfFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>When {@link FileAttribute#FileAttribute()}.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link PdfFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); when FileAttribute(); then ConcurrentModel() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PdfFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_whenFileAttribute_thenConcurrentModelSizeIsOne() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    pdfFilePreviewImpl.filePreviewHandle("https://example.org/example", model, new FileAttribute());

    // Assert
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("pdfUrl"));
  }
}
