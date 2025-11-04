package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import cn.keking.service.cache.CacheService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

class FileHandlerServiceDiffblueTest {
  @MockBean
  private CacheService cacheService;

  /**
   * Method under test: {@link FileHandlerService#getSubString(String, String)}
   */
  @Test
  void testGetSubString() {
    // Arrange, Act and Assert
    assertEquals("ortedEncodingException", FileHandlerService.getSubString("UnsupportedEncodingException", "Pos Str"));
  }
}
