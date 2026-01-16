package cn.keking.web.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import cn.keking.model.ReturnResponse;
import cn.keking.utils.FtpUtilsFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.multipart.MultipartFile;

@ContextConfiguration(classes = {FileController.class})
@ExtendWith(SpringExtension.class)
class FileControllerDiffblueTest {
  @Autowired private FileController fileController;

  /**
   * Test {@link FileController#fileUpload(MultipartFile)}.
   *
   * <ul>
   *   <li>Then return Msg is {@code 不允许上传的类型}.
   * </ul>
   *
   * <p>Method under test: {@link FileController#fileUpload(MultipartFile)}
   */
  @Test
  @DisplayName("Test fileUpload(MultipartFile); then return Msg is '不允许上传的类型'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReturnResponse FileController.fileUpload(MultipartFile)"})
  void testFileUpload_thenReturnMsgIs() throws IOException {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    FileController fileController = new FileController();
    String name = FtpUtilsFactory.createValidFtpUrl();
    MockMultipartFile file =
        new MockMultipartFile(name, new ByteArrayInputStream("A/A/A/A/".getBytes("UTF-8")));

    // Act
    ReturnResponse<Object> actualFileUploadResult = fileController.fileUpload(file);

    // Assert
    assertEquals("不允许上传的类型", actualFileUploadResult.getMsg());
    assertNull(actualFileUploadResult.getContent());
    assertEquals(1, actualFileUploadResult.getCode());
    assertFalse(actualFileUploadResult.isSuccess());
    assertTrue(actualFileUploadResult.isFailure());
  }

  /**
   * Test {@link FileController#deleteFile(HttpServletRequest, String, String)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link MockMvcRequestBuilders#get(String, Object[])} {@code /deleteFile} secure
   *       {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FileController#deleteFile(HttpServletRequest, String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteFile(HttpServletRequest, String, String); given 'true'; when get(String, Object[]) '/deleteFile' secure 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ReturnResponse FileController.deleteFile(HttpServletRequest, String, String)"
  })
  void testDeleteFile_givenTrue_whenGetDeleteFileSecureTrue() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/deleteFile");
    getResult.secure(true);

    MockHttpServletRequestBuilder requestBuilder =
        getResult.param("fileName", "foo").param("password", "foo");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(fileController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json"))
        .andExpect(
            content()
                .string(
                    "{\"code\":1,\"msg\":\"å é¤æä»¶å¤±è´¥ï¼å¯ç éè¯¯ï¼\",\"content\":null,\"failure\":true,\"success"
                        + "\":false}"));
  }

  /**
   * Test {@link FileController#deleteFile(HttpServletRequest, String, String)}.
   *
   * <ul>
   *   <li>When {@link MockMvcRequestBuilders#get(String, Object[])} {@code /deleteFile}.
   * </ul>
   *
   * <p>Method under test: {@link FileController#deleteFile(HttpServletRequest, String, String)}
   */
  @Test
  @DisplayName(
      "Test deleteFile(HttpServletRequest, String, String); when get(String, Object[]) '/deleteFile'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ReturnResponse FileController.deleteFile(HttpServletRequest, String, String)"
  })
  void testDeleteFile_whenGetDeleteFile() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/deleteFile").param("fileName", "foo").param("password", "foo");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(fileController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json"))
        .andExpect(
            content()
                .string(
                    "{\"code\":1,\"msg\":\"å é¤æä»¶å¤±è´¥ï¼å¯ç éè¯¯ï¼\",\"content\":null,\"failure\":true,\"success"
                        + "\":false}"));
  }

  /**
   * Test {@link FileController#captcha(HttpServletRequest, HttpServletResponse)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link MockMvcRequestBuilders#get(String, Object[])} {@code /deleteFile/captcha}
   *       secure {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FileController#captcha(HttpServletRequest, HttpServletResponse)}
   */
  @Test
  @DisplayName(
      "Test captcha(HttpServletRequest, HttpServletResponse); given 'true'; when get(String, Object[]) '/deleteFile/captcha' secure 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileController.captcha(HttpServletRequest, HttpServletResponse)"})
  void testCaptcha_givenTrue_whenGetDeleteFileCaptchaSecureTrue() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/deleteFile/captcha");
    requestBuilder.secure(true);

    // Act and Assert
    MockMvcBuilders.standaloneSetup(fileController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk());
  }

  /**
   * Test {@link FileController#captcha(HttpServletRequest, HttpServletResponse)}.
   *
   * <ul>
   *   <li>When {@link MockMvcRequestBuilders#get(String, Object[])} {@code /deleteFile/captcha}.
   * </ul>
   *
   * <p>Method under test: {@link FileController#captcha(HttpServletRequest, HttpServletResponse)}
   */
  @Test
  @DisplayName(
      "Test captcha(HttpServletRequest, HttpServletResponse); when get(String, Object[]) '/deleteFile/captcha'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileController.captcha(HttpServletRequest, HttpServletResponse)"})
  void testCaptcha_whenGetDeleteFileCaptcha() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder =
        MockMvcRequestBuilders.get("/deleteFile/captcha");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(fileController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk());
  }

  /**
   * Test {@link FileController#getFiles()}.
   *
   * <p>Method under test: {@link FileController#getFiles()}
   */
  @Test
  @DisplayName("Test getFiles()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List FileController.getFiles()"})
  void testGetFiles() throws Exception {
    // Arrange
    MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/listFiles");

    // Act and Assert
    MockMvcBuilders.standaloneSetup(fileController)
        .build()
        .perform(requestBuilder)
        .andExpect(status().isOk())
        .andExpect(content().contentType("application/json"))
        .andExpect(content().string("[]"));
  }
}
