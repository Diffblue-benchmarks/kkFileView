package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
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
   * <p>
   * Method under test: {@link MediaFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String MediaFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle() {
    // Arrange
    when(otherFilePreviewImpl.notSupportedFile(Mockito.<Model>any(), Mockito.<FileAttribute>any(),
        Mockito.<String>any())).thenReturn("Not Supported File");
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = mediaFilePreviewImpl.filePreviewHandle("https://example.org/example", model,
        new FileAttribute(FileType.PICTURE, "+", "avi", "https://example.org/example"));

    // Assert
    verify(otherFilePreviewImpl).notSupportedFile(isA(Model.class), isA(FileAttribute.class), eq("系统还不支持该格式文件的在线预览"));
    assertEquals("Not Supported File", actualFilePreviewHandleResult);
  }

  /**
   * Test {@link MediaFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   * <ul>
   *   <li>Given {@code PICTURE}.</li>
   *   <li>Then calls {@link FileAttribute#forceUpdatedCache()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link MediaFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute); given 'PICTURE'; then calls forceUpdatedCache()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String MediaFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_givenPicture_thenCallsForceUpdatedCache() {
    // Arrange
    when(otherFilePreviewImpl.notSupportedFile(Mockito.<Model>any(), Mockito.<FileAttribute>any(),
        Mockito.<String>any())).thenReturn("Not Supported File");
    ConcurrentModel model = new ConcurrentModel();
    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getType()).thenReturn(FileType.PICTURE);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getCacheName()).thenReturn("Cache Name");
    when(fileAttribute.getName()).thenReturn("Name");
    when(fileAttribute.getOutFilePath()).thenReturn("/directory/foo.txt");
    when(fileAttribute.getSuffix()).thenReturn("Suffix");

    // Act
    String actualFilePreviewHandleResult = mediaFilePreviewImpl.filePreviewHandle("https://example.org/example", model,
        fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getCacheName();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOutFilePath();
    verify(fileAttribute).getSuffix();
    verify(fileAttribute).getType();
    verify(otherFilePreviewImpl).notSupportedFile(isA(Model.class), isA(FileAttribute.class), eq("系统还不支持该格式文件的在线预览"));
    assertEquals("Not Supported File", actualFilePreviewHandleResult);
  }
}
