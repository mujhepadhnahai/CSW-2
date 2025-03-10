

public class Throw2{

    public void test(int n1,int n2){
        try {
            System.out.println(n1/n2);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in test");
            throw e;
        }finally{
            System.out.println("connection terminated");
        }
    }

    public static void main(String[] args) {
        System.out.println("connected");
        Throw2 main = new Throw2();
        try {
            main.test(30,0);
        } catch (Exception e) {
            System.out.println("Exception handled");
            e.printStackTrace();
        }
        System.out.println("Signed out");
    }

   
}
/*
connected
Exception handled in test
connection terminated
Exception handled
java.lang.ArithmeticException: / by zero
        at Throw2.test(Throw2.java:7)
        at Throw2.main(Throw2.java:20)
Signed out
*/