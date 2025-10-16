package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import cn.keking.service.OfficeToPdfService;
import cn.keking.service.OfficeToPdfServiceTestFactory;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
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

@ContextConfiguration(classes = {OfficeFilePreviewImpl.class})
@EnableConfigurationProperties
@ExtendWith(SpringExtension.class)
@PropertySource("classpath:application-test.properties")
class OfficeFilePreviewImplDiffblueTest {
  @MockBean private FileHandlerService fileHandlerService;

  @Autowired private OfficeFilePreviewImpl officeFilePreviewImpl;

  @MockBean private OfficeToPdfService officeToPdfService;

  @MockBean private OtherFilePreviewImpl otherFilePreviewImpl;

  /**
   * Test {@link OfficeFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Then throw {@link EncryptedDocumentException}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); then throw EncryptedDocumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String OfficeFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_thenThrowEncryptedDocumentException() {
    // Arrange
    when(fileHandlerService.listConvertedFiles()).thenThrow(new EncryptedDocumentException("+"));
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = OfficeToPdfServiceTestFactory.createFileAttribute();
    fileAttribute.setOfficePreviewType("html");
    fileAttribute.setSuffix("xlsx");
    fileAttribute.setFilePassword("not empty");
    fileAttribute.setOutFilePath("not blank");
    fileAttribute.setHtmlView(false);
    fileAttribute.setCompressFile(false);
    fileAttribute.setUsePasswordCache(false);

    // Act and Assert
    assertThrows(
        EncryptedDocumentException.class,
        () -> officeFilePreviewImpl.filePreviewHandle("not blank", model, fileAttribute));
    verify(fileHandlerService).listConvertedFiles();
  }

  /**
   * Test {@link OfficeFilePreviewImpl#getPreviewType(Model, FileAttribute, String, String, String,
   * FileHandlerService, String, OtherFilePreviewImpl)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code ppt}.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code imgUrls} {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeFilePreviewImpl#getPreviewType(Model, FileAttribute, String,
   * String, String, FileHandlerService, String, OtherFilePreviewImpl)}
   */
  @Test
  @DisplayName(
      "Test getPreviewType(Model, FileAttribute, String, String, String, FileHandlerService, String, OtherFilePreviewImpl); given ArrayList() add 'ppt'; then ConcurrentModel() 'imgUrls' List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String OfficeFilePreviewImpl.getPreviewType(Model, FileAttribute, String, String, String, FileHandlerService, String, OtherFilePreviewImpl)"
  })
  void testGetPreviewType_givenArrayListAddPpt_thenConcurrentModelImgUrlsList() throws Exception {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getSuffix()).thenReturn("Suffix");

    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("ppt");

    FileHandlerService fileHandlerService = mock(FileHandlerService.class);
    when(fileHandlerService.pdf2jpg(
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<String>any(),
            Mockito.<FileAttribute>any()))
        .thenReturn(stringList);

    // Act
    String actualPreviewType =
        OfficeFilePreviewImpl.getPreviewType(
            model,
            fileAttribute,
            "Office Preview Type",
            "Pdf Name",
            "/directory/foo.txt",
            fileHandlerService,
            "Office Preview Type Image",
            new OtherFilePreviewImpl());

    // Assert
    verify(fileAttribute).getSuffix();
    verify(fileHandlerService)
        .pdf2jpg(
            eq("/directory/foo.txt"),
            eq("/directory/foo.txt"),
            eq("Pdf Name"),
            isA(FileAttribute.class));
    assertEquals(2, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals("picture", actualPreviewType);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("ppt", ((List<String>) getResult).get(0));
    assertEquals("ppt", model.get("currentUrl"));
    assertSame(stringList, getResult);
  }

  /**
   * Test {@link OfficeFilePreviewImpl#getPreviewType(Model, FileAttribute, String, String, String,
   * FileHandlerService, String, OtherFilePreviewImpl)}.
   *
   * <ul>
   *   <li>Given {@link EncryptedDocumentException#EncryptedDocumentException(String)} with s is
   *       {@code password}.
   *   <li>Then return {@code html}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeFilePreviewImpl#getPreviewType(Model, FileAttribute, String,
   * String, String, FileHandlerService, String, OtherFilePreviewImpl)}
   */
  @Test
  @DisplayName(
      "Test getPreviewType(Model, FileAttribute, String, String, String, FileHandlerService, String, OtherFilePreviewImpl); given EncryptedDocumentException(String) with s is 'password'; then return 'html'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String OfficeFilePreviewImpl.getPreviewType(Model, FileAttribute, String, String, String, FileHandlerService, String, OtherFilePreviewImpl)"
  })
  void testGetPreviewType_givenEncryptedDocumentExceptionWithSIsPassword_thenReturnHtml() {
    // Arrange
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.forceUpdatedCache()).thenThrow(new EncryptedDocumentException("password"));
    when(fileAttribute.getSuffix()).thenReturn("Suffix");
    FileHandlerService fileHandlerService = new FileHandlerService(mock(CacheServiceJDKImpl.class));

    // Act
    String actualPreviewType =
        OfficeFilePreviewImpl.getPreviewType(
            model,
            fileAttribute,
            "Office Preview Type",
            "Pdf Name",
            "/directory/foo.txt",
            fileHandlerService,
            "Office Preview Type Image",
            new OtherFilePreviewImpl());

    // Assert
    verify(fileAttribute).forceUpdatedCache();
    verify(fileAttribute).getSuffix();
    assertEquals("html", actualPreviewType);
    assertEquals(1, model.size());
    assertTrue((Boolean) model.get("needFilePassword"));
  }
}
