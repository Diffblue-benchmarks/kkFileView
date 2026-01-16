package cn.keking.web.filter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpCompliance;
import org.eclipse.jetty.io.ByteArrayEndPoint;
import org.eclipse.jetty.server.HttpChannel;
import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.HttpConnection;
import org.eclipse.jetty.server.HttpOutput;
import org.eclipse.jetty.server.LocalConnector;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.server.ResponseWriter;
import org.eclipse.jetty.server.Server;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockFilterConfig;
import org.springframework.mock.web.MockHttpServletResponse;

class TrustDirFilterDiffblueTest {
  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName("Test doFilter(ServletRequest, ServletResponse, FilterChain)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter() throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    trustDirFilter.init(new MockFilterConfig());
    HttpServletRequest request = FileControllerFactory.createHttpServletRequestWithSession();
    LocalConnector connector = new LocalConnector(new Server());
    HttpConfiguration configuration = new HttpConfiguration();
    ByteArrayEndPoint endPoint = new ByteArrayEndPoint();
    HttpConfiguration config = new HttpConfiguration();
    LocalConnector connector2 = new LocalConnector(new Server());

    HttpConnection transport =
        new HttpConnection(
            config, connector2, new ByteArrayEndPoint(), HttpCompliance.LEGACY, true);

    HttpChannel channel = new HttpChannel(connector, configuration, endPoint, transport);
    LocalConnector connector3 = new LocalConnector(new Server());
    HttpConfiguration configuration2 = new HttpConfiguration();
    ByteArrayEndPoint endPoint2 = new ByteArrayEndPoint();
    HttpConfiguration config2 = new HttpConfiguration();
    LocalConnector connector4 = new LocalConnector(new Server());

    HttpConnection transport2 =
        new HttpConnection(
            config2, connector4, new ByteArrayEndPoint(), HttpCompliance.LEGACY, true);

    HttpChannel channel2 = new HttpChannel(connector3, configuration2, endPoint2, transport2);
    Response response = new Response(channel, new HttpOutput(channel2));

    // Act
    trustDirFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
    assertTrue(response.getWriter() instanceof ResponseWriter);
    HttpOutput httpOutput = response.getHttpOutput();
    assertEquals(865L, httpOutput.getWritten());
    assertEquals(865L, response.getContentCount());
    assertFalse(response.isStreaming());
    assertTrue(httpOutput.getHttpChannel().isCommitted());
    assertTrue(httpOutput.isClosed());
    assertTrue(httpOutput.isWritten());
    assertTrue(response.isWriting());
  }

  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given IOException(); then throw IOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenIOException_thenThrowIOException() throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    ServletRequest request = TrustHostFilterFactory.createServletRequestWithValidUrl();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

    FilterChain chain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(chain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(IOException.class, () -> trustDirFilter.doFilter(request, response, chain));
    verify(chain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Then createHttpServletResponse ContentAsString is a string.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); then createHttpServletResponse ContentAsString is a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_thenCreateHttpServletResponseContentAsStringIsAString()
      throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    trustDirFilter.init(new MockFilterConfig());
    HttpServletRequest request = FileControllerFactory.createHttpServletRequestWithSession();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

    // Act
    trustDirFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
    assertTrue(response instanceof MockHttpServletResponse);
    assertEquals(
        "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "<head>\n"
            + "    <meta charset=\"utf-8\" />\n"
            + "    <style type=\"text/css\">\n"
            + "        body {\n"
            + "            margin: 0 auto;\n"
            + "            width: 900px;\n"
            + "            background-color: #CCB;\n"
            + "        }\n"
            + "\n"
            + "        .container {\n"
            + "            width: 700px;\n"
            + "            height: 700px;\n"
            + "            margin: 0 auto;\n"
            + "        }\n"
            + "\n"
            + "        img {\n"
            + "            width: auto;\n"
            + "            height: auto;\n"
            + "            max-width: 100%;\n"
            + "            max-height: 100%;\n"
            + "            padding-bottom: 36px;\n"
            + "        }\n"
            + "\n"
            + "        p {\n"
            + "            display: block;\n"
            + "            font-size: 20px;\n"
            + "            color: blue;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div class=\"container\">\n"
            + "    <img src=\"images/sorry.jpg\" />\n"
            + "    <p>\n"
            + "        ????????????????????<br>\n"
            + "        ?????????kk???????????<a href=\"https://t.zsxq.com/09ZHSXbsQ\">https://t.zsxq.com/09ZHSXbsQ</a><br>"
            + "\n"
            + "    </p>\n"
            + "</div>\n"
            + "</body>\n"
            + "</html>\n",
        ((MockHttpServletResponse) response).getContentAsString());
    assertEquals(865, ((MockHttpServletResponse) response).getContentAsByteArray().length);
    assertTrue(response.isCommitted());
  }

  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Then createHttpServletResponse ContentAsString is empty string.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); then createHttpServletResponse ContentAsString is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_thenCreateHttpServletResponseContentAsStringIsEmptyString()
      throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    ServletRequest request = TrustHostFilterFactory.createServletRequestWithValidUrl();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

    FilterChain chain = mock(FilterChain.class);
    doNothing().when(chain).doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    trustDirFilter.doFilter(request, response, chain);

    // Assert that nothing has changed
    verify(chain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
    assertTrue(response instanceof MockHttpServletResponse);
    assertEquals("", ((MockHttpServletResponse) response).getContentAsString());
    assertFalse(response.isCommitted());
    assertArrayEquals(new byte[] {}, ((MockHttpServletResponse) response).getContentAsByteArray());
  }
}
