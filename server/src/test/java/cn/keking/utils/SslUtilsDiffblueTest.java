package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class SslUtilsDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link SslUtils.miTM}
   *   <li>{@link SslUtils.miTM#getAcceptedIssuers()}
   * </ul>
   */
  @Test
  void testMiTMGettersAndSetters() {
    // Arrange, Act and Assert
    assertNull((new SslUtils.miTM()).getAcceptedIssuers());
  }
}
