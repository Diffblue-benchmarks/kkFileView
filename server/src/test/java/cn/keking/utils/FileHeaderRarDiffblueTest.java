package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class FileHeaderRarDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link FileHeaderRar#FileHeaderRar(String, Boolean)}
   *   <li>{@link FileHeaderRar#setDirectory(Boolean)}
   *   <li>{@link FileHeaderRar#setFileNameW(String)}
   *   <li>{@link FileHeaderRar#getDirectory()}
   *   <li>{@link FileHeaderRar#getFileNameW()}
   * </ul>
   */
  @Test
  void testGettersAndSetters() {
    // Arrange and Act
    FileHeaderRar actualFileHeaderRar = new FileHeaderRar("foo.txt", true);
    actualFileHeaderRar.setDirectory(true);
    actualFileHeaderRar.setFileNameW("foo.txt");
    Boolean actualDirectory = actualFileHeaderRar.getDirectory();

    // Assert that nothing has changed
    assertEquals("foo.txt", actualFileHeaderRar.getFileNameW());
    assertTrue(actualDirectory);
  }
}
