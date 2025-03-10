public class error2{
    public static void main(String[] args) {
        System.out.println("started");
        try {
            try {
                try {
                    int arr[] = {1,2,3,4};
                    System.out.println(arr[5]);
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array Index Out of Bounds: "+e);
                    System.out.println("Inner try block 2 ");
                    }
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception: "+e);
                System.out.println("Inner try block 1 ");
                }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("mai other try block");
            }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("handled in main block");
            }
        System.out.println("Ended");    
    }
}
/*
started
Array Index Out of Bounds: java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
Inner try block 2
Ended 
*/