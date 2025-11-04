package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.jodconverter.core.office.OfficeException;
import org.junit.jupiter.api.Test;

class OfficePluginManagerDiffblueTest {
  /**
   * Method under test: {@link OfficePluginManager#startOfficeManager()}
   */
  @Test
  void testStartOfficeManager() throws OfficeException {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange, Act and Assert
    assertThrows(RuntimeException.class, () -> (new OfficePluginManager()).startOfficeManager());
  }
}
