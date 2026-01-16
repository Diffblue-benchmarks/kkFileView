package cn.keking.web.filter;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import cn.keking.web.controller.FileControllerFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BaseUrlFilterDiffblueTest {
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
    ServletRequest request = TrustHostFilterFactory.createServletRequestWithValidUrl();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

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
   *   <li>When createServletRequestWithValidUrl.
   *   <li>Then calls {@link FilterChain#doFilter(ServletRequest, ServletResponse)}.
   * </ul>
   *
   * <p>Method under test: {@link BaseUrlFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); when createServletRequestWithValidUrl; then calls doFilter(ServletRequest, ServletResponse)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BaseUrlFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_whenCreateServletRequestWithValidUrl_thenCallsDoFilter()
      throws IOException, ServletException {
    // Arrange
    BaseUrlFilter baseUrlFilter = new BaseUrlFilter();
    ServletRequest request = TrustHostFilterFactory.createServletRequestWithValidUrl();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

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
