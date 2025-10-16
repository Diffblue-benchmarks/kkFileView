package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ExtendWith(MockitoExtension.class)
class FilePreviewFactoryDiffblueTest {
  @Mock private ApplicationContext applicationContext;

  @InjectMocks private FilePreviewFactory filePreviewFactory;

  /**
   * Test {@link FilePreviewFactory#get(FileAttribute)}.
   *
   * <p>Method under test: {@link FilePreviewFactory#get(FileAttribute)}
   */
  @Test
  @DisplayName("Test get(FileAttribute)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilePreview FilePreviewFactory.get(FileAttribute)"})
  void testGet() throws BeansException {
    // Arrange
    FilePreview filePreview = mock(FilePreview.class);
    when(filePreview.filePreviewHandle(
            Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    when(applicationContext.getBean(Mockito.<String>any(), Mockito.<Class<FilePreview>>any()))
        .thenReturn(filePreview);
    FileAttribute fileAttribute =
        new FileAttribute(FileType.PICTURE, "Suffix", "Name", "https://example.org/example");

    // Act
    FilePreview actualGetResult = filePreviewFactory.get(fileAttribute);
    ConcurrentModel concurrentModel = new ConcurrentModel();
    String actualFilePreviewHandleResult =
        actualGetResult.filePreviewHandle("foo", concurrentModel, new FileAttribute());

    // Assert
    verify(filePreview).filePreviewHandle(eq("foo"), isA(Model.class), isA(FileAttribute.class));
    verify(applicationContext).getBean(eq("pictureFilePreviewImpl"), isA(Class.class));
    assertEquals("File Preview Handle", actualFilePreviewHandleResult);
  }
}
