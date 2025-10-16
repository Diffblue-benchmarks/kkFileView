package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import cn.keking.service.OfficeToPdfServiceTestFactory;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {BpmnFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class BpmnFilePreviewImplDiffblueTest {
  @Autowired private BpmnFilePreviewImpl bpmnFilePreviewImpl;

  @MockBean(name = "commonPreview")
  private CommonPreviewImpl commonPreviewImpl;

  /**
   * Test {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When createFileAttribute CompressFile is {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given 'false'; when createFileAttribute CompressFile is 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BpmnFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_givenFalse_whenCreateFileAttributeCompressFileIsFalse() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    CommonPreviewImpl commonPreview =
        new CommonPreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    BpmnFilePreviewImpl bpmnFilePreviewImpl = new BpmnFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = OfficeToPdfServiceTestFactory.createFileAttribute();
    fileAttribute.setCompressFile(false);

    // Act and Assert
    assertEquals("bpmn", bpmnFilePreviewImpl.filePreviewHandle(null, model, fileAttribute));
    assertEquals(1, model.size());
    assertEquals("test-document.docx", model.get("fileName"));
  }

  /**
   * Test {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then calls {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   * </ul>
   *
   * <p>Method under test: {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then calls filePreviewHandle(String, Model, FileAttribute)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BpmnFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenCallsFilePreviewHandle() {
    // Arrange
    when(commonPreviewImpl.filePreviewHandle(
            Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult =
        bpmnFilePreviewImpl.filePreviewHandle(
            "https://example.org/example",
            model,
            OfficeToPdfServiceTestFactory.createFileAttribute());

    // Assert
    verify(commonPreviewImpl)
        .filePreviewHandle(
            eq("https://example.org/example"), isA(Model.class), isA(FileAttribute.class));
    assertEquals("bpmn", actualFilePreviewHandleResult);
    assertEquals(1, model.size());
    assertEquals("test-document.docx", model.get("fileName"));
  }

  /**
   * Test {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BpmnFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenConcurrentModelSizeIsTwo() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    CommonPreviewImpl commonPreview =
        new CommonPreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    BpmnFilePreviewImpl bpmnFilePreviewImpl = new BpmnFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    // Act and Assert
    assertEquals(
        "bpmn",
        bpmnFilePreviewImpl.filePreviewHandle(
            "https://example.org/example",
            model,
            OfficeToPdfServiceTestFactory.createFileAttribute()));
    assertEquals(2, model.size());
    assertEquals("https://example.org/example", model.get("currentUrl"));
    assertEquals("test-document.docx", model.get("fileName"));
  }
}
