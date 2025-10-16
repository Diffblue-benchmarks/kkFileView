package cn.keking.service.cache.impl;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * Test configuration for CacheServiceJDKImpl to resolve Spring context issues.
 * This configuration provides the necessary beans for testing without requiring
 * the conditional expression to be satisfied.
 */
@TestConfiguration
public class CacheServiceJDKImplTestConfiguration {

    /**
     * Creates a CacheServiceJDKImpl bean for testing.
     * The @Primary annotation ensures this bean is used when autowiring.
     *
     * @return a properly initialized CacheServiceJDKImpl instance
     */
    @Bean
    @Primary
    public CacheServiceJDKImpl cacheServiceJDKImpl() {
        CacheServiceJDKImpl cacheService = new CacheServiceJDKImpl();
        // Manually call initCache since @PostConstruct may not be triggered in test context
        cacheService.initCache();
        return cacheService;
    }
}
