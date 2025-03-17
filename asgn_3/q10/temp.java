import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class FileProcessor {

    public static void main(String[] args)throws Exception {
        if (args.length != 1) {
            System.out.println("Please provide a valid file path.");
            return;
        }
        
        String filePath = args[0];
        File file = new File(filePath);
        
        if (!file.exists()) {
            throw new CustomFileNotFoundException("File not found: " + filePath);
        }

        try (FileReader reader = new FileReader(file)) {
            Scanner scanner = new Scanner(reader);
            int wordCount = 0;
            
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (!isPunctuation(word.charAt(word.length() - 1))) {
                    wordCount++;
                }
            }
            
            System.out.println("\n\nWord Count: " + wordCount);
        } catch (IOException e) {
            throw new CustomFileReadPermissionException("Error reading the file: " + e.getMessage());
        }
    }

    private static boolean isPunctuation(char c) {
        return c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':';
    }
}
class CustomFileNotFoundException extends FileNotFoundException {
    public CustomFileNotFoundException(String message) {
        super(message);
    }
}
class CustomFileReadPermissionException extends FileNotFoundException {
    public CustomFileReadPermissionException(String message) {
        super(message);
    }
}