package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import cn.keking.service.FileHandlerService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

class Online3DFilePreviewImplDiffblueTest {
  /**
   * Test {@link Online3DFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@code null}.
   *   <li>Then return {@code online3D}.
   * </ul>
   *
   * <p>Method under test: {@link Online3DFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given 'false'; when 'null'; then return 'online3D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Online3DFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_givenFalse_whenNull_thenReturnOnline3D() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    CommonPreviewImpl commonPreview =
        new CommonPreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    Online3DFilePreviewImpl online3DFilePreviewImpl = new Online3DFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute =
        new FileAttribute(FileType.PICTURE, "Suffix", "Name", "https://example.org/example");
    fileAttribute.setCompressFile(false);

    // Act and Assert
    assertEquals("online3D", online3DFilePreviewImpl.filePreviewHandle(null, model, fileAttribute));
    assertTrue(model.isEmpty());
  }

  /**
   * Test {@link Online3DFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then calls {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   * </ul>
   *
   * <p>Method under test: {@link Online3DFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then calls filePreviewHandle(String, Model, FileAttribute)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Online3DFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_thenCallsFilePreviewHandle() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    CommonPreviewImpl commonPreview = mock(CommonPreviewImpl.class);
    when(commonPreview.filePreviewHandle(
            Mockito.<String>any(), Mockito.<Model>any(), Mockito.<FileAttribute>any()))
        .thenReturn("File Preview Handle");
    Online3DFilePreviewImpl online3DFilePreviewImpl = new Online3DFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult =
        online3DFilePreviewImpl.filePreviewHandle(
            "https://example.org/example", model, new FileAttribute());

    // Assert
    verify(commonPreview)
        .filePreviewHandle(
            eq("https://example.org/example"), isA(Model.class), isA(FileAttribute.class));
    assertEquals("online3D", actualFilePreviewHandleResult);
    assertTrue(model.isEmpty());
  }

  /**
   * Test {@link Online3DFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link Online3DFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Online3DFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_thenConcurrentModelSizeIsOne() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    CommonPreviewImpl commonPreview =
        new CommonPreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    Online3DFilePreviewImpl online3DFilePreviewImpl = new Online3DFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    // Act
    online3DFilePreviewImpl.filePreviewHandle(
        "https://example.org/example", model, new FileAttribute());

    // Assert
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("currentUrl"));
  }

  /**
   * Test {@link Online3DFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link Online3DFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Online3DFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_thenConcurrentModelSizeIsTwo() {
    //   Diffblue Cover was unable to create a Spring-specific test for this Spring method.
    //   Run dcover create --keep-partial-tests to gain insights into why
    //   a non-Spring test was created.

    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    PictureFilePreviewImpl commonPreview =
        new PictureFilePreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    Online3DFilePreviewImpl online3DFilePreviewImpl = new Online3DFilePreviewImpl(commonPreview);
    ConcurrentModel model = new ConcurrentModel();

    // Act
    online3DFilePreviewImpl.filePreviewHandle(
        "https://example.org/example", model, new FileAttribute());

    // Assert
    assertEquals(2, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("https://example.org/example", ((List<String>) getResult).get(0));
    assertTrue(model.containsKey("currentUrl"));
  }
}
