package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import cn.keking.model.FileAttribute;
import cn.keking.utils.FtpUtilsFactory;
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
   * Test {@link OtherFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code fileType} is empty string.
   * </ul>
   *
   * <p>Method under test: {@link OtherFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given empty string; then ConcurrentModel() 'fileType' is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OtherFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_givenEmptyString_thenConcurrentModelFileTypeIsEmptyString() {
    // Arrange
    String url = FtpUtilsFactory.createValidFtpUrl();
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = SimTextFilePreviewImplFactory.createFileAttribute();
    fileAttribute.setSuffix("");

    // Act
    String actualFilePreviewHandleResult =
        otherFilePreviewImpl.filePreviewHandle(url, model, fileAttribute);

    // Assert
    assertEquals(2, model.size());
    assertEquals("", model.get("fileType"));
    assertEquals("系统还不支持该格式文件的在线预览", model.get("msg"));
    assertEquals("fileNotSupported", actualFilePreviewHandleResult);
  }

  /**
   * Test {@link OtherFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>When createFileAttribute.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code fileType} is {@code txt}.
   * </ul>
   *
   * <p>Method under test: {@link OtherFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); when createFileAttribute; then ConcurrentModel() 'fileType' is 'txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OtherFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_whenCreateFileAttribute_thenConcurrentModelFileTypeIsTxt() {
    // Arrange
    String url = FtpUtilsFactory.createValidFtpUrl();
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult =
        otherFilePreviewImpl.filePreviewHandle(
            url, model, SimTextFilePreviewImplFactory.createFileAttribute());

    // Assert
    assertEquals(2, model.size());
    assertEquals("系统还不支持该格式文件的在线预览", model.get("msg"));
    assertEquals("fileNotSupported", actualFilePreviewHandleResult);
    assertEquals("txt", model.get("fileType"));
  }

  /**
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, String)} with {@code model}, {@code
   * errMsg}.
   *
   * <p>Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, String)}
   */
  @Test
  @DisplayName("Test notSupportedFile(Model, String) with 'model', 'errMsg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, String)"})
  void testNotSupportedFileWithModelErrMsg() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualNotSupportedFileResult =
        otherFilePreviewImpl.notSupportedFile(model, FtpUtilsFactory.createValidFtpUrl());

    // Assert
    assertEquals(2, model.size());
    assertEquals("未知", model.get("fileType"));
    assertEquals("fileNotSupported", actualNotSupportedFileResult);
    assertEquals("ftp://localhost/test/file.txt", model.get("msg"));
  }

  /**
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, String)} with {@code model}, {@code
   * errMsg}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code msg} is empty string.
   * </ul>
   *
   * <p>Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, String)}
   */
  @Test
  @DisplayName(
      "Test notSupportedFile(Model, String) with 'model', 'errMsg'; then ConcurrentModel() 'msg' is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, String)"})
  void testNotSupportedFileWithModelErrMsg_thenConcurrentModelMsgIsEmptyString() {
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
    FileAttribute fileAttribute = SimTextFilePreviewImplFactory.createFileAttribute();

    // Act and Assert
    assertEquals(
        "fileNotSupported",
        otherFilePreviewImpl.notSupportedFile(
            model, fileAttribute, FtpUtilsFactory.createValidFtpUrl()));
    assertEquals(2, model.size());
    assertEquals("ftp://localhost/test/file.txt", model.get("msg"));
    assertEquals("txt", model.get("fileType"));
  }

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
  void testNotSupportedFileWithModelFileAttributeErrMsg2() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = SimTextFilePreviewImplFactory.createFileAttribute();
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
   * Test {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)} with {@code model},
   * {@code fileType}, {@code errMsg}.
   *
   * <p>Method under test: {@link OtherFilePreviewImpl#notSupportedFile(Model, String, String)}
   */
  @Test
  @DisplayName("Test notSupportedFile(Model, String, String) with 'model', 'fileType', 'errMsg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OtherFilePreviewImpl.notSupportedFile(Model, String, String)"})
  void testNotSupportedFileWithModelFileTypeErrMsg() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();
    String fileType = FtpUtilsFactory.createValidFtpUrl();

    // Act and Assert
    assertEquals(
        "fileNotSupported",
        otherFilePreviewImpl.notSupportedFile(
            model, fileType, FtpUtilsFactory.createValidFtpUrl()));
    assertEquals(2, model.size());
    assertEquals("ftp://localhost/test/file.txt", model.get("fileType"));
    assertEquals("ftp://localhost/test/file.txt", model.get("msg"));
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
}
