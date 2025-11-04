package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import cn.keking.model.FileAttribute;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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
   * Test {@link OtherFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   * <ul>
   *   <li>When {@link FileAttribute#FileAttribute()}.</li>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link OtherFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute); when FileAttribute(); then ConcurrentModel() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OtherFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_whenFileAttribute_thenConcurrentModelSizeIsOne() {
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
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, String)} with {@code model}, {@code errMsg}.
   * <ul>
   *   <li>When {@code Err Msg}.</li>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, String)}
   */
  @Test
  @DisplayName("Test notSupportedFile(Model, String) with 'model', 'errMsg'; when 'Err Msg'; then ConcurrentModel() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, String)"})
  void testNotSupportedFileWithModelErrMsg_whenErrMsg_thenConcurrentModelSizeIsTwo() {
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
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, String)} with {@code model}, {@code errMsg}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, String)}
   */
  @Test
  @DisplayName("Test notSupportedFile(Model, String) with 'model', 'errMsg'; when 'null'; then ConcurrentModel() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, String)"})
  void testNotSupportedFileWithModelErrMsg_whenNull_thenConcurrentModelSizeIsOne() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualNotSupportedFileResult = otherFilePreviewImpl.notSupportedFile(model, null);

    // Assert
    assertEquals(1, model.size());
    assertEquals("未知", model.get("fileType"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
  }

  /**
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, FileAttribute, String)} with {@code model}, {@code fileAttribute}, {@code errMsg}.
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, FileAttribute, String)}
   */
  @Test
  @DisplayName("Test notSupportedFile(Model, FileAttribute, String) with 'model', 'fileAttribute', 'errMsg'; then ConcurrentModel() size is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, FileAttribute, String)"})
  void testNotSupportedFileWithModelFileAttributeErrMsg_thenConcurrentModelSizeIsOne() {
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
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)} with {@code model}, {@code fileType}, {@code errMsg}.
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is two.</li>
   * </ul>
   * <p>
   * Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)}
   */
  @Test
  @DisplayName("Test notSupportedFile(Model, String, String) with 'model', 'fileType', 'errMsg'; then ConcurrentModel() size is two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, String, String)"})
  void testNotSupportedFileWithModelFileTypeErrMsg_thenConcurrentModelSizeIsTwo() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    otherFilePreviewImpl.notSupportedFile(model, "File Type", "Err Msg");

    // Assert
    assertEquals(2, model.size());
    assertEquals("Err Msg", model.get("msg"));
    assertEquals("File Type", model.get("fileType"));
  }

  /**
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)} with {@code model}, {@code fileType}, {@code errMsg}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code fileNotSupported}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)}
   */
  @Test
  @DisplayName("Test notSupportedFile(Model, String, String) with 'model', 'fileType', 'errMsg'; when 'null'; then return 'fileNotSupported'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, String, String)"})
  void testNotSupportedFileWithModelFileTypeErrMsg_whenNull_thenReturnFileNotSupported() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act and Assert
    assertEquals("fileNotSupported", otherFilePreviewImpl.notSupportedFile(model, (String) null, null));
    assertTrue(model.isEmpty());
  }
}
