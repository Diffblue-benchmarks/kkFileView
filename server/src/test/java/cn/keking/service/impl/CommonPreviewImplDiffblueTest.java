package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
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

@ContextConfiguration(classes = {CommonPreviewImpl.class})
@ExtendWith(SpringExtension.class)
class CommonPreviewImplDiffblueTest {
  @Autowired
  private CommonPreviewImpl commonPreviewImpl;

  @MockBean
  private FileHandlerService fileHandlerService;

  @MockBean
  private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Method under test:
   * {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = commonPreviewImpl.filePreviewHandle("https://example.org/example", model,
        new FileAttribute());

    // Assert
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("currentUrl"));
    assertNull(actualFilePreviewHandleResult);
  }

  /**
   * Method under test:
   * {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle2() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act and Assert
    assertNull(commonPreviewImpl.filePreviewHandle(null, model, new FileAttribute()));
    assertTrue(model.isEmpty());
  }

  /**
   * Method under test:
   * {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle3() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = commonPreviewImpl.filePreviewHandle("https://example.org/example", model,
        mock(FileAttribute.class));

    // Assert
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("currentUrl"));
    assertNull(actualFilePreviewHandleResult);
  }
}
