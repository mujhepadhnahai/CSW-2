public class Throw1{
    public static void main(String[] args) {
        check(4);
        System.out.println("End");
    }
    public static void check(int a){
        if(a<10){
            throw new ArithmeticException("Some problem");
        }else{
            System.out.println("All is well");
        }
    }
}