package cn.keking.web.filter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TrustHostFilterDiffblueTest {
  /**
   * Test {@link TrustHostFilter#isNotTrustHost(String)}.
   *
   * <p>Method under test: {@link TrustHostFilter#isNotTrustHost(String)}
   */
  @Test
  @DisplayName("Test isNotTrustHost(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TrustHostFilter.isNotTrustHost(String)"})
  void testIsNotTrustHost() {
    // Arrange, Act and Assert
    assertFalse(new TrustHostFilter().isNotTrustHost("localhost"));
  }
}
