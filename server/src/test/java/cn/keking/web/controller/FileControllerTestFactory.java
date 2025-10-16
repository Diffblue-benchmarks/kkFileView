package cn.keking.web.controller;

import cn.keking.config.ConfigConstants;
import cn.keking.web.controller.FileController;
import com.diffblue.cover.annotations.InterestingTestFactory;

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

        return new FileController();
    }
}
