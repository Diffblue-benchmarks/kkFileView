package cn.keking.service.cache.impl;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class CacheServiceJDKImplDiffblueTest {
  /**
   * Method under test: {@link CacheServiceJDKImpl#getImgCache(String)}
   */
  @Test
  void testGetImgCache() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange, Act and Assert
    assertTrue((new CacheServiceJDKImpl()).getImgCache("").isEmpty());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link CacheServiceJDKImpl#getImgCache()}
   *   <li>{@link CacheServiceJDKImpl#getMediaConvertCache()}
   *   <li>{@link CacheServiceJDKImpl#getPDFCache()}
   * </ul>
   */
  @Test
  void testGettersAndSetters() {
    // Arrange
    CacheServiceJDKImpl cacheServiceJDKImpl = new CacheServiceJDKImpl();

    // Act
    Map<String, List<String>> actualImgCache = cacheServiceJDKImpl.getImgCache();
    Map<String, String> actualMediaConvertCache = cacheServiceJDKImpl.getMediaConvertCache();

    // Assert
    assertNull(actualMediaConvertCache);
    assertNull(cacheServiceJDKImpl.getPDFCache());
    assertNull(actualImgCache);
  }
}
