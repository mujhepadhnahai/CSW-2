class ex{
    private int intValue;
    private double doubleValue;
    ex(){
        this.intValue = 0;
        this.doubleValue=0.0;
    }
    void setData(int i,double d){
        this.intValue=i;
        this.doubleValue=d;
    }
    void updateDoubleValue(double d){
        this.doubleValue=d;
    }
    void updateIntValue(int i){
        this.intValue=i;
    }
    void printData(){
        System.out.println("Integer value"+intValue);
        System.out.println("Double value"+doubleValue);
    }
}
public class q5{
    public static void main(String[] args) {
        ex obj1 = new ex();
        obj1.setData(5,55.56);
        obj1.printData();
        ex obj2 = new ex();
        obj2.setData(10,66.66);
        obj2.printData();
        obj1 = null;
        obj2 = null;
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory before garbage collection");
    }
}