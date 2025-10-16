package cn.keking.service;

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
}
