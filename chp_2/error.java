//ArithmaticException
//NegativeArraySizeException
//ArrayIndexOutofBoundException
//Exception finallytry {

public class error{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("code started");
        try {
            int arr[] = new int[5];
            arr[0] = 30/0;
            arr[5] = 4;
            System.out.println(arr[0]);
            String s = null ;
            System.out.println(s.length());

        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("code ended");
    }
}
/*
code started
java.lang.ArithmeticException: / by zero
code ended
*/