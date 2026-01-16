package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import cn.keking.service.cache.CacheService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import cn.keking.utils.FtpUtilsFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
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
   * <p>Method under test: {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CommonPreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    PictureFilePreviewImpl pictureFilePreviewImpl =
        new PictureFilePreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = SimTextFilePreviewImplFactory.createFileAttribute();
    fileAttribute.setCompressFile(false);

    // Act
    String actualFilePreviewHandleResult =
        pictureFilePreviewImpl.filePreviewHandle(null, model, fileAttribute);

    // Assert
    assertEquals(1, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals("picture", actualFilePreviewHandleResult);
    assertEquals(1, ((List<Object>) getResult).size());
    assertNull(((List<Object>) getResult).get(0));
  }

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

    FileAttribute fileAttribute = SimTextFilePreviewImplFactory.createFileAttribute();
    fileAttribute.setCompressFile(false);

    // Act and Assert
    assertNull(commonPreviewImpl.filePreviewHandle(null, model, fileAttribute));
    assertTrue(model.isEmpty());
  }

  /**
   * Test {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CommonPreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenConcurrentModelSizeIsTwo() {
    // Arrange
    CacheService cacheService = mock(CacheService.class);
    when(cacheService.getImgCache(Mockito.<String>any())).thenReturn(new ArrayList<>());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);
    PictureFilePreviewImpl pictureFilePreviewImpl =
        new PictureFilePreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getCompressFileKey()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    pictureFilePreviewImpl.filePreviewHandle("https://example.org/example", model, fileAttribute);

    // Assert
    verify(fileAttribute).getCompressFileKey();
    verify(cacheService).getImgCache("ftp://localhost/test/file.txt");
    assertEquals(2, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("https://example.org/example", ((List<String>) getResult).get(0));
    assertEquals("https://example.org/example", model.get("currentUrl"));
  }

  /**
   * Test {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then return {@code picture}.
   * </ul>
   *
   * <p>Method under test: {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute); then return 'picture'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CommonPreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_thenReturnPicture() {
    // Arrange
    CacheService cacheService = mock(CacheService.class);
    when(cacheService.getImgCache(Mockito.<String>any())).thenReturn(new ArrayList<>());
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);
    PictureFilePreviewImpl pictureFilePreviewImpl =
        new PictureFilePreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getCompressFileKey()).thenReturn(FtpUtilsFactory.createValidFtpUrl());

    // Act
    String actualFilePreviewHandleResult =
        pictureFilePreviewImpl.filePreviewHandle(null, model, fileAttribute);

    // Assert
    verify(fileAttribute).getCompressFileKey();
    verify(cacheService).getImgCache("ftp://localhost/test/file.txt");
    assertEquals(1, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals("picture", actualFilePreviewHandleResult);
    assertEquals(1, ((List<Object>) getResult).size());
    assertNull(((List<Object>) getResult).get(0));
  }

  /**
   * Test {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>When {@link FileAttribute}.
   * </ul>
   *
   * <p>Method under test: {@link CommonPreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute); when FileAttribute")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CommonPreviewImpl.filePreviewHandle(String, Model, FileAttribute)"})
  void testFilePreviewHandle_whenFileAttribute() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    // Act
    commonPreviewImpl.filePreviewHandle(
        "https://example.org/example", model, mock(FileAttribute.class));

    // Assert
    assertEquals(1, model.size());
    assertEquals("https://example.org/example", model.get("currentUrl"));
  }
}
