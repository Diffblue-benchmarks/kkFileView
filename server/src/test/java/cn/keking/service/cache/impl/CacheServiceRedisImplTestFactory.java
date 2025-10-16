package cn.keking.service.cache.impl;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.redisson.config.Config;

/**
 * Test factory for CacheServiceRedisImpl to help Diffblue Cover generate tests.
 */
public class CacheServiceRedisImplTestFactory {

    /**
     * Factory method to create a valid Redisson Config for testing.
     * This prevents initialization errors when creating CacheServiceRedisImpl.
     *
     * @return a properly initialized Redisson Config instance
     */
    @InterestingTestFactory
    public static Config createRedissonConfig() {
        Config config = new Config();
        // Use single server mode with local Redis settings
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

    /**
     * Factory method to create a valid CacheServiceRedisImpl instance for testing.
     * This prevents NullPointerException during test generation.
     *
     * @return a properly initialized CacheServiceRedisImpl instance
     */
    @InterestingTestFactory
    public static CacheServiceRedisImpl createCacheServiceRedisImpl() {
        Config config = createRedissonConfig();
        return new CacheServiceRedisImpl(config);
    }
}
