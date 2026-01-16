package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import cn.keking.utils.DownloadUtilsFactory;
import cn.keking.utils.FtpUtilsFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import org.apache.poi.EncryptedDocumentException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {PdfFilePreviewImpl.class})
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@PropertySource("classpath:application-test.properties")
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
   *   <li>Then return {@code pdf}.
   * </ul>
   *
   * <p>Method under test: {@link PdfFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given FileHandlerService; when 'null'; then return 'pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PdfFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_givenFileHandlerService_whenNull_thenReturnPdf() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getOfficePreviewType()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getOriginFilePath()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getOutFilePath()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    String actualFilePreviewHandleResult =
        pdfFilePreviewImpl.filePreviewHandle(null, model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOfficePreviewType();
    verify(fileAttribute).getOriginFilePath();
    verify(fileAttribute).getOutFilePath();
    assertEquals("pdf", actualFilePreviewHandleResult);
    assertTrue(model.isEmpty());
  }

  /**
   * Test {@link PdfFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code pdfUrl} is {@code
   *       https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link PdfFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() 'pdfUrl' is 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PdfFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenConcurrentModelPdfUrlIsHttpsExampleOrgExample() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getOfficePreviewType()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getOriginFilePath()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getOutFilePath()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    pdfFilePreviewImpl.filePreviewHandle("https://example.org/example", model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOfficePreviewType();
    verify(fileAttribute).getOriginFilePath();
    verify(fileAttribute).getOutFilePath();
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("pdfUrl"));
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
    when(fileHandlerService.listConvertedFiles())
        .thenThrow(new EncryptedDocumentException(FtpUtilsFactory.createValidFtpUrl()));
    String url = FtpUtilsFactory.createValidFtpUrl();
    ConcurrentModel model = new ConcurrentModel();

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () ->
            pdfFilePreviewImpl.filePreviewHandle(
                url, model, DownloadUtilsFactory.createValidFileAttribute()));
    verify(fileHandlerService).listConvertedFiles();
  }
}
