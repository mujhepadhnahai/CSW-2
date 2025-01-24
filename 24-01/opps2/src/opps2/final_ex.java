package opps2;

final class Animal{
	final int leg = 4;
	final void sound() {
		System.out.println("Bhoo Bhoo");
	}
}
public class final_ex {
       public static void main(String [] args) {
    	   Animal dog = new Animal();
    	   System.out.println("Dog legs: "+dog.leg);
    	   dog.sound();
    	   //dog.leg = 6;
       }
}
