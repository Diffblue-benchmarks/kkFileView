package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {OtherFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class OtherFilePreviewImplDiffblueTest {
  @Autowired
  private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Method under test:
   * {@link OtherFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = otherFilePreviewImpl.filePreviewHandle("https://example.org/example", model,
        new FileAttribute());

    // Assert
    assertEquals(1, model.size());
    assertEquals("系统还不支持该格式文件的在线预览", model.get("msg"));
    assertEquals("fileNotSupported", actualFilePreviewHandleResult);
  }

  /**
   * Method under test:
   * {@link OtherFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle2() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();
    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getSuffix()).thenReturn("Suffix");

    // Act
    String actualFilePreviewHandleResult = otherFilePreviewImpl.filePreviewHandle("https://example.org/example", model,
        fileAttribute);

    // Assert
    verify(fileAttribute).getSuffix();
    assertEquals(2, model.size());
    assertEquals("Suffix", model.get("fileType"));
    assertEquals("系统还不支持该格式文件的在线预览", model.get("msg"));
    assertEquals("fileNotSupported", actualFilePreviewHandleResult);
  }

  /**
   * Method under test:
   * {@link OtherFilePreviewImpl#notSupportedFile(Model, FileAttribute, String)}
   */
  @Test
  void testNotSupportedFile() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualNotSupportedFileResult = otherFilePreviewImpl.notSupportedFile(model, new FileAttribute(), "Err Msg");

    // Assert
    assertEquals(1, model.size());
    assertEquals("Err Msg", model.get("msg"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
  }

  /**
   * Method under test:
   * {@link OtherFilePreviewImpl#notSupportedFile(Model, FileAttribute, String)}
   */
  @Test
  void testNotSupportedFile2() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();
    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getSuffix()).thenReturn("Suffix");

    // Act
    String actualNotSupportedFileResult = otherFilePreviewImpl.notSupportedFile(model, fileAttribute, "Err Msg");

    // Assert
    verify(fileAttribute).getSuffix();
    assertEquals(2, model.size());
    assertEquals("Err Msg", model.get("msg"));
    assertEquals("Suffix", model.get("fileType"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
  }

  /**
   * Method under test:
   * {@link OtherFilePreviewImpl#notSupportedFile(Model, String)}
   */
  @Test
  void testNotSupportedFile3() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualNotSupportedFileResult = otherFilePreviewImpl.notSupportedFile(model, "Err Msg");

    // Assert
    assertEquals(2, model.size());
    assertEquals("Err Msg", model.get("msg"));
    assertEquals("未知", model.get("fileType"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
  }

  /**
   * Method under test:
   * {@link OtherFilePreviewImpl#notSupportedFile(Model, String)}
   */
  @Test
  void testNotSupportedFile4() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualNotSupportedFileResult = otherFilePreviewImpl.notSupportedFile(model, "");

    // Assert
    assertEquals(2, model.size());
    assertEquals("", model.get("msg"));
    assertEquals("未知", model.get("fileType"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
  }

  /**
   * Method under test:
   * {@link OtherFilePreviewImpl#notSupportedFile(Model, String)}
   */
  @Test
  void testNotSupportedFile5() {
    // Arrange
    Function<String, Object> function = mock(Function.class);
    when(function.apply(Mockito.<String>any())).thenReturn("Apply");

    ConcurrentModel model = new ConcurrentModel();
    model.computeIfAbsent("未知", function);

    // Act
    String actualNotSupportedFileResult = otherFilePreviewImpl.notSupportedFile(model, "Err Msg");

    // Assert
    verify(function).apply(eq("未知"));
    assertEquals(3, model.size());
    assertEquals("Err Msg", model.get("msg"));
    assertEquals("未知", model.get("fileType"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
    assertTrue(model.containsKey("未知"));
  }

  /**
   * Method under test:
   * {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)}
   */
  @Test
  void testNotSupportedFile6() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualNotSupportedFileResult = otherFilePreviewImpl.notSupportedFile(model, "File Type", "Err Msg");

    // Assert
    assertEquals(2, model.size());
    assertEquals("Err Msg", model.get("msg"));
    assertEquals("File Type", model.get("fileType"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
  }

  /**
   * Method under test:
   * {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)}
   */
  @Test
  void testNotSupportedFile7() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualNotSupportedFileResult = otherFilePreviewImpl.notSupportedFile(model, "", "Err Msg");

    // Assert
    assertEquals(2, model.size());
    assertEquals("", model.get("fileType"));
    assertEquals("Err Msg", model.get("msg"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
  }

  /**
   * Method under test:
   * {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)}
   */
  @Test
  void testNotSupportedFile8() {
    // Arrange
    Function<String, Object> function = mock(Function.class);
    when(function.apply(Mockito.<String>any())).thenReturn("Apply");

    ConcurrentModel model = new ConcurrentModel();
    model.computeIfAbsent("fileType", function);

    // Act
    String actualNotSupportedFileResult = otherFilePreviewImpl.notSupportedFile(model, "File Type", "Err Msg");

    // Assert
    verify(function).apply(eq("fileType"));
    assertEquals(2, model.size());
    assertEquals("Err Msg", model.get("msg"));
    assertEquals("File Type", model.get("fileType"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
  }
}
