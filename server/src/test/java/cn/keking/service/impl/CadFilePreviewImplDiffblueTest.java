package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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

@ContextConfiguration(classes = {CadFilePreviewImpl.class})
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@PropertySource("classpath:application-test.properties")
class CadFilePreviewImplDiffblueTest {
  @Autowired private CadFilePreviewImpl cadFilePreviewImpl;

  @MockBean private FileHandlerService fileHandlerService;

  @MockBean private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Test {@link CadFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>When createFileAttribute.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link CadFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); when createFileAttribute; then throw RuntimeException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CadFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_whenCreateFileAttribute_thenThrowRuntimeException() {
    // Arrange
    when(fileHandlerService.listConvertedFiles()).thenThrow(new RuntimeException());
    ConcurrentModel model = new ConcurrentModel();

    // Act and Assert
    assertThrows(
        RuntimeException.class,
        () ->
            cadFilePreviewImpl.filePreviewHandle(
                "https://example.org/example",
                model,
                OfficeToPdfServiceTestFactory.createFileAttribute()));
    verify(fileHandlerService).listConvertedFiles();
  }
}
