package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import cn.keking.service.FileHandlerService;
import cn.keking.utils.FtpUtilsFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
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
   * <p>Method under test: {@link MediaFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MediaFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle() {
    // Arrange
    when(otherFilePreviewImpl.notSupportedFile(
            Mockito.<Model>any(), Mockito.<FileAttribute>any(), Mockito.<String>any()))
        .thenThrow(new RuntimeException());
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getOutFilePath()).thenReturn("/");
    when(fileAttribute.getType()).thenReturn(FileType.PICTURE);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getCacheName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getSuffix()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            mediaFilePreviewImpl.filePreviewHandle(
                "https://example.org/example", model, fileAttribute));
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getCacheName();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOutFilePath();
    verify(fileAttribute).getSuffix();
    verify(fileAttribute).getType();
    verify(otherFilePreviewImpl)
        .notSupportedFile(isA(Model.class), isA(FileAttribute.class), eq("系统还不支持该格式文件的在线预览"));
  }

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
    String url = FtpUtilsFactory.createValidFtpUrl();
    ConcurrentModel model = new ConcurrentModel();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            mediaFilePreviewImpl.filePreviewHandle(
                url, model, SimTextFilePreviewImplFactory.createFileAttribute()));
    verify(fileHandlerService).listConvertedFiles();
  }

  /**
   * Test {@link MediaFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MediaFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MediaFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenConcurrentModelSizeIsOne() {
    // Arrange
    MediaFilePreviewImpl mediaFilePreviewImpl =
        new MediaFilePreviewImpl(mock(FileHandlerService.class), mock(OtherFilePreviewImpl.class));
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getOutFilePath()).thenReturn("/");
    when(fileAttribute.getType()).thenReturn(FileType.MEDIA);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getCacheName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getSuffix()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    String actualFilePreviewHandleResult =
        mediaFilePreviewImpl.filePreviewHandle("https://example.org/example", model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getCacheName();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOutFilePath();
    verify(fileAttribute).getSuffix();
    verify(fileAttribute).getType();
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("mediaUrl"));
    assertEquals("media", actualFilePreviewHandleResult);
  }

  /**
   * Test {@link MediaFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link MediaFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MediaFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenConcurrentModelSizeIsTwo() {
    // Arrange
    FileHandlerService fileHandlerService = mock(FileHandlerService.class);
    MediaFilePreviewImpl mediaFilePreviewImpl =
        new MediaFilePreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getOutFilePath()).thenReturn("/");
    when(fileAttribute.getType()).thenReturn(FileType.PICTURE);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getCacheName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getSuffix()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    String actualFilePreviewHandleResult =
        mediaFilePreviewImpl.filePreviewHandle("https://example.org/example", model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getCacheName();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOutFilePath();
    verify(fileAttribute, atLeast(1)).getSuffix();
    verify(fileAttribute).getType();
    assertEquals(2, model.size());
    assertEquals("系统还不支持该格式文件的在线预览", model.get("msg"));
    assertEquals("fileNotSupported", actualFilePreviewHandleResult);
    assertEquals("ftp://localhost/test/file.txt", model.get("fileType"));
  }

  /**
   * Test {@link MediaFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then return {@code ftp://localhost/test/file.txt}.
   * </ul>
   *
   * <p>Method under test: {@link MediaFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then return 'ftp://localhost/test/file.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MediaFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenReturnFtpLocalhostTestFileTxt() {
    // Arrange
    when(otherFilePreviewImpl.notSupportedFile(
            Mockito.<Model>any(), Mockito.<FileAttribute>any(), Mockito.<String>any()))
        .thenReturn(FtpUtilsFactory.createValidFtpUrl());
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getOutFilePath()).thenReturn("/");
    when(fileAttribute.getType()).thenReturn(FileType.PICTURE);
    when(fileAttribute.forceUpdatedCache()).thenReturn(true);
    when(fileAttribute.getCacheName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getName()).thenReturn(FtpUtilsFactory.createValidFtpUrl());
    when(fileAttribute.getSuffix()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    String actualFilePreviewHandleResult =
        mediaFilePreviewImpl.filePreviewHandle("https://example.org/example", model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getCacheName();
    verify(fileAttribute).getName();
    verify(fileAttribute).getOutFilePath();
    verify(fileAttribute).getSuffix();
    verify(fileAttribute).getType();
    verify(otherFilePreviewImpl)
        .notSupportedFile(isA(Model.class), isA(FileAttribute.class), eq("系统还不支持该格式文件的在线预览"));
    assertEquals("ftp://localhost/test/file.txt", actualFilePreviewHandleResult);
  }
}
