package cn.keking.web.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import cn.keking.model.ReturnResponse;
import javax.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {FileController.class})
@ExtendWith(SpringExtension.class)
class FileControllerDiffblueTest {
  @Autowired
  private FileController fileController;

  /**
   * Method under test:
   * {@link FileController#deleteFile(HttpServletRequest, String, String)}
   */
  @Test
  void testDeleteFile() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    FileController fileController = new FileController();

    // Act
    ReturnResponse<Object> actualDeleteFileResult = fileController.deleteFile(new MockHttpServletRequest(), null, null);

    // Assert
    assertEquals("文件名为空，删除失败！", actualDeleteFileResult.getMsg());
    assertNull(actualDeleteFileResult.getContent());
    assertEquals(1, actualDeleteFileResult.getCode());
    assertFalse(actualDeleteFileResult.isSuccess());
    assertTrue(actualDeleteFileResult.isFailure());
  }

  /**
   * Method under test:
   * {@link FileController#deleteFile(HttpServletRequest, String, String)}
   */
  @Test
  void testDeleteFile2() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.

    // Arrange
    FileController fileController = new FileController();

    // Act
    ReturnResponse<Object> actualDeleteFileResult = fileController.deleteFile(new MockHttpServletRequest(), "base64",
        null);

    // Assert
    assertEquals("密码 or 验证码为空，删除失败！", actualDeleteFileResult.getMsg());
    assertNull(actualDeleteFileResult.getContent());
    assertEquals(1, actualDeleteFileResult.getCode());
    assertFalse(actualDeleteFileResult.isSuccess());
    assertTrue(actualDeleteFileResult.isFailure());
  }

  /**
   * Method under test: {@link FileController#getFiles()}
   */
  @Test
  void testGetFiles() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/listFiles");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(fileController)
        .build()
        .perform(requestBuilder)
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().contentType("application/json"))
        .andExpect(MockMvcResultMatchers.content().string("[]"));
  }
}
