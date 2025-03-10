import java.io.FileReader;
import java.io.IOException;

class Parent {
    void msg() throws Exception {
        System.out.println("Parent method");
    }
}

public class overriding extends Parent {
    @Override
    void msg() throws IOException {  
        System.out.println("Test exception in child");
        FileReader f = new FileReader("ml.txt");
       
    }
    public static void main(String[] args) {
        System.out.println("started");
    Parent p = new overriding();
    try {
        p.msg();
    } catch (Exception e) {
        System.out.println("file not found");
    }
    }
}
/*
started
Test exception in child
file not found
*/