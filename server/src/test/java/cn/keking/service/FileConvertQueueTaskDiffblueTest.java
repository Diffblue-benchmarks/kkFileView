package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import cn.keking.model.FileType;
import cn.keking.service.FileConvertQueueTask.ConvertTask;
import cn.keking.service.cache.CacheService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;

class FileConvertQueueTaskDiffblueTest {
  /**
   * Test ConvertTask {@link ConvertTask#isNeedConvert(FileType)}.
   *
   * <ul>
   *   <li>When {@code COMPRESS}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ConvertTask#isNeedConvert(FileType)}
   */
  @Test
  @DisplayName("Test ConvertTask isNeedConvert(FileType); when 'COMPRESS'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConvertTask.isNeedConvert(FileType)"})
  void testConvertTaskIsNeedConvert_whenCompress_thenReturnTrue() {
    // Arrange
    FilePreviewFactory previewFactory = new FilePreviewFactory(mock(ApplicationContext.class));
    CacheServiceJDKImpl cacheService = new CacheServiceJDKImpl();

    ConvertTask convertTask =
        new ConvertTask(
            previewFactory, cacheService, new FileHandlerService(new CacheServiceJDKImpl()));

    // Act and Assert
    assertTrue(convertTask.isNeedConvert(FileType.COMPRESS));
  }

  /**
   * Test ConvertTask {@link ConvertTask#isNeedConvert(FileType)}.
   *
   * <ul>
   *   <li>When {@code OFFICE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ConvertTask#isNeedConvert(FileType)}
   */
  @Test
  @DisplayName("Test ConvertTask isNeedConvert(FileType); when 'OFFICE'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConvertTask.isNeedConvert(FileType)"})
  void testConvertTaskIsNeedConvert_whenOffice_thenReturnTrue() {
    // Arrange
    FilePreviewFactory previewFactory = new FilePreviewFactory(mock(ApplicationContext.class));
    CacheServiceJDKImpl cacheService = new CacheServiceJDKImpl();

    ConvertTask convertTask =
        new ConvertTask(
            previewFactory, cacheService, new FileHandlerService(new CacheServiceJDKImpl()));

    // Act and Assert
    assertTrue(convertTask.isNeedConvert(FileType.OFFICE));
  }

  /**
   * Test ConvertTask {@link ConvertTask#isNeedConvert(FileType)}.
   *
   * <ul>
   *   <li>When {@code PICTURE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ConvertTask#isNeedConvert(FileType)}
   */
  @Test
  @DisplayName("Test ConvertTask isNeedConvert(FileType); when 'PICTURE'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ConvertTask.isNeedConvert(FileType)"})
  void testConvertTaskIsNeedConvert_whenPicture_thenReturnFalse() {
    // Arrange
    FilePreviewFactory previewFactory = new FilePreviewFactory(mock(ApplicationContext.class));
    CacheServiceJDKImpl cacheService = new CacheServiceJDKImpl();

    ConvertTask convertTask =
        new ConvertTask(
            previewFactory, cacheService, new FileHandlerService(new CacheServiceJDKImpl()));

    // Act and Assert
    assertFalse(convertTask.isNeedConvert(FileType.PICTURE));
  }

  /**
   * Test ConvertTask {@link ConvertTask#ConvertTask(FilePreviewFactory, CacheService,
   * FileHandlerService)}.
   *
   * <p>Method under test: {@link ConvertTask#ConvertTask(FilePreviewFactory, CacheService,
   * FileHandlerService)}
   */
  @Test
  @DisplayName(
      "Test ConvertTask new ConvertTask(FilePreviewFactory, CacheService, FileHandlerService)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ConvertTask.<init>(FilePreviewFactory, CacheService, FileHandlerService)"
  })
  void testConvertTaskNewConvertTask() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    FilePreviewFactory previewFactory = new FilePreviewFactory(mock(ApplicationContext.class));
    CacheServiceJDKImpl cacheService = new CacheServiceJDKImpl();

    // Act
    ConvertTask actualConvertTask =
        new ConvertTask(
            previewFactory, cacheService, new FileHandlerService(new CacheServiceJDKImpl()));

    // Assert
    assertFalse(actualConvertTask.isNeedConvert(FileType.PICTURE));
  }

  /**
   * Test {@link FileConvertQueueTask#startTask()}.
   *
   * <p>Method under test: {@link FileConvertQueueTask#startTask()}
   */
  @Test
  @DisplayName("Test startTask()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileConvertQueueTask.startTask()"})
  void testStartTask() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).addQueueTask(Mockito.<String>any());
    cacheService.addQueueTask("https://example.org/example");
    FileConvertQueueTask fileConvertQueueTask =
        new FileConvertQueueTask(
            mock(FilePreviewFactory.class), cacheService, mock(FileHandlerService.class));

    // Act
    fileConvertQueueTask.startTask();

    // Assert
    verify(cacheService).addQueueTask("https://example.org/example");
  }

  /**
   * Test {@link FileConvertQueueTask#startTask()}.
   *
   * <p>Method under test: {@link FileConvertQueueTask#startTask()}
   */
  @Test
  @DisplayName("Test startTask()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileConvertQueueTask.startTask()"})
  void testStartTask2() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).addQueueTask(Mockito.<String>any());
    cacheService.addQueueTask("https://example.org/example");
    FilePreviewFactory previewFactory = new FilePreviewFactory(mock(ApplicationContext.class));

    FileConvertQueueTask fileConvertQueueTask =
        new FileConvertQueueTask(previewFactory, cacheService, mock(FileHandlerService.class));

    // Act
    fileConvertQueueTask.startTask();

    // Assert
    verify(cacheService).addQueueTask("https://example.org/example");
  }
}
