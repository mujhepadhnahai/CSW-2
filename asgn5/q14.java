import java.io.File;
import java.util.*;
public class q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of file to delete");
        String fileName = sc.nextLine();
        File fileToDelete = new File(fileName);
        if(fileToDelete.delete()){
            if(fileToDelete.delete()){
                System.out.println("File deleted successfully");
            }else{
                System.out.println("File not deleted");
            }
        }else{
            System.out.println("File not found");
        }
    }
}