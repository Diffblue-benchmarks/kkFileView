package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import cn.keking.utils.FtpUtilsFactory;
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

@ContextConfiguration(classes = {TiffFilePreviewImpl.class})
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@PropertySource("classpath:application-test.properties")
class TiffFilePreviewImplDiffblueTest {
  @MockBean private FileHandlerService fileHandlerService;

  @MockBean private OtherFilePreviewImpl otherFilePreviewImpl;

  @Autowired private TiffFilePreviewImpl tiffFilePreviewImpl;

  /**
   * Test {@link TiffFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@link FileHandlerService}.
   *   <li>When {@code null}.
   *   <li>Then return {@code tiff}.
   * </ul>
   *
   * <p>Method under test: {@link TiffFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given FileHandlerService; when 'null'; then return 'tiff'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String TiffFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_givenFileHandlerService_whenNull_thenReturnTiff() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getCacheName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getOutFilePath()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    String actualFilePreviewHandleResult =
        tiffFilePreviewImpl.filePreviewHandle(null, model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getCacheName();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOutFilePath();
    assertEquals("tiff", actualFilePreviewHandleResult);
    assertTrue(model.isEmpty());
  }

  /**
   * Test {@link TiffFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link TiffFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); when 'https://example.org/example'; then ConcurrentModel() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String TiffFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_whenHttpsExampleOrgExample_thenConcurrentModelSizeIsOne() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getCacheName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getOutFilePath()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    tiffFilePreviewImpl.filePreviewHandle("https://example.org/example", model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getCacheName();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOutFilePath();
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("currentUrl"));
  }
}
