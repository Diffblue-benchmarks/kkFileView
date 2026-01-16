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
        // Return a valid FTP URL with proper protocol
        return "ftp://localhost/test/file.txt";
    }
}
