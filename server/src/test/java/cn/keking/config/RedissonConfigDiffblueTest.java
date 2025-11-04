package cn.keking.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class RedissonConfigDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>{@link RedissonConfig#setAddress(String)}
   *   <li>{@link RedissonConfig#setClientName(String)}
   *   <li>{@link RedissonConfig#setCodec(String)}
   *   <li>{@link RedissonConfig#setConnectTimeout(int)}
   *   <li>{@link RedissonConfig#setConnectionMinimumIdleSize(int)}
   *   <li>{@link RedissonConfig#setConnectionPoolSize(int)}
   *   <li>{@link RedissonConfig#setDatabase(int)}
   *   <li>{@link RedissonConfig#setDnsMonitoring(boolean)}
   *   <li>{@link RedissonConfig#setDnsMonitoringInterval(int)}
   *   <li>{@link RedissonConfig#setFailedAttempts(int)}
   *   <li>{@link RedissonConfig#setIdleConnectionTimeout(int)}
   *   <li>{@link RedissonConfig#setPassword(String)}
   *   <li>{@link RedissonConfig#setPingTimeout(int)}
   *   <li>{@link RedissonConfig#setReconnectionTimeout(int)}
   *   <li>{@link RedissonConfig#setRetryAttempts(int)}
   *   <li>{@link RedissonConfig#setRetryInterval(int)}
   *   <li>{@link RedissonConfig#setSubscriptionConnectionMinimumIdleSize(int)}
   *   <li>{@link RedissonConfig#setSubscriptionConnectionPoolSize(int)}
   *   <li>{@link RedissonConfig#setSubscriptionsPerConnection(int)}
   *   <li>{@link RedissonConfig#setThread(int)}
   *   <li>{@link RedissonConfig#setTimeout(int)}
   *   <li>{@link RedissonConfig#getAddress()}
   *   <li>{@link RedissonConfig#getClientName()}
   *   <li>{@link RedissonConfig#getCodec()}
   *   <li>{@link RedissonConfig#getConnectTimeout()}
   *   <li>{@link RedissonConfig#getConnectionMinimumIdleSize()}
   *   <li>{@link RedissonConfig#getConnectionPoolSize()}
   *   <li>{@link RedissonConfig#getDatabase()}
   *   <li>{@link RedissonConfig#getDnsMonitoringInterval()}
   *   <li>{@link RedissonConfig#getFailedAttempts()}
   *   <li>{@link RedissonConfig#getIdleConnectionTimeout()}
   *   <li>{@link RedissonConfig#getPassword()}
   *   <li>{@link RedissonConfig#getPingTimeout()}
   *   <li>{@link RedissonConfig#getReconnectionTimeout()}
   *   <li>{@link RedissonConfig#getRetryAttempts()}
   *   <li>{@link RedissonConfig#getRetryInterval()}
   *   <li>{@link RedissonConfig#getSubscriptionConnectionMinimumIdleSize()}
   *   <li>{@link RedissonConfig#getSubscriptionConnectionPoolSize()}
   *   <li>{@link RedissonConfig#getSubscriptionsPerConnection()}
   *   <li>{@link RedissonConfig#getThread()}
   *   <li>{@link RedissonConfig#getTimeout()}
   *   <li>{@link RedissonConfig#isDnsMonitoring()}
   * </ul>
   */
  @Test
  void testGettersAndSetters() {
    // Arrange
    RedissonConfig redissonConfig = new RedissonConfig();

    // Act
    redissonConfig.setAddress("42 Main St");
    redissonConfig.setClientName("Dr Jane Doe");
    redissonConfig.setCodec("Codec");
    redissonConfig.setConnectTimeout(10);
    redissonConfig.setConnectionMinimumIdleSize(1);
    redissonConfig.setConnectionPoolSize(3);
    redissonConfig.setDatabase(1);
    redissonConfig.setDnsMonitoring(true);
    redissonConfig.setDnsMonitoringInterval(42);
    redissonConfig.setFailedAttempts(1);
    redissonConfig.setIdleConnectionTimeout(1);
    redissonConfig.setPassword("iloveyou");
    redissonConfig.setPingTimeout(10);
    redissonConfig.setReconnectionTimeout(10);
    redissonConfig.setRetryAttempts(1);
    redissonConfig.setRetryInterval(42);
    redissonConfig.setSubscriptionConnectionMinimumIdleSize(1);
    redissonConfig.setSubscriptionConnectionPoolSize(3);
    redissonConfig.setSubscriptionsPerConnection(1);
    redissonConfig.setThread(1);
    redissonConfig.setTimeout(10);
    String actualAddress = redissonConfig.getAddress();
    String actualClientName = redissonConfig.getClientName();
    String actualCodec = redissonConfig.getCodec();
    int actualConnectTimeout = redissonConfig.getConnectTimeout();
    int actualConnectionMinimumIdleSize = redissonConfig.getConnectionMinimumIdleSize();
    int actualConnectionPoolSize = redissonConfig.getConnectionPoolSize();
    int actualDatabase = redissonConfig.getDatabase();
    int actualDnsMonitoringInterval = redissonConfig.getDnsMonitoringInterval();
    int actualFailedAttempts = redissonConfig.getFailedAttempts();
    int actualIdleConnectionTimeout = redissonConfig.getIdleConnectionTimeout();
    String actualPassword = redissonConfig.getPassword();
    int actualPingTimeout = redissonConfig.getPingTimeout();
    int actualReconnectionTimeout = redissonConfig.getReconnectionTimeout();
    int actualRetryAttempts = redissonConfig.getRetryAttempts();
    int actualRetryInterval = redissonConfig.getRetryInterval();
    int actualSubscriptionConnectionMinimumIdleSize = redissonConfig.getSubscriptionConnectionMinimumIdleSize();
    int actualSubscriptionConnectionPoolSize = redissonConfig.getSubscriptionConnectionPoolSize();
    int actualSubscriptionsPerConnection = redissonConfig.getSubscriptionsPerConnection();
    int actualThread = redissonConfig.getThread();
    int actualTimeout = redissonConfig.getTimeout();

    // Assert that nothing has changed
    assertEquals("42 Main St", actualAddress);
    assertEquals("Codec", actualCodec);
    assertEquals("Dr Jane Doe", actualClientName);
    assertEquals("iloveyou", actualPassword);
    assertEquals(1, actualConnectionMinimumIdleSize);
    assertEquals(1, actualDatabase);
    assertEquals(1, actualFailedAttempts);
    assertEquals(1, actualIdleConnectionTimeout);
    assertEquals(1, actualRetryAttempts);
    assertEquals(1, actualSubscriptionConnectionMinimumIdleSize);
    assertEquals(1, actualSubscriptionsPerConnection);
    assertEquals(1, actualThread);
    assertEquals(10, actualConnectTimeout);
    assertEquals(10, actualPingTimeout);
    assertEquals(10, actualReconnectionTimeout);
    assertEquals(10, actualTimeout);
    assertEquals(3, actualConnectionPoolSize);
    assertEquals(3, actualSubscriptionConnectionPoolSize);
    assertEquals(42, actualDnsMonitoringInterval);
    assertEquals(42, actualRetryInterval);
    assertTrue(redissonConfig.isDnsMonitoring());
  }
}
