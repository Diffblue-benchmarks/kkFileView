package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FileHeaderRarDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FileHeaderRar#FileHeaderRar(String, Boolean)}
   *   <li>{@link FileHeaderRar#setDirectory(Boolean)}
   *   <li>{@link FileHeaderRar#setFileNameW(String)}
   *   <li>{@link FileHeaderRar#getDirectory()}
   *   <li>{@link FileHeaderRar#getFileNameW()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FileHeaderRar.<init>(String, Boolean)",
    "Boolean FileHeaderRar.getDirectory()",
    "String FileHeaderRar.getFileNameW()",
    "void FileHeaderRar.setDirectory(Boolean)",
    "void FileHeaderRar.setFileNameW(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    FileHeaderRar actualFileHeaderRar = new FileHeaderRar("foo.txt", true);
    actualFileHeaderRar.setDirectory(true);
    actualFileHeaderRar.setFileNameW("foo.txt");
    Boolean actualDirectory = actualFileHeaderRar.getDirectory();

    // Assert
    assertEquals("foo.txt", actualFileHeaderRar.getFileNameW());
    assertTrue(actualDirectory);
  }
}
