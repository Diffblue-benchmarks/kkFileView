package cn.keking.service;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.ApplicationContext;

class FileConvertQueueTaskDiffblueTest {
  /**
   * Test {@link FileConvertQueueTask#startTask()}.
   *
   * <ul>
   *   <li>Given {@link FilePreviewFactory#FilePreviewFactory(ApplicationContext)} with context is
   *       {@link ApplicationContext}.
   * </ul>
   *
   * <p>Method under test: {@link FileConvertQueueTask#startTask()}
   */
  @Test
  @DisplayName(
      "Test startTask(); given FilePreviewFactory(ApplicationContext) with context is ApplicationContext")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileConvertQueueTask.startTask()"})
  void testStartTask_givenFilePreviewFactoryWithContextIsApplicationContext() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).putPdfImageCache(Mockito.<String>any(), anyInt());
    cacheService.putPdfImageCache("/directory/foo.txt", 10);
    FilePreviewFactory previewFactory = new FilePreviewFactory(mock(ApplicationContext.class));

    FileConvertQueueTask fileConvertQueueTask =
        new FileConvertQueueTask(previewFactory, cacheService, mock(FileHandlerService.class));

    // Act
    fileConvertQueueTask.startTask();

    // Assert
    verify(cacheService).putPdfImageCache("/directory/foo.txt", 10);
  }

  /**
   * Test {@link FileConvertQueueTask#startTask()}.
   *
   * <ul>
   *   <li>Then calls {@link FileHandlerService#putImgCache(String, List)}.
   * </ul>
   *
   * <p>Method under test: {@link FileConvertQueueTask#startTask()}
   */
  @Test
  @DisplayName("Test startTask(); then calls putImgCache(String, List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileConvertQueueTask.startTask()"})
  void testStartTask_thenCallsPutImgCache() throws InterruptedException {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    when(cacheService.takeQueueTask()).thenReturn("Take Queue Task");
    doNothing().when(cacheService).putPdfImageCache(Mockito.<String>any(), anyInt());
    cacheService.putPdfImageCache("/directory/foo.txt", 10);

    ArrayList<String> imgs = new ArrayList<>();
    imgs.add("foo");

    FileHandlerService fileHandlerService = mock(FileHandlerService.class);
    doNothing()
        .when(fileHandlerService)
        .putImgCache(Mockito.<String>any(), Mockito.<List<String>>any());
    fileHandlerService.putImgCache("fullfilename", imgs);

    FileConvertQueueTask fileConvertQueueTask =
        new FileConvertQueueTask(null, cacheService, fileHandlerService);

    // Act
    fileConvertQueueTask.startTask();

    // Assert
    verify(fileHandlerService).putImgCache(eq("fullfilename"), isA(List.class));
    verify(cacheService).putPdfImageCache("/directory/foo.txt", 10);
  }
}
