package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OfficeToPdfServiceDiffblueTest {
  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("DocumentOpenPassword."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath2() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxt."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code 42cn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '42cn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturn42cnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "42cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("42cn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code OfficeToPdfService/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return 'cn.keking.service.OfficeToPdfService/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnCnKekingServiceOfficeToPdfServiceDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.OfficeToPdfService/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath(
            "cn.keking.service.OfficeToPdfService/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code .cn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '.cn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnCnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        ".cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(".cn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code cn.keking.service.pdfcn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return 'cn.keking.service.pdfcn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnCnKekingServicePdfcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdfcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "cn.keking.service.OfficeToPdfServicecn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code /directory/foo.pdf/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '/directory/foo.pdf/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooPdfDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code /directory/foo.pdf./directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return '/directory/foo.pdf./directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooPdfDirectoryFooPdf2() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf./directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt./directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code /directory/foo.pdf/directory/foo.pdf/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return '/directory/foo.pdf/directory/foo.pdf/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooPdfDirectoryFooPdfDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf/directory/foo.pdf/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath(
            "/directory/foo.txt/directory/foo.txt/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code /directory/foo.pdf.pdf/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return '/directory/foo.pdf.pdf/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooPdfPdfDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf.pdf/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxt/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code /directory/foo.pdfU/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return '/directory/foo.pdfU/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooPdfUDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdfU/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtU/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code /directory/foo.txt/directory/foo.txtcn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return '/directory/foo.txt/directory/foo.txtcn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooTxtDirectoryFooTxtcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.txtcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "/directory/foo.txt/directory/foo.txtcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code /directory/foo.txtUcn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return '/directory/foo.txtUcn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooTxtUcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txtUcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "/directory/foo.txtUcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code /directory/foo.txtUtxtcn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return '/directory/foo.txtUtxtcn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooTxtUtxtcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txtUtxtcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "/directory/foo.txtUtxtcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code /directory/foo.txtcn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return '/directory/foo.txtcn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDirectoryFooTxtcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txtcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "/directory/foo.txtcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code DocumentOpenPassword/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return 'DocumentOpenPassword/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDocumentOpenPasswordDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "DocumentOpenPassword/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("DocumentOpenPassword/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code DocumentOpenPasswordcn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return 'DocumentOpenPasswordcn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnDocumentOpenPasswordcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "DocumentOpenPasswordcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "DocumentOpenPasswordcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code EncryptFile/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'EncryptFile/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnEncryptFileDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "EncryptFile/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("EncryptFile/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code EncryptFilecn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'EncryptFilecn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnEncryptFilecnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "EncryptFilecn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("EncryptFilecn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code ExportBookmarks/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'ExportBookmarks/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnExportBookmarksDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "ExportBookmarks/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("ExportBookmarks/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code ExportBookmarkscn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'ExportBookmarkscn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnExportBookmarkscnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "ExportBookmarkscn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "ExportBookmarkscn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code ExportNotes/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'ExportNotes/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnExportNotesDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "ExportNotes/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("ExportNotes/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code ExportNotescn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'ExportNotescn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnExportNotescnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "ExportNotescn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("ExportNotescn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code falsecn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'falsecn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnFalsecnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "falsecn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("falsecn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code FilterData/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'FilterData/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnFilterDataDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "FilterData/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("FilterData/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code FilterDatacn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'FilterDatacn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnFilterDatacnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "FilterDatacn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("FilterDatacn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code Input File Path/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'Input File Path/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnInputFilePathDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "Input File Path/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("Input File Path/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code Input File Pathcn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'Input File Pathcn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnInputFilePathcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "Input File Pathcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "Input File Pathcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code MaxImageResolution/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'MaxImageResolution/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnMaxImageResolutionDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "MaxImageResolution/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("MaxImageResolution/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code MaxImageResolutioncn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); then return 'MaxImageResolutioncn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnMaxImageResolutioncnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "MaxImageResolutioncn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "MaxImageResolutioncn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code PageRange/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'PageRange/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnPageRangeDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "PageRange/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("PageRange/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code PageRangecn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'PageRangecn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnPageRangecnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "PageRangecn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("PageRangecn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code .pdfcn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return '.pdfcn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnPdfcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdfcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(".pdfcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code Ucn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'Ucn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnUcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "Ucn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("Ucn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>Then return {@code Utxtcn.keking.service.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); then return 'Utxtcn.keking.service.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_thenReturnUtxtcnKekingServicePdf() {
    // Arrange, Act and Assert
    assertEquals(
        "Utxtcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("Utxtcn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code 42/directory/foo.txt}.
   *   <li>Then return {@code 42/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '42/directory/foo.txt'; then return '42/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_when42DirectoryFooTxt_thenReturn42DirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "42/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("42/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .42}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.42'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_when42_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code 42.}.
   *   <li>Then return {@code .pdf.pdf.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '42.'; then return '.pdf.pdf.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_when42_thenReturnPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("42."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfService}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfService'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfService() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfService"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfService42}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfService42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfService42() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfService42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServiceDocumentOpenPassword}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceDocumentOpenPassword'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceDocumentOpenPassword() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "cn.keking.service.OfficeToPdfServiceDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServiceEncryptFile}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceEncryptFile'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceEncryptFile() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServiceExportBookmarks}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceExportBookmarks'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "cn.keking.service.OfficeToPdfServiceExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServiceExportNotes}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceExportNotes'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceExportNotes() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServiceFilterData}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceFilterData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceFilterData() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServiceInput File Path}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceInput File Path'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceInputFilePath() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "cn.keking.service.OfficeToPdfServiceInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServiceMaxImageResolution}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceMaxImageResolution'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(
            "cn.keking.service.OfficeToPdfServiceMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServicePageRange}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServicePageRange'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServicePageRange() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServicePageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServiceU}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceU'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceU() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceU"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServiceUtxt}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServiceUtxt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServiceUtxt() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceUtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code OfficeToPdfService.}.
   *   <li>Then return a string.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfService.'; then return a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code OfficeToPdfServicefalse}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'cn.keking.service.OfficeToPdfServicefalse'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenCnKekingServiceOfficeToPdfServicefalse() {
    // Arrange, Act and Assert
    assertEquals(
        "cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServicefalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt..}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt..'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt2() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt42}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt42'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt42_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.42}.
   *   <li>Then return {@code /directory/foo.txt.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt.42'; then return '/directory/foo.txt.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt42_thenReturnDirectoryFooTxtPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txt42}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txt42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxt42() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txt42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtDocumentOpenPassword}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtDocumentOpenPassword'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtDocumentOpenPassword() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath(
            "/directory/foo.txt/directory/foo.txtDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtEncryptFile}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtEncryptFile'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtEncryptFile() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtExportBookmarks}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtExportBookmarks'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath(
            "/directory/foo.txt/directory/foo.txtExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtExportNotes}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtExportNotes'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtExportNotes() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtFilterData}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtFilterData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtFilterData() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtInput File Path}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtInput File Path'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtInputFilePath() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath(
            "/directory/foo.txt/directory/foo.txtInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtMaxImageResolution}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtMaxImageResolution'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath(
            "/directory/foo.txt/directory/foo.txtMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtPageRange}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtPageRange'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtPageRange() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtPageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtU}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtU'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtU() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtU"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtUtxt}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtUtxt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtUtxt() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtUtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txt.}.
   *   <li>Then return a string.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txt.'; then return a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt/directory/foo.txtfalse}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt/directory/foo.txtfalse'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDirectoryFooTxtfalse() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtfalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtDocumentOpenPassword}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtDocumentOpenPassword'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDocumentOpenPassword() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.DocumentOpenPassword}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.DocumentOpenPassword'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtDocumentOpenPassword2() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.DocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.EncryptFile}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.EncryptFile'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtEncryptFile() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.EncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtEncryptFile}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtEncryptFile'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtEncryptFile_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtExportBookmarks}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtExportBookmarks'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.ExportBookmarks}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.ExportBookmarks'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtExportBookmarks2() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.ExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.ExportNotes}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.ExportNotes'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtExportNotes() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.ExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtExportNotes}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtExportNotes'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtExportNotes_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtFilterData}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtFilterData'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtFilterData_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.FilterData}.
   *   <li>Then return {@code /directory/foo.txt.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt.FilterData'; then return '/directory/foo.txt.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtFilterData_thenReturnDirectoryFooTxtPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.FilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.Input File Path}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.Input File Path'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtInputFilePath() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.Input File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtInput File Path}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtInput File Path'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtInputFilePath_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtMaxImageResolution}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtMaxImageResolution'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.MaxImageResolution}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txt.MaxImageResolution'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtMaxImageResolution2() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.MaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtPageRange}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtPageRange'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtPageRange_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtPageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtU.}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtU.'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtU() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtU."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtU42}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtU42'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtU42_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtU42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUDocumentOpenPassword}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUDocumentOpenPassword'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUDocumentOpenPassword() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUEncryptFile}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUEncryptFile'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUEncryptFile_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUExportBookmarks}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUExportBookmarks'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUExportNotes}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUExportNotes'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUExportNotes_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUFilterData}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUFilterData'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUFilterData_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUInput File Path}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUInput File Path'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUInputFilePath() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUMaxImageResolution}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUMaxImageResolution'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUPageRange}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUPageRange'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUPageRange_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtUPageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUU}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUU'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUU_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtUU"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtU}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtU'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtU_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtU"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.U}.
   *   <li>Then return {@code /directory/foo.txt.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt.U'; then return '/directory/foo.txt.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtU_thenReturnDirectoryFooTxtPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.U"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUfalse}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUfalse'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUfalse_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtUfalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxt42}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUtxt42'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxt42_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxt42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxtDocumentOpenPassword}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUtxtDocumentOpenPassword'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxtDocumentOpenPassword() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxtDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxtEncryptFile}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUtxtEncryptFile'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxtEncryptFile() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxtEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxtExportBookmarks}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUtxtExportBookmarks'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxtExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxtExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxtExportNotes}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUtxtExportNotes'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxtExportNotes() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxtExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxtFilterData}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUtxtFilterData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxtFilterData() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxtFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxtInput File Path}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUtxtInput File Path'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxtInputFilePath() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxtInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxtMaxImageResolution}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '/directory/foo.txtUtxtMaxImageResolution'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxtMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxtMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxtPageRange}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUtxtPageRange'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxtPageRange_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxtPageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxtUtxt}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUtxtUtxt'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxtUtxt_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxtUtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxt}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUtxt'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxt_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt.Utxt}.
   *   <li>Then return {@code /directory/foo.txt.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt.Utxt'; then return '/directory/foo.txt.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxt_thenReturnDirectoryFooTxtPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.Utxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtUtxtfalse}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtUtxtfalse'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtUtxtfalse_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtUtxtfalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txt}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txt'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code ./directory/foo.txt}.
   *   <li>Then return {@code ./directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when './directory/foo.txt'; then return './directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxt_thenReturnDirectoryFooPdf2() {
    // Arrange, Act and Assert
    assertEquals(
        "./directory/foo.pdf", OfficeToPdfService.getOutputFilePath("./directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code /directory/foo.txtfalse}.
   *   <li>Then return {@code /directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '/directory/foo.txtfalse'; then return '/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDirectoryFooTxtfalse_thenReturnDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtfalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .DocumentOpenPassword}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.DocumentOpenPassword'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDocumentOpenPassword_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".DocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code ..}.
   *   <li>Then return {@code .pdf.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '..'; then return '.pdf.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDotDot_thenReturnPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf", OfficeToPdfService.getOutputFilePath(".."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenDot_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath("."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code EncryptFile.}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'EncryptFile.'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenEncryptFile() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("EncryptFile."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .EncryptFile}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.EncryptFile'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenEncryptFile_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".EncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code ExportBookmarks.}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'ExportBookmarks.'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenExportBookmarks() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("ExportBookmarks."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .ExportBookmarks}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.ExportBookmarks'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenExportBookmarks_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".ExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code ExportNotes.}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'ExportNotes.'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenExportNotes() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("ExportNotes."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .ExportNotes}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.ExportNotes'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenExportNotes_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".ExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code false/directory/foo.txt}.
   *   <li>Then return {@code false/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'false/directory/foo.txt'; then return 'false/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenFalseDirectoryFooTxt_thenReturnFalseDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "false/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("false/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .false}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.false'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenFalse_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".false"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code false.}.
   *   <li>Then return {@code .pdf.pdf.pdf.pdf.pdf.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'false.'; then return '.pdf.pdf.pdf.pdf.pdf.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenFalse_thenReturnPdfPdfPdfPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("false."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .FilterData}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.FilterData'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenFilterData_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".FilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code FilterData.}.
   *   <li>Then return {@code .pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'FilterData.'; then return '.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenFilterData_thenReturnPdfPdfPdfPdfPdfPdfPdfPdfPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("FilterData."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code Input File Path.}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'Input File Path.'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenInputFilePath() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("Input File Path."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .Input File Path}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.Input File Path'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenInputFilePath_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".Input File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code MaxImageResolution.}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'MaxImageResolution.'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenMaxImageResolution() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("MaxImageResolution."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .MaxImageResolution}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.MaxImageResolution'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenMaxImageResolution_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".MaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .PageRange}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.PageRange'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPageRange_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".PageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code PageRange.}.
   *   <li>Then return {@code .pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'PageRange.'; then return '.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPageRange_thenReturnPdfPdfPdfPdfPdfPdfPdfPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("PageRange."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdf42}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdf42'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdf42_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdf42"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdf/directory/foo.txt}.
   *   <li>Then return {@code .pdf/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '.pdf/directory/foo.txt'; then return '.pdf/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfDirectoryFooTxt_thenReturnPdfDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf/directory/foo.pdf", OfficeToPdfService.getOutputFilePath(".pdf/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdfDocumentOpenPassword}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when '.pdfDocumentOpenPassword'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfDocumentOpenPassword_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfDocumentOpenPassword"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdfEncryptFile}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfEncryptFile'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfEncryptFile_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfEncryptFile"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdfExportBookmarks}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfExportBookmarks'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfExportBookmarks_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfExportBookmarks"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdfExportNotes}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfExportNotes'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfExportNotes_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfExportNotes"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdfFilterData}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfFilterData'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfFilterData_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfFilterData"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdfInput File Path}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfInput File Path'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfInputFilePath_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfInput File Path"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdfMaxImageResolution}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfMaxImageResolution'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfMaxImageResolution_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfMaxImageResolution"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdfPageRange}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfPageRange'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfPageRange_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfPageRange"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdfU}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfU'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfU_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfU"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdfUtxt}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdfUtxt'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdfUtxt_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfUtxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdf.}.
   *   <li>Then return {@code .pdf.pdf.pdf.pdf.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdf.'; then return '.pdf.pdf.pdf.pdf.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdf_thenReturnPdfPdfPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath(".pdf."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .pdffalse}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.pdffalse'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenPdffalse_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdffalse"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code U/directory/foo.txt}.
   *   <li>Then return {@code U/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'U/directory/foo.txt'; then return 'U/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenUDirectoryFooTxt_thenReturnUDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        "U/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("U/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .U}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.U'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenU_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".U"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code U.}.
   *   <li>Then return {@code .pdf.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'U.'; then return '.pdf.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenU_thenReturnPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf", OfficeToPdfService.getOutputFilePath("U."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code Utxt/directory/foo.txt}.
   *   <li>Then return {@code .pdf/directory/foo.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName(
      "Test getOutputFilePath(String); when 'Utxt/directory/foo.txt'; then return '.pdf/directory/foo.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenUtxtDirectoryFooTxt_thenReturnPdfDirectoryFooPdf() {
    // Arrange, Act and Assert
    assertEquals(
        ".pdf/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("Utxt/directory/foo.txt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code .Utxt}.
   *   <li>Then return {@code .pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when '.Utxt'; then return '.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenUtxt_thenReturnPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".Utxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code Utxt.}.
   *   <li>Then return {@code .pdf.pdf.pdf.pdf.pdf}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'Utxt.'; then return '.pdf.pdf.pdf.pdf.pdf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenUtxt_thenReturnPdfPdfPdfPdfPdf() {
    // Arrange, Act and Assert
    assertEquals(".pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("Utxt."));
  }

  /**
   * Test {@link OfficeToPdfService#getOutputFilePath(String)}.
   *
   * <ul>
   *   <li>When {@code Utxt}.
   *   <li>Then return {@code Utxt}.
   * </ul>
   *
   * <p>Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  @DisplayName("Test getOutputFilePath(String); when 'Utxt'; then return 'Utxt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getOutputFilePath(String)"})
  void testGetOutputFilePath_whenUtxt_thenReturnUtxt() {
    // Arrange, Act and Assert
    assertEquals("Utxt", OfficeToPdfService.getOutputFilePath("Utxt"));
  }

  /**
   * Test {@link OfficeToPdfService#getPostfix(String)}.
   *
   * <p>Method under test: {@link OfficeToPdfService#getPostfix(String)}
   */
  @Test
  @DisplayName("Test getPostfix(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OfficeToPdfService.getPostfix(String)"})
  void testGetPostfix() {
    // Arrange, Act and Assert
    assertEquals(
        FilePreview.TXT_FILE_PREVIEW_PAGE, OfficeToPdfService.getPostfix("/directory/foo.txt"));
  }
}
