package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertNull;
import cn.keking.utils.SslUtils.miTM;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SslUtilsDiffblueTest {
  /**
   * Test miTM getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link miTM}
   *   <li>{@link miTM#getAcceptedIssuers()}
   * </ul>
   */
  @Test
  @DisplayName("Test miTM getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void miTM.<init>()",
    "void miTM.checkClientTrusted(java.security.cert.X509Certificate[], java.lang.String)",
    "void miTM.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String)",
    "java.security.cert.X509Certificate[] miTM.getAcceptedIssuers()"
  })
  void testMiTMGettersAndSetters() {
    // Arrange, Act and Assert
    assertNull(new miTM().getAcceptedIssuers());
  }
}
