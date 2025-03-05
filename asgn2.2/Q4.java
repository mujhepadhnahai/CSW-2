import java.util.*;

class Student {
    String name;
    int age;
    int mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && mark == student.mark && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mark);
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + mark;
    }
}

public class Q4 {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        studentList.add(new Student("Alice", 20, 85));
        studentList.add(new Student("Bob", 21, 90));
        studentList.add(new Student("Charlie", 22, 80));
        studentList.add(new Student("David", 23, 95));

        System.out.println("Student List:");
        displayList(studentList);
        
        System.out.println("Enter details of the student to search (name, age, mark):");
        Student searchStudent = new Student(scanner.next(), scanner.nextInt(), scanner.nextInt());
        searchStudentInList(studentList, searchStudent);

        System.out.println("Enter details of student to remove (name, age, mark): ");
        Student removeStudent = new Student(scanner.next(), scanner.nextInt(), scanner.nextInt());
        removeStudentFromList(studentList, removeStudent);
        
        int count = countStudents(studentList);
        System.out.println("Number of students in the list: " + count);
        
        checkDuplicatesWithStream(studentList);
        checkDuplicates(studentList);
    }

    public static void displayList(LinkedList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public static void searchStudentInList(LinkedList<Student> list, Student student) {
        boolean found = list.contains(student);
        System.out.println(found ? "Student found in the list" : "Student not found");
    }

    public static void removeStudentFromList(LinkedList<Student> list, Student student) {
        if (list.contains(student)) {
            list.remove(student);
            System.out.println("Student removed from the list");
        } else {
            System.out.println("Student not found, not removed");
        }
    }

    public static int countStudents(LinkedList<Student> list) {
        return list.size();
    }

    public static void checkDuplicatesWithStream(LinkedList<Student> list) {
        list.stream()
            .filter(student -> Collections.frequency(list, student) > 1)
            .distinct()
            .forEach(student -> System.out.println("Duplicate found with stream: " + student));
    }

    public static void checkDuplicates(LinkedList<Student> list) {
        boolean duplicatesFound = false;
        for (Student student : list) {
            if (Collections.frequency(list, student) > 1) {
                System.out.println("Duplicate found without stream check: " + student);
                duplicatesFound = true;
                break;
            }
        }
        if (!duplicatesFound) {
            System.out.println("No duplicates found");
        }
    }
}