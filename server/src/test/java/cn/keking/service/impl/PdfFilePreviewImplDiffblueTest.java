package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import com.diffblue.cover.annotations.MethodsUnderTest;
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
  @MockBean
  private FileHandlerService fileHandlerService;

  @MockBean
  private OtherFilePreviewImpl otherFilePreviewImpl;

  @Autowired
  private PdfFilePreviewImpl pdfFilePreviewImpl;

  /**
   * Test {@link PdfFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   * <ul>
   *   <li>Given {@code Office Preview Type}.</li>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PdfFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute); given 'Office Preview Type'; when 'null'; then return 'pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String PdfFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_givenOfficePreviewType_whenNull_thenReturnPdf() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();
    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getName()).thenReturn("Name");
    when(fileAttribute.getOfficePreviewType()).thenReturn("Office Preview Type");
    when(fileAttribute.getOriginFilePath()).thenReturn("/directory/foo.txt");
    when(fileAttribute.getOutFilePath()).thenReturn("/directory/foo.txt");

    // Act
    String actualFilePreviewHandleResult = pdfFilePreviewImpl.filePreviewHandle(null, model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOfficePreviewType();
    verify(fileAttribute).getOriginFilePath();
    verify(fileAttribute).getOutFilePath();
    assertEquals("pdf", actualFilePreviewHandleResult);
    assertTrue(model.isEmpty());
  }
}
