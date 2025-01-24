package opps2;

class Studentdetails {
    String name;
    int roll;
    Studentdetails(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    void check() {
        System.out.println("Student name: " + name);
        System.out.println("Student roll: " + roll);
        
    }
}

class Studentadd extends Studentdetails {
	String add;
    Studentadd(String name, int roll,String add) {
    super(name, roll);
    this.add = add;
   
    }
}

public class inheritance_ex {
    public static void main(String[] args) {
       
        Studentadd student = new Studentadd("John", 101,"42 mouza");
        student.check(); 
        System.out.println("address: " +student.add);
    }
}
