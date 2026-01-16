package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.utils.DownloadUtilsFactory;
import cn.keking.utils.FtpUtilsFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
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

@ContextConfiguration(classes = {MarkdownFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class MarkdownFilePreviewImplDiffblueTest {
  @Autowired private MarkdownFilePreviewImpl markdownFilePreviewImpl;

  @MockBean private SimTextFilePreviewImpl simTextFilePreviewImpl;

  /**
   * Test {@link MarkdownFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <p>Method under test: {@link MarkdownFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String MarkdownFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle() {
    // Arrange
    when(simTextFilePreviewImpl.filePreviewHandle(
            Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn(FtpUtilsFactory.createValidFtpUrl());
    String url = FtpUtilsFactory.createValidFtpUrl();
    ConcurrentModel model = new ConcurrentModel();

    // Act and Assert
    assertEquals(
        "markdown",
        markdownFilePreviewImpl.filePreviewHandle(
            url, model, DownloadUtilsFactory.createValidFileAttribute()));
  }
}
