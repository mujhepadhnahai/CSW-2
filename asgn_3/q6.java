import java.util.Arrays;
import java.util.Scanner;

public class q6 {
    
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static int binarySearch(int[] arr, int target) {
        return Arrays.binarySearch(arr, target);
    }

    public static void accessElementSafely(int[] arr, int index) {
        try {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index out of bounds. Index: " + index);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {15, 3, 12, 8, 7, 5, 10};
        System.out.println("Initial Array: " + Arrays.toString(arr));
        sortArray(arr);
        
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();        
        int index = binarySearch(arr, target);
        if (index >= 0) {
            System.out.println("Number " + target + " found at index: " + index);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }

        System.out.print("Enter an index to access an element: ");
        int indexToAccess = scanner.nextInt();
        accessElementSafely(arr, indexToAccess);

        System.out.println("Demonstrating out-of-bounds access:");
        accessElementSafely(arr, arr.length);

  
        System.out.print("Enter another index to access an element: ");
        indexToAccess = scanner.nextInt();
        accessElementSafely(arr, indexToAccess);
        scanner.close();
    }
}
