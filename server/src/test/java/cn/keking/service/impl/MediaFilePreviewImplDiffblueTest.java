package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import cn.keking.service.FileHandlerService;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {MediaFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class MediaFilePreviewImplDiffblueTest {
  @MockBean
  private FileHandlerService fileHandlerService;

  @Autowired
  private MediaFilePreviewImpl mediaFilePreviewImpl;

  @MockBean
  private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Test {@link MediaFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   * <ul>
   *   <li>Given {@link FileHandlerService}.</li>
   *   <li>Then return {@code Not Supported File}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MediaFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute); given FileHandlerService; then return 'Not Supported File'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String MediaFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_givenFileHandlerService_thenReturnNotSupportedFile() {
    // Arrange
    when(otherFilePreviewImpl.notSupportedFile(Mockito.<Model>any(), Mockito.<FileAttribute>any(),
        Mockito.<String>any())).thenReturn("Not Supported File");
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = mediaFilePreviewImpl.filePreviewHandle("https://example.org/example", model,
        new FileAttribute(FileType.PICTURE, "http", "http", "https://example.org/example"));

    // Assert
    verify(otherFilePreviewImpl).notSupportedFile(isA(Model.class), isA(FileAttribute.class), eq("系统还不支持该格式文件的在线预览"));
    assertEquals("Not Supported File", actualFilePreviewHandleResult);
  }
}
