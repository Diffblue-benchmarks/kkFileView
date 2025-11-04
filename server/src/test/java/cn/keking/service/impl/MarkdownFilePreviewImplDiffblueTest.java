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

@ContextConfiguration(classes = {MarkdownFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class MarkdownFilePreviewImplDiffblueTest {
  @Autowired
  private MarkdownFilePreviewImpl markdownFilePreviewImpl;

  @MockBean
  private SimTextFilePreviewImpl simTextFilePreviewImpl;

  /**
   * Method under test:
   * {@link MarkdownFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle() {
    // Arrange
    when(simTextFilePreviewImpl.filePreviewHandle(Mockito.<String>any(), Mockito.<Model>any(),
        Mockito.<FileAttribute>any())).thenReturn("File Preview Handle");
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = markdownFilePreviewImpl.filePreviewHandle("https://example.org/example",
        model, new FileAttribute());

    // Assert
    verify(simTextFilePreviewImpl).filePreviewHandle(eq("https://example.org/example"), isA(Model.class),
        isA(FileAttribute.class));
    assertEquals("markdown", actualFilePreviewHandleResult);
  }
}
