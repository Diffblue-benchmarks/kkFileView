package cn.keking.utils;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating test instances for FtpUtils tests.
 */
public class FtpUtilsFactory {

    /**
     * Creates a valid FTP URL string to prevent MalformedURLException.
     * The URL must have a proper protocol (ftp://) to avoid "no protocol" error.
     */
    @InterestingTestFactory
    public static String createValidFtpUrl() {
        // Return a valid FTP URL with proper protocol and valid hostname format
        // Using 127.0.0.1 instead of "ftp://localhost" to avoid invalid IPv6 address literal error
        return "ftp://127.0.0.1/test/file.txt";
    }

    /**
     * Creates a valid hostname string for FTP connection.
     * Returns a proper hostname to prevent UnknownHostException with invalid IPv6 address literal.
     */
    @InterestingTestFactory
    public static String createValidFtpHost() {
        // Return a valid IP address instead of a URL to avoid parsing issues
        return "127.0.0.1";
    }
}
