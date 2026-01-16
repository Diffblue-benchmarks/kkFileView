package cn.keking.utils;

import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating test instances for DownloadUtils tests.
 */
public class DownloadUtilsFactory {

    /**
     * Creates a valid FileAttribute instance to prevent NullPointerException.
     * This factory method ensures all required fields are properly initialized.
     */
    @InterestingTestFactory
    public static FileAttribute createValidFileAttribute() {
        FileAttribute fileAttribute = new FileAttribute();
        fileAttribute.setName("test-file.txt");
        fileAttribute.setType(FileType.SIMTEXT);
        fileAttribute.setSuffix("txt");
        fileAttribute.setUrl("http://example.com/test-file.txt");
        fileAttribute.setOriginFilePath("/tmp/test-file.txt");
        fileAttribute.setOutFilePath("/tmp/test-output.txt");
        fileAttribute.setCacheName("test-cache.txt");
        fileAttribute.setCompressFile(false);
        fileAttribute.setForceUpdatedCache(false);
        fileAttribute.setSkipDownLoad(false);
        fileAttribute.setHtmlView(false);
        return fileAttribute;
    }

    /**
     * Creates a valid file name string for download operations.
     * This prevents NullPointerException when processing file names.
     */
    @InterestingTestFactory
    public static String createValidFileName() {
        return "test-download-file.txt";
    }
}
