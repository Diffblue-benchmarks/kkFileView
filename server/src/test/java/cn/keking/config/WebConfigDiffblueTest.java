package cn.keking.config;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import cn.keking.web.filter.AttributeSetFilter;
import cn.keking.web.filter.BaseUrlFilter;
import cn.keking.web.filter.ChinesePathFilter;
import cn.keking.web.filter.TrustDirFilter;
import cn.keking.web.filter.TrustHostFilter;
import cn.keking.web.filter.UrlCheckFilter;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Collection;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {WebConfig.class})
@ExtendWith(SpringExtension.class)
class WebConfigDiffblueTest {
  @Autowired private WebConfig webConfig;

  /**
   * Test {@link WebConfig#getChinesePathFilter()}.
   *
   * <ul>
   *   <li>Given createWebConfig.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getChinesePathFilter()}
   */
  @Test
  @DisplayName("Test getChinesePathFilter(); given createWebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getChinesePathFilter()"})
  void testGetChinesePathFilter_givenCreateWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<ChinesePathFilter> actualChinesePathFilter =
        WebConfigTestFactory.createWebConfig().getChinesePathFilter();

    // Assert
    Collection<String> servletNames = actualChinesePathFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualChinesePathFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    assertEquals(10, actualChinesePathFilter.getOrder());
    assertFalse(actualChinesePathFilter.isMatchAfter());
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualChinesePathFilter.getInitParameters().isEmpty());
    assertTrue(actualChinesePathFilter.isAsyncSupported());
    assertTrue(actualChinesePathFilter.isEnabled());
    assertEquals(servletNames, actualChinesePathFilter.getUrlPatterns());
  }

  /**
   * Test {@link WebConfig#getChinesePathFilter()}.
   *
   * <ul>
   *   <li>Given {@link WebConfig}.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getChinesePathFilter()}
   */
  @Test
  @DisplayName("Test getChinesePathFilter(); given WebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getChinesePathFilter()"})
  void testGetChinesePathFilter_givenWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<ChinesePathFilter> actualChinesePathFilter =
        webConfig.getChinesePathFilter();

    // Assert
    Collection<String> servletNames = actualChinesePathFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualChinesePathFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    assertEquals(10, actualChinesePathFilter.getOrder());
    assertFalse(actualChinesePathFilter.isMatchAfter());
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualChinesePathFilter.getInitParameters().isEmpty());
    assertTrue(actualChinesePathFilter.isAsyncSupported());
    assertTrue(actualChinesePathFilter.isEnabled());
    assertEquals(servletNames, actualChinesePathFilter.getUrlPatterns());
  }

  /**
   * Test {@link WebConfig#getTrustHostFilter()}.
   *
   * <ul>
   *   <li>Given createWebConfig.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getTrustHostFilter()}
   */
  @Test
  @DisplayName("Test getTrustHostFilter(); given createWebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getTrustHostFilter()"})
  void testGetTrustHostFilter_givenCreateWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<TrustHostFilter> actualTrustHostFilter =
        WebConfigTestFactory.createWebConfig().getTrustHostFilter();

    // Assert
    Collection<String> servletNames = actualTrustHostFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualTrustHostFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    Collection<String> urlPatterns = actualTrustHostFilter.getUrlPatterns();
    assertEquals(3, urlPatterns.size());
    assertTrue(urlPatterns instanceof Set);
    assertFalse(actualTrustHostFilter.isMatchAfter());
    assertTrue(urlPatterns.contains("/getCorsFile"));
    assertTrue(urlPatterns.contains("/onlinePreview"));
    assertTrue(urlPatterns.contains("/picturesPreview"));
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualTrustHostFilter.getInitParameters().isEmpty());
    assertTrue(actualTrustHostFilter.isAsyncSupported());
    assertTrue(actualTrustHostFilter.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualTrustHostFilter.getOrder());
  }

  /**
   * Test {@link WebConfig#getTrustHostFilter()}.
   *
   * <ul>
   *   <li>Given {@link WebConfig}.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getTrustHostFilter()}
   */
  @Test
  @DisplayName("Test getTrustHostFilter(); given WebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getTrustHostFilter()"})
  void testGetTrustHostFilter_givenWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<TrustHostFilter> actualTrustHostFilter = webConfig.getTrustHostFilter();

    // Assert
    Collection<String> servletNames = actualTrustHostFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualTrustHostFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    Collection<String> urlPatterns = actualTrustHostFilter.getUrlPatterns();
    assertEquals(3, urlPatterns.size());
    assertTrue(urlPatterns instanceof Set);
    assertFalse(actualTrustHostFilter.isMatchAfter());
    assertTrue(urlPatterns.contains("/getCorsFile"));
    assertTrue(urlPatterns.contains("/onlinePreview"));
    assertTrue(urlPatterns.contains("/picturesPreview"));
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualTrustHostFilter.getInitParameters().isEmpty());
    assertTrue(actualTrustHostFilter.isAsyncSupported());
    assertTrue(actualTrustHostFilter.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualTrustHostFilter.getOrder());
  }

  /**
   * Test {@link WebConfig#getTrustDirFilter()}.
   *
   * <ul>
   *   <li>Given createWebConfig.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getTrustDirFilter()}
   */
  @Test
  @DisplayName("Test getTrustDirFilter(); given createWebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getTrustDirFilter()"})
  void testGetTrustDirFilter_givenCreateWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<TrustDirFilter> actualTrustDirFilter =
        WebConfigTestFactory.createWebConfig().getTrustDirFilter();

    // Assert
    Collection<String> servletNames = actualTrustDirFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualTrustDirFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    Collection<String> urlPatterns = actualTrustDirFilter.getUrlPatterns();
    assertEquals(3, urlPatterns.size());
    assertTrue(urlPatterns instanceof Set);
    assertFalse(actualTrustDirFilter.isMatchAfter());
    assertTrue(urlPatterns.contains("/getCorsFile"));
    assertTrue(urlPatterns.contains("/onlinePreview"));
    assertTrue(urlPatterns.contains("/picturesPreview"));
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualTrustDirFilter.getInitParameters().isEmpty());
    assertTrue(actualTrustDirFilter.isAsyncSupported());
    assertTrue(actualTrustDirFilter.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualTrustDirFilter.getOrder());
  }

  /**
   * Test {@link WebConfig#getTrustDirFilter()}.
   *
   * <ul>
   *   <li>Given {@link WebConfig}.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getTrustDirFilter()}
   */
  @Test
  @DisplayName("Test getTrustDirFilter(); given WebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getTrustDirFilter()"})
  void testGetTrustDirFilter_givenWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<TrustDirFilter> actualTrustDirFilter = webConfig.getTrustDirFilter();

    // Assert
    Collection<String> servletNames = actualTrustDirFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualTrustDirFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    Collection<String> urlPatterns = actualTrustDirFilter.getUrlPatterns();
    assertEquals(3, urlPatterns.size());
    assertTrue(urlPatterns instanceof Set);
    assertFalse(actualTrustDirFilter.isMatchAfter());
    assertTrue(urlPatterns.contains("/getCorsFile"));
    assertTrue(urlPatterns.contains("/onlinePreview"));
    assertTrue(urlPatterns.contains("/picturesPreview"));
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualTrustDirFilter.getInitParameters().isEmpty());
    assertTrue(actualTrustDirFilter.isAsyncSupported());
    assertTrue(actualTrustDirFilter.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualTrustDirFilter.getOrder());
  }

  /**
   * Test {@link WebConfig#getBaseUrlFilter()}.
   *
   * <ul>
   *   <li>Given createWebConfig.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getBaseUrlFilter()}
   */
  @Test
  @DisplayName("Test getBaseUrlFilter(); given createWebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getBaseUrlFilter()"})
  void testGetBaseUrlFilter_givenCreateWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<BaseUrlFilter> actualBaseUrlFilter =
        WebConfigTestFactory.createWebConfig().getBaseUrlFilter();

    // Assert
    Collection<String> servletNames = actualBaseUrlFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualBaseUrlFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    assertEquals(20, actualBaseUrlFilter.getOrder());
    assertFalse(actualBaseUrlFilter.isMatchAfter());
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualBaseUrlFilter.getInitParameters().isEmpty());
    assertTrue(actualBaseUrlFilter.isAsyncSupported());
    assertTrue(actualBaseUrlFilter.isEnabled());
    assertEquals(servletNames, actualBaseUrlFilter.getUrlPatterns());
  }

  /**
   * Test {@link WebConfig#getBaseUrlFilter()}.
   *
   * <ul>
   *   <li>Given {@link WebConfig}.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getBaseUrlFilter()}
   */
  @Test
  @DisplayName("Test getBaseUrlFilter(); given WebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getBaseUrlFilter()"})
  void testGetBaseUrlFilter_givenWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<BaseUrlFilter> actualBaseUrlFilter = webConfig.getBaseUrlFilter();

    // Assert
    Collection<String> servletNames = actualBaseUrlFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualBaseUrlFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    assertEquals(20, actualBaseUrlFilter.getOrder());
    assertFalse(actualBaseUrlFilter.isMatchAfter());
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualBaseUrlFilter.getInitParameters().isEmpty());
    assertTrue(actualBaseUrlFilter.isAsyncSupported());
    assertTrue(actualBaseUrlFilter.isEnabled());
    assertEquals(servletNames, actualBaseUrlFilter.getUrlPatterns());
  }

  /**
   * Test {@link WebConfig#getUrlCheckFilter()}.
   *
   * <ul>
   *   <li>Given createWebConfig.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getUrlCheckFilter()}
   */
  @Test
  @DisplayName("Test getUrlCheckFilter(); given createWebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getUrlCheckFilter()"})
  void testGetUrlCheckFilter_givenCreateWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<UrlCheckFilter> actualUrlCheckFilter =
        WebConfigTestFactory.createWebConfig().getUrlCheckFilter();

    // Assert
    Collection<String> servletNames = actualUrlCheckFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualUrlCheckFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    assertEquals(30, actualUrlCheckFilter.getOrder());
    assertFalse(actualUrlCheckFilter.isMatchAfter());
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualUrlCheckFilter.getInitParameters().isEmpty());
    assertTrue(actualUrlCheckFilter.isAsyncSupported());
    assertTrue(actualUrlCheckFilter.isEnabled());
    assertEquals(servletNames, actualUrlCheckFilter.getUrlPatterns());
  }

  /**
   * Test {@link WebConfig#getUrlCheckFilter()}.
   *
   * <ul>
   *   <li>Given {@link WebConfig}.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getUrlCheckFilter()}
   */
  @Test
  @DisplayName("Test getUrlCheckFilter(); given WebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getUrlCheckFilter()"})
  void testGetUrlCheckFilter_givenWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<UrlCheckFilter> actualUrlCheckFilter = webConfig.getUrlCheckFilter();

    // Assert
    Collection<String> servletNames = actualUrlCheckFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualUrlCheckFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    assertEquals(30, actualUrlCheckFilter.getOrder());
    assertFalse(actualUrlCheckFilter.isMatchAfter());
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualUrlCheckFilter.getInitParameters().isEmpty());
    assertTrue(actualUrlCheckFilter.isAsyncSupported());
    assertTrue(actualUrlCheckFilter.isEnabled());
    assertEquals(servletNames, actualUrlCheckFilter.getUrlPatterns());
  }

  /**
   * Test {@link WebConfig#getWatermarkConfigFilter()}.
   *
   * <ul>
   *   <li>Given createWebConfig.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getWatermarkConfigFilter()}
   */
  @Test
  @DisplayName("Test getWatermarkConfigFilter(); given createWebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getWatermarkConfigFilter()"})
  void testGetWatermarkConfigFilter_givenCreateWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<AttributeSetFilter> actualWatermarkConfigFilter =
        WebConfigTestFactory.createWebConfig().getWatermarkConfigFilter();

    // Assert
    Collection<String> servletNames = actualWatermarkConfigFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualWatermarkConfigFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    Collection<String> urlPatterns = actualWatermarkConfigFilter.getUrlPatterns();
    assertEquals(4, urlPatterns.size());
    assertTrue(urlPatterns instanceof Set);
    assertFalse(actualWatermarkConfigFilter.isMatchAfter());
    assertTrue(urlPatterns.contains("/"));
    assertTrue(urlPatterns.contains("/index"));
    assertTrue(urlPatterns.contains("/onlinePreview"));
    assertTrue(urlPatterns.contains("/picturesPreview"));
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualWatermarkConfigFilter.getInitParameters().isEmpty());
    assertTrue(actualWatermarkConfigFilter.isAsyncSupported());
    assertTrue(actualWatermarkConfigFilter.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualWatermarkConfigFilter.getOrder());
  }

  /**
   * Test {@link WebConfig#getWatermarkConfigFilter()}.
   *
   * <ul>
   *   <li>Given {@link WebConfig}.
   * </ul>
   *
   * <p>Method under test: {@link WebConfig#getWatermarkConfigFilter()}
   */
  @Test
  @DisplayName("Test getWatermarkConfigFilter(); given WebConfig")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FilterRegistrationBean WebConfig.getWatermarkConfigFilter()"})
  void testGetWatermarkConfigFilter_givenWebConfig() {
    // Arrange and Act
    FilterRegistrationBean<AttributeSetFilter> actualWatermarkConfigFilter =
        webConfig.getWatermarkConfigFilter();

    // Assert
    Collection<String> servletNames = actualWatermarkConfigFilter.getServletNames();
    assertTrue(servletNames instanceof Set);
    Collection<ServletRegistrationBean<?>> servletRegistrationBeans =
        actualWatermarkConfigFilter.getServletRegistrationBeans();
    assertTrue(servletRegistrationBeans instanceof Set);
    Collection<String> urlPatterns = actualWatermarkConfigFilter.getUrlPatterns();
    assertEquals(4, urlPatterns.size());
    assertTrue(urlPatterns instanceof Set);
    assertFalse(actualWatermarkConfigFilter.isMatchAfter());
    assertTrue(urlPatterns.contains("/"));
    assertTrue(urlPatterns.contains("/index"));
    assertTrue(urlPatterns.contains("/onlinePreview"));
    assertTrue(urlPatterns.contains("/picturesPreview"));
    assertTrue(servletNames.isEmpty());
    assertTrue(servletRegistrationBeans.isEmpty());
    assertTrue(actualWatermarkConfigFilter.getInitParameters().isEmpty());
    assertTrue(actualWatermarkConfigFilter.isAsyncSupported());
    assertTrue(actualWatermarkConfigFilter.isEnabled());
    assertEquals(Integer.MAX_VALUE, actualWatermarkConfigFilter.getOrder());
  }
}
