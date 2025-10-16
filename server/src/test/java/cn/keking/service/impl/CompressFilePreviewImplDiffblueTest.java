package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.CompressFileReader;
import cn.keking.service.CompressFileReaderTestFactory;
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
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {CompressFilePreviewImpl.class})
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@PropertySource("classpath:application-test.properties")
class CompressFilePreviewImplDiffblueTest {
  @Autowired private CompressFilePreviewImpl compressFilePreviewImpl;

  @MockBean private CompressFileReader compressFileReader;

  @MockBean private FileHandlerService fileHandlerService;

  @MockBean private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Test {@link CompressFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code fileName} is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link CompressFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given 'false'; then ConcurrentModel() 'fileName' is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String CompressFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_givenFalse_thenConcurrentModelFileNameIsName() {
    // Arrange
    when(fileHandlerService.getConvertedFile(Mockito.<String>any())).thenReturn("Converted File");
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.forceUpdatedCache()).thenReturn(false);
    when(fileAttribute.getFilePassword()).thenReturn("iloveyou");
    when(fileAttribute.getName()).thenReturn("Name");

    // Act
    String actualFilePreviewHandleResult =
        compressFilePreviewImpl.filePreviewHandle(
            "https://example.org/example", model, fileAttribute);

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getFilePassword();
    verify(fileAttribute).getName();
    verify(fileHandlerService, atLeast(1)).getConvertedFile("Name");
    assertEquals(2, model.size());
    assertEquals("Converted File", model.get("fileTree"));
    assertEquals("Name", model.get("fileName"));
    assertEquals("compress", actualFilePreviewHandleResult);
  }

  /**
   * Test {@link CompressFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code fileTree} is {@code Converted
   *       File}.
   * </ul>
   *
   * <p>Method under test: {@link CompressFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() 'fileTree' is 'Converted File'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String CompressFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_thenConcurrentModelFileTreeIsConvertedFile() {
    // Arrange
    when(fileHandlerService.getConvertedFile(Mockito.<String>any())).thenReturn("Converted File");
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult =
        compressFilePreviewImpl.filePreviewHandle(
            "https://example.org/example",
            model,
            OfficeToPdfServiceTestFactory.createFileAttribute());

    // Assert
    verify(fileHandlerService, atLeast(1)).getConvertedFile("test-document.docx");
    assertEquals(2, model.size());
    assertEquals("Converted File", model.get("fileTree"));
    assertEquals("compress", actualFilePreviewHandleResult);
    assertEquals("test-document.docx", model.get("fileName"));
  }

  /**
   * Test {@link CompressFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code fileTree} is {@code Pdf Cache}.
   * </ul>
   *
   * <p>Method under test: {@link CompressFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then ConcurrentModel() 'fileTree' is 'Pdf Cache'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String CompressFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_thenConcurrentModelFileTreeIsPdfCache() {
    // Arrange
    CacheServiceJDKImpl cacheService = mock(CacheServiceJDKImpl.class);
    when(cacheService.getPDFCache(Mockito.<String>any())).thenReturn("Pdf Cache");
    FileHandlerService fileHandlerService = new FileHandlerService(cacheService);
    CompressFileReader compressFileReader =
        CompressFileReaderTestFactory.createCompressFileReader();

    CompressFilePreviewImpl compressFilePreviewImpl =
        new CompressFilePreviewImpl(
            fileHandlerService, compressFileReader, new OtherFilePreviewImpl());
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult =
        compressFilePreviewImpl.filePreviewHandle(
            "https://example.org/example",
            model,
            OfficeToPdfServiceTestFactory.createFileAttribute());

    // Assert
    verify(cacheService, atLeast(1)).getPDFCache("test-document.docx");
    assertEquals(2, model.size());
    assertEquals("Pdf Cache", model.get("fileTree"));
    assertEquals("compress", actualFilePreviewHandleResult);
    assertEquals("test-document.docx", model.get("fileName"));
  }
}
