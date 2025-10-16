package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.File;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LocalOfficeUtilsDiffblueTest {
  /**
   * Test {@link LocalOfficeUtils#getDefaultOfficeHome()}.
   *
   * <p>Method under test: {@link LocalOfficeUtils#getDefaultOfficeHome()}
   */
  @Test
  @DisplayName("Test getDefaultOfficeHome()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"File LocalOfficeUtils.getDefaultOfficeHome()"})
  void testGetDefaultOfficeHome() {
    // Arrange and Act
    File actualDefaultOfficeHome = LocalOfficeUtils.getDefaultOfficeHome();

    // Assert
    assertEquals("libreoffice", actualDefaultOfficeHome.getName());
    assertTrue(actualDefaultOfficeHome.isAbsolute());
  }
}
