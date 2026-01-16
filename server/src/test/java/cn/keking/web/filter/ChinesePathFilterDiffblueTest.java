package cn.keking.web.filter;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletResponse;

class ChinesePathFilterDiffblueTest {
  /**
   * Test {@link ChinesePathFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link ChinesePathFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given IOException(); then throw IOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ChinesePathFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_givenIOException_thenThrowIOException() throws IOException, ServletException {
    // Arrange
    ChinesePathFilter chinesePathFilter = new ChinesePathFilter();
    ServletRequest request = TrustHostFilterFactory.createServletRequestWithValidUrl();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

    FilterChain chain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(chain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(IOException.class, () -> chinesePathFilter.doFilter(request, response, chain));
    verify(chain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link ChinesePathFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Then createHttpServletResponse {@link MockHttpServletResponse}.
   * </ul>
   *
   * <p>Method under test: {@link ChinesePathFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); then createHttpServletResponse MockHttpServletResponse")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ChinesePathFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_thenCreateHttpServletResponseMockHttpServletResponse()
      throws IOException, ServletException {
    // Arrange
    ChinesePathFilter chinesePathFilter = new ChinesePathFilter();
    ServletRequest request = TrustHostFilterFactory.createServletRequestWithValidUrl();
    HttpServletResponse response = FileControllerFactory.createHttpServletResponse();

    FilterChain chain = mock(FilterChain.class);
    doNothing().when(chain).doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    chinesePathFilter.doFilter(request, response, chain);

    // Assert
    verify(chain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
    assertTrue(response instanceof MockHttpServletResponse);
    assertEquals("UTF-8", response.getCharacterEncoding());
    assertTrue(((MockHttpServletResponse) response).isCharset());
  }
}
