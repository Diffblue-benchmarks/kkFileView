package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {TiffFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class TiffFilePreviewImplDiffblueTest {
  @MockBean
  private FileHandlerService fileHandlerService;

  @MockBean
  private OtherFilePreviewImpl otherFilePreviewImpl;

  @Autowired
  private TiffFilePreviewImpl tiffFilePreviewImpl;

  /**
   * Method under test:
   * {@link TiffFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = tiffFilePreviewImpl.filePreviewHandle("https://example.org/example", model,
        new FileAttribute());

    // Assert
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("currentUrl"));
    assertEquals("tiff", actualFilePreviewHandleResult);
  }

  /**
   * Method under test:
   * {@link TiffFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle2() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();
    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getCacheName()).thenReturn("Cache Name");
    when(fileAttribute.getName()).thenReturn("Name");
    when(fileAttribute.getOutFilePath()).thenReturn("/directory/foo.txt");

    // Act
    String actualFilePreviewHandleResult = tiffFilePreviewImpl.filePreviewHandle(null, model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getCacheName();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOutFilePath();
    assertEquals("tiff", actualFilePreviewHandleResult);
    assertTrue(model.isEmpty());
  }
}
