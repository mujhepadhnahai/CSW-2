class Student {
    private String name;
    private int rollNo;
    private String course;

    Student(int rollNo,String name,String course){
        this.rollNo=rollNo;
        this.name=name;
        this.course=course;
    }
    public void finalize(){
        System.out.println("Object is being garbage collected");
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Course: "+course);
    }
    public void getName(){
        return this.name ;
    }

}
public class q7{
   
     public static void main(String[] args) {
         Student s1=new Student(1,"Smruti Sourav","MCA");
         Student s2=new Student(2,"Smruti","BCA");
         Student s3=new Student(3,"Prakriti","MCA");
        
         long totalMemory =Runtime.getRuntime().totalMemory();
         System.out.println("Total Memory: "+totalMemory);
         System.out.println("Memory used: "+(totalMemory - Runtime.getRuntime().freeMemory()));

         s1.display();
         s2.display();
         s3.display();

         s1=null;
         s2=null;   
         s3=null;
         System.gc();
         System.out.println("Total Memory: "+totalMemory);
         System.out.println("Memory used: "+(totalMemory - Runtime.getRuntime().freeMemory()));
     }
}