package cn.keking.config;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SchedulerCleanConfigDiffblueTest {
  /**
   * Test {@link SchedulerCleanConfig#clean()}.
   *
   * <p>Method under test: {@link SchedulerCleanConfig#clean()}
   */
  @Test
  @DisplayName("Test clean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SchedulerCleanConfig.clean()"})
  void testClean() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).cleanCache();

    // Act
    new SchedulerCleanConfig(cacheService).clean();

    // Assert
    verify(cacheService).cleanCache();
  }
}
