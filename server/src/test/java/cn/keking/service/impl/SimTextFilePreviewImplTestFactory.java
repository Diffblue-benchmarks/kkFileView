package cn.keking.service.impl;

import cn.keking.config.ConfigConstants;
import cn.keking.service.FileHandlerService;
import cn.keking.service.cache.CacheService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Test factory for SimTextFilePreviewImpl to help Diffblue Cover generate tests.
 */
public class SimTextFilePreviewImplTestFactory {

    /**
     * Factory method to create a valid SimTextFilePreviewImpl instance for testing.
     * This prevents NullPointerException during test generation for filePreviewHandle method.
     *
     * @return a properly initialized SimTextFilePreviewImpl instance
     */
    @InterestingTestFactory
    public static SimTextFilePreviewImpl createSimTextFilePreviewImpl() {
        // Initialize ConfigConstants to prevent NPE
        ConfigConstants.setCacheEnabledValueValue(true);
        ConfigConstants.setFileDirValue("C:/temp/test-files/");

        // Create CacheService implementation
        CacheServiceJDKImpl cacheService = new CacheServiceJDKImpl();
        cacheService.initCache();

        // Create FileHandlerService with the cache service
        FileHandlerService fileHandlerService = new FileHandlerService(cacheService);

        // Create OtherFilePreviewImpl
        OtherFilePreviewImpl otherFilePreview = new OtherFilePreviewImpl();

        // Create and return SimTextFilePreviewImpl with required dependencies
        return new SimTextFilePreviewImpl(fileHandlerService, otherFilePreview);
    }
}
