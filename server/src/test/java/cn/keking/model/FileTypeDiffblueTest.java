package cn.keking.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FileTypeDiffblueTest {
  /**
   * Test {@link FileType#typeFromUrl(String)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link FileType#typeFromUrl(String)}
   */
  @Test
  @DisplayName("Test typeFromUrl(String); when 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileType FileType.typeFromUrl(String)"})
  void testTypeFromUrl_whenHttpsExampleOrgExample() {
    // Arrange, Act and Assert
    assertEquals(FileType.OTHER, FileType.typeFromUrl("https://example.org/example"));
  }

  /**
   * Test {@link FileType#typeFromUrl(String)}.
   *
   * <ul>
   *   <li>When {@code ?}.
   * </ul>
   *
   * <p>Method under test: {@link FileType#typeFromUrl(String)}
   */
  @Test
  @DisplayName("Test typeFromUrl(String); when '?'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FileType FileType.typeFromUrl(String)"})
  void testTypeFromUrl_whenQuestionMark() {
    // Arrange, Act and Assert
    assertEquals(FileType.OTHER, FileType.typeFromUrl("?"));
  }

  /**
   * Test {@link FileType#getInstanceName()}.
   *
   * <p>Method under test: {@link FileType#getInstanceName()}
   */
  @Test
  @DisplayName("Test getInstanceName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FileType.getInstanceName()"})
  void testGetInstanceName() {
    // Arrange, Act and Assert
    assertEquals("pictureFilePreviewImpl", FileType.valueOf("PICTURE").getInstanceName());
  }
}
