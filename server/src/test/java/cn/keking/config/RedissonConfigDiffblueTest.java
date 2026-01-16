package cn.keking.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import cn.keking.utils.FtpUtilsFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import io.netty.channel.nio.NioEventLoopGroup;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.redisson.codec.DefaultCodecProvider;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;
import org.redisson.liveobject.provider.DefaultResolverProvider;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
class RedissonConfigDiffblueTest {
  /**
   * Test {@link RedissonConfig#config()}.
   *
   * <ul>
   *   <li>Given {@link RedissonConfig} (default constructor) ClientName is createValidFtpUrl.
   * </ul>
   *
   * <p>Method under test: {@link RedissonConfig#config()}
   */
  @Test
  @DisplayName(
      "Test config(); given RedissonConfig (default constructor) ClientName is createValidFtpUrl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Config RedissonConfig.config()"})
  void testConfig_givenRedissonConfigClientNameIsCreateValidFtpUrl() throws Exception {
    // Arrange
    RedissonConfig redissonConfig = new RedissonConfig();
    redissonConfig.setClientName(FtpUtilsFactory.createValidFtpUrl());

    // Act
    Config actualConfigResult = redissonConfig.config();

    // Assert
    assertTrue(actualConfigResult.getEventLoopGroup() instanceof NioEventLoopGroup);
    assertTrue(actualConfigResult.getCodecProvider() instanceof DefaultCodecProvider);
    assertTrue(actualConfigResult.getCodec() instanceof JsonJacksonCodec);
    assertTrue(actualConfigResult.getResolverProvider() instanceof DefaultResolverProvider);
    assertEquals(
        "---\n"
            + "singleServerConfig:\n"
            + "  idleConnectionTimeout: 10000\n"
            + "  pingTimeout: 1000\n"
            + "  connectTimeout: 10000\n"
            + "  timeout: 3000\n"
            + "  retryAttempts: 3\n"
            + "  retryInterval: 1500\n"
            + "  reconnectionTimeout: 3000\n"
            + "  failedAttempts: 3\n"
            + "  subscriptionsPerConnection: 5\n"
            + "  clientName: \"ftp://localhost/test/file.txt\"\n"
            + "  subscriptionConnectionMinimumIdleSize: 1\n"
            + "  subscriptionConnectionPoolSize: 50\n"
            + "  connectionMinimumIdleSize: 10\n"
            + "  connectionPoolSize: 64\n"
            + "  database: 0\n"
            + "  dnsMonitoring: false\n"
            + "  dnsMonitoringInterval: 5000\n"
            + "threads: 0\n"
            + "nettyThreads: 0\n"
            + "codec: !<org.redisson.codec.JsonJacksonCodec> {}\n"
            + "codecProvider: !<org.redisson.codec.DefaultCodecProvider> {}\n"
            + "resolverProvider: !<org.redisson.liveobject.provider.DefaultResolverProvider> {}\n"
            + "redissonReferenceEnabled: true\n"
            + "useLinuxNativeEpoll: false\n"
            + "eventLoopGroup:\n"
            + "  shuttingDown: false\n"
            + "  shutdown: false\n"
            + "  terminated: false\n",
        actualConfigResult.toYAML());
    assertEquals(
        "{\"singleServerConfig\":{\"idleConnectionTimeout\":10000,\"pingTimeout\":1000,\"connectTimeout\":10000,\"timeout"
            + "\":3000,\"retryAttempts\":3,\"retryInterval\":1500,\"reconnectionTimeout\":3000,\"failedAttempts\":3,"
            + "\"subscriptionsPerConnection\":5,\"clientName\":\"ftp://localhost/test/file.txt\",\"subscriptionConnectionM"
            + "inimumIdleSize\":1,\"subscriptionConnectionPoolSize\":50,\"connectionMinimumIdleSize\":10,\"connectionPoolSize"
            + "\":64,\"database\":0,\"dnsMonitoring\":false,\"dnsMonitoringInterval\":5000},\"threads\":0,\"nettyThreads\":0,"
            + "\"codec\":{\"class\":\"org.redisson.codec.JsonJacksonCodec\"},\"codecProvider\":{\"class\":\"org.redisson.codec"
            + ".DefaultCodecProvider\"},\"resolverProvider\":{\"class\":\"org.redisson.liveobject.provider.DefaultResolverProvider"
            + "\"},\"redissonReferenceEnabled\":true,\"useLinuxNativeEpoll\":false,\"eventLoopGroup\":{\"shuttingDown\":false"
            + ",\"shutdown\":false,\"terminated\":false}}",
        actualConfigResult.toJSON());
    assertNull(actualConfigResult.getExecutor());
    assertEquals(0, actualConfigResult.getNettyThreads());
    assertEquals(0, actualConfigResult.getThreads());
    assertFalse(actualConfigResult.isClusterConfig());
    assertFalse(actualConfigResult.isUseLinuxNativeEpoll());
    assertTrue(actualConfigResult.isRedissonReferenceEnabled());
  }

  /**
   * Test {@link RedissonConfig#config()}.
   *
   * <ul>
   *   <li>Given {@link RedissonConfig} (default constructor) Codec is {@code JsonJacksonCodec}.
   * </ul>
   *
   * <p>Method under test: {@link RedissonConfig#config()}
   */
  @Test
  @DisplayName(
      "Test config(); given RedissonConfig (default constructor) Codec is 'org.redisson.codec.JsonJacksonCodec'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Config RedissonConfig.config()"})
  void testConfig_givenRedissonConfigCodecIsOrgRedissonCodecJsonJacksonCodec() throws Exception {
    // Arrange
    RedissonConfig redissonConfig = new RedissonConfig();
    redissonConfig.setAddress("");
    redissonConfig.setCodec("org.redisson.codec.JsonJacksonCodec");

    // Act
    Config actualConfigResult = redissonConfig.config();

    // Assert
    assertTrue(actualConfigResult.getEventLoopGroup() instanceof NioEventLoopGroup);
    assertTrue(actualConfigResult.getCodecProvider() instanceof DefaultCodecProvider);
    assertTrue(actualConfigResult.getCodec() instanceof JsonJacksonCodec);
    assertTrue(actualConfigResult.getResolverProvider() instanceof DefaultResolverProvider);
    assertEquals(
        "---\n"
            + "singleServerConfig:\n"
            + "  idleConnectionTimeout: 10000\n"
            + "  pingTimeout: 1000\n"
            + "  connectTimeout: 10000\n"
            + "  timeout: 3000\n"
            + "  retryAttempts: 3\n"
            + "  retryInterval: 1500\n"
            + "  reconnectionTimeout: 3000\n"
            + "  failedAttempts: 3\n"
            + "  subscriptionsPerConnection: 5\n"
            + "  address:\n"
            + "  - \"//:\"\n"
            + "  subscriptionConnectionMinimumIdleSize: 1\n"
            + "  subscriptionConnectionPoolSize: 50\n"
            + "  connectionMinimumIdleSize: 10\n"
            + "  connectionPoolSize: 64\n"
            + "  database: 0\n"
            + "  dnsMonitoring: false\n"
            + "  dnsMonitoringInterval: 5000\n"
            + "threads: 0\n"
            + "nettyThreads: 0\n"
            + "codec: !<org.redisson.codec.JsonJacksonCodec> {}\n"
            + "codecProvider: !<org.redisson.codec.DefaultCodecProvider> {}\n"
            + "resolverProvider: !<org.redisson.liveobject.provider.DefaultResolverProvider> {}\n"
            + "redissonReferenceEnabled: true\n"
            + "useLinuxNativeEpoll: false\n"
            + "eventLoopGroup:\n"
            + "  shuttingDown: false\n"
            + "  shutdown: false\n"
            + "  terminated: false\n",
        actualConfigResult.toYAML());
    assertEquals(
        "{\"singleServerConfig\":{\"idleConnectionTimeout\":10000,\"pingTimeout\":1000,\"connectTimeout\":10000,\"timeout"
            + "\":3000,\"retryAttempts\":3,\"retryInterval\":1500,\"reconnectionTimeout\":3000,\"failedAttempts\":3,"
            + "\"subscriptionsPerConnection\":5,\"address\":[\"//:\"],\"subscriptionConnectionMinimumIdleSize\":1,"
            + "\"subscriptionConnectionPoolSize\":50,\"connectionMinimumIdleSize\":10,\"connectionPoolSize\":64,\"database"
            + "\":0,\"dnsMonitoring\":false,\"dnsMonitoringInterval\":5000},\"threads\":0,\"nettyThreads\":0,\"codec\":{\"class"
            + "\":\"org.redisson.codec.JsonJacksonCodec\"},\"codecProvider\":{\"class\":\"org.redisson.codec.DefaultCodecProvider"
            + "\"},\"resolverProvider\":{\"class\":\"org.redisson.liveobject.provider.DefaultResolverProvider\"},"
            + "\"redissonReferenceEnabled\":true,\"useLinuxNativeEpoll\":false,\"eventLoopGroup\":{\"shuttingDown\":false,"
            + "\"shutdown\":false,\"terminated\":false}}",
        actualConfigResult.toJSON());
    assertNull(actualConfigResult.getExecutor());
    assertEquals(0, actualConfigResult.getNettyThreads());
    assertEquals(0, actualConfigResult.getThreads());
    assertFalse(actualConfigResult.isClusterConfig());
    assertFalse(actualConfigResult.isUseLinuxNativeEpoll());
    assertTrue(actualConfigResult.isRedissonReferenceEnabled());
  }

  /**
   * Test {@link RedissonConfig#config()}.
   *
   * <ul>
   *   <li>Given {@link RedissonConfig} (default constructor) Password is createValidFtpUrl.
   * </ul>
   *
   * <p>Method under test: {@link RedissonConfig#config()}
   */
  @Test
  @DisplayName(
      "Test config(); given RedissonConfig (default constructor) Password is createValidFtpUrl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Config RedissonConfig.config()"})
  void testConfig_givenRedissonConfigPasswordIsCreateValidFtpUrl() throws Exception {
    // Arrange
    RedissonConfig redissonConfig = new RedissonConfig();
    redissonConfig.setPassword(FtpUtilsFactory.createValidFtpUrl());

    // Act
    Config actualConfigResult = redissonConfig.config();

    // Assert
    assertTrue(actualConfigResult.getEventLoopGroup() instanceof NioEventLoopGroup);
    assertTrue(actualConfigResult.getCodecProvider() instanceof DefaultCodecProvider);
    assertTrue(actualConfigResult.getCodec() instanceof JsonJacksonCodec);
    assertTrue(actualConfigResult.getResolverProvider() instanceof DefaultResolverProvider);
    assertEquals(
        "---\n"
            + "singleServerConfig:\n"
            + "  idleConnectionTimeout: 10000\n"
            + "  pingTimeout: 1000\n"
            + "  connectTimeout: 10000\n"
            + "  timeout: 3000\n"
            + "  retryAttempts: 3\n"
            + "  retryInterval: 1500\n"
            + "  reconnectionTimeout: 3000\n"
            + "  failedAttempts: 3\n"
            + "  password: \"ftp://localhost/test/file.txt\"\n"
            + "  subscriptionsPerConnection: 5\n"
            + "  subscriptionConnectionMinimumIdleSize: 1\n"
            + "  subscriptionConnectionPoolSize: 50\n"
            + "  connectionMinimumIdleSize: 10\n"
            + "  connectionPoolSize: 64\n"
            + "  database: 0\n"
            + "  dnsMonitoring: false\n"
            + "  dnsMonitoringInterval: 5000\n"
            + "threads: 0\n"
            + "nettyThreads: 0\n"
            + "codec: !<org.redisson.codec.JsonJacksonCodec> {}\n"
            + "codecProvider: !<org.redisson.codec.DefaultCodecProvider> {}\n"
            + "resolverProvider: !<org.redisson.liveobject.provider.DefaultResolverProvider> {}\n"
            + "redissonReferenceEnabled: true\n"
            + "useLinuxNativeEpoll: false\n"
            + "eventLoopGroup:\n"
            + "  shuttingDown: false\n"
            + "  shutdown: false\n"
            + "  terminated: false\n",
        actualConfigResult.toYAML());
    assertEquals(
        "{\"singleServerConfig\":{\"idleConnectionTimeout\":10000,\"pingTimeout\":1000,\"connectTimeout\":10000,\"timeout"
            + "\":3000,\"retryAttempts\":3,\"retryInterval\":1500,\"reconnectionTimeout\":3000,\"failedAttempts\":3,\"password"
            + "\":\"ftp://localhost/test/file.txt\",\"subscriptionsPerConnection\":5,\"subscriptionConnectionMinimumIdleSize"
            + "\":1,\"subscriptionConnectionPoolSize\":50,\"connectionMinimumIdleSize\":10,\"connectionPoolSize\":64,\"database"
            + "\":0,\"dnsMonitoring\":false,\"dnsMonitoringInterval\":5000},\"threads\":0,\"nettyThreads\":0,\"codec\":{\"class"
            + "\":\"org.redisson.codec.JsonJacksonCodec\"},\"codecProvider\":{\"class\":\"org.redisson.codec.DefaultCodecProvider"
            + "\"},\"resolverProvider\":{\"class\":\"org.redisson.liveobject.provider.DefaultResolverProvider\"},"
            + "\"redissonReferenceEnabled\":true,\"useLinuxNativeEpoll\":false,\"eventLoopGroup\":{\"shuttingDown\":false,"
            + "\"shutdown\":false,\"terminated\":false}}",
        actualConfigResult.toJSON());
    assertNull(actualConfigResult.getExecutor());
    assertEquals(0, actualConfigResult.getNettyThreads());
    assertEquals(0, actualConfigResult.getThreads());
    assertFalse(actualConfigResult.isClusterConfig());
    assertFalse(actualConfigResult.isUseLinuxNativeEpoll());
    assertTrue(actualConfigResult.isRedissonReferenceEnabled());
  }

  /**
   * Test {@link RedissonConfig#config()}.
   *
   * <ul>
   *   <li>Given {@link RedissonConfig} (default constructor) Password is empty string.
   * </ul>
   *
   * <p>Method under test: {@link RedissonConfig#config()}
   */
  @Test
  @DisplayName("Test config(); given RedissonConfig (default constructor) Password is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Config RedissonConfig.config()"})
  void testConfig_givenRedissonConfigPasswordIsEmptyString() throws Exception {
    // Arrange
    RedissonConfig redissonConfig = new RedissonConfig();
    redissonConfig.setPassword("");

    // Act
    Config actualConfigResult = redissonConfig.config();

    // Assert
    assertTrue(actualConfigResult.getEventLoopGroup() instanceof NioEventLoopGroup);
    assertTrue(actualConfigResult.getCodecProvider() instanceof DefaultCodecProvider);
    assertTrue(actualConfigResult.getCodec() instanceof JsonJacksonCodec);
    assertTrue(actualConfigResult.getResolverProvider() instanceof DefaultResolverProvider);
    assertEquals(
        "---\n"
            + "singleServerConfig:\n"
            + "  idleConnectionTimeout: 10000\n"
            + "  pingTimeout: 1000\n"
            + "  connectTimeout: 10000\n"
            + "  timeout: 3000\n"
            + "  retryAttempts: 3\n"
            + "  retryInterval: 1500\n"
            + "  reconnectionTimeout: 3000\n"
            + "  failedAttempts: 3\n"
            + "  subscriptionsPerConnection: 5\n"
            + "  subscriptionConnectionMinimumIdleSize: 1\n"
            + "  subscriptionConnectionPoolSize: 50\n"
            + "  connectionMinimumIdleSize: 10\n"
            + "  connectionPoolSize: 64\n"
            + "  database: 0\n"
            + "  dnsMonitoring: false\n"
            + "  dnsMonitoringInterval: 5000\n"
            + "threads: 0\n"
            + "nettyThreads: 0\n"
            + "codec: !<org.redisson.codec.JsonJacksonCodec> {}\n"
            + "codecProvider: !<org.redisson.codec.DefaultCodecProvider> {}\n"
            + "resolverProvider: !<org.redisson.liveobject.provider.DefaultResolverProvider> {}\n"
            + "redissonReferenceEnabled: true\n"
            + "useLinuxNativeEpoll: false\n"
            + "eventLoopGroup:\n"
            + "  shuttingDown: false\n"
            + "  shutdown: false\n"
            + "  terminated: false\n",
        actualConfigResult.toYAML());
    assertEquals(
        "{\"singleServerConfig\":{\"idleConnectionTimeout\":10000,\"pingTimeout\":1000,\"connectTimeout\":10000,"
            + "\"timeout\":3000,\"retryAttempts\":3,\"retryInterval\":1500,\"reconnectionTimeout\":3000,\"failedAttempts\":3"
            + ",\"subscriptionsPerConnection\":5,\"subscriptionConnectionMinimumIdleSize\":1,\"subscriptionConnectionPoolSize"
            + "\":50,\"connectionMinimumIdleSize\":10,\"connectionPoolSize\":64,\"database\":0,\"dnsMonitoring\":false,"
            + "\"dnsMonitoringInterval\":5000},\"threads\":0,\"nettyThreads\":0,\"codec\":{\"class\":\"org.redisson.codec"
            + ".JsonJacksonCodec\"},\"codecProvider\":{\"class\":\"org.redisson.codec.DefaultCodecProvider\"},\"resolverProvider"
            + "\":{\"class\":\"org.redisson.liveobject.provider.DefaultResolverProvider\"},\"redissonReferenceEnabled\""
            + ":true,\"useLinuxNativeEpoll\":false,\"eventLoopGroup\":{\"shuttingDown\":false,\"shutdown\":false,\"terminated"
            + "\":false}}",
        actualConfigResult.toJSON());
    assertNull(actualConfigResult.getExecutor());
    assertEquals(0, actualConfigResult.getNettyThreads());
    assertEquals(0, actualConfigResult.getThreads());
    assertFalse(actualConfigResult.isClusterConfig());
    assertFalse(actualConfigResult.isUseLinuxNativeEpoll());
    assertTrue(actualConfigResult.isRedissonReferenceEnabled());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
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
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String RedissonConfig.getAddress()",
    "String RedissonConfig.getClientName()",
    "String RedissonConfig.getCodec()",
    "int RedissonConfig.getConnectTimeout()",
    "int RedissonConfig.getConnectionMinimumIdleSize()",
    "int RedissonConfig.getConnectionPoolSize()",
    "int RedissonConfig.getDatabase()",
    "int RedissonConfig.getDnsMonitoringInterval()",
    "int RedissonConfig.getFailedAttempts()",
    "int RedissonConfig.getIdleConnectionTimeout()",
    "String RedissonConfig.getPassword()",
    "int RedissonConfig.getPingTimeout()",
    "int RedissonConfig.getReconnectionTimeout()",
    "int RedissonConfig.getRetryAttempts()",
    "int RedissonConfig.getRetryInterval()",
    "int RedissonConfig.getSubscriptionConnectionMinimumIdleSize()",
    "int RedissonConfig.getSubscriptionConnectionPoolSize()",
    "int RedissonConfig.getSubscriptionsPerConnection()",
    "int RedissonConfig.getThread()",
    "int RedissonConfig.getTimeout()",
    "boolean RedissonConfig.isDnsMonitoring()",
    "void RedissonConfig.setAddress(String)",
    "void RedissonConfig.setClientName(String)",
    "void RedissonConfig.setCodec(String)",
    "void RedissonConfig.setConnectTimeout(int)",
    "void RedissonConfig.setConnectionMinimumIdleSize(int)",
    "void RedissonConfig.setConnectionPoolSize(int)",
    "void RedissonConfig.setDatabase(int)",
    "void RedissonConfig.setDnsMonitoring(boolean)",
    "void RedissonConfig.setDnsMonitoringInterval(int)",
    "void RedissonConfig.setFailedAttempts(int)",
    "void RedissonConfig.setIdleConnectionTimeout(int)",
    "void RedissonConfig.setPassword(String)",
    "void RedissonConfig.setPingTimeout(int)",
    "void RedissonConfig.setReconnectionTimeout(int)",
    "void RedissonConfig.setRetryAttempts(int)",
    "void RedissonConfig.setRetryInterval(int)",
    "void RedissonConfig.setSubscriptionConnectionMinimumIdleSize(int)",
    "void RedissonConfig.setSubscriptionConnectionPoolSize(int)",
    "void RedissonConfig.setSubscriptionsPerConnection(int)",
    "void RedissonConfig.setThread(int)",
    "void RedissonConfig.setTimeout(int)"
  })
  void testGettersAndSetters() {
    // Arrange
    RedissonConfig redissonConfig = new RedissonConfig();

    // Act
    redissonConfig.setAddress(FtpUtilsFactory.createValidFtpUrl());
    redissonConfig.setClientName(FtpUtilsFactory.createValidFtpUrl());
    redissonConfig.setCodec(FtpUtilsFactory.createValidFtpUrl());
    redissonConfig.setConnectTimeout(10);
    redissonConfig.setConnectionMinimumIdleSize(1);
    redissonConfig.setConnectionPoolSize(3);
    redissonConfig.setDatabase(1);
    redissonConfig.setDnsMonitoring(true);
    redissonConfig.setDnsMonitoringInterval(42);
    redissonConfig.setFailedAttempts(1);
    redissonConfig.setIdleConnectionTimeout(1);
    redissonConfig.setPassword(FtpUtilsFactory.createValidFtpUrl());
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
    int actualSubscriptionConnectionMinimumIdleSize =
        redissonConfig.getSubscriptionConnectionMinimumIdleSize();
    int actualSubscriptionConnectionPoolSize = redissonConfig.getSubscriptionConnectionPoolSize();
    int actualSubscriptionsPerConnection = redissonConfig.getSubscriptionsPerConnection();
    int actualThread = redissonConfig.getThread();
    int actualTimeout = redissonConfig.getTimeout();

    // Assert
    assertEquals("ftp://localhost/test/file.txt", actualAddress);
    assertEquals("ftp://localhost/test/file.txt", actualClientName);
    assertEquals("ftp://localhost/test/file.txt", actualCodec);
    assertEquals("ftp://localhost/test/file.txt", actualPassword);
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
