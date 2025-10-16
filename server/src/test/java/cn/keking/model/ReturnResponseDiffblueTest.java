package cn.keking.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import cn.keking.web.controller.FileControllerTestFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.web.multipart.MultipartFile;

class ReturnResponseDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ReturnResponse#ReturnResponse(int, String, Object)}
   *   <li>{@link ReturnResponse#setCode(int)}
   *   <li>{@link ReturnResponse#setContent(Object)}
   *   <li>{@link ReturnResponse#setMsg(String)}
   *   <li>{@link ReturnResponse#getCode()}
   *   <li>{@link ReturnResponse#getContent()}
   *   <li>{@link ReturnResponse#getMsg()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ReturnResponse.<init>(int, String, Object)",
    "int ReturnResponse.getCode()",
    "Object ReturnResponse.getContent()",
    "String ReturnResponse.getMsg()",
    "void ReturnResponse.setCode(int)",
    "void ReturnResponse.setContent(Object)",
    "void ReturnResponse.setMsg(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ReturnResponse<Object> actualReturnResponse =
        new ReturnResponse<>(1, "Msg", FileControllerTestFactory.createMultipartFile());
    actualReturnResponse.setCode(1);
    MultipartFile createMultipartFileResult = FileControllerTestFactory.createMultipartFile();
    actualReturnResponse.setContent(createMultipartFileResult);
    actualReturnResponse.setMsg("Msg");
    int actualCode = actualReturnResponse.getCode();
    Object actualContent = actualReturnResponse.getContent();

    // Assert
    assertEquals("Msg", actualReturnResponse.getMsg());
    assertEquals(1, actualCode);
    assertSame(createMultipartFileResult, actualContent);
  }

  /**
   * Test {@link ReturnResponse#failure()}.
   *
   * <p>Method under test: {@link ReturnResponse#failure()}
   */
  @Test
  @DisplayName("Test failure()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReturnResponse ReturnResponse.failure()"})
  void testFailure() {
    // Arrange and Act
    ReturnResponse<Object> actualFailureResult = ReturnResponse.failure();

    // Assert
    assertNull(actualFailureResult.getContent());
    assertEquals(1, actualFailureResult.getCode());
    assertFalse(actualFailureResult.isSuccess());
    assertTrue(actualFailureResult.isFailure());
    assertEquals(ReturnResponse.FAILURE_MSG, actualFailureResult.getMsg());
  }

  /**
   * Test {@link ReturnResponse#failure(String)} with {@code String}.
   *
   * <p>Method under test: {@link ReturnResponse#failure(String)}
   */
  @Test
  @DisplayName("Test failure(String) with 'String'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReturnResponse ReturnResponse.failure(String)"})
  void testFailureWithString() {
    // Arrange and Act
    ReturnResponse<Object> actualFailureResult = ReturnResponse.failure("Err Msg");

    // Assert
    assertEquals("Err Msg", actualFailureResult.getMsg());
    assertNull(actualFailureResult.getContent());
    assertEquals(1, actualFailureResult.getCode());
    assertFalse(actualFailureResult.isSuccess());
    assertTrue(actualFailureResult.isFailure());
  }

  /**
   * Test {@link ReturnResponse#success()}.
   *
   * <p>Method under test: {@link ReturnResponse#success()}
   */
  @Test
  @DisplayName("Test success()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReturnResponse ReturnResponse.success()"})
  void testSuccess() {
    // Arrange and Act
    ReturnResponse<Object> actualSuccessResult = ReturnResponse.success();

    // Assert
    assertNull(actualSuccessResult.getContent());
    assertEquals(0, actualSuccessResult.getCode());
    assertFalse(actualSuccessResult.isFailure());
    assertTrue(actualSuccessResult.isSuccess());
    assertEquals(ReturnResponse.SUCCESS_MSG, actualSuccessResult.getMsg());
  }

  /**
   * Test {@link ReturnResponse#success(Object)} with {@code Object}.
   *
   * <p>Method under test: {@link ReturnResponse#success(Object)}
   */
  @Test
  @DisplayName("Test success(Object) with 'Object'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReturnResponse ReturnResponse.success(Object)"})
  void testSuccessWithObject() {
    // Arrange
    MultipartFile createMultipartFileResult = FileControllerTestFactory.createMultipartFile();

    // Act
    ReturnResponse<Object> actualSuccessResult = ReturnResponse.success(createMultipartFileResult);

    // Assert
    assertEquals(0, actualSuccessResult.getCode());
    assertFalse(actualSuccessResult.isFailure());
    assertTrue(actualSuccessResult.isSuccess());
    assertEquals(ReturnResponse.SUCCESS_MSG, actualSuccessResult.getMsg());
    assertSame(createMultipartFileResult, actualSuccessResult.getContent());
  }

  /**
   * Test {@link ReturnResponse#isSuccess()}.
   *
   * <ul>
   *   <li>Given failure {@code Err Msg}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ReturnResponse#isSuccess()}
   */
  @Test
  @DisplayName("Test isSuccess(); given failure 'Err Msg'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReturnResponse.isSuccess()"})
  void testIsSuccess_givenFailureErrMsg_thenReturnFalse() {
    // Arrange
    ReturnResponse<Object> failureResult = ReturnResponse.failure("Err Msg");

    // Act and Assert
    assertFalse(failureResult.isSuccess());
  }

  /**
   * Test {@link ReturnResponse#isSuccess()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ReturnResponse#isSuccess()}
   */
  @Test
  @DisplayName("Test isSuccess(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReturnResponse.isSuccess()"})
  void testIsSuccess_thenReturnTrue() {
    // Arrange
    ReturnResponse<Object> returnResponse =
        new ReturnResponse<>(0, "Msg", FileControllerTestFactory.createMultipartFile());

    // Act and Assert
    assertTrue(returnResponse.isSuccess());
  }

  /**
   * Test {@link ReturnResponse#isFailure()}.
   *
   * <ul>
   *   <li>Given failure {@code Err Msg}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ReturnResponse#isFailure()}
   */
  @Test
  @DisplayName("Test isFailure(); given failure 'Err Msg'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReturnResponse.isFailure()"})
  void testIsFailure_givenFailureErrMsg_thenReturnTrue() {
    // Arrange
    ReturnResponse<Object> failureResult = ReturnResponse.failure("Err Msg");

    // Act and Assert
    assertTrue(failureResult.isFailure());
  }

  /**
   * Test {@link ReturnResponse#isFailure()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ReturnResponse#isFailure()}
   */
  @Test
  @DisplayName("Test isFailure(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ReturnResponse.isFailure()"})
  void testIsFailure_thenReturnFalse() {
    // Arrange
    ReturnResponse<Object> returnResponse =
        new ReturnResponse<>(0, "Msg", FileControllerTestFactory.createMultipartFile());

    // Act and Assert
    assertFalse(returnResponse.isFailure());
  }
}
