package cn.keking.utils;

import com.diffblue.cover.annotations.InterestingTestFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Factory class for creating test instances for EncodingDetects tests.
 */
public class EncodingDetectsFactory {

    /**
     * Creates a valid file path with sufficient content for testing.
     * This prevents ArrayIndexOutOfBoundsException by ensuring the file has adequate content
     * for encoding detection.
     */
    @InterestingTestFactory
    public static String createValidFilePath() {
        try {
            File tempFile = File.createTempFile("encoding-test", ".txt");
            tempFile.deleteOnExit();
            // Write sufficient content to avoid ArrayIndexOutOfBoundsException
            // The encoding detection needs at least some bytes to analyze
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                String content = "This is a test file with sufficient content for encoding detection.\n" +
                        "It contains multiple lines of text to ensure proper analysis.\n" +
                        "The content should be long enough to avoid any array bounds issues.\n" +
                        "Additional lines are added to provide adequate data for testing.\n" +
                        "This helps prevent ArrayIndexOutOfBoundsException during encoding detection.";
                fos.write(content.getBytes(StandardCharsets.UTF_8));
            }
            return tempFile.getAbsolutePath();
        } catch (IOException e) {
            // Fallback path - though this might not exist, it's better than null
            return "/tmp/encoding-test.txt";
        }
    }

    /**
     * Creates a valid byte array with sufficient content for testing.
     * This prevents ArrayIndexOutOfBoundsException in byte array processing.
     */
    @InterestingTestFactory
    public static byte[] createValidByteArray() {
        String content = "Test content with sufficient bytes for encoding detection. " +
                "This ensures that the array has enough elements to prevent " +
                "ArrayIndexOutOfBoundsException during processing.";
        return content.getBytes(StandardCharsets.UTF_8);
    }
}
