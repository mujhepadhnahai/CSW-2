import java.util.Scanner;
public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            if (age < 18) {
                UnderAgeException underAge = new UnderAgeException();
                throw underAge;
            } else if (age > 65) {
                OverAgeException overAge = new OverAgeException();
                throw overAge;
            } else {
                System.out.println("Your age is valid. Welcome!");
            }
        } catch (UnderAgeException e) {
            System.out.println("Error: " + e.message());
        } catch (OverAgeException e) {
            System.out.println("Error: " + e.message());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            scanner.close();
        }
    }
}
/*
Picked up JAVA_TOOL_OPTIONS: -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8
Enter your age: 14
Error: Age is under 18. You are not allowed.

Picked up JAVA_TOOL_OPTIONS: -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8
Enter your age: 45
Your age is valid. Welcome!

Picked up JAVA_TOOL_OPTIONS: -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8
Enter your age: 66
Error: Age is over 65. You are considered overage.
*/