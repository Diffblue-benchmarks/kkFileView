package cn.keking.web.controller;

import cn.keking.config.ConfigConstants;
import cn.keking.web.controller.FileController;
import com.diffblue.cover.annotations.InterestingTestFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Test factory for FileController to help Diffblue Cover generate tests.
 * Ensures ConfigConstants is properly initialized to prevent NullPointerException.
 */
public class FileControllerTestFactory {

    /**
     * Factory method to create a FileController with properly initialized ConfigConstants.
     * This prevents NullPointerException when accessing ConfigConstants.getDeleteCaptcha().
     *
     * @return a FileController instance with initialized configuration
     */
    @InterestingTestFactory
    public static FileController createFileController() {
        // Initialize ConfigConstants fields to prevent NPE
        ConfigConstants.setDeleteCaptchaValue(false);
        ConfigConstants.setPasswordValue("123456");
        ConfigConstants.setFileUploadDisableValue(false);
        ConfigConstants.setFileDirValue(System.getProperty("java.io.tmpdir") + File.separator + "kkfileview" + File.separator);
        ConfigConstants.setProhibitValue(new String[]{"exe", "dll"});

        return new FileController();
    }

    /**
     * Factory method to create a MultipartFile for testing file upload operations.
     * This prevents MultipartException: Current request is not a multipart request.
     *
     * @return a MultipartFile instance with test data
     */
    @InterestingTestFactory
    public static MultipartFile createMultipartFile() {
        return new MultipartFile() {
            private final byte[] content = "Test file content".getBytes();

            @Override
            public String getName() {
                return "file";
            }

            @Override
            public String getOriginalFilename() {
                return "test-document.txt";
            }

            @Override
            public String getContentType() {
                return "text/plain";
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public long getSize() {
                return content.length;
            }

            @Override
            public byte[] getBytes() throws IOException {
                return content;
            }

            @Override
            public InputStream getInputStream() throws IOException {
                return new ByteArrayInputStream(content);
            }

            @Override
            public void transferTo(File dest) throws IOException, IllegalStateException {
                // Not implemented for test purposes
            }
        };
    }
}
