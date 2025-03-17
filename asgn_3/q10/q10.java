import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class q10 {

    static class FileNotFoundException extends Exception {
        public FileNotFoundException(String message) {
            super(message);
        }
    }

    static class FileReadPermissionException extends Exception {
        public FileReadPermissionException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file path as a command-line argument.");
            return;
        }

        String filePath = args[0];
        try {
            readFile(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (FileReadPermissionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readFile(String filePath) throws FileNotFoundException, FileReadPermissionException {
        if (filePath == null || filePath.trim().isEmpty()) {
            throw new FileNotFoundException("File path is null or empty.");
        }

        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException("The file at " + filePath + " does not exist.");
        }

        if (!file.canRead()) {
            throw new FileReadPermissionException("Cannot read the file at " + filePath + " due to permission issues.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
