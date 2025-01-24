package opps2;

abstract class Animal1{
	void eat() {
		System.out.println("Animal is eating");
	}
	abstract void sound();			
}
class Dog extends Animal1{
	void sound() {
		System.out.println("Dog barks");
	}
}
interface Flyable{
	void fly();
}
class Airplane implements Flyable{
	public void fly() {
		System.out.println("Airplane flies");
	}
}

public class interface_adbstract {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sound();
		Airplane a = new Airplane();
		a.fly();
	}

}
