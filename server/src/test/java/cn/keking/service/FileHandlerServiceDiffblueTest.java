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

class FileHandlerServiceDiffblueTest {
  /**
   * Test {@link FileHandlerService#addConvertedFile(String, String)}.
   *
   * <ul>
   *   <li>Then calls {@link CacheServiceJDKImpl#putPDFCache(String, String)}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#addConvertedFile(String, String)}
   */
  @Test
  @DisplayName("Test addConvertedFile(String, String); then calls putPDFCache(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileHandlerService.addConvertedFile(String, String)"})
  void testAddConvertedFile_thenCallsPutPDFCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    doNothing().when(cacheService).putPDFCache(Mockito.<String>any(), Mockito.<String>any());

    // Act
    new FileHandlerService(cacheService).addConvertedFile("foo.txt", "42");

    // Assert
    verify(cacheService).putPDFCache("foo.txt", "42");
  }
}
