package cn.keking.service;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
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
    cacheService.addQueueTask("42");
    FilePreviewFactory previewFactory = mock(FilePreviewFactory.class);

    FileConvertQueueTask fileConvertQueueTask =
        new FileConvertQueueTask(
            previewFactory, cacheService, new FileHandlerService(new CacheServiceJDKImpl()));

    // Act
    fileConvertQueueTask.startTask();

    // Assert
    verify(cacheService).addQueueTask("42");
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
    cacheService.addQueueTask("42");

    CacheServiceJDKImpl cacheService2 = new CacheServiceJDKImpl();
    cacheService2.addQueueTask("https://example.org/example");
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService2);
    FilePreviewFactory previewFactory = new FilePreviewFactory(mock(ApplicationContext.class));

    FileConvertQueueTask fileConvertQueueTask =
        new FileConvertQueueTask(previewFactory, cacheService, fileHandlerService);

    // Act
    fileConvertQueueTask.startTask();

    // Assert
    verify(cacheService).addQueueTask("42");
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
  void testStartTask3() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).addQueueTask(Mockito.<String>any());
    cacheService.addQueueTask("42");

    CacheServiceJDKImpl cacheService2 = new CacheServiceJDKImpl();
    cacheService2.addQueueTask("https://example.org/example");
    FileConvertQueueTask fileConvertQueueTask =
        new FileConvertQueueTask(
            mock(FilePreviewFactory.class), cacheService, new FileHandlerService(cacheService2));

    // Act
    fileConvertQueueTask.startTask();

    // Assert
    verify(cacheService).addQueueTask("42");
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
  void testStartTask4() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).addQueueTask(Mockito.<String>any());
    cacheService.addQueueTask("");
    FilePreviewFactory previewFactory = mock(FilePreviewFactory.class);

    FileConvertQueueTask fileConvertQueueTask =
        new FileConvertQueueTask(
            previewFactory, cacheService, new FileHandlerService(new CacheServiceJDKImpl()));

    // Act
    fileConvertQueueTask.startTask();

    // Assert
    verify(cacheService).addQueueTask("");
  }

  /**
   * Test {@link FileConvertQueueTask#startTask()}.
   *
   * <ul>
   *   <li>Given {@link CacheServiceJDKImpl} addQueueTask empty string.
   * </ul>
   *
   * <p>Method under test: {@link FileConvertQueueTask#startTask()}
   */
  @Test
  @DisplayName("Test startTask(); given CacheServiceJDKImpl addQueueTask empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileConvertQueueTask.startTask()"})
  void testStartTask_givenCacheServiceJDKImplAddQueueTaskEmptyString() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).addQueueTask(Mockito.<String>any());
    cacheService.addQueueTask("");
    FileConvertQueueTask fileConvertQueueTask =
        new FileConvertQueueTask(
            mock(FilePreviewFactory.class), cacheService, mock(FileHandlerService.class));

    // Act
    fileConvertQueueTask.startTask();

    // Assert
    verify(cacheService).addQueueTask("");
  }
}
