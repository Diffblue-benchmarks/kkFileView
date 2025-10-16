package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FileHandlerServiceDiffblueTest {
  /**
   * Test {@link FileHandlerService#getSubString(String, String)}.
   *
   * <ul>
   *   <li>Then return {@code ortedEncodingException}.
   * </ul>
   *
   * <p>Method under test: {@link FileHandlerService#getSubString(String, String)}
   */
  @Test
  @DisplayName("Test getSubString(String, String); then return 'ortedEncodingException'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileHandlerService.getSubString(String, String)"})
  void testGetSubString_thenReturnOrtedEncodingException() {
    // Arrange, Act and Assert
    assertEquals(
        "ortedEncodingException",
        FileHandlerService.getSubString("UnsupportedEncodingException", "Pos Str"));
  }
}
