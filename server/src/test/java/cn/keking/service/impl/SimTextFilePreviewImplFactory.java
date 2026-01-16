package cn.keking.service.impl;

import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating test instances for SimTextFilePreviewImpl tests.
 */
public class SimTextFilePreviewImplFactory {

    /**
     * Creates a valid FileAttribute instance for testing.
     * This prevents NullPointerException by ensuring all required fields are initialized.
     */
    @InterestingTestFactory
    public static FileAttribute createFileAttribute() {
        FileAttribute fileAttribute = new FileAttribute();
        fileAttribute.setName("test.txt");
        fileAttribute.setType(FileType.SIMTEXT);
        fileAttribute.setSuffix("txt");
        fileAttribute.setUrl("http://example.com/test.txt");
        fileAttribute.setOriginFilePath("/tmp/test.txt");
        fileAttribute.setOutFilePath("/tmp/test-output.txt");
        fileAttribute.setCacheName("test-cache.txt");
        fileAttribute.setForceUpdatedCache(false);
        fileAttribute.setSkipDownLoad(false);
        return fileAttribute;
    }
}
