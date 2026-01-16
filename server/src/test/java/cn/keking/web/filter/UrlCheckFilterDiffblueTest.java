package cn.keking.web.filter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
import java.util.Collection;
import java.util.Set;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpCompliance;
import org.eclipse.jetty.io.ByteArrayEndPoint;
import org.eclipse.jetty.server.HttpChannel;
import org.eclipse.jetty.server.HttpChannelState;
import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.HttpConnection;
import org.eclipse.jetty.server.HttpInput;
import org.eclipse.jetty.server.LocalConnector;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletResponse;

class UrlCheckFilterDiffblueTest {
  /**
   * Test {@link UrlCheckFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link UrlCheckFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given IOException(); then throw IOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UrlCheckFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenIOException_thenThrowIOException() throws IOException, ServletException {
    // Arrange
    UrlCheckFilter urlCheckFilter = new UrlCheckFilter();
    ServletRequest request = TrustHostFilterFactory.createServletRequestWithValidUrl();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

    FilterChain chain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(chain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(IOException.class, () -> urlCheckFilter.doFilter(request, response, chain));
    verify(chain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link UrlCheckFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Then createHttpServletResponse HeaderNames size is one.
   * </ul>
   *
   * <p>Method under test: {@link UrlCheckFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); then createHttpServletResponse HeaderNames size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UrlCheckFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_thenCreateHttpServletResponseHeaderNamesSizeIsOne()
      throws IOException, ServletException {
    // Arrange
    UrlCheckFilter urlCheckFilter = new UrlCheckFilter();
    LocalConnector connector = new LocalConnector(new Server());
    HttpConfiguration configuration = new HttpConfiguration();
    ByteArrayEndPoint endPoint = new ByteArrayEndPoint();
    HttpConfiguration config = new HttpConfiguration();
    LocalConnector connector2 = new LocalConnector(new Server());

    HttpConnection transport =
        new HttpConnection(
            config, connector2, new ByteArrayEndPoint(), HttpCompliance.LEGACY, true);

    HttpChannel channel = new HttpChannel(connector, configuration, endPoint, transport);
    HttpInput input = new HttpInput(mock(HttpChannelState.class));

    Request request = new Request(channel, input);
    request.setServletPath(FtpUtilsFactory.createValidFtpUrl());
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

    // Act
    urlCheckFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
    Collection<String> headerNames = response.getHeaderNames();
    assertEquals(1, headerNames.size());
    assertTrue(headerNames instanceof Set);
    assertTrue(response instanceof MockHttpServletResponse);
    assertEquals(302, response.getStatus());
    assertTrue(headerNames.contains("Location"));
    assertTrue(response.isCommitted());
  }

  /**
   * Test {@link UrlCheckFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Then createHttpServletResponse Status is two hundred.
   * </ul>
   *
   * <p>Method under test: {@link UrlCheckFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); then createHttpServletResponse Status is two hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void UrlCheckFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_thenCreateHttpServletResponseStatusIsTwoHundred()
      throws IOException, ServletException {
    // Arrange
    UrlCheckFilter urlCheckFilter = new UrlCheckFilter();
    ServletRequest request = TrustHostFilterFactory.createServletRequestWithValidUrl();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

    FilterChain chain = mock(FilterChain.class);
    doNothing().when(chain).doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    urlCheckFilter.doFilter(request, response, chain);

    // Assert that nothing has changed
    verify(chain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
    Collection<String> headerNames = response.getHeaderNames();
    assertTrue(headerNames instanceof Set);
    assertTrue(response instanceof MockHttpServletResponse);
    assertEquals(200, response.getStatus());
    assertFalse(response.isCommitted());
    assertTrue(headerNames.isEmpty());
  }
}
