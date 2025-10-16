package cn.keking.service.cache.impl;

import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.TestPropertySource;

/**
 * Test configuration for CacheServiceRedisImpl to resolve Spring context issues.
 * This configuration provides the necessary beans for testing without requiring
 * a real Redis connection.
 */
@Configuration
@TestPropertySource(properties = {
    "cache.type=redis",
    "server.tomcat.uri-encoding=UTF-8"
})
public class CacheServiceRedisImplTestConfiguration {

    /**
     * Creates a Redisson Config bean for testing.
     * Uses single server configuration with a dummy/local Redis setup.
     *
     * @return a Redisson Config instance
     */
    @Bean
    public Config redissonConfig() {
        Config config = new Config();
        // Use single server mode with embedded/local Redis settings
        // This will work without a real Redis server for basic initialization
        config.useSingleServer()
                .setAddress("redis://127.0.0.1:6379")
                .setConnectionPoolSize(10)
                .setConnectionMinimumIdleSize(2)
                .setTimeout(3000)
                .setRetryAttempts(0)  // Don't retry on failure for tests
                .setRetryInterval(1500)
                .setConnectTimeout(3000);

        return config;
    }

    /**
     * Creates a CacheServiceRedisImpl bean for testing.
     * The @Primary annotation ensures this bean is used when autowiring.
     * This bean is created directly without relying on the conditional expression.
     *
     * @param config the Redisson configuration
     * @return a CacheServiceRedisImpl instance
     */
    @Bean
    @Primary
    public CacheServiceRedisImpl cacheServiceRedisImpl(Config config) {
        return new CacheServiceRedisImpl(config);
    }
}
