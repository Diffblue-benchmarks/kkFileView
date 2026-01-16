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
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

class AttributeSetFilterDiffblueTest {
  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName("Test doFilter(ServletRequest, ServletResponse, FilterChain)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter() throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("watermarkYSpace", "watermarkXSpace");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(
        IOException.class, () -> attributeSetFilter.doFilter(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given array of {@link String} with {@code 44444}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given array of String with '44444'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_givenArrayOfStringWith44444() throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("watermarkXSpace", "42");
    request.addParameter("watermarkYSpace", "44444");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(
        IOException.class, () -> attributeSetFilter.doFilter(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@link IOException#IOException()}.
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()}.
   *   <li>Then throw {@link IOException}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given IOException(); when MockHttpServletRequest(); then throw IOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_givenIOException_whenMockHttpServletRequest_thenThrowIOException()
      throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();
    MockHttpServletRequest request = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(
        IOException.class, () -> attributeSetFilter.doFilter(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code watermarkAlpha}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'watermarkAlpha'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_givenWatermarkAlpha() throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("watermarkXSpace", "42");
    request.addParameter("watermarkAlpha", "42");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(
        IOException.class, () -> attributeSetFilter.doFilter(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code watermarkColor}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'watermarkColor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_givenWatermarkColor() throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("watermarkXSpace", "42");
    request.addParameter("watermarkColor", "42");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(
        IOException.class, () -> attributeSetFilter.doFilter(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code watermarkFont}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName("Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'watermarkFont'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_givenWatermarkFont() throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("watermarkXSpace", "42");
    request.addParameter("watermarkFont", "42");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(
        IOException.class, () -> attributeSetFilter.doFilter(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code watermarkFontsize}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'watermarkFontsize'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_givenWatermarkFontsize() throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("watermarkXSpace", "42");
    request.addParameter("watermarkFontsize", "42");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(
        IOException.class, () -> attributeSetFilter.doFilter(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>Given {@code watermarkTxt}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName("Test doFilter(ServletRequest, ServletResponse, FilterChain); given 'watermarkTxt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_givenWatermarkTxt() throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("watermarkTxt", "42");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    attributeSetFilter.doFilter(request, response, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); when MockHttpServletRequest()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_whenMockHttpServletRequest() throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();
    MockHttpServletRequest request = new MockHttpServletRequest();
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doNothing()
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act
    attributeSetFilter.doFilter(request, response, filterChain);

    // Assert
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code
   *       watermarkYSpace} and {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); when MockHttpServletRequest() addParameter 'watermarkYSpace' and '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_whenMockHttpServletRequestAddParameterWatermarkYSpaceAnd42()
      throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("watermarkYSpace", "42");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(
        IOException.class, () -> attributeSetFilter.doFilter(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }

  /**
   * Test {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse, FilterChain)}.
   *
   * <ul>
   *   <li>When {@link MockHttpServletRequest#MockHttpServletRequest()} addParameter {@code
   *       watermarkYSpace} and {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link AttributeSetFilter#doFilter(ServletRequest, ServletResponse,
   * FilterChain)}
   */
  @Test
  @DisplayName(
      "Test doFilter(ServletRequest, ServletResponse, FilterChain); when MockHttpServletRequest() addParameter 'watermarkYSpace' and '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AttributeSetFilter.doFilter(ServletRequest, ServletResponse, FilterChain)"
  })
  void testDoFilter_whenMockHttpServletRequestAddParameterWatermarkYSpaceAnd422()
      throws IOException, ServletException {
    // Arrange
    AttributeSetFilter attributeSetFilter = new AttributeSetFilter();

    MockHttpServletRequest request = new MockHttpServletRequest();
    request.addParameter("watermarkXSpace", "42");
    request.addParameter("watermarkYSpace", "42");
    MockHttpServletResponse response = new MockHttpServletResponse();

    FilterChain filterChain = mock(FilterChain.class);
    doThrow(new IOException())
        .when(filterChain)
        .doFilter(Mockito.<ServletRequest>any(), Mockito.<ServletResponse>any());

    // Act and Assert
    assertThrows(
        IOException.class, () -> attributeSetFilter.doFilter(request, response, filterChain));
    verify(filterChain).doFilter(isA(ServletRequest.class), isA(ServletResponse.class));
  }
}
