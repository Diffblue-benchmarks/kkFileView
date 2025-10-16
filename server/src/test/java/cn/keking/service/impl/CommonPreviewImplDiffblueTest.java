package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import cn.keking.service.OfficeToPdfServiceTestFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {CommonPreviewImpl.class})
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@PropertySource("classpath:application-test.properties")
class CommonPreviewImplDiffblueTest {
  @Autowired private CommonPreviewImpl commonPreviewImpl;

  @MockBean private FileHandlerService fileHandlerService;

  @MockBean private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Test {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given 'false'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CommonPreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_givenFalse_thenReturnNull() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = OfficeToPdfServiceTestFactory.createFileAttribute();
    fileAttribute.setCompressFile(false);

    // Act and Assert
    assertNull(commonPreviewImpl.filePreviewHandle(null, model, fileAttribute));
    assertTrue(model.isEmpty());
  }

  /**
   * Test {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); when 'https://example.org/example'; then ConcurrentModel() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CommonPreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_whenHttpsExampleOrgExample_thenConcurrentModelSizeIsOne() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    commonPreviewImpl.filePreviewHandle(
        "https://example.org/example", model, OfficeToPdfServiceTestFactory.createFileAttribute());

    // Assert
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("currentUrl"));
  }
}
