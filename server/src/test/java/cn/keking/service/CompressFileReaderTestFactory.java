package cn.keking.service;

import cn.keking.config.ConfigConstants;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import cn.keking.service.cache.CacheService;
import cn.keking.web.filter.BaseUrlFilter;
import com.diffblue.cover.annotations.InterestingTestFactory;
import org.mockito.Mockito;

import java.io.File;

/**
 * Test factory for CompressFileReader to help Diffblue Cover generate tests.
 * Ensures ConfigConstants and BaseUrlFilter are properly initialized to prevent exceptions.
 */
public class CompressFileReaderTestFactory {

    /**
     * Factory method to create a CompressFileReader instance with properly initialized dependencies.
     * This prevents NullPointerException and other exceptions during test generation.
     *
     * @return a CompressFileReader instance with initialized configuration
     */
    @InterestingTestFactory
    public static CompressFileReader createCompressFileReader() {
        // Initialize ConfigConstants fields to prevent NPE
        ConfigConstants.setFileDirValue(System.getProperty("java.io.tmpdir") + File.separator + "kkfileview" + File.separator);
        ConfigConstants.setBaseUrlValue("http://localhost:8080");
        ConfigConstants.setOfficePreviewTypeValue("image");
        ConfigConstants.setCacheEnabledValueValue(true);
        ConfigConstants.setCadThreadValue(5);

        // Create a mock CacheService to avoid real cache interactions
        CacheService mockCacheService = Mockito.mock(CacheService.class);

        // Create FileHandlerService with the mock cache service
        FileHandlerService fileHandlerService = new FileHandlerService(mockCacheService);


        return new CompressFileReader(fileHandlerService);
    }

    /**
     * Factory method to create a FileAttribute instance for testing unRar method.
     * This ensures the FileAttribute has all required fields properly initialized.
     *
     * @return a properly initialized FileAttribute instance
     */
    @InterestingTestFactory
    public static FileAttribute createFileAttribute() {
        FileAttribute fileAttribute = new FileAttribute();
        fileAttribute.setType(FileType.COMPRESS);
        fileAttribute.setSuffix("rar");
        fileAttribute.setName("test-archive.rar");
        fileAttribute.setUrl("http://example.com/test-archive.rar");
        fileAttribute.setOfficePreviewType("image");
        fileAttribute.setFilePassword(null);
        fileAttribute.setUsePasswordCache(false);
        fileAttribute.setCompressFile(false);
        fileAttribute.setSkipDownLoad(false);
        fileAttribute.setForceUpdatedCache(false);
        fileAttribute.setHtmlView(false);
        return fileAttribute;
    }
}
