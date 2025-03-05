
class Student1<T>{
  private T rollNumber;
  private String name;
  private int age;
  Student1(String name,T rollNumber,int age){
     this.name = name;
     this.rollNumber = rollNumber;
     this.age=age;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setRollNumber(T rollNumber){
    this.rollNumber = rollNumber;
  }
  public void setAge(int age){
    this.age = age;
  }
  public String getName(){
    return this.name;
  }
    public T RollNo(){
      return rollNumber;
  }
    public int getAge(){
      return this.age;
  }
      

}
public class Q1{
    
    public static void main(String[] args) {
      Student1<Integer> student1 = new Student1<>("Alice",101,20);
      student1.setName("Guru p p");
      System.out.println("name: "+student1.getName()+"Age"+student1.getAge()+" roll "+student1.RollNo());
      }
}