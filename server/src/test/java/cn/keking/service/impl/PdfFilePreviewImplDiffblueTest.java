package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import cn.keking.service.FileHandlerService;
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
   * Method under test:
   * {@link PdfFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = pdfFilePreviewImpl.filePreviewHandle("https://example.org/example", model,
        new FileAttribute(FileType.PICTURE, "+", "+", "https://example.org/example", "+"));

    // Assert
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("pdfUrl"));
    assertEquals("pdf", actualFilePreviewHandleResult);
  }

  /**
   * Method under test:
   * {@link PdfFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle2() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();
    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getName()).thenReturn("Name");
    when(fileAttribute.getOfficePreviewType()).thenReturn("Office Preview Type");
    when(fileAttribute.getOriginFilePath()).thenReturn("/directory/foo.txt");
    when(fileAttribute.getOutFilePath()).thenReturn("/directory/foo.txt");

    // Act
    String actualFilePreviewHandleResult = pdfFilePreviewImpl.filePreviewHandle("https://example.org/example", model,
        fileAttribute);

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
   * Method under test:
   * {@link PdfFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle3() {
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
