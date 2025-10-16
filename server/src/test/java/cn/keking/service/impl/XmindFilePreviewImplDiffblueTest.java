package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
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

@ContextConfiguration(classes = {XmindFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class XmindFilePreviewImplDiffblueTest {
  @MockBean(name = "commonPreview")
  private CommonPreviewImpl commonPreviewImpl;

  @Autowired private XmindFilePreviewImpl xmindFilePreviewImpl;

  /**
   * Test {@link XmindFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@code null}.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link XmindFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given 'false'; when 'null'; then ConcurrentModel() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmindFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_givenFalse_whenNull_thenConcurrentModelEmpty() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    CommonPreviewImpl commonPreview =
        new CommonPreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    XmindFilePreviewImpl xmindFilePreviewImpl = new XmindFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = OfficeToPdfServiceTestFactory.createFileAttribute();
    fileAttribute.setCompressFile(false);

    // Act and Assert
    assertEquals("xmind", xmindFilePreviewImpl.filePreviewHandle(null, model, fileAttribute));
    assertTrue(model.isEmpty());
  }

  /**
   * Test {@link XmindFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then calls {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   * </ul>
   *
   * <p>Method under test: {@link XmindFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then calls filePreviewHandle(String, Model, FileAttribute)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmindFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenCallsFilePreviewHandle() {
    // Arrange
    when(commonPreviewImpl.filePreviewHandle(
            Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult =
        xmindFilePreviewImpl.filePreviewHandle(
            "https://example.org/example",
            model,
            OfficeToPdfServiceTestFactory.createFileAttribute());

    // Assert
    verify(commonPreviewImpl)
        .filePreviewHandle(
            eq("https://example.org/example"), isA(Model.class), isA(FileAttribute.class));
    assertEquals("xmind", actualFilePreviewHandleResult);
  }

  /**
   * Test {@link XmindFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link XmindFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmindFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenConcurrentModelSizeIsOne() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    CommonPreviewImpl commonPreview =
        new CommonPreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    XmindFilePreviewImpl xmindFilePreviewImpl = new XmindFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    // Act
    xmindFilePreviewImpl.filePreviewHandle(
        "https://example.org/example", model, OfficeToPdfServiceTestFactory.createFileAttribute());

    // Assert
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("currentUrl"));
  }
}
