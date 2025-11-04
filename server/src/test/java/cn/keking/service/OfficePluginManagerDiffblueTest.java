package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.jodconverter.core.office.OfficeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OfficePluginManagerDiffblueTest {
  @InjectMocks
  private OfficePluginManager officePluginManager;

  @InjectMocks
  private String string;

  /**
   * Test {@link OfficePluginManager#startOfficeManager()}.
   * <p>
   * Method under test: {@link OfficePluginManager#startOfficeManager()}
   */
  @Test
  @DisplayName("Test startOfficeManager()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void OfficePluginManager.startOfficeManager()"})
  void testStartOfficeManager() throws OfficeException {
    // Arrange, Act and Assert
    assertThrows(RuntimeException.class, () -> officePluginManager.startOfficeManager());
  }
}
