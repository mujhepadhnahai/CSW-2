package oops;

public class Student {
         int roll;
         String name;
         Float mark;
         
         Student(){
        	 this(13,"default person ",100.f);
         }
         Student(int i, String s, float f) {
			roll = i;
			name = s;
			mark = f;
		}
        Student (Student other){
        	this.name = other.name;
        	this.roll = this.roll;
        	this.mark = this.mark;
        	
        }
         void greeting() {
        	 System.out.println("Hare Krishna Hare Krishna Krishna Krishna Hare Hare");
         }
         void changename(String name) {
        	 this.name = name;
         }
		void print() {
        	 System.out.println("-------------------Student details-------------------");
        	 System.out.println("Name: "+name);
        	 System.out.println("Roll: "+roll);
         }
}
