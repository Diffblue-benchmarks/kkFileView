package cn.keking.config;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import cn.keking.service.cache.CacheService;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SchedulerCleanConfigDiffblueTest {
  @Mock
  private CacheService cacheService;

  @InjectMocks
  private SchedulerCleanConfig schedulerCleanConfig;

  /**
   * Test {@link SchedulerCleanConfig#clean()}.
   * <p>
   * Method under test: {@link SchedulerCleanConfig#clean()}
   */
  @Test
  @DisplayName("Test clean()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SchedulerCleanConfig.clean()"})
  void testClean() {
    // Arrange
    doNothing().when(cacheService).cleanCache();

    // Act
    schedulerCleanConfig.clean();

    // Assert
    verify(cacheService).cleanCache();
  }
}
