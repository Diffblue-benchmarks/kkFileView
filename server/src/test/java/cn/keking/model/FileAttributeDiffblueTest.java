package cn.keking.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import cn.keking.utils.FtpUtilsFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FileAttributeDiffblueTest {
  /**
   * Test {@link FileAttribute#FileAttribute(FileType, String, String, String, String)}.
   *
   * <p>Method under test: {@link FileAttribute#FileAttribute(FileType, String, String, String,
   * String)}
   */
  @Test
  @DisplayName("Test new FileAttribute(FileType, String, String, String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FileAttribute.<init>(FileType, String, String, String, String)"})
  void testNewFileAttribute() {
    // Arrange
    String suffix = FtpUtilsFactory.createValidFtpUrl();
    String name = FtpUtilsFactory.createValidFtpUrl();
    String url = FtpUtilsFactory.createValidFtpUrl();

    // Act
    FileAttribute actualFileAttribute =
        new FileAttribute(FileType.PICTURE, suffix, name, url, FtpUtilsFactory.createValidFtpUrl());

    // Assert
    assertNull(actualFileAttribute.getCacheListName());
    assertNull(actualFileAttribute.getCacheName());
    assertNull(actualFileAttribute.getCompressFileKey());
    assertNull(actualFileAttribute.getFilePassword());
    assertNull(actualFileAttribute.getKkProxyAuthorization());
    assertNull(actualFileAttribute.getOriginFilePath());
    assertNull(actualFileAttribute.getOutFilePath());
    assertNull(actualFileAttribute.getTifPreviewType());
    assertEquals(FileType.PICTURE, actualFileAttribute.getType());
    assertFalse(actualFileAttribute.forceUpdatedCache());
    assertFalse(actualFileAttribute.getSkipDownLoad());
    assertFalse(actualFileAttribute.getUsePasswordCache());
    assertFalse(actualFileAttribute.isCompressFile());
    assertFalse(actualFileAttribute.isHtmlView());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FileAttribute#setCacheListName(String)}
   *   <li>{@link FileAttribute#setCacheName(String)}
   *   <li>{@link FileAttribute#setCompressFile(boolean)}
   *   <li>{@link FileAttribute#setCompressFileKey(String)}
   *   <li>{@link FileAttribute#setFilePassword(String)}
   *   <li>{@link FileAttribute#setForceUpdatedCache(Boolean)}
   *   <li>{@link FileAttribute#setHtmlView(boolean)}
   *   <li>{@link FileAttribute#setKkProxyAuthorization(String)}
   *   <li>{@link FileAttribute#setName(String)}
   *   <li>{@link FileAttribute#setOfficePreviewType(String)}
   *   <li>{@link FileAttribute#setOriginFilePath(String)}
   *   <li>{@link FileAttribute#setOutFilePath(String)}
   *   <li>{@link FileAttribute#setSkipDownLoad(Boolean)}
   *   <li>{@link FileAttribute#setSuffix(String)}
   *   <li>{@link FileAttribute#setTifPreviewType(String)}
   *   <li>{@link FileAttribute#setType(FileType)}
   *   <li>{@link FileAttribute#setUrl(String)}
   *   <li>{@link FileAttribute#setUsePasswordCache(boolean)}
   *   <li>{@link FileAttribute#forceUpdatedCache()}
   *   <li>{@link FileAttribute#getCacheListName()}
   *   <li>{@link FileAttribute#getCacheName()}
   *   <li>{@link FileAttribute#getCompressFileKey()}
   *   <li>{@link FileAttribute#getFilePassword()}
   *   <li>{@link FileAttribute#getKkProxyAuthorization()}
   *   <li>{@link FileAttribute#getName()}
   *   <li>{@link FileAttribute#getOfficePreviewType()}
   *   <li>{@link FileAttribute#getOriginFilePath()}
   *   <li>{@link FileAttribute#getOutFilePath()}
   *   <li>{@link FileAttribute#getSkipDownLoad()}
   *   <li>{@link FileAttribute#getSuffix()}
   *   <li>{@link FileAttribute#getTifPreviewType()}
   *   <li>{@link FileAttribute#getType()}
   *   <li>{@link FileAttribute#getUrl()}
   *   <li>{@link FileAttribute#getUsePasswordCache()}
   *   <li>{@link FileAttribute#isCompressFile()}
   *   <li>{@link FileAttribute#isHtmlView()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Boolean FileAttribute.forceUpdatedCache()",
    "String FileAttribute.getCacheListName()",
    "String FileAttribute.getCacheName()",
    "String FileAttribute.getCompressFileKey()",
    "String FileAttribute.getFilePassword()",
    "String FileAttribute.getKkProxyAuthorization()",
    "String FileAttribute.getName()",
    "String FileAttribute.getOfficePreviewType()",
    "String FileAttribute.getOriginFilePath()",
    "String FileAttribute.getOutFilePath()",
    "Boolean FileAttribute.getSkipDownLoad()",
    "String FileAttribute.getSuffix()",
    "String FileAttribute.getTifPreviewType()",
    "FileType FileAttribute.getType()",
    "String FileAttribute.getUrl()",
    "boolean FileAttribute.getUsePasswordCache()",
    "boolean FileAttribute.isCompressFile()",
    "boolean FileAttribute.isHtmlView()",
    "void FileAttribute.setCacheListName(String)",
    "void FileAttribute.setCacheName(String)",
    "void FileAttribute.setCompressFile(boolean)",
    "void FileAttribute.setCompressFileKey(String)",
    "void FileAttribute.setFilePassword(String)",
    "void FileAttribute.setForceUpdatedCache(Boolean)",
    "void FileAttribute.setHtmlView(boolean)",
    "void FileAttribute.setKkProxyAuthorization(String)",
    "void FileAttribute.setName(String)",
    "void FileAttribute.setOfficePreviewType(String)",
    "void FileAttribute.setOriginFilePath(String)",
    "void FileAttribute.setOutFilePath(String)",
    "void FileAttribute.setSkipDownLoad(Boolean)",
    "void FileAttribute.setSuffix(String)",
    "void FileAttribute.setTifPreviewType(String)",
    "void FileAttribute.setType(FileType)",
    "void FileAttribute.setUrl(String)",
    "void FileAttribute.setUsePasswordCache(boolean)"
  })
  void testGettersAndSetters() {
    // Arrange
    FileAttribute fileAttribute = new FileAttribute();

    // Act
    fileAttribute.setCacheListName(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setCacheName(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setCompressFile(true);
    fileAttribute.setCompressFileKey(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setFilePassword(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setForceUpdatedCache(true);
    fileAttribute.setHtmlView(true);
    fileAttribute.setKkProxyAuthorization(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setName(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setOfficePreviewType(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setOriginFilePath(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setOutFilePath(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setSkipDownLoad(true);
    fileAttribute.setSuffix(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setTifPreviewType(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setType(FileType.PICTURE);
    fileAttribute.setUrl(FtpUtilsFactory.createValidFtpUrl());
    fileAttribute.setUsePasswordCache(true);
    Boolean actualForceUpdatedCacheResult = fileAttribute.forceUpdatedCache();
    fileAttribute.getCacheListName();
    fileAttribute.getCacheName();
    fileAttribute.getCompressFileKey();
    fileAttribute.getFilePassword();
    fileAttribute.getKkProxyAuthorization();
    fileAttribute.getName();
    fileAttribute.getOfficePreviewType();
    fileAttribute.getOriginFilePath();
    fileAttribute.getOutFilePath();
    Boolean actualSkipDownLoad = fileAttribute.getSkipDownLoad();
    fileAttribute.getSuffix();
    fileAttribute.getTifPreviewType();
    FileType actualType = fileAttribute.getType();
    fileAttribute.getUrl();
    boolean actualUsePasswordCache = fileAttribute.getUsePasswordCache();
    boolean actualIsCompressFileResult = fileAttribute.isCompressFile();

    // Assert
    assertEquals(FileType.PICTURE, actualType);
    assertTrue(actualForceUpdatedCacheResult);
    assertTrue(actualSkipDownLoad);
    assertTrue(actualUsePasswordCache);
    assertTrue(actualIsCompressFileResult);
    assertTrue(fileAttribute.isHtmlView());
  }
}
