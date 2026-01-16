package cn.keking.web.filter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import cn.keking.utils.FtpUtilsFactory;
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

class TrustHostFilterDiffblueTest {
  /**
   * Test {@link TrustHostFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link TrustHostFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given IOException(); then throw IOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustHostFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenIOException_thenThrowIOException() throws IOException, ServletException {
    // Arrange
    TrustHostFilter trustHostFilter = new TrustHostFilter();
    ServletRequest request = TrustHostFilterFactory.createServletRequestWithValidUrl();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

    FilterChain chain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(chain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(IOException.class, () -> trustHostFilter.doFilter(request, response, chain));
    verify(chain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link TrustHostFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>When createServletRequestWithValidUrl.
   *   <li>Then calls {@link FilterChain#doFilter(ServletRequest, ServletResponse)}.
   * </ul>
   *
   * <p>Method under test: {@link TrustHostFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); when createServletRequestWithValidUrl; then calls doFilter(ServletRequest, ServletResponse)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustHostFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_whenCreateServletRequestWithValidUrl_thenCallsDoFilter()
      throws IOException, ServletException {
    // Arrange
    TrustHostFilter trustHostFilter = new TrustHostFilter();
    ServletRequest request = TrustHostFilterFactory.createServletRequestWithValidUrl();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

    FilterChain chain = mock(FilterChain.class);
    doNothing().when(chain).doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    trustHostFilter.doFilter(request, response, chain);

    // Assert
    verify(chain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link TrustHostFilter#isNotTrustHost(String)}.
   *
   * <p>Method under test: {@link TrustHostFilter#isNotTrustHost(String)}
   */
  @Test
  @DisplayName("Test isNotTrustHost(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TrustHostFilter.isNotTrustHost(String)"})
  void testIsNotTrustHost() {
    // Arrange
    TrustHostFilter trustHostFilter = new TrustHostFilter();

    // Act and Assert
    assertFalse(trustHostFilter.isNotTrustHost(FtpUtilsFactory.createValidFtpUrl()));
  }
}
