package cn.keking.web.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import cn.keking.model.ReturnResponse;
import com.diffblue.cover.annotations.MethodsUnderTest;
import javax.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
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
   * Test {@link FileController#deleteFile(HttpServletRequest, String, String)}.
   * <ul>
   *   <li>When {@code base64}.</li>
   *   <li>Then return Msg is {@code 密码 or 验证码为空，删除失败！}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileController#deleteFile(HttpServletRequest, String, String)}
   */
  @Test
  @DisplayName("Test deleteFile(HttpServletRequest, String, String); when 'base64'; then return Msg is '密码 or 验证码为空，删除失败！'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ReturnResponse FileController.deleteFile(HttpServletRequest, String, String)"})
  void testDeleteFile_whenBase64_thenReturnMsgIsOr() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

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
   * Test {@link FileController#deleteFile(HttpServletRequest, String, String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Msg is {@code 文件名为空，删除失败！}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FileController#deleteFile(HttpServletRequest, String, String)}
   */
  @Test
  @DisplayName("Test deleteFile(HttpServletRequest, String, String); when 'null'; then return Msg is '文件名为空，删除失败！'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"ReturnResponse FileController.deleteFile(HttpServletRequest, String, String)"})
  void testDeleteFile_whenNull_thenReturnMsgIs() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

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
   * Test {@link FileController#getFiles()}.
   * <p>
   * Method under test: {@link FileController#getFiles()}
   */
  @Test
  @DisplayName("Test getFiles()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.util.List FileController.getFiles()"})
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
