package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OfficeToPdfServiceDiffblueTest {
  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("DocumentOpenPassword."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath2() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxt."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code 42cn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '42cn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturn42cnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("42cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("42cn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code OfficeToPdfService/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'cn.keking.service.OfficeToPdfService/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnCnKekingServiceOfficeToPdfServiceDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.OfficeToPdfService/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfService/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code .cn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '.cn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnCnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(".cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(".cn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code 创建目录【{}】失败，请检查目录权限！cn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '创建目录【{}】失败，请检查目录权限！cn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnCnKekingServicePdf2() {
    // Arrange, Act and Assert
    assertEquals("创建目录【{}】失败，请检查目录权限！cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("创建目录【{}】失败，请检查目录权限！cn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code cn.keking.service.pdfcn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'cn.keking.service.pdfcn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnCnKekingServicePdfcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdfcn.keking.service.pdf", OfficeToPdfService
        .getOutputFilePath("cn.keking.service.OfficeToPdfServicecn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code /directory/foo.pdf/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '/directory/foo.pdf/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooPdfDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code /directory/foo.pdf./directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '/directory/foo.pdf./directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooPdfDirectoryFooPdf2() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf./directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt./directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code /directory/foo.pdf/directory/foo.pdf/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '/directory/foo.pdf/directory/foo.pdf/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooPdfDirectoryFooPdfDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf/directory/foo.pdf/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txt/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code /directory/foo.pdf.pdf/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '/directory/foo.pdf.pdf/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooPdfPdfDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf.pdf/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxt/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code /directory/foo.txt/directory/foo.txtcn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '/directory/foo.txt/directory/foo.txtcn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooTxtDirectoryFooTxtcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.txtcn.keking.service.pdf", OfficeToPdfService
        .getOutputFilePath("/directory/foo.txt/directory/foo.txtcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code /directory/foo.txtcn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '/directory/foo.txtcn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooTxtcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txtcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code /directory/foo.txtxtxtcn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '/directory/foo.txtxtxtcn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooTxtxtxtcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txtxtxtcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code DocumentOpenPassword/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'DocumentOpenPassword/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDocumentOpenPasswordDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("DocumentOpenPassword/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("DocumentOpenPassword/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code DocumentOpenPasswordcn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'DocumentOpenPasswordcn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDocumentOpenPasswordcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("DocumentOpenPasswordcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("DocumentOpenPasswordcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code EncryptFile/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'EncryptFile/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnEncryptFileDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("EncryptFile/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("EncryptFile/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code EncryptFilecn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'EncryptFilecn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnEncryptFilecnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("EncryptFilecn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("EncryptFilecn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code ExportBookmarks/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'ExportBookmarks/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnExportBookmarksDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("ExportBookmarks/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("ExportBookmarks/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code ExportBookmarkscn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'ExportBookmarkscn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnExportBookmarkscnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("ExportBookmarkscn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("ExportBookmarkscn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code ExportNotes/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'ExportNotes/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnExportNotesDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("ExportNotes/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("ExportNotes/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code ExportNotescn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'ExportNotescn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnExportNotescnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("ExportNotescn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("ExportNotescn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code falsecn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'falsecn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnFalsecnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("falsecn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("falsecn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code FilterData/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'FilterData/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnFilterDataDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("FilterData/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("FilterData/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code FilterDatacn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'FilterDatacn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnFilterDatacnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("FilterDatacn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("FilterDatacn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code Input File Path/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'Input File Path/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnInputFilePathDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("Input File Path/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("Input File Path/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code Input File Pathcn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'Input File Pathcn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnInputFilePathcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("Input File Pathcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("Input File Pathcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code MaxImageResolution/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'MaxImageResolution/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnMaxImageResolutionDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("MaxImageResolution/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("MaxImageResolution/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code MaxImageResolutioncn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'MaxImageResolutioncn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnMaxImageResolutioncnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("MaxImageResolutioncn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("MaxImageResolutioncn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code PageRange/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'PageRange/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnPageRangeDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("PageRange/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("PageRange/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code PageRangecn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'PageRangecn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnPageRangecnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("PageRangecn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("PageRangecn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code .pdfcn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '.pdfcn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnPdfcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(".pdfcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(".pdfcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>Then return {@code xtxtcn.keking.service.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'xtxtcn.keking.service.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnXtxtcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals("xtxtcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("xtxtcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code 创建目录【{}】失败，请检查目录权限！.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '创建目录【{}】失败，请检查目录权限！.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_when() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("创建目录【{}】失败，请检查目录权限！."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code 42/directory/foo.txt}.</li>
   *   <li>Then return {@code 42/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '42/directory/foo.txt'; then return '42/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_when42DirectoryFooTxt_thenReturn42DirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("42/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("42/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .42}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.42'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_when42_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code 42.}.</li>
   *   <li>Then return {@code .pdf.pdf.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '42.'; then return '.pdf.pdf.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_when42_thenReturnPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("42."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfService}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfService'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfService() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf", OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfService42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfService42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfService42() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfService42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfServiceDocumentOpenPassword}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceDocumentOpenPassword'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceDocumentOpenPassword() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfServiceEncryptFile}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceEncryptFile'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceEncryptFile() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfServiceExportBookmarks}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceExportBookmarks'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfServiceExportNotes}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceExportNotes'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceExportNotes() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfServiceFilterData}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceFilterData'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceFilterData() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfServiceInput File Path}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceInput File Path'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceInputFilePath() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfServiceMaxImageResolution}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceMaxImageResolution'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfServicePageRange}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServicePageRange'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServicePageRange() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServicePageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfService.}.</li>
   *   <li>Then return a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfService.'; then return a string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfService_thenReturnAString() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf"
            + ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfService."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfServicefalse}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServicefalse'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServicefalse() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServicefalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code OfficeToPdfServicextxt}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServicextxt'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServicextxt() {
    // Arrange, Act and Assert
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServicextxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt..}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt..'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt2() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt42}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt42'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt42_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt.42}.</li>
   *   <li>Then return {@code /directory/foo.txt.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.42'; then return '/directory/foo.txt.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt42_thenReturnDirectoryFooTxtPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txt42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txt42'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxt42() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txt42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtDocumentOpenPassword}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtDocumentOpenPassword'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtDocumentOpenPassword() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtEncryptFile}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtEncryptFile'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtEncryptFile() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtExportBookmarks}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtExportBookmarks'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtExportNotes}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtExportNotes'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtExportNotes() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtFilterData}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtFilterData'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtFilterData() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtInput File Path}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtInput File Path'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtInputFilePath() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtMaxImageResolution}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtMaxImageResolution'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtPageRange}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtPageRange'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtPageRange() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtPageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txt.}.</li>
   *   <li>Then return a string.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txt.'; then return a string")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxt_thenReturnAString() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf"
            + ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txt."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtfalse}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtfalse'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtfalse() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtfalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtxtxt}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtxtxt'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtxtxt() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtxtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtDocumentOpenPassword}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtDocumentOpenPassword'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDocumentOpenPassword() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt.DocumentOpenPassword}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.DocumentOpenPassword'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDocumentOpenPassword2() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.DocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt.EncryptFile}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.EncryptFile'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtEncryptFile() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.EncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtEncryptFile}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtEncryptFile'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtEncryptFile_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtExportBookmarks}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtExportBookmarks'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt.ExportBookmarks}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.ExportBookmarks'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtExportBookmarks2() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.ExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt.ExportNotes}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.ExportNotes'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtExportNotes() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.ExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtExportNotes}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtExportNotes'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtExportNotes_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtFilterData}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtFilterData'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtFilterData_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt.FilterData}.</li>
   *   <li>Then return {@code /directory/foo.txt.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.FilterData'; then return '/directory/foo.txt.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtFilterData_thenReturnDirectoryFooTxtPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.FilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt.Input File Path}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.Input File Path'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtInputFilePath() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.Input File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtInput File Path}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtInput File Path'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtInputFilePath_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtMaxImageResolution}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtMaxImageResolution'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt.MaxImageResolution}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.MaxImageResolution'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtMaxImageResolution2() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.MaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtPageRange}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtPageRange'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtPageRange_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtPageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt.xtxt}.</li>
   *   <li>Then return {@code /directory/foo.txt.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.xtxt'; then return '/directory/foo.txt.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtXtxt_thenReturnDirectoryFooTxtPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.xtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txt}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code ./directory/foo.txt}.</li>
   *   <li>Then return {@code ./directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when './directory/foo.txt'; then return './directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt_thenReturnDirectoryFooPdf2() {
    // Arrange, Act and Assert
    assertEquals("./directory/foo.pdf", OfficeToPdfService.getOutputFilePath("./directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code 创建目录【{}】失败，请检查目录权限！/directory/foo.txt}.</li>
   *   <li>Then return {@code 创建目录【{}】失败，请检查目录权限！/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '创建目录【{}】失败，请检查目录权限！/directory/foo.txt'; then return '创建目录【{}】失败，请检查目录权限！/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt_thenReturnDirectoryFooPdf3() {
    // Arrange, Act and Assert
    assertEquals("创建目录【{}】失败，请检查目录权限！/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("创建目录【{}】失败，请检查目录权限！/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtfalse}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtfalse'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtfalse_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtfalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxt42}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxt42'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxt42_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxt42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxtDocumentOpenPassword}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxtDocumentOpenPassword'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxtDocumentOpenPassword() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxtEncryptFile}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxtEncryptFile'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxtEncryptFile() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxtExportBookmarks}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxtExportBookmarks'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxtExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxtExportNotes}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxtExportNotes'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxtExportNotes() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxtFilterData}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxtFilterData'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxtFilterData() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxtInput File Path}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxtInput File Path'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxtInputFilePath() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxtMaxImageResolution}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxtMaxImageResolution'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxtMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxtPageRange}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxtPageRange'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxtPageRange_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtPageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxt}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxt'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxt_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxtfalse}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxtfalse'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxtfalse_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtfalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code /directory/foo.txtxtxtxtxt}.</li>
   *   <li>Then return {@code /directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtxtxtxtxt'; then return '/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtxtxtxtxt_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtxtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .DocumentOpenPassword}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.DocumentOpenPassword'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDocumentOpenPassword_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".DocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code ..}.</li>
   *   <li>Then return {@code .pdf.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '..'; then return '.pdf.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDotDot_thenReturnPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf", OfficeToPdfService.getOutputFilePath(".."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDot_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath("."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code EncryptFile.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'EncryptFile.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenEncryptFile() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("EncryptFile."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .EncryptFile}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.EncryptFile'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenEncryptFile_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".EncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code ExportBookmarks.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'ExportBookmarks.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("ExportBookmarks."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .ExportBookmarks}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.ExportBookmarks'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenExportBookmarks_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".ExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code ExportNotes.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'ExportNotes.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenExportNotes() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("ExportNotes."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .ExportNotes}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.ExportNotes'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenExportNotes_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".ExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code false/directory/foo.txt}.</li>
   *   <li>Then return {@code false/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'false/directory/foo.txt'; then return 'false/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenFalseDirectoryFooTxt_thenReturnFalseDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("false/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("false/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .false}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.false'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenFalse_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".false"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code false.}.</li>
   *   <li>Then return {@code .pdf.pdf.pdf.pdf.pdf.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'false.'; then return '.pdf.pdf.pdf.pdf.pdf.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenFalse_thenReturnPdfPdfPdfPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("false."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .FilterData}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.FilterData'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenFilterData_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".FilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code FilterData.}.</li>
   *   <li>Then return {@code .pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'FilterData.'; then return '.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenFilterData_thenReturnPdfPdfPdfPdfPdfPdfPdfPdfPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("FilterData."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code Input File Path.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'Input File Path.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenInputFilePath() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("Input File Path."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .Input File Path}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.Input File Path'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenInputFilePath_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".Input File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code MaxImageResolution.}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'MaxImageResolution.'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("MaxImageResolution."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .MaxImageResolution}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.MaxImageResolution'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenMaxImageResolution_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".MaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .PageRange}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.PageRange'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPageRange_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".PageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code PageRange.}.</li>
   *   <li>Then return {@code .pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'PageRange.'; then return '.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPageRange_thenReturnPdfPdfPdfPdfPdfPdfPdfPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("PageRange."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdf42}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdf42'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdf42_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdf42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdf/directory/foo.txt}.</li>
   *   <li>Then return {@code .pdf/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdf/directory/foo.txt'; then return '.pdf/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfDirectoryFooTxt_thenReturnPdfDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf/directory/foo.pdf", OfficeToPdfService.getOutputFilePath(".pdf/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdfDocumentOpenPassword}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfDocumentOpenPassword'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfDocumentOpenPassword_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdfEncryptFile}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfEncryptFile'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfEncryptFile_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdfExportBookmarks}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfExportBookmarks'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfExportBookmarks_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdfExportNotes}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfExportNotes'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfExportNotes_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdfFilterData}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfFilterData'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfFilterData_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdfInput File Path}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfInput File Path'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfInputFilePath_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdfMaxImageResolution}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfMaxImageResolution'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfMaxImageResolution_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdfPageRange}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfPageRange'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfPageRange_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfPageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdf.}.</li>
   *   <li>Then return {@code .pdf.pdf.pdf.pdf.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdf.'; then return '.pdf.pdf.pdf.pdf.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdf_thenReturnPdfPdfPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath(".pdf."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdffalse}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdffalse'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdffalse_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdffalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .pdfxtxt}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfxtxt'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfxtxt_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfxtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code xtxt/directory/foo.txt}.</li>
   *   <li>Then return {@code .pdf/directory/foo.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'xtxt/directory/foo.txt'; then return '.pdf/directory/foo.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenXtxtDirectoryFooTxt_thenReturnPdfDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("xtxt/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code .xtxt}.</li>
   *   <li>Then return {@code .pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.xtxt'; then return '.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenXtxt_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".xtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code xtxt.}.</li>
   *   <li>Then return {@code .pdf.pdf.pdf.pdf.pdf}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'xtxt.'; then return '.pdf.pdf.pdf.pdf.pdf'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenXtxt_thenReturnPdfPdfPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("xtxt."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   * <ul>
   *   <li>When {@code xtxt}.</li>
   *   <li>Then return {@code xtxt}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'xtxt'; then return 'xtxt'")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenXtxt_thenReturnXtxt() {
    // Arrange, Act and Assert
    assertEquals("xtxt", OfficeToPdfService.getOutputFilePath("xtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getPostfix(String)}.
   * <p>
   * Method under test: {@link OfficeToPdfService#getPostfix(String)}
   */
  @Test
  @DisplayName("Test getPostfix(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String OfficeToPdfService.getPostfix(String)"})
  void testGetPostfix() {
    // Arrange, Act and Assert
    assertEquals(FilePreview.TXT_FILE_PREVIEW_PAGE, OfficeToPdfService.getPostfix("/directory/foo.txt"));
  }
}
