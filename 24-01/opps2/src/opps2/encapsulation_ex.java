package opps2;

public class encapsulation_ex {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setName("Krishna");
		System.out.println("Name: "+s1.getName());
	}
}
class Student1 {
	private String name;
	public void setName(String name) {
	this.name = name;	
	}
	public String getName() {
		return name;
	}
}
