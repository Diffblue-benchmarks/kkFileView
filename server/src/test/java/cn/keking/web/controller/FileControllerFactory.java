package cn.keking.web.controller;

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
     */
    @InterestingTestFactory
    public static HttpServletRequest createHttpServletRequestWithSession() {
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
     */
    @InterestingTestFactory
    public static MultipartFile createMultipartFile() {
        return new MockMultipartFile(
            "file",
            "test-document.txt",
            "text/plain",
            "Test file content for upload".getBytes()
        );
    }
}
