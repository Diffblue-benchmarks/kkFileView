package cn.keking.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConfigConstantsDiffblueTest {
  /**
   * Test {@link ConfigConstants#maxSize()}.
   *
   * <p>Method under test: {@link ConfigConstants#maxSize()}
   */
  @Test
  @DisplayName("Test maxSize()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String ConfigConstants.maxSize()"})
  void testMaxSize() {
    // Arrange, Act and Assert
    assertEquals("Size", ConfigConstants.maxSize());
  }
}
