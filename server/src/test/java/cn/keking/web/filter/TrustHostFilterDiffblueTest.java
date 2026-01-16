package cn.keking.web.filter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
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
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockFilterConfig;

class TrustHostFilterDiffblueTest {
  /**
   * Test {@link TrustHostFilter#init(FilterConfig)}.
   *
   * <p>Method under test: {@link TrustHostFilter#init(FilterConfig)}
   */
  @Test
  @DisplayName("Test init(FilterConfig)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TrustHostFilter.init(FilterConfig)"})
  void testInit() {
    // Arrange
    TrustHostFilter trustHostFilter = new TrustHostFilter();

    // Act
    trustHostFilter.init(new MockFilterConfig());

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
            + "        预览源文件来自不受信任的站点：<span style=\"color: red; display: inline;\">${current_host}</span>"
            + " 请联系管理员！<br>\n"
            + "        有任何疑问，请加入kk开源社区知识星球咨询：<a href=\"https://t.zsxq.com/09ZHSXbsQ\">https://t.zsxq.com/09ZHSXbsQ</a><br>"
            + "\n"
            + "    </p>\n"
            + "</div>\n"
            + "</body>\n"
            + "</html>\n",
        trustHostFilter.getNotTrustHostHtmlView());
  }

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

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link TrustHostFilter}
   *   <li>{@link TrustHostFilter#destroy()}
   *   <li>{@link TrustHostFilter#getNotTrustHostHtmlView()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TrustHostFilter.<init>()",
    "void TrustHostFilter.destroy()",
    "String TrustHostFilter.getNotTrustHostHtmlView()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    TrustHostFilter actualTrustHostFilter = new TrustHostFilter();
    actualTrustHostFilter.destroy();

    // Assert
    assertNull(actualTrustHostFilter.getNotTrustHostHtmlView());
  }
}
