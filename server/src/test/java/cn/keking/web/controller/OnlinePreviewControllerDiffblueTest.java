package cn.keking.web.controller;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import cn.keking.service.FilePreview;
import cn.keking.service.FilePreviewFactory;
import cn.keking.service.cache.CacheService;
import cn.keking.service.impl.OtherFilePreviewImpl;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {OnlinePreviewController.class})
@ExtendWith(SpringExtension.class)
class OnlinePreviewControllerDiffblueTest {
  @MockBean
  private CacheService cacheService;

  @MockBean
  private FileHandlerService fileHandlerService;

  @MockBean
  private FilePreviewFactory filePreviewFactory;

  @Autowired
  private OnlinePreviewController onlinePreviewController;

  @MockBean
  private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Method under test: {@link OnlinePreviewController#addQueueTask(String)}
   */
  @Test
  void testAddQueueTask() throws Exception {
    // Arrange
    doNothing().when(cacheService).addQueueTask(Mockito.<String>any());
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/addTask").param("url", "foo");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
        .andExpect(MockMvcResultMatchers.content().string("success"));
  }

  /**
   * Method under test:
   * {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse, FileAttribute)}
   */
  @Test
  void testGetCorsFile() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCorsFile").param("urlPath", "foo");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk());
  }

  /**
   * Method under test:
   * {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse, FileAttribute)}
   */
  @Test
  void testGetCorsFile2() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCorsFile")
        .param("urlPath", "https://example.org/example");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk());
  }

  /**
   * Method under test:
   * {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse, FileAttribute)}
   */
  @Test
  void testGetCorsFile3() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCorsFile").param("urlPath", " ");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk());
  }

  /**
   * Method under test:
   * {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse, FileAttribute)}
   */
  @Test
  void testGetCorsFile4() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCorsFile").param("urlPath", "\n");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk());
  }

  /**
   * Method under test:
   * {@link OnlinePreviewController#getCorsFile(String, HttpServletResponse, FileAttribute)}
   */
  @Test
  void testGetCorsFile5() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/getCorsFile")
        .param("urlPath", OnlinePreviewController.BASE64_DECODE_ERROR_MSG);

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk());
  }

  /**
   * Method under test:
   * {@link OnlinePreviewController#onlinePreview(String, Model, HttpServletRequest)}
   */
  @Test
  void testOnlinePreview() throws Exception {
    // Arrange
    FilePreview filePreview = mock(FilePreview.class);
    when(filePreview.filePreviewHandle(Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    when(filePreviewFactory.get(Mockito.<FileAttribute>any())).thenReturn(filePreview);
    when(fileHandlerService.getFileAttribute(Mockito.<String>any(), Mockito.<HttpServletRequest>any()))
        .thenReturn(new FileAttribute());
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/onlinePreview").param("url", "foo");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.model().size(1))
        .andExpect(MockMvcResultMatchers.model().attributeExists("file"))
        .andExpect(MockMvcResultMatchers.view().name("File Preview Handle"))
        .andExpect(MockMvcResultMatchers.forwardedUrl("File Preview Handle"));
  }

  /**
   * Method under test:
   * {@link OnlinePreviewController#onlinePreview(String, Model, HttpServletRequest)}
   */
  @Test
  void testOnlinePreview2() throws Exception {
    // Arrange
    FilePreview filePreview = mock(FilePreview.class);
    when(filePreview.filePreviewHandle(Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    when(filePreviewFactory.get(Mockito.<FileAttribute>any())).thenReturn(filePreview);
    when(fileHandlerService.getFileAttribute(Mockito.<String>any(), Mockito.<HttpServletRequest>any()))
        .thenReturn(new FileAttribute());
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/onlinePreview").param("url", "42");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.model().size(1))
        .andExpect(MockMvcResultMatchers.model().attributeExists("file"))
        .andExpect(MockMvcResultMatchers.view().name("File Preview Handle"))
        .andExpect(MockMvcResultMatchers.forwardedUrl("File Preview Handle"));
  }

  /**
   * Method under test:
   * {@link OnlinePreviewController#onlinePreview(String, Model, HttpServletRequest)}
   */
  @Test
  void testOnlinePreview3() throws Exception {
    // Arrange
    FilePreview filePreview = mock(FilePreview.class);
    when(filePreview.filePreviewHandle(Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    when(filePreviewFactory.get(Mockito.<FileAttribute>any())).thenReturn(filePreview);
    when(fileHandlerService.getFileAttribute(Mockito.<String>any(), Mockito.<HttpServletRequest>any()))
        .thenReturn(new FileAttribute());
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/onlinePreview").param("url", "Values");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.model().size(1))
        .andExpect(MockMvcResultMatchers.model().attributeExists("file"))
        .andExpect(MockMvcResultMatchers.view().name("File Preview Handle"))
        .andExpect(MockMvcResultMatchers.forwardedUrl("File Preview Handle"));
  }

  /**
   * Method under test:
   * {@link OnlinePreviewController#picturesPreview(String, Model, HttpServletRequest)}
   */
  @Test
  void testPicturesPreview() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/picturesPreview").param("urls", "foo");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(onlinePreviewController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.model().size(2))
        .andExpect(MockMvcResultMatchers.model().attributeExists("currentUrl", "imgUrls"))
        .andExpect(MockMvcResultMatchers.view().name("picture"))
        .andExpect(MockMvcResultMatchers.forwardedUrl("picture"));
  }
}
