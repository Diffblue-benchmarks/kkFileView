package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
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
  @MethodsUnderTest({"java.io.File LocalOfficeUtils.getDefaultOfficeHome()"})
  void testGetDefaultOfficeHome() {
    // Arrange, Act and Assert
    assertNull(LocalOfficeUtils.getDefaultOfficeHome());
  }
}
