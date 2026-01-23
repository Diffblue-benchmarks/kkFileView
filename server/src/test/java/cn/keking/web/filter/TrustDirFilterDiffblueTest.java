package cn.keking.web.filter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
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
import org.springframework.mock.web.MockFilterConfig;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

class TrustDirFilterDiffblueTest {
  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code https://}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code
   *       currentUrl} and {@code https://}.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'https://'; when MockHttpServletRequest() addParameter 'currentUrl' and 'https://'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenHttps_whenMockHttpServletRequestAddParameterCurrentUrlAndHttps()
      throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    trustDirFilter.init(new MockFilterConfig());

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("currentUrl", "https://");
    MockHttpServletResponse response = new MockHttpServletResponse();

    // Act
    trustDirFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
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
        response.getContentAsString());
    assertEquals(865, response.getContentAsByteArray().length);
    assertTrue(response.isCommitted());
  }

  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given space.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code
   *       currentUrl} and space.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given space; when MockHttpServletRequest() addParameter 'currentUrl' and space")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenSpace_whenMockHttpServletRequestAddParameterCurrentUrlAndSpace()
      throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    trustDirFilter.init(new MockFilterConfig());

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("currentUrl", " ");
    MockHttpServletResponse response = new MockHttpServletResponse();

    // Act
    trustDirFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
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
        response.getContentAsString());
    assertEquals(865, response.getContentAsByteArray().length);
    assertTrue(response.isCommitted());
  }

  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code urlPath}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code urlPath}
   *       and {@code urls}.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'urlPath'; when MockHttpServletRequest() addParameter 'urlPath' and 'urls'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenUrlPath_whenMockHttpServletRequestAddParameterUrlPathAndUrls()
      throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    trustDirFilter.init(new MockFilterConfig());

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("urlPath", "urls");
    MockHttpServletResponse response = new MockHttpServletResponse();

    // Act
    trustDirFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
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
        response.getContentAsString());
    assertEquals(865, response.getContentAsByteArray().length);
    assertTrue(response.isCommitted());
  }

  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code url}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code url} and
   *       {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'url'; when MockHttpServletRequest() addParameter 'url' and '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenUrl_whenMockHttpServletRequestAddParameterUrlAnd42()
      throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    trustDirFilter.init(new MockFilterConfig());

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("url", "42");
    MockHttpServletResponse response = new MockHttpServletResponse();

    // Act
    trustDirFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
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
        response.getContentAsString());
    assertEquals(865, response.getContentAsByteArray().length);
    assertTrue(response.isCommitted());
  }

  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code urls}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code
   *       currentUrl} and {@code urls}.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'urls'; when MockHttpServletRequest() addParameter 'currentUrl' and 'urls'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenUrls_whenMockHttpServletRequestAddParameterCurrentUrlAndUrls()
      throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    trustDirFilter.init(new MockFilterConfig());

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("currentUrl", "urls");
    MockHttpServletResponse response = new MockHttpServletResponse();

    // Act
    trustDirFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
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
        response.getContentAsString());
    assertEquals(865, response.getContentAsByteArray().length);
    assertTrue(response.isCommitted());
  }

  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code urls}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code urls}
   *       and {@code urls}.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'urls'; when MockHttpServletRequest() addParameter 'urls' and 'urls'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenUrls_whenMockHttpServletRequestAddParameterUrlsAndUrls()
      throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    trustDirFilter.init(new MockFilterConfig());

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("urls", "urls");
    MockHttpServletResponse response = new MockHttpServletResponse();

    // Act
    trustDirFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
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
        response.getContentAsString());
    assertEquals(865, response.getContentAsByteArray().length);
    assertTrue(response.isCommitted());
  }

  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code
   *       currentUrl} and {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'Value'; when MockHttpServletRequest() addParameter 'currentUrl' and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_givenValue_whenMockHttpServletRequestAddParameterCurrentUrlAndValue()
      throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    trustDirFilter.init(new MockFilterConfig());

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("currentUrl", "Value");
    MockHttpServletResponse response = new MockHttpServletResponse();

    // Act
    trustDirFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
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
        response.getContentAsString());
    assertEquals(865, response.getContentAsByteArray().length);
    assertTrue(response.isCommitted());
  }

  /**
   * Test {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()}.
   * </ul>
   *
   * <p>Method under test: {@link TrustDirFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); when MockHttpServletRequest()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustDirFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"})
  void testDoFilter_whenMockHttpServletRequest() throws IOException, ServletException {
    // Arrange
    TrustDirFilter trustDirFilter = new TrustDirFilter();
    trustDirFilter.init(new MockFilterConfig());
    MockHttpServletRequest request = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();

    // Act
    trustDirFilter.doFilter(request, response, mock(FilterChain.class));

    // Assert
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
        response.getContentAsString());
    assertEquals(865, response.getContentAsByteArray().length);
    assertTrue(response.isCommitted());
  }
}
