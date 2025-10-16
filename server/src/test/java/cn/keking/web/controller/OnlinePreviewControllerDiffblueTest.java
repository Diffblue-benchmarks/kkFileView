package cn.keking.web.controller;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import cn.keking.service.FilePreview;
import cn.keking.service.FilePreviewFactory;
import cn.keking.service.cache.CacheService;
import cn.keking.service.impl.OtherFilePreviewImpl;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {OnlinePreviewController.class})
@ExtendWith(SpringExtension.class)
class OnlinePreviewControllerDiffblueTest {
  @MockBean private CacheService cacheService;

  @MockBean private FileHandlerService fileHandlerService;

  @MockBean private FilePreviewFactory filePreviewFactory;

  @Autowired private OnlinePreviewController onlinePreviewController;

  @MockBean private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Test {@link OnlinePreviewController#onlinePreview(String, Model, HttpServletRequest)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link OnlinePreviewController#onlinePreview(String, Model,
   * HttpServletRequest)}
   */
  @Test
  @DisplayName("Test onlinePreview(String, Model, HttpServletRequest); when '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String OnlinePreviewController.onlinePreview(String, Model, HttpServletRequest)"
  })
  void testOnlinePreview_when42() throws Exception {
    // Arrange
    FilePreview filePreview = mock(FilePreview.class);
    when(filePreview.filePreviewHandle(
            Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    when(filePreviewFactory.get(Mockito.<FileAttribute>any())).thenReturn(filePreview);
    when(fileHandlerService.getFileAttribute(
            Mockito.<String>any(), Mockito.<HttpServletRequest>any()))
        .thenReturn(new FileAttribute());

    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/onlinePreview").param("url", "42");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(model().size(1))
        .andExpect(model().attributeExists("file"))
        .andExpect(view().name("File Preview Handle"))
        .andExpect(forwardedUrl("File Preview Handle"));
  }

  /**
   * Test {@link OnlinePreviewController#onlinePreview(String, Model, HttpServletRequest)}.
   *
   * <ul>
   *   <li>When {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link OnlinePreviewController#onlinePreview(String, Model,
   * HttpServletRequest)}
   */
  @Test
  @DisplayName("Test onlinePreview(String, Model, HttpServletRequest); when 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String OnlinePreviewController.onlinePreview(String, Model, HttpServletRequest)"
  })
  void testOnlinePreview_whenFoo() throws Exception {
    // Arrange
    FilePreview filePreview = mock(FilePreview.class);
    when(filePreview.filePreviewHandle(
            Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    when(filePreviewFactory.get(Mockito.<FileAttribute>any())).thenReturn(filePreview);
    when(fileHandlerService.getFileAttribute(
            Mockito.<String>any(), Mockito.<HttpServletRequest>any()))
        .thenReturn(new FileAttribute());

    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/onlinePreview").param("url", "foo");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(model().size(1))
        .andExpect(model().attributeExists("file"))
        .andExpect(view().name("File Preview Handle"))
        .andExpect(forwardedUrl("File Preview Handle"));
  }

  /**
   * Test {@link OnlinePreviewController#onlinePreview(String, Model, HttpServletRequest)}.
   *
   * <ul>
   *   <li>When {@code Values}.
   * </ul>
   *
   * <p>Method under test: {@link OnlinePreviewController#onlinePreview(String, Model,
   * HttpServletRequest)}
   */
  @Test
  @DisplayName("Test onlinePreview(String, Model, HttpServletRequest); when 'Values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String OnlinePreviewController.onlinePreview(String, Model, HttpServletRequest)"
  })
  void testOnlinePreview_whenValues() throws Exception {
    // Arrange
    FilePreview filePreview = mock(FilePreview.class);
    when(filePreview.filePreviewHandle(
            Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    when(filePreviewFactory.get(Mockito.<FileAttribute>any())).thenReturn(filePreview);
    when(fileHandlerService.getFileAttribute(
            Mockito.<String>any(), Mockito.<HttpServletRequest>any()))
        .thenReturn(new FileAttribute());

    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/onlinePreview").param("url", "Values");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(model().size(1))
        .andExpect(model().attributeExists("file"))
        .andExpect(view().name("File Preview Handle"))
        .andExpect(forwardedUrl("File Preview Handle"));
  }

  /**
   * Test {@link OnlinePreviewController#picturesPreview(String, Model, HttpServletRequest)}.
   *
   * <p>Method under test: {@link OnlinePreviewController#picturesPreview(String, Model,
   * HttpServletRequest)}
   */
  @Test
  @DisplayName("Test picturesPreview(String, Model, HttpServletRequest)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String OnlinePreviewController.picturesPreview(String, Model, HttpServletRequest)"
  })
  void testPicturesPreview() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/picturesPreview").param("urls", "foo");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(model().size(2))
        .andExpect(model().attributeExists("currentUrl", "imgUrls"))
        .andExpect(view().name("picture"))
        .andExpect(forwardedUrl("picture"));
  }

  /**
   * Test {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse, FileAttribute)}.
   *
   * <ul>
   *   <li>When {@link OnlinePreviewController#BASE64_DECODE_ERROR_MSG}.
   * </ul>
   *
   * <p>Method under test: {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test getCorsFile(String, HttpServletResponse, FileAttribute); when BASE64_DECODE_ERROR_MSG")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OnlinePreviewController.getCorsFile(String, HttpServletResponse, FileAttribute)"
  })
  void testGetCorsFile_whenBase64_decode_error_msg() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/getCorsFile")
            .param("urlPath", OnlinePreviewController.BASE64_DECODE_ERROR_MSG);

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk());
  }

  /**
   * Test {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse, FileAttribute)}.
   *
   * <ul>
   *   <li>When {@code foo}.
   * </ul>
   *
   * <p>Method under test: {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse,
   * FileAttribute)}
   */
  @Test
  @DisplayName("Test getCorsFile(String, HttpServletResponse, FileAttribute); when 'foo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OnlinePreviewController.getCorsFile(String, HttpServletResponse, FileAttribute)"
  })
  void testGetCorsFile_whenFoo() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/getCorsFile").param("urlPath", "foo");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk());
  }

  /**
   * Test {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse, FileAttribute)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test getCorsFile(String, HttpServletResponse, FileAttribute); when 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OnlinePreviewController.getCorsFile(String, HttpServletResponse, FileAttribute)"
  })
  void testGetCorsFile_whenHttpsExampleOrgExample() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/getCorsFile").param("urlPath", "https://example.org/example");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk());
  }

  /**
   * Test {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse, FileAttribute)}.
   *
   * <ul>
   *   <li>When lf.
   * </ul>
   *
   * <p>Method under test: {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse,
   * FileAttribute)}
   */
  @Test
  @DisplayName("Test getCorsFile(String, HttpServletResponse, FileAttribute); when lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OnlinePreviewController.getCorsFile(String, HttpServletResponse, FileAttribute)"
  })
  void testGetCorsFile_whenLf() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/getCorsFile").param("urlPath", "\n");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk());
  }

  /**
   * Test {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse, FileAttribute)}.
   *
   * <ul>
   *   <li>When space.
   * </ul>
   *
   * <p>Method under test: {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse,
   * FileAttribute)}
   */
  @Test
  @DisplayName("Test getCorsFile(String, HttpServletResponse, FileAttribute); when space")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OnlinePreviewController.getCorsFile(String, HttpServletResponse, FileAttribute)"
  })
  void testGetCorsFile_whenSpace() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/getCorsFile").param("urlPath", " ");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk());
  }

  /**
   * Test {@link OnlinePreviewController#addQueueTask(String)}.
   *
   * <p>Method under test: {@link OnlinePreviewController#addQueueTask(String)}
   */
  @Test
  @DisplayName("Test addQueueTask(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OnlinePreviewController.addQueueTask(String)"})
  void testAddQueueTask() throws Exception {
    // Arrange
    doNothing().when(cacheService).addQueueTask(Mockito.<String>any());

    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/addTask").param("url", "foo");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(content().contentType("text/plain;charset=ISO-8859-1"))
        .andExpect(content().string("success"));
  }
}
