package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {BpmnFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class BpmnFilePreviewImplDiffblueTest {
  @Autowired
  private BpmnFilePreviewImpl bpmnFilePreviewImpl;

  @MockBean(name = "commonPreview")
  private CommonPreviewImpl commonPreviewImpl;

  /**
   * Method under test:
   * {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle() {
    // Arrange
    when(commonPreviewImpl.filePreviewHandle(Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = bpmnFilePreviewImpl.filePreviewHandle("https://example.org/example", model,
        new FileAttribute());

    // Assert
    verify(commonPreviewImpl).filePreviewHandle(eq("https://example.org/example"), isA(Model.class),
        isA(FileAttribute.class));
    assertEquals("bpmn", actualFilePreviewHandleResult);
  }
}
