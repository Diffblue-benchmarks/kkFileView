package cn.keking.service;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
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
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

@ExtendWith(MockitoExtension.class)
class FilePreviewFactoryDiffblueTest {
  @Mock
  private ApplicationContext applicationContext;

  @InjectMocks
  private FilePreviewFactory filePreviewFactory;

  /**
   * Test {@link FilePreviewFactory#get(FileAttribute)}.
   * <ul>
   *   <li>Given {@link ApplicationContext} {@link BeanFactory#getBean(String, Class)} return {@link FilePreview}.</li>
   *   <li>Then calls {@link BeanFactory#getBean(String, Class)}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FilePreviewFactory#get(FileAttribute)}
   */
  @Test
  @DisplayName("Test get(FileAttribute); given ApplicationContext getBean(String, Class) return FilePreview; then calls getBean(String, Class)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"FilePreview FilePreviewFactory.get(FileAttribute)"})
  void testGet_givenApplicationContextGetBeanReturnFilePreview_thenCallsGetBean() throws BeansException {
    // Arrange
    when(applicationContext.getBean(Mockito.<String>any(), Mockito.<Class<FilePreview>>any()))
        .thenReturn(mock(FilePreview.class));

    FileAttribute fileAttribute = new FileAttribute();
    fileAttribute.setType(FileType.PICTURE);

    // Act
    filePreviewFactory.get(fileAttribute);

    // Assert
    verify(applicationContext).getBean(eq("pictureFilePreviewImpl"), isA(Class.class));
  }
}
