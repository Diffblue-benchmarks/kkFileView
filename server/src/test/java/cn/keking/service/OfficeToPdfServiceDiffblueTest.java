package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OfficeToPdfServiceDiffblueTest {
  /**
   * Method under test: {@link OfficeToPdfService#getOutputFilePath(String)}
   */
  @Test
  void testGetOutputFilePath() {
    // Arrange, Act and Assert
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt"));
    assertEquals("xtxt", OfficeToPdfService.getOutputFilePath("xtxt"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath("."));
    assertEquals("cn.keking.service.pdf", OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfService"));
    assertEquals("/directory/foo.pdf/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txt"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt."));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtInput File Path"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtDocumentOpenPassword"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt42"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtEncryptFile"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtExportBookmarks"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtExportNotes"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtFilterData"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtMaxImageResolution"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtPageRange"));
    assertEquals("/directory/foo.txtcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtcn.keking.service.OfficeToPdfService"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtfalse"));
    assertEquals(".pdf/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("xtxt/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("xtxt."));
    assertEquals("xtxtcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("xtxtcn.keking.service.OfficeToPdfService"));
    assertEquals("./directory/foo.pdf", OfficeToPdfService.getOutputFilePath("./directory/foo.txt"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".xtxt"));
    assertEquals(".pdf.pdf", OfficeToPdfService.getOutputFilePath(".."));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".Input File Path"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".DocumentOpenPassword"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".42"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".EncryptFile"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".ExportBookmarks"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".ExportNotes"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".FilterData"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".MaxImageResolution"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".PageRange"));
    assertEquals(".cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(".cn.keking.service.OfficeToPdfService"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".false"));
    assertEquals(".pdf/directory/foo.pdf", OfficeToPdfService.getOutputFilePath(".pdf/directory/foo.txt"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfxtxt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath(".pdf."));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfInput File Path"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfDocumentOpenPassword"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdf42"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfEncryptFile"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfExportBookmarks"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfExportNotes"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfFilterData"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfMaxImageResolution"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdfPageRange"));
    assertEquals(".pdfcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath(".pdfcn.keking.service.OfficeToPdfService"));
    assertEquals(".pdf", OfficeToPdfService.getOutputFilePath(".pdffalse"));
    assertEquals("Input File Path/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("Input File Path/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("Input File Path."));
    assertEquals("Input File Pathcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("Input File Pathcn.keking.service.OfficeToPdfService"));
    assertEquals("DocumentOpenPassword/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("DocumentOpenPassword/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("DocumentOpenPassword."));
    assertEquals("DocumentOpenPasswordcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("DocumentOpenPasswordcn.keking.service.OfficeToPdfService"));
    assertEquals("42/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("42/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("42."));
    assertEquals("42cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("42cn.keking.service.OfficeToPdfService"));
    assertEquals("EncryptFile/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("EncryptFile/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("EncryptFile."));
    assertEquals("EncryptFilecn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("EncryptFilecn.keking.service.OfficeToPdfService"));
    assertEquals("ExportBookmarks/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("ExportBookmarks/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("ExportBookmarks."));
    assertEquals("ExportBookmarkscn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("ExportBookmarkscn.keking.service.OfficeToPdfService"));
    assertEquals("ExportNotes/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("ExportNotes/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("ExportNotes."));
    assertEquals("ExportNotescn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("ExportNotescn.keking.service.OfficeToPdfService"));
    assertEquals("FilterData/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("FilterData/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("FilterData."));
    assertEquals("FilterDatacn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("FilterDatacn.keking.service.OfficeToPdfService"));
    assertEquals("MaxImageResolution/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("MaxImageResolution/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("MaxImageResolution."));
    assertEquals("MaxImageResolutioncn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("MaxImageResolutioncn.keking.service.OfficeToPdfService"));
    assertEquals("PageRange/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("PageRange/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("PageRange."));
    assertEquals("PageRangecn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("PageRangecn.keking.service.OfficeToPdfService"));
    assertEquals("cn.keking.service.OfficeToPdfService/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfService/directory/foo.txt"));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServicextxt"));
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf"
            + ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfService."));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceInput File Path"));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceDocumentOpenPassword"));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfService42"));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceEncryptFile"));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceExportBookmarks"));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceExportNotes"));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceFilterData"));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServiceMaxImageResolution"));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServicePageRange"));
    assertEquals("cn.keking.service.pdfcn.keking.service.pdf", OfficeToPdfService
        .getOutputFilePath("cn.keking.service.OfficeToPdfServicecn.keking.service.OfficeToPdfService"));
    assertEquals("cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("cn.keking.service.OfficeToPdfServicefalse"));
    assertEquals("false/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("false/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf", OfficeToPdfService.getOutputFilePath("false."));
    assertEquals("falsecn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("falsecn.keking.service.OfficeToPdfService"));
    assertEquals("创建目录【{}】失败，请检查目录权限！/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("创建目录【{}】失败，请检查目录权限！/directory/foo.txt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("创建目录【{}】失败，请检查目录权限！."));
    assertEquals("创建目录【{}】失败，请检查目录权限！cn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("创建目录【{}】失败，请检查目录权限！cn.keking.service.OfficeToPdfService"));
    assertEquals("/directory/foo.pdf/directory/foo.pdf/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txt/directory/foo.txt"));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtxtxt"));
    assertEquals(
        ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf"
            + ".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txt."));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtInput File Path"));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtDocumentOpenPassword"));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txt42"));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtEncryptFile"));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtExportBookmarks"));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtExportNotes"));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtFilterData"));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtMaxImageResolution"));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtPageRange"));
    assertEquals("/directory/foo.txt/directory/foo.txtcn.keking.service.pdf", OfficeToPdfService
        .getOutputFilePath("/directory/foo.txt/directory/foo.txtcn.keking.service.OfficeToPdfService"));
    assertEquals("/directory/foo.txt/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt/directory/foo.txtfalse"));
    assertEquals("/directory/foo.pdf.pdf/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxt/directory/foo.txt"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtxtxt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxt."));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtInput File Path"));
    assertEquals("/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtDocumentOpenPassword"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxt42"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtEncryptFile"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtExportBookmarks"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtExportNotes"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtFilterData"));
    assertEquals("/directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtMaxImageResolution"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtPageRange"));
    assertEquals("/directory/foo.txtxtxtcn.keking.service.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtcn.keking.service.OfficeToPdfService"));
    assertEquals("/directory/foo.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txtxtxtfalse"));
    assertEquals("/directory/foo.pdf./directory/foo.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt./directory/foo.txt"));
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.xtxt"));
    assertEquals(".pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.."));
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.Input File Path"));
    assertEquals("/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.DocumentOpenPassword"));
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.42"));
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.EncryptFile"));
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.ExportBookmarks"));
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.ExportNotes"));
    assertEquals("/directory/foo.txt.pdf", OfficeToPdfService.getOutputFilePath("/directory/foo.txt.FilterData"));
    assertEquals("/directory/foo.txt.pdf",
        OfficeToPdfService.getOutputFilePath("/directory/foo.txt.MaxImageResolution"));
  }

  /**
   * Method under test: {@link OfficeToPdfService#getPostfix(String)}
   */
  @Test
  void testGetPostfix() {
    // Arrange, Act and Assert
    assertEquals(FilePreview.TXT_FILE_PREVIEW_PAGE, OfficeToPdfService.getPostfix("/directory/foo.txt"));
  }
}
