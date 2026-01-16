package cn.keking.web.filter;

import com.diffblue.cover.annotations.InterestingTestFactory;
import org.springframework.mock.web.MockHttpServletRequest;

import javax.servlet.ServletRequest;

/**
 * Factory class for creating test instances for TrustHostFilter tests.
 */
public class TrustHostFilterFactory {

    /**
     * Creates a valid ServletRequest with proper URL parameters to prevent AssertionError.
     * The filter's doFilter method expects WebUtils.getHost(url) to return a non-null host,
     * which requires a valid URL with protocol and host.
     */
    @InterestingTestFactory
    public static ServletRequest createServletRequestWithValidUrl() {
        MockHttpServletRequest request = new MockHttpServletRequest();
        // Set a valid URL parameter that will produce a non-null host
        // Using Base64 encoding as expected by WebUtils.decodeUrl
        // "http://localhost/test" encoded in Base64
        request.addParameter("url", "aHR0cDovL2xvY2FsaG9zdC90ZXN0");
        return request;
    }
}
