package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import cn.keking.service.FileHandlerService;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {MediaFilePreviewImpl.class})
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@PropertySource("classpath:application-test.properties")
class MediaFilePreviewImplDiffblueTest {
  @MockBean private FileHandlerService fileHandlerService;

  @Autowired private MediaFilePreviewImpl mediaFilePreviewImpl;

  @MockBean private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Test {@link MediaFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then calls {@link FileHandlerService#listConvertedFiles()}.
   * </ul>
   *
   * <p>Method under test: {@link MediaFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then calls listConvertedFiles()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MediaFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenCallsListConvertedFiles() {
    // Arrange
    when(fileHandlerService.listConvertedFiles()).thenThrow(new RuntimeException());
    String url = Boolean.TRUE.toString();
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getOutFilePath()).thenReturn("/");
    when(fileAttribute.getType()).thenReturn(FileType.PICTURE);
    when(fileAttribute.forceUpdatedCache()).thenReturn(false);
    when(fileAttribute.getCacheName()).thenReturn("Cache Name");
    when(fileAttribute.getName()).thenReturn("Name");
    when(fileAttribute.getSuffix()).thenReturn("Suffix");

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () -> mediaFilePreviewImpl.filePreviewHandle(url, model, fileAttribute));
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getCacheName();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOutFilePath();
    verify(fileAttribute).getSuffix();
    verify(fileAttribute).getType();
    verify(fileHandlerService).listConvertedFiles();
  }
}
