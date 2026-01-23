package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import cn.keking.service.FileHandlerService;
import cn.keking.service.OfficeToPdfService;
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

@ContextConfiguration(classes = {OfficeFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class OfficeFilePreviewImplDiffblueTest {
  @MockBean private FileHandlerService fileHandlerService;

  @Autowired private OfficeFilePreviewImpl officeFilePreviewImpl;

  @MockBean private OfficeToPdfService officeToPdfService;

  @MockBean private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Test {@link OfficeFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String OfficeFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_thenThrowEncryptedDocumentException() {
    // Arrange
    when(fileHandlerService.listConvertedFiles()).thenThrow(new EncryptedDocumentException("+"));
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute =
        new FileAttribute(FileType.PICTURE, "xlsx", "Name", "https://example.org/example");
    fileAttribute.setOfficePreviewType("html");
    fileAttribute.setFilePassword("not empty");
    fileAttribute.setOutFilePath("not blank");
    fileAttribute.setHtmlView(false);
    fileAttribute.setCompressFile(false);
    fileAttribute.setUsePasswordCache(false);

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> officeFilePreviewImpl.filePreviewHandle("not blank", model, fileAttribute));
    verify(fileHandlerService).listConvertedFiles();
  }
}
