package cn.keking.config;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Test factory for WebConfig to help Diffblue Cover generate tests.
 */
public class WebConfigTestFactory {

    /**
     * Factory method to create a valid WebConfig instance for testing.
     * This initializes ConfigConstants to prevent NullPointerException
     * when addResourceHandlers is called.
     *
     * @return a properly initialized WebConfig instance
     */
    @InterestingTestFactory
    public static WebConfig createWebConfig() {
        // Initialize ConfigConstants static fields to prevent NPE
        ConfigConstants.setFileDirValue("C:/temp/test-files/");
        ConfigConstants.setBaseUrlValue("http://localhost:8080");
        ConfigConstants.setCacheEnabledValueValue(true);

        return new WebConfig();
    }
}
