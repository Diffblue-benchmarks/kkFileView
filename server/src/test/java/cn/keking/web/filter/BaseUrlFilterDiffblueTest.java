package cn.keking.web.filter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import cn.keking.web.controller.FileControllerTestFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

class BaseUrlFilterDiffblueTest {
  /**
   * Test {@link BaseUrlFilter#getBaseUrl()}.
   *
   * <p>Method under test: {@link BaseUrlFilter#getBaseUrl()}
   */
  @Test
  @DisplayName("Test getBaseUrl()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String BaseUrlFilter.getBaseUrl()"})
  void testGetBaseUrl() {
    // Arrange, Act and Assert
    assertEquals("http://localhost:8080/", BaseUrlFilter.getBaseUrl());
  }

  /**
   * Test {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given createMultipartFile.
   * </ul>
   *
   * <p>Method under test: {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given createMultipartFile")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseUrlFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenCreateMultipartFile() throws IOException, ServletException {
    // Arrange
    BaseUrlFilter baseUrlFilter = new BaseUrlFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addHeader("X-Base-Url", FileControllerTestFactory.createMultipartFile());
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    baseUrlFilter.doFilter(request, response, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given empty string.
   * </ul>
   *
   * <p>Method under test: {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName("Test doFilter(ServletRequest, ServletResponse, FilterChain); given empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseUrlFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenEmptyString() throws IOException, ServletException {
    // Arrange
    BaseUrlFilter baseUrlFilter = new BaseUrlFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addHeader("X-Base-Url", "");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    baseUrlFilter.doFilter(request, response, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given IOException(); then throw IOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseUrlFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenIOException_thenThrowIOException() throws IOException, ServletException {
    // Arrange
    BaseUrlFilter baseUrlFilter = new BaseUrlFilter();
    MockHttpServletRequest request = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(IOException.class, () -> baseUrlFilter.doFilter(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code /}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addHeader {@code X-Base-Url}
   *       and {@code /}.
   * </ul>
   *
   * <p>Method under test: {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given '/'; when MockHttpServletRequest() addHeader 'X-Base-Url' and '/'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseUrlFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenSlash_whenMockHttpServletRequestAddHeaderXBaseUrlAndSlash()
      throws IOException, ServletException {
    // Arrange
    BaseUrlFilter baseUrlFilter = new BaseUrlFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addHeader("X-Base-Url", "/");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    baseUrlFilter.doFilter(request, response, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()}.
   * </ul>
   *
   * <p>Method under test: {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); when MockHttpServletRequest()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseUrlFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_whenMockHttpServletRequest() throws IOException, ServletException {
    // Arrange
    BaseUrlFilter baseUrlFilter = new BaseUrlFilter();
    MockHttpServletRequest request = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    baseUrlFilter.doFilter(request, response, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }
}
