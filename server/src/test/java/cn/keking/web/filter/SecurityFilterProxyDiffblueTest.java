package cn.keking.web.filter;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(classes = {SecurityFilterProxy.class})
@ExtendWith(SpringExtension.class)
@WebAppConfiguration
class SecurityFilterProxyDiffblueTest {
  @Autowired private SecurityFilterProxy securityFilterProxy;

  /**
   * Test {@link SecurityFilterProxy#doFilterInternal(HttpServletRequest, HttpServletResponse,
   * FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link ServletException#ServletException()}.
   *   <li>Then throw {@link ServletException}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityFilterProxy#doFilterInternal(HttpServletRequest,
   * HttpServletResponse, FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilterInternal(HttpServletRequest, HttpServletResponse, FilterChain); given ServletException(); then throw ServletException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SecurityFilterProxy.doFilterInternal(HttpServletRequest, HttpServletResponse, FilterChain)"
  })
  void testDoFilterInternal_givenServletException_thenThrowServletException()
      throws IOException, ServletException {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new ServletException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(
        ServletException.class,
        () -> securityFilterProxy.doFilterInternal(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link SecurityFilterProxy#doFilterInternal(HttpServletRequest, HttpServletResponse,
   * FilterChain)}.
   *
   * <ul>
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()}.
   *   <li>Then calls {@link FilterChain#doFilter(ServletRequest, ServletResponse)}.
   * </ul>
   *
   * <p>Method under test: {@link SecurityFilterProxy#doFilterInternal(HttpServletRequest,
   * HttpServletResponse, FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilterInternal(HttpServletRequest, HttpServletResponse, FilterChain); when MockHttpServletRequest(); then calls doFilter(ServletRequest, ServletResponse)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SecurityFilterProxy.doFilterInternal(HttpServletRequest, HttpServletResponse, FilterChain)"
  })
  void testDoFilterInternal_whenMockHttpServletRequest_thenCallsDoFilter()
      throws IOException, ServletException {
    // Arrange
    MockHttpServletRequest request = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    securityFilterProxy.doFilterInternal(request, response, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }
}
