package cn.keking.service.cache.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.TestPropertySource;

/**
 * Test configuration for CacheServiceJDKImpl to resolve Spring context issues.
 * This configuration provides the necessary beans for testing without requiring
 * the conditional expression to be satisfied.
 *
 * Note: Using @Configuration instead of @TestConfiguration to ensure it's
 * automatically picked up by component scanning in test contexts.
 */
@Configuration
@TestPropertySource(properties = {
    "cache.type=jdk",
    "server.tomcat.uri-encoding=UTF-8"
})
public class CacheServiceJDKImplTestConfiguration {

    /**
     * Creates a CacheServiceJDKImpl bean for testing.
     * The @Primary annotation ensures this bean is used when autowiring.
     * This bean is created directly without relying on the conditional expression.
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

