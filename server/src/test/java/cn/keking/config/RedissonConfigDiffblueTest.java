package cn.keking.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import io.netty.channel.nio.NioEventLoopGroup;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.redisson.codec.DefaultCodecProvider;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;
import org.redisson.liveobject.provider.DefaultResolverProvider;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

@ExtendWith(MockitoExtension.class)
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
class RedissonConfigDiffblueTest {
  @InjectMocks
  private RedissonConfig redissonConfig;

  /**
   * Test {@link RedissonConfig#config()}.
   * <ul>
   *   <li>Given {@link RedissonConfig} (default constructor) ClientName is {@code Dr Jane Doe}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RedissonConfig#config()}
   */
  @Test
  @DisplayName("Test config(); given RedissonConfig (default constructor) ClientName is 'Dr Jane Doe'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Config RedissonConfig.config()"})
  void testConfig_givenRedissonConfigClientNameIsDrJaneDoe() throws Exception {
    // Arrange
    RedissonConfig redissonConfig2 = new RedissonConfig();
    redissonConfig2.setClientName("Dr Jane Doe");

    // Act
    Config actualConfigResult = redissonConfig2.config();

    // Assert
    assertTrue(actualConfigResult.getEventLoopGroup() instanceof NioEventLoopGroup);
    assertTrue(actualConfigResult.getCodecProvider() instanceof DefaultCodecProvider);
    assertTrue(actualConfigResult.getCodec() instanceof JsonJacksonCodec);
    assertTrue(actualConfigResult.getResolverProvider() instanceof DefaultResolverProvider);
    assertNull(actualConfigResult.getExecutor());
    assertEquals(0, actualConfigResult.getNettyThreads());
    assertEquals(0, actualConfigResult.getThreads());
    assertFalse(actualConfigResult.isClusterConfig());
    assertFalse(actualConfigResult.isUseLinuxNativeEpoll());
    assertTrue(actualConfigResult.isRedissonReferenceEnabled());
  }

  /**
   * Test {@link RedissonConfig#config()}.
   * <ul>
   *   <li>Given {@link RedissonConfig} (default constructor) ConnectionMinimumIdleSize is nine.</li>
   * </ul>
   * <p>
   * Method under test: {@link RedissonConfig#config()}
   */
  @Test
  @DisplayName("Test config(); given RedissonConfig (default constructor) ConnectionMinimumIdleSize is nine")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Config RedissonConfig.config()"})
  void testConfig_givenRedissonConfigConnectionMinimumIdleSizeIsNine() throws Exception {
    // Arrange
    RedissonConfig redissonConfig2 = new RedissonConfig();
    redissonConfig2.setConnectionMinimumIdleSize(9);

    // Act
    Config actualConfigResult = redissonConfig2.config();

    // Assert
    assertTrue(actualConfigResult.getEventLoopGroup() instanceof NioEventLoopGroup);
    assertTrue(actualConfigResult.getCodecProvider() instanceof DefaultCodecProvider);
    assertTrue(actualConfigResult.getCodec() instanceof JsonJacksonCodec);
    assertTrue(actualConfigResult.getResolverProvider() instanceof DefaultResolverProvider);
    assertNull(actualConfigResult.getExecutor());
    assertEquals(0, actualConfigResult.getNettyThreads());
    assertEquals(0, actualConfigResult.getThreads());
    assertFalse(actualConfigResult.isClusterConfig());
    assertFalse(actualConfigResult.isUseLinuxNativeEpoll());
    assertTrue(actualConfigResult.isRedissonReferenceEnabled());
  }

  /**
   * Test {@link RedissonConfig#config()}.
   * <ul>
   *   <li>Given {@link RedissonConfig} (default constructor) ConnectionMinimumIdleSize is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link RedissonConfig#config()}
   */
  @Test
  @DisplayName("Test config(); given RedissonConfig (default constructor) ConnectionMinimumIdleSize is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Config RedissonConfig.config()"})
  void testConfig_givenRedissonConfigConnectionMinimumIdleSizeIsOne() throws Exception {
    // Arrange
    RedissonConfig redissonConfig2 = new RedissonConfig();
    redissonConfig2.setConnectionMinimumIdleSize(1);

    // Act
    Config actualConfigResult = redissonConfig2.config();

    // Assert
    assertTrue(actualConfigResult.getEventLoopGroup() instanceof NioEventLoopGroup);
    assertTrue(actualConfigResult.getCodecProvider() instanceof DefaultCodecProvider);
    assertTrue(actualConfigResult.getCodec() instanceof JsonJacksonCodec);
    assertTrue(actualConfigResult.getResolverProvider() instanceof DefaultResolverProvider);
    assertNull(actualConfigResult.getExecutor());
    assertEquals(0, actualConfigResult.getNettyThreads());
    assertEquals(0, actualConfigResult.getThreads());
    assertFalse(actualConfigResult.isClusterConfig());
    assertFalse(actualConfigResult.isUseLinuxNativeEpoll());
    assertTrue(actualConfigResult.isRedissonReferenceEnabled());
  }

  /**
   * Test {@link RedissonConfig#config()}.
   * <ul>
   *   <li>Given {@link RedissonConfig} (default constructor) Database is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link RedissonConfig#config()}
   */
  @Test
  @DisplayName("Test config(); given RedissonConfig (default constructor) Database is one")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Config RedissonConfig.config()"})
  void testConfig_givenRedissonConfigDatabaseIsOne() throws Exception {
    // Arrange
    RedissonConfig redissonConfig2 = new RedissonConfig();
    redissonConfig2.setDatabase(1);

    // Act
    Config actualConfigResult = redissonConfig2.config();

    // Assert
    assertTrue(actualConfigResult.getEventLoopGroup() instanceof NioEventLoopGroup);
    assertTrue(actualConfigResult.getCodecProvider() instanceof DefaultCodecProvider);
    assertTrue(actualConfigResult.getCodec() instanceof JsonJacksonCodec);
    assertTrue(actualConfigResult.getResolverProvider() instanceof DefaultResolverProvider);
    assertNull(actualConfigResult.getExecutor());
    assertEquals(0, actualConfigResult.getNettyThreads());
    assertEquals(0, actualConfigResult.getThreads());
    assertFalse(actualConfigResult.isClusterConfig());
    assertFalse(actualConfigResult.isUseLinuxNativeEpoll());
    assertTrue(actualConfigResult.isRedissonReferenceEnabled());
  }

  /**
   * Test {@link RedissonConfig#config()}.
   * <ul>
   *   <li>Given {@link RedissonConfig} (default constructor) DnsMonitoringInterval is forty-two.</li>
   * </ul>
   * <p>
   * Method under test: {@link RedissonConfig#config()}
   */
  @Test
  @DisplayName("Test config(); given RedissonConfig (default constructor) DnsMonitoringInterval is forty-two")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Config RedissonConfig.config()"})
  void testConfig_givenRedissonConfigDnsMonitoringIntervalIsFortyTwo() throws Exception {
    // Arrange
    RedissonConfig redissonConfig2 = new RedissonConfig();
    redissonConfig2.setDnsMonitoringInterval(42);

    // Act
    Config actualConfigResult = redissonConfig2.config();

    // Assert
    assertTrue(actualConfigResult.getEventLoopGroup() instanceof NioEventLoopGroup);
    assertTrue(actualConfigResult.getCodecProvider() instanceof DefaultCodecProvider);
    assertTrue(actualConfigResult.getCodec() instanceof JsonJacksonCodec);
    assertTrue(actualConfigResult.getResolverProvider() instanceof DefaultResolverProvider);
    assertNull(actualConfigResult.getExecutor());
    assertEquals(0, actualConfigResult.getNettyThreads());
    assertEquals(0, actualConfigResult.getThreads());
    assertFalse(actualConfigResult.isClusterConfig());
    assertFalse(actualConfigResult.isUseLinuxNativeEpoll());
    assertTrue(actualConfigResult.isRedissonReferenceEnabled());
  }

  /**
   * Test {@link RedissonConfig#config()}.
   * <ul>
   *   <li>Given {@link RedissonConfig} (default constructor).</li>
   *   <li>Then EventLoopGroup return {@link NioEventLoopGroup}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RedissonConfig#config()}
   */
  @Test
  @DisplayName("Test config(); given RedissonConfig (default constructor); then EventLoopGroup return NioEventLoopGroup")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Config RedissonConfig.config()"})
  void testConfig_givenRedissonConfig_thenEventLoopGroupReturnNioEventLoopGroup() throws Exception {
    // Arrange and Act
    Config actualConfigResult = (new RedissonConfig()).config();

    // Assert
    assertTrue(actualConfigResult.getEventLoopGroup() instanceof NioEventLoopGroup);
    assertTrue(actualConfigResult.getCodecProvider() instanceof DefaultCodecProvider);
    assertTrue(actualConfigResult.getCodec() instanceof JsonJacksonCodec);
    assertTrue(actualConfigResult.getResolverProvider() instanceof DefaultResolverProvider);
    assertNull(actualConfigResult.getExecutor());
    assertEquals(0, actualConfigResult.getNettyThreads());
    assertEquals(0, actualConfigResult.getThreads());
    assertFalse(actualConfigResult.isClusterConfig());
    assertFalse(actualConfigResult.isUseLinuxNativeEpoll());
    assertTrue(actualConfigResult.isRedissonReferenceEnabled());
  }

  /**
   * Test getters and setters.
   * <p>
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
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String RedissonConfig.getAddress()", "String RedissonConfig.getClientName()",
      "String RedissonConfig.getCodec()", "int RedissonConfig.getConnectTimeout()",
      "int RedissonConfig.getConnectionMinimumIdleSize()", "int RedissonConfig.getConnectionPoolSize()",
      "int RedissonConfig.getDatabase()", "int RedissonConfig.getDnsMonitoringInterval()",
      "int RedissonConfig.getFailedAttempts()", "int RedissonConfig.getIdleConnectionTimeout()",
      "String RedissonConfig.getPassword()", "int RedissonConfig.getPingTimeout()",
      "int RedissonConfig.getReconnectionTimeout()", "int RedissonConfig.getRetryAttempts()",
      "int RedissonConfig.getRetryInterval()", "int RedissonConfig.getSubscriptionConnectionMinimumIdleSize()",
      "int RedissonConfig.getSubscriptionConnectionPoolSize()", "int RedissonConfig.getSubscriptionsPerConnection()",
      "int RedissonConfig.getThread()", "int RedissonConfig.getTimeout()", "boolean RedissonConfig.isDnsMonitoring()",
      "void RedissonConfig.setAddress(String)", "void RedissonConfig.setClientName(String)",
      "void RedissonConfig.setCodec(String)", "void RedissonConfig.setConnectTimeout(int)",
      "void RedissonConfig.setConnectionMinimumIdleSize(int)", "void RedissonConfig.setConnectionPoolSize(int)",
      "void RedissonConfig.setDatabase(int)", "void RedissonConfig.setDnsMonitoring(boolean)",
      "void RedissonConfig.setDnsMonitoringInterval(int)", "void RedissonConfig.setFailedAttempts(int)",
      "void RedissonConfig.setIdleConnectionTimeout(int)", "void RedissonConfig.setPassword(String)",
      "void RedissonConfig.setPingTimeout(int)", "void RedissonConfig.setReconnectionTimeout(int)",
      "void RedissonConfig.setRetryAttempts(int)", "void RedissonConfig.setRetryInterval(int)",
      "void RedissonConfig.setSubscriptionConnectionMinimumIdleSize(int)",
      "void RedissonConfig.setSubscriptionConnectionPoolSize(int)",
      "void RedissonConfig.setSubscriptionsPerConnection(int)", "void RedissonConfig.setThread(int)",
      "void RedissonConfig.setTimeout(int)"})
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

    // Assert
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
