package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.jodconverter.core.office.OfficeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OfficePluginManagerDiffblueTest {
  /**
   * Test {@link OfficePluginManager#startOfficeManager()}.
   *
   * <p>Method under test: {@link OfficePluginManager#startOfficeManager()}
   */
  @Test
  @DisplayName("Test startOfficeManager()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OfficePluginManager.startOfficeManager()"})
  void testStartOfficeManager() throws OfficeException {
    // Arrange, Act and Assert
    assertThrows(RuntimeException.class, () -> new OfficePluginManager().startOfficeManager());
  }
}
