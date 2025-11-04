package cn.keking.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import cn.keking.model.FileAttribute;
import cn.keking.service.FileHandlerService;
import java.util.ArrayList;
import java.util.List;
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
  @MockBean
  private FileHandlerService fileHandlerService;

  @MockBean
  private OtherFilePreviewImpl otherFilePreviewImpl;

  @Autowired
  private PictureFilePreviewImpl pictureFilePreviewImpl;

  /**
   * Method under test:
   * {@link PictureFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle() {
    // Arrange
    when(fileHandlerService.getImgCache(Mockito.<String>any())).thenReturn(new ArrayList<>());
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = pictureFilePreviewImpl.filePreviewHandle("https://example.org/example",
        model, new FileAttribute());

    // Assert
    verify(fileHandlerService).getImgCache(isNull());
    assertEquals(2, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("https://example.org/example", ((List<String>) getResult).get(0));
    assertEquals("https://example.org/example", model.get("currentUrl"));
    assertEquals("picture", actualFilePreviewHandleResult);
  }

  /**
   * Method under test:
   * {@link PictureFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle2() {
    // Arrange
    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("UTF-8");
    when(fileHandlerService.getImgCache(Mockito.<String>any())).thenReturn(stringList);
    ConcurrentModel model = new ConcurrentModel();

    // Act
    String actualFilePreviewHandleResult = pictureFilePreviewImpl.filePreviewHandle("https://example.org/example",
        model, new FileAttribute());

    // Assert
    verify(fileHandlerService).getImgCache(isNull());
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
   * Method under test:
   * {@link PictureFilePreviewImpl#filePreviewHandle(String, Model, FileAttribute)}
   */
  @Test
  void testFilePreviewHandle3() {
    // Arrange
    when(fileHandlerService.getImgCache(Mockito.<String>any())).thenReturn(new ArrayList<>());
    ConcurrentModel model = new ConcurrentModel();
    FileAttribute fileAttribute = mock(FileAttribute.class);
    when(fileAttribute.getCompressFileKey()).thenReturn("Compress File Key");

    // Act
    String actualFilePreviewHandleResult = pictureFilePreviewImpl.filePreviewHandle("https://example.org/example",
        model, fileAttribute);

    // Assert
    verify(fileAttribute).getCompressFileKey();
    verify(fileHandlerService).getImgCache(eq("Compress File Key"));
    assertEquals(2, model.size());
    Object getResult = model.get("imgUrls");
    assertTrue(getResult instanceof List);
    assertEquals(1, ((List<String>) getResult).size());
    assertEquals("https://example.org/example", ((List<String>) getResult).get(0));
    assertEquals("https://example.org/example", model.get("currentUrl"));
    assertEquals("picture", actualFilePreviewHandleResult);
  }
}
