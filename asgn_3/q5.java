public class q5 {
    public static void main(String[] args) {
        String strNumber = "100";
        String invalidNumber = "abc"; 
        try {
            int number = Integer.parseInt(strNumber); 
            System.out.println("Converted number: " + number);

            try {
                int result = number / 0; 
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException");
            }
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        }
    }
}
