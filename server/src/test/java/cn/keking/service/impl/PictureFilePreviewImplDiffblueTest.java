package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import cn.keking.service.FileHandlerService;
import cn.keking.service.cache.impl.CacheServiceJDKImpl;
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
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {PictureFilePreviewImpl.class})
@ExtendWith(SpringExtension.class)
class PictureFilePreviewImplDiffblueTest {
  @MockBean private FileHandlerService fileHandlerService;

  @MockBean private OtherFilePreviewImpl otherFilePreviewImpl;

  @Autowired private PictureFilePreviewImpl pictureFilePreviewImpl;

  /**
   * Test {@link PictureFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <p>Method under test: {@link PictureFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName("Test filePreviewHandle(String, Model, FileAttribute)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String PictureFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    PictureFilePreviewImpl pictureFilePreviewImpl =
        new PictureFilePreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    ConcurrentModel model = new ConcurrentModel();

    // Act
    pictureFilePreviewImpl.filePreviewHandle(
        "https://example.org/example", model, new FileAttribute());

    // Assert
    assertEquals(2, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("https://example.org/example", ((List<String>) getResult).get(0));
    assertEquals("https://example.org/example", model.get("currentUrl"));
  }

  /**
   * Test {@link PictureFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code UTF-8}.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} {@code imgUrls} size is two.
   * </ul>
   *
   * <p>Method under test: {@link PictureFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given ArrayList() add 'UTF-8'; then ConcurrentModel() 'imgUrls' size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String PictureFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_givenArrayListAddUtf8_thenConcurrentModelImgUrlsSizeIsTwo() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("UTF-8");
    when(fileHandlerService.getImgCache(Mockito.<String>any())).thenReturn(stringList);
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult =
        pictureFilePreviewImpl.filePreviewHandle(
            "https://example.org/example", model, new FileAttribute());

    // Assert
    verify(fileHandlerService).getImgCache(null);
    assertEquals(2, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals(2, ((List<String>) getResult).size());
    assertEquals("UTF-8", ((List<String>) getResult).get(1));
    assertEquals("https://example.org/example", ((List<String>) getResult).get(0));
    assertEquals("https://example.org/example", model.get("currentUrl"));
    assertEquals("picture", actualFilePreviewHandleResult);
  }

  /**
   * Test {@link PictureFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then {@link ConcurrentModel#ConcurrentModel()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link PictureFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); given 'false'; then ConcurrentModel() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String PictureFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_givenFalse_thenConcurrentModelSizeIsOne() {
    // Arrange
    FileHandlerService fileHandlerService = new FileHandlerService(new CacheServiceJDKImpl());
    PictureFilePreviewImpl pictureFilePreviewImpl =
        new PictureFilePreviewImpl(fileHandlerService, new OtherFilePreviewImpl());
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute =
        new FileAttribute(FileType.PICTURE, "Suffix", "Name", "https://example.org/example");
    fileAttribute.setCompressFile(false);

    // Act
    pictureFilePreviewImpl.filePreviewHandle(null, model, fileAttribute);

    // Assert
    assertEquals(1, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<Object>) getResult).size());
    assertNull(((List<Object>) getResult).get(0));
  }

  /**
   * Test {@link PictureFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>When {@link FileAttribute#FileAttribute()}.
   *   <li>Then return {@code picture}.
   * </ul>
   *
   * <p>Method under test: {@link PictureFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); when FileAttribute(); then return 'picture'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String PictureFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_whenFileAttribute_thenReturnPicture() {
    // Arrange
    when(fileHandlerService.getImgCache(Mockito.<String>any())).thenReturn(new ArrayList<>());
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult =
        pictureFilePreviewImpl.filePreviewHandle(
            "https://example.org/example", model, new FileAttribute());

    // Assert
    verify(fileHandlerService).getImgCache(null);
    assertEquals(2, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("https://example.org/example", ((List<String>) getResult).get(0));
    assertEquals("https://example.org/example", model.get("currentUrl"));
    assertEquals("picture", actualFilePreviewHandleResult);
  }

  /**
   * Test {@link PictureFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}.
   *
   * <ul>
   *   <li>When {@code https://example.org/example}.
   *   <li>Then calls {@link FileAttribute#getCompressFileKey()}.
   * </ul>
   *
   * <p>Method under test: {@link PictureFilePreviewImpl#filePreviewHandle(String, Model,
   * FileAttribute)}
   */
  @Test
  @DisplayName(
      "Test filePreviewHandle(String, Model, FileAttribute); when 'https://example.org/example'; then calls getCompressFileKey()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String PictureFilePreviewImpl.filePreviewHandle(String, Model, FileAttribute)"
  })
  void testFilePreviewHandle_whenHttpsExampleOrgExample_thenCallsGetCompressFileKey() {
    // Arrange
    when(fileHandlerService.getImgCache(Mockito.<String>any())).thenReturn(new ArrayList<>());
    ConcurrentModel model = new ConcurrentModel();

    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getCompressFileKey()).thenReturn("Compress File Key");

    // Act
    String actualFilePreviewHandleResult =
        pictureFilePreviewImpl.filePreviewHandle(
            "https://example.org/example", model, fileAttribute);

    // Assert
    verify(fileAttribute).getCompressFileKey();
    verify(fileHandlerService).getImgCache("Compress File Key");
    assertEquals(2, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("https://example.org/example", ((List<String>) getResult).get(0));
    assertEquals("https://example.org/example", model.get("currentUrl"));
    assertEquals("picture", actualFilePreviewHandleResult);
  }
}
