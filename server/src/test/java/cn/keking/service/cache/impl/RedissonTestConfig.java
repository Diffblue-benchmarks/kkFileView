package cn.keking.service.cache.impl;

import org.redisson.config.Config;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Provides a Redisson Config bean for test contexts.
 * This configuration is automatically picked up when Spring needs a Config bean
 * for CacheServiceRedisImpl constructor injection.
 */
@Configuration
public class RedissonTestConfig {

    /**
     * Creates a Redisson Config bean for testing.
     * Only created if no other Config bean is defined.
     * Uses single server configuration with local/test Redis settings.
     *
     * @return a Redisson Config instance
     */
    @Bean
    @ConditionalOnMissingBean
    public Config redissonConfig() {
        Config config = new Config();
        // Use single server mode with test Redis settings
        // Set retry attempts to 0 to avoid hanging on connection failures during tests
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
}
