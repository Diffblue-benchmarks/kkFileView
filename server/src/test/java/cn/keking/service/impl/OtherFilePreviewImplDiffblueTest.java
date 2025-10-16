package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import cn.keking.model.FileAttribute;
import cn.keking.service.OfficeToPdfServiceTestFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
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
  @Autowired private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, FileAttribute, String)} with {@code
   * model}, {@code fileAttribute}, {@code errMsg}.
   *
   * <p>Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, FileAttribute,
   * String)}
   */
  @Test
  @DisplayName(
      "Test notSupportedFile(Model, FileAttribute, String) with 'model', 'fileAttribute', 'errMsg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, FileAttribute, String)"})
  void testNotSupportedFileWithModelFileAttributeErrMsg() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = OfficeToPdfServiceTestFactory.createFileAttribute();
    fileAttribute.setSuffix("not blank");

    // Act
    String actualNotSupportedFileResult =
        otherFilePreviewImpl.notSupportedFile(model, fileAttribute, "");

    // Assert
    assertEquals(2, model.size());
    assertEquals("", model.get("msg"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
    assertEquals("not blank", model.get("fileType"));
  }

  /**
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, FileAttribute, String)} with {@code
   * model}, {@code fileAttribute}, {@code errMsg}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code msg} is {@code Err Msg}.
   * </ul>
   *
   * <p>Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, FileAttribute,
   * String)}
   */
  @Test
  @DisplayName(
      "Test notSupportedFile(Model, FileAttribute, String) with 'model', 'fileAttribute', 'errMsg'; then ConcurrentModel() 'msg' is 'Err Msg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, FileAttribute, String)"})
  void testNotSupportedFileWithModelFileAttributeErrMsg_thenConcurrentModelMsgIsErrMsg() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualNotSupportedFileResult =
        otherFilePreviewImpl.notSupportedFile(
            model, OfficeToPdfServiceTestFactory.createFileAttribute(), "Err Msg");

    // Assert
    assertEquals(2, model.size());
    assertEquals("Err Msg", model.get("msg"));
    assertEquals("docx", model.get("fileType"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
  }

  /**
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)} with {@code model},
   * {@code fileType}, {@code errMsg}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code msg} is empty string.
   * </ul>
   *
   * <p>Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)}
   */
  @Test
  @DisplayName(
      "Test notSupportedFile(Model, String, String) with 'model', 'fileType', 'errMsg'; then ConcurrentModel() 'msg' is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, String, String)"})
  void testNotSupportedFileWithModelFileTypeErrMsg_thenConcurrentModelMsgIsEmptyString() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualNotSupportedFileResult =
        otherFilePreviewImpl.notSupportedFile(model, "not blank", "");

    // Assert
    assertEquals(2, model.size());
    assertEquals("", model.get("msg"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
    assertEquals("not blank", model.get("fileType"));
  }

  /**
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)} with {@code model},
   * {@code fileType}, {@code errMsg}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code msg} is {@code Err Msg}.
   * </ul>
   *
   * <p>Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)}
   */
  @Test
  @DisplayName(
      "Test notSupportedFile(Model, String, String) with 'model', 'fileType', 'errMsg'; then ConcurrentModel() 'msg' is 'Err Msg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, String, String)"})
  void testNotSupportedFileWithModelFileTypeErrMsg_thenConcurrentModelMsgIsErrMsg() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualNotSupportedFileResult =
        otherFilePreviewImpl.notSupportedFile(model, "File Type", "Err Msg");

    // Assert
    assertEquals(2, model.size());
    assertEquals("Err Msg", model.get("msg"));
    assertEquals("File Type", model.get("fileType"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
  }
}
