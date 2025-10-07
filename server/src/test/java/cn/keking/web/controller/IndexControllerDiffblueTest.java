package cn.keking.web.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {IndexController.class})
@ExtendWith(SpringExtension.class)
class IndexControllerDiffblueTest {
  @Autowired private IndexController indexController;

  /**
   * Test {@link IndexController#go2Index()}.
   *
   * <p>Method under test: {@link IndexController#go2Index()}
   */
  @Test
  @DisplayName("Test go2Index()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String IndexController.go2Index()"})
  void testGo2Index() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/index");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(indexController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(model().size(0))
        .andExpect(view().name("/main/index"))
        .andExpect(forwardedUrl("/main/index"));
  }

  /**
   * Test {@link IndexController#go2Record()}.
   *
   * <p>Method under test: {@link IndexController#go2Record()}
   */
  @Test
  @DisplayName("Test go2Record()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String IndexController.go2Record()"})
  void testGo2Record() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/record");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(indexController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(model().size(0))
        .andExpect(view().name("/main/record"))
        .andExpect(forwardedUrl("/main/record"));
  }

  /**
   * Test {@link IndexController#go2Sponsor()}.
   *
   * <p>Method under test: {@link IndexController#go2Sponsor()}
   */
  @Test
  @DisplayName("Test go2Sponsor()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String IndexController.go2Sponsor()"})
  void testGo2Sponsor() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/sponsor");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(indexController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(model().size(0))
        .andExpect(view().name("/main/sponsor"))
        .andExpect(forwardedUrl("/main/sponsor"));
  }

  /**
   * Test {@link IndexController#go2Integrated()}.
   *
   * <p>Method under test: {@link IndexController#go2Integrated()}
   */
  @Test
  @DisplayName("Test go2Integrated()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String IndexController.go2Integrated()"})
  void testGo2Integrated() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/integrated");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(indexController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(model().size(0))
        .andExpect(view().name("/main/integrated"))
        .andExpect(forwardedUrl("/main/integrated"));
  }

  /**
   * Test {@link IndexController#root()}.
   *
   * <p>Method under test: {@link IndexController#root()}
   */
  @Test
  @DisplayName("Test root()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String IndexController.root()"})
  void testRoot() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(indexController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(model().size(0))
        .andExpect(view().name("/main/index"))
        .andExpect(forwardedUrl("/main/index"));
  }
}
