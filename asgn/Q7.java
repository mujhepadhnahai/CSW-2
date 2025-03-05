import java.util.*;

class Student6 {
    String name;
    int rollNo;
    int age;

    public Student6(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name: "+name+" Roll No: "+rollNo+" Age: "+age;
    }
}
class StudentRollNoComparator implements Comparator<Student6>{
    @Override
    public int compare(Student6 s1, Student6 s2) {
        return Integer.compare(s1.rollNo,s2.rollNo);
    }
}
class StudentAgeComparator implements Comparator<Student6>{
    @Override
    public int compare(Student6 s1, Student6 s2) {
        return Integer.compare(s1.age,s2.age);
    }
}
class StudentAgeRollNoCompareator implements Comparator<Student6>{
    @Override
    public int compare(Student6 s1, Student6 s2) {
        int ageComparision = Integer.compare(s1.age,s2.age);
        if(ageComparision==0){
            return Integer.compare(s1.rollNo,s2.rollNo);
            }
        return ageComparision;
    }
}

public class Q7{
    public static void main(String[] args) {
        ArrayList<Student6> students = new ArrayList<>();
        students.add(new Student6("Rahul", 1, 29));
        students.add(new Student6("Rohan", 2, 21));
        students.add(new Student6("Ram", 3, 19));
        students.add(new Student6("Raj", 4, 22));
        students.add(new Student6("Ravi", 5, 20));
       
        students.sort (new StudentAgeComparator());
        System.out.println("Students in sorted by Age");
        for(Student6 s : students){
            System.out.println(s);
        }
        students.sort(new StudentRollNoComparator());
        System.out.println("\nStudents in sorted by Roll No");
        for(Student6 s : students){
            System.out.println(s);
        }
        students.sort(new StudentAgeRollNoCompareator());
        System.out.println("\nStudents in sorted by Age and Roll No");
        for(Student6 s :students){
        System.out.println(s);
        }
       
    }
}
