package cn.keking.service;

import cn.keking.config.ConfigConstants;
import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Test factory for OfficeToPdfService to help Diffblue Cover generate tests.
 */
public class OfficeToPdfServiceTestFactory {

    /**
     * Factory method to create a valid FileAttribute instance for testing.
     * This prevents NullPointerException during test generation.
     *
     * @return a properly initialized FileAttribute instance
     */
    @InterestingTestFactory
    public static FileAttribute createFileAttribute() {
        // Initialize ConfigConstants to prevent NPE in converterFile method
        ConfigConstants.setOfficePageRangeValue("false");
        ConfigConstants.setOfficeWatermarkValue("false");
        ConfigConstants.setOfficeQualityValue("80");
        ConfigConstants.setOfficeMaxImageResolutionValue("150");
        ConfigConstants.setOfficeExportBookmarksValue(true);
        ConfigConstants.setOfficeExportNotesValue(true);
        ConfigConstants.setOfficeDocumentOpenPasswordsValue(true);

        FileAttribute fileAttribute = new FileAttribute();
        fileAttribute.setType(FileType.OFFICE);
        fileAttribute.setSuffix("docx");
        fileAttribute.setName("test-document.docx");
        fileAttribute.setUrl("http://example.com/test-document.docx");
        fileAttribute.setOfficePreviewType("pdf");
        fileAttribute.setFilePassword(null);
        fileAttribute.setUsePasswordCache(false);
        fileAttribute.setCompressFile(false);
        fileAttribute.setSkipDownLoad(false);
        fileAttribute.setForceUpdatedCache(false);
        fileAttribute.setHtmlView(false);
        return fileAttribute;
    }

    /**
     * Factory method to create a valid OfficeToPdfService instance for testing.
     * This prevents NullPointerException during test generation for openOfficeToPDF method.
     *
     * @return a properly initialized OfficeToPdfService instance
     */
    @InterestingTestFactory
    public static OfficeToPdfService createOfficeToPdfService() {
        // Initialize ConfigConstants to prevent NPE
        ConfigConstants.setOfficePageRangeValue("false");
        ConfigConstants.setOfficeWatermarkValue("false");
        ConfigConstants.setOfficeQualityValue("80");
        ConfigConstants.setOfficeMaxImageResolutionValue("150");
        ConfigConstants.setOfficeExportBookmarksValue(true);
        ConfigConstants.setOfficeExportNotesValue(true);
        ConfigConstants.setOfficeDocumentOpenPasswordsValue(true);

        return new OfficeToPdfService();
    }
}
