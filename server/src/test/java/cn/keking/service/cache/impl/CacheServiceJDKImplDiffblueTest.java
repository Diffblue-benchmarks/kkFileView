package cn.keking.service.cache.impl;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CacheServiceJDKImplDiffblueTest {
  /**
   * Test {@link CacheServiceJDKImpl#getImgCache(String)} with {@code String}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CacheServiceJDKImpl#getImgCache(String)}
   */
  @Test
  @DisplayName("Test getImgCache(String) with 'String'; when empty string; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List CacheServiceJDKImpl.getImgCache(String)"})
  void testGetImgCacheWithString_whenEmptyString_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(new CacheServiceJDKImpl().getImgCache("").isEmpty());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CacheServiceJDKImpl#getImgCache()}
   *   <li>{@link CacheServiceJDKImpl#getMediaConvertCache()}
   *   <li>{@link CacheServiceJDKImpl#getPDFCache()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Map CacheServiceJDKImpl.getImgCache()",
    "Map CacheServiceJDKImpl.getMediaConvertCache()",
    "Map CacheServiceJDKImpl.getPDFCache()"
  })
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
