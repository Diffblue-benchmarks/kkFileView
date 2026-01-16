package cn.keking;

import cn.keking.config.TestOfficeConfig;
import org.springframework.context.annotation.Import;

/**
 * Base class for Diffblue tests that imports test configuration.
 * This prevents OfficePluginManager from failing during test context initialization
 * when no actual office installation is available.
 *
 * The TestOfficeConfig provides a mock OfficePluginManager bean that takes precedence
 * over the real implementation during tests.
 */
@Import(TestOfficeConfig.class)
public abstract class DiffblueTestBase {
    // This class serves as a base for tests that need Spring context support
    // The @Import annotation ensures TestOfficeConfig is loaded for all tests extending this class
}
