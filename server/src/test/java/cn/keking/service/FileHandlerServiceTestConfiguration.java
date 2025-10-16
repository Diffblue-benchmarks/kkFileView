package cn.keking.service;

import cn.keking.config.ConfigConstants;
import cn.keking.service.cache.CacheService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * Test configuration for FileHandlerService to resolve Spring context issues.
 * This configuration provides the necessary beans for testing without requiring
 * a full Spring Boot application context.
 */
@TestConfiguration
public class FileHandlerServiceTestConfiguration {

    /**
     * Creates a ConfigConstants bean for testing.
     * Initializes necessary static fields to prevent NPE during test execution.
     *
     * @return a properly initialized ConfigConstants instance
     */
    @Bean
    public ConfigConstants configConstants() {
        ConfigConstants config = new ConfigConstants();

        // Initialize all required static fields
        ConfigConstants.setFileDirValue("C:/temp/test-files/");
        ConfigConstants.setCacheEnabledValueValue(true);
        ConfigConstants.setCadThreadValue(5);
        ConfigConstants.setCadTimeoutValue("90");
        ConfigConstants.setPdfTimeoutValue(90);
        ConfigConstants.setPdfTimeout80Value(180);
        ConfigConstants.setPdfTimeout200Value(300);
        ConfigConstants.setPdf2JpgDpiValue(105);
        ConfigConstants.setCadPreviewTypeValue("pdf");
        ConfigConstants.setTifPreviewTypeValue("tif");

        return config;
    }

    /**
     * Creates a CacheService bean for testing.
     *
     * @return a properly initialized CacheService instance
     */
    @Bean
    public CacheService cacheService() {
        CacheServiceJDKImpl cacheService = new CacheServiceJDKImpl();
        cacheService.initCache();
        return cacheService;
    }

    /**
     * Creates a FileHandlerService bean for testing.
     * The @Primary annotation ensures this bean is used when autowiring.
     *
     * @param cacheService the cache service dependency
     * @return a properly initialized FileHandlerService instance
     */
    @Bean
    @Primary
    public FileHandlerService fileHandlerService(CacheService cacheService) {
        FileHandlerService fileHandlerService = new FileHandlerService(cacheService);

        // Manually call afterPropertiesSet to initialize the thread pool
        try {
            fileHandlerService.afterPropertiesSet();
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize FileHandlerService", e);
        }

        return fileHandlerService;
    }
}
