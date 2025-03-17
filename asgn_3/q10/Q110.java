import java.io.*;

public class Q110{
      public static void main(String[] args) throws Exception{
        if(args.length!=1){
            System.out.println("provide a valid path");
            return;
        }
        String filePath = args[0];
        File file = new File(filePath);
        if(!file.exists()){
        throw new CustomFileNotFoundException("File not found"+filePath);
        }
        try {
            FileReader reader = new FileReader(filePath);
            System.out.println("Contents");
            int charValue;
            while((charValue = reader.read()) != -1){
            System.out.print((char) charValue);
            }
        } catch (IOException e) {
            throw new CustomFileReadPermissionException("Error reading file"+e.getMessage());
        }
      }
}
class CustomFileNotFoundException extends FileNotFoundException{
     public CustomFileNotFoundException(String message){
        super(message);
     }
}
class CustomFileReadPermissionException extends IOException{
     public CustomFileReadPermissionException(String message){
        super(message);
     }
}

//"C:\Users\E 555\Desktop\jjj\CSW-2\asgn_3\q10\hello.txt"