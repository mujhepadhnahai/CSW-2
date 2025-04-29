// import java.io.IOException;
// import java.io.*;
// import java.util.*;
// public class fileaccess {
//     public static void main(String[] args)throws IOException  {
//     String Path = "Diary.txt";
//     File f = new File(Path);
//     if(!f.exists()){
//         System.out.println("file not exist");
//     }
//     FileReader reader = new FileReader(f);
//     int charV ;
//     while((charV=reader.read())!=-1){
//        System.out.print((char)charV);
//     }
//     }
// }


import java.io.*;
import java.util.*;

public class fileaccess {
    public static void main(String[] args) throws IOException {
        String path = "Diary.txt";
        File file = new File(path);

        // Check if file exists
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return; // Exit if file does not exist
        }

        // Reading the file content
        System.out.println("Existing content in the file:");
        FileReader reader = new FileReader(file);
        int charV;
        while ((charV = reader.read()) != -1) {
            System.out.print((char) charV); // Print current file content
        }
        reader.close(); // Close the FileReader after use

        // Now, let's add new data with timestamp
        System.out.println("\n\nEnter new content to append to the diary:");
        Scanner scanner = new Scanner(System.in);
        String newContent = scanner.nextLine();

        // Create a FileWriter in append mode
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("\n\n"+new Date() + "\n" + newContent); // Add a timestamp and the new content
            System.out.println("New content added successfully with timestamp.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close(); // Close the scanner
    }
}

