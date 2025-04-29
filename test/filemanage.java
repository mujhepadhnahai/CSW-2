import java.io.IOException;
import java.io.*;
import java.util.*;
public class filemanage {
   public static void main(String[] args)throws IOException  {
    String path = "Diary.txt";
    File f = new File(path);
    if(f.exists())System.out.println("File already exist in same diarectory");
    else System.out.println(path+" created successfully");

    System.out.println("enter file contents");
    String contents = new Scanner(System.in).nextLine();

    try(FileWriter w = new FileWriter(f)){
        w.write(new Date()+ "\n" +contents);
        System.out.println("Data saved successfully");
    }
   }
}
