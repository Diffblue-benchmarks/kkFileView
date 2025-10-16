package cn.keking.service;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

class FilePreviewFactoryDiffblueTest {
  /**
   * Test {@link FilePreviewFactory#get(FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@link FilePreviewFactory#FilePreviewFactory(ApplicationContext)} with context is
   *       {@link ApplicationContext}.
   *   <li>Then calls {@link ApplicationContext#getBean(String, Class)}.
   * </ul>
   *
   * <p>Method under test: {@link FilePreviewFactory#get(FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test get(FileAttribute); given FilePreviewFactory(ApplicationContext) with context is ApplicationContext; then calls getBean(String, Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilePreview FilePreviewFactory.get(FileAttribute)"})
  void testGet_givenFilePreviewFactoryWithContextIsApplicationContext_thenCallsGetBean()
      throws BeansException {
    // Arrange
    ApplicationContext context = mock(ApplicationContext.class);
    when(context.getBean(Mockito.<String>any(), eq(FilePreview.class)))
        .thenReturn(mock(FilePreview.class));
    FilePreviewFactory filePreviewFactory = new FilePreviewFactory(context);

    // Act
    filePreviewFactory.get(OfficeToPdfServiceTestFactory.createFileAttribute());

    // Assert
    verify(context).getBean(eq("officeFilePreviewImpl"), isA(Class.class));
  }
}
