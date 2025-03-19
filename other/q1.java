public class q1{
    private String myObj;
    public static void main(String[] args) {
        testMethord();
        System.gc();
    }
    public q1(String myObj){
        this.myObj = myObj;
    }
    private static void testMethord(){
        q1 objtest1 = new q1("objtest 1");
        testMethord2 ();
    }
    private static void testMethord2(){
        q1 objtest2 = new q1("objtest 2");
    }
    @Override
    protected void finalize() throws Throwable {    
        System.out.println("Garbage collection successful for "+this.myObj);
    } 
}