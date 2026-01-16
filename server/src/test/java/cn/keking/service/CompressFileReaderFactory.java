package cn.keking.service;

import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import com.diffblue.cover.annotations.InterestingTestFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Factory class for creating test instances for CompressFileReader tests.
 */
public class CompressFileReaderFactory {

    /**
     * Creates a valid FileAttribute instance for testing.
     * This prevents NullPointerException in CompressFileReader.unRar.
     */
    @InterestingTestFactory
    public static FileAttribute createFileAttribute() {
        FileAttribute fileAttribute = new FileAttribute();
        fileAttribute.setName("test.rar");
        fileAttribute.setType(FileType.COMPRESS);
        fileAttribute.setSuffix("rar");
        fileAttribute.setUrl("http://example.com/test.rar");
        fileAttribute.setOriginFilePath("/tmp/test.rar");
        fileAttribute.setOutFilePath("/tmp/test-output.rar");
        fileAttribute.setCacheName("test-cache.rar");
        fileAttribute.setCompressFile(false);
        fileAttribute.setForceUpdatedCache(false);
        fileAttribute.setSkipDownLoad(false);
        return fileAttribute;
    }

    /**
     * Creates a valid temporary RAR file path for testing.
     * This ensures the file exists to prevent FileNotFoundException.
     */
    @InterestingTestFactory
    public static String createValidRarFilePath() {
        try {
            File tempFile = File.createTempFile("test", ".rar");
            tempFile.deleteOnExit();
            // Write minimal RAR file header to make it a valid file
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                // Write something to the file so it's not empty
                fos.write(new byte[]{0x52, 0x61, 0x72, 0x21, 0x1A, 0x07, 0x00}); // RAR signature
            }
            return tempFile.getAbsolutePath();
        } catch (IOException e) {
            return "/tmp/test.rar";
        }
    }
}
