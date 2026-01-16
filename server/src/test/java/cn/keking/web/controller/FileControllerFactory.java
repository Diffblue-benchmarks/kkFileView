package cn.keking.web.controller;

import cn.keking.config.ConfigConstants;
import com.diffblue.cover.annotations.InterestingTestFactory;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Factory class for creating test instances for FileController tests.
 */
public class FileControllerFactory {

    /**
     * Creates a valid HttpServletRequest with a session to prevent NullPointerException.
     * This is used for captcha and deleteFile methods that require session attributes.
     * Also initializes ConfigConstants to prevent NPE when accessing configuration values.
     */
    @InterestingTestFactory
    public static HttpServletRequest createHttpServletRequestWithSession() {
        // Initialize ConfigConstants to prevent NPE in captcha method
        ConfigConstants.setDeleteCaptchaValue(false);
        ConfigConstants.setFileUploadDisableValue(false);

        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpSession session = new MockHttpSession();
        request.setSession(session);
        return request;
    }

    /**
     * Creates a valid HttpServletResponse for captcha method.
     */
    @InterestingTestFactory
    public static HttpServletResponse createHttpServletResponse() {
        return new MockHttpServletResponse();
    }

    /**
     * Creates a valid MultipartFile for file upload testing.
     * This prevents MultipartException by providing a proper multipart file.
     * Also initializes ConfigConstants to prevent NPE when checking file upload settings.
     */
    @InterestingTestFactory
    public static MultipartFile createMultipartFile() {
        // Initialize ConfigConstants to prevent NPE in fileUpload method
        ConfigConstants.setFileUploadDisableValue(false);

        return new MockMultipartFile(
            "file",
            "test-document.txt",
            "text/plain",
            "Test file content for upload".getBytes()
        );
    }
}
