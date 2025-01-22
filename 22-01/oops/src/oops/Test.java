package oops;
public class Test {
	public static void main(String[] args) {
		Student Kunal = new Student(15,"Kunal",99.1f);
		System.out.println(Kunal.roll);
		System.out.println(Kunal.name);
		System.out.println(Kunal.mark);
		
		Student random = new Student(Kunal);
		System.out.println(random.name);
		Student random2 = new Student();
		System.out.println(random2.name);
		Student one = new Student();
		Student two = one;
		one.name = "hello honey bonny";
		System.out.println(two.name);
	}
}
