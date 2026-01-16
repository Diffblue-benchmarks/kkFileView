package cn.keking.service;

import cn.keking.model.FileAttribute;
import cn.keking.model.FileType;
import com.diffblue.cover.annotations.InterestingTestFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Factory class for creating test instances for FileHandlerService tests.
 */
public class FileHandlerServiceFactory {

    /**
     * Creates a valid FileAttribute instance for CAD file testing.
     * This prevents FileNotFoundException in cadToPdf method.
     */
    @InterestingTestFactory
    public static FileAttribute createFileAttributeForCad() {
        FileAttribute fileAttribute = new FileAttribute();
        fileAttribute.setName("test.dwg");
        fileAttribute.setType(FileType.CAD);
        fileAttribute.setSuffix("dwg");
        fileAttribute.setUrl("http://example.com/test.dwg");
        fileAttribute.setOriginFilePath("/tmp/test.dwg");
        fileAttribute.setOutFilePath("/tmp/test-output.pdf");
        fileAttribute.setCacheName("test-cache.pdf");
        fileAttribute.setCompressFile(false);
        fileAttribute.setForceUpdatedCache(false);
        fileAttribute.setSkipDownLoad(false);
        return fileAttribute;
    }

    /**
     * Creates a valid temporary CAD file path for testing.
     * This ensures the file exists to prevent FileNotFoundException in cadToPdf.
     */
    @InterestingTestFactory
    public static String createValidCadFilePath() {
        try {
            File tempFile = File.createTempFile("test", ".dwg");
            tempFile.deleteOnExit();
            // Write minimal DWG file header to make it recognizable
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                // Write a simple AutoCAD DWG header
                fos.write("AC1015".getBytes(StandardCharsets.UTF_8));
                // Add some padding to make the file non-empty
                fos.write(new byte[1024]);
            }
            return tempFile.getAbsolutePath();
        } catch (IOException e) {
            return "/tmp/test.dwg";
        }
    }

    /**
     * Creates a valid file path with content for testing doActionConvertedFile.
     * This prevents ArrayIndexOutOfBoundsException by ensuring the file has sufficient content.
     */
    @InterestingTestFactory
    public static String createValidFilePathWithContent() {
        try {
            File tempFile = File.createTempFile("test", ".html");
            tempFile.deleteOnExit();
            // Write HTML content with encoding declaration
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                String htmlContent = "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "    <meta charset=\"utf-8\">\n" +
                        "    <title>Test File</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "    <h1>Test Content</h1>\n" +
                        "    <p>This is a test file with sufficient content to avoid ArrayIndexOutOfBoundsException.</p>\n" +
                        "</body>\n" +
                        "</html>";
                fos.write(htmlContent.getBytes(StandardCharsets.UTF_8));
            }
            return tempFile.getAbsolutePath();
        } catch (IOException e) {
            return "/tmp/test.html";
        }
    }
}
