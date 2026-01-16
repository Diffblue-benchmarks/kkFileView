package cn.keking.config;

import cn.keking.service.OfficePluginManager;
import org.mockito.Mockito;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * Test configuration that provides a mock OfficePluginManager bean.
 * This prevents the real OfficePluginManager from being initialized during tests,
 * avoiding failures when no actual office installation is available.
 */
@TestConfiguration
public class TestOfficeConfig {

    /**
     * Provides a mock OfficePluginManager bean for testing.
     * The @Primary annotation ensures this bean takes precedence over the real one.
     *
     * @return a mock instance of OfficePluginManager
     */
    @Bean
    @Primary
    public OfficePluginManager officePluginManager() {
        return Mockito.mock(OfficePluginManager.class);
    }
}
