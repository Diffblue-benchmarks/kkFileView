package cn.keking.web.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {IndexController.class})
@ExtendWith(SpringExtension.class)
class IndexControllerDiffblueTest {
  @Autowired
  private IndexController indexController;

  /**
   * Method under test: {@link IndexController#go2Index()}
   */
  @Test
  void testGo2Index() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/index");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(indexController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.model().size(0))
        .andExpect(MockMvcResultMatchers.view().name("/main/index"))
        .andExpect(MockMvcResultMatchers.forwardedUrl("/main/index"));
  }

  /**
   * Method under test: {@link IndexController#go2Integrated()}
   */
  @Test
  void testGo2Integrated() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/integrated");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(indexController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.model().size(0))
        .andExpect(MockMvcResultMatchers.view().name("/main/integrated"))
        .andExpect(MockMvcResultMatchers.forwardedUrl("/main/integrated"));
  }

  /**
   * Method under test: {@link IndexController#go2Record()}
   */
  @Test
  void testGo2Record() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/record");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(indexController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.model().size(0))
        .andExpect(MockMvcResultMatchers.view().name("/main/record"))
        .andExpect(MockMvcResultMatchers.forwardedUrl("/main/record"));
  }

  /**
   * Method under test: {@link IndexController#go2Sponsor()}
   */
  @Test
  void testGo2Sponsor() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/sponsor");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(indexController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.model().size(0))
        .andExpect(MockMvcResultMatchers.view().name("/main/sponsor"))
        .andExpect(MockMvcResultMatchers.forwardedUrl("/main/sponsor"));
  }

  /**
   * Method under test: {@link IndexController#root()}
   */
  @Test
  void testRoot() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(indexController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.model().size(0))
        .andExpect(MockMvcResultMatchers.view().name("/main/index"))
        .andExpect(MockMvcResultMatchers.forwardedUrl("/main/index"));
  }
}
