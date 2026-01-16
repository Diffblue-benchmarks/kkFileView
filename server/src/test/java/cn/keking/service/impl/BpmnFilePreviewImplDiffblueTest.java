package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import cn.keking.utils.DownloadUtilsFactory;
import cn.keking.utils.FtpUtilsFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
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
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code currentUrl} is {@code
   *       https://example.org/example}.
   * </ul>
   *
   * <p>Method under test: {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() 'currentUrl' is 'https://example.org/example'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BpmnFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenConcurrentModelCurrentUrlIsHttpsExampleOrgExample() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    CommonPreviewImpl commonPreview =
        new CommonPreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    BpmnFilePreviewImpl bpmnFilePreviewImpl = new BpmnFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = DownloadUtilsFactory.createValidFileAttribute();
    fileAttribute.setCompressFile(false);

    // Act and Assert
    assertEquals(
        "bpmn",
        bpmnFilePreviewImpl.filePreviewHandle("https://example.org/example", model, fileAttribute));
    assertEquals(2, model.size());
    assertEquals("https://example.org/example", model.get("currentUrl"));
    assertEquals("test-file.txt", model.get("fileName"));
  }

  /**
   * Test {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code imgUrls} {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() 'imgUrls' List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BpmnFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenConcurrentModelImgUrlsList() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    PictureFilePreviewImpl commonPreview =
        new PictureFilePreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    BpmnFilePreviewImpl bpmnFilePreviewImpl = new BpmnFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = DownloadUtilsFactory.createValidFileAttribute();
    fileAttribute.setCompressFile(false);

    // Act
    bpmnFilePreviewImpl.filePreviewHandle(null, model, fileAttribute);

    // Assert
    assertEquals(2, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<Object>) getResult).size());
    assertNull(((List<Object>) getResult).get(0));
    assertTrue(model.containsKey("fileName"));
  }

  /**
   * Test {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BpmnFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenConcurrentModelSizeIsOne() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    CommonPreviewImpl commonPreview =
        new CommonPreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    BpmnFilePreviewImpl bpmnFilePreviewImpl = new BpmnFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = DownloadUtilsFactory.createValidFileAttribute();
    fileAttribute.setCompressFile(false);

    // Act and Assert
    assertEquals("bpmn", bpmnFilePreviewImpl.filePreviewHandle(null, model, fileAttribute));
    assertEquals(1, model.size());
    assertEquals("test-file.txt", model.get("fileName"));
  }

  /**
   * Test {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>When createValidFileAttribute.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link BpmnFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); when createValidFileAttribute; then ConcurrentModel() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BpmnFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_whenCreateValidFileAttribute_thenConcurrentModelSizeIsOne() {
    // Arrange
    when(commonPreviewImpl.filePreviewHandle(
            Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn(FtpUtilsFactory.createValidFtpUrl());
    String url = FtpUtilsFactory.createValidFtpUrl();
    ConcurrentModel model = new ConcurrentModel();

    // Act and Assert
    assertEquals(
        "bpmn",
        bpmnFilePreviewImpl.filePreviewHandle(
            url, model, DownloadUtilsFactory.createValidFileAttribute()));
    assertEquals(1, model.size());
    assertEquals("test-file.txt", model.get("fileName"));
  }
}
