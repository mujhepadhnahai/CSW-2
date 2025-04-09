
import java.util.ArrayList;

class phone{
    private String name;
    private String number;
    public phone(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return name;
    }
     public String getNumber(){
       return number;
    }

}
public class test{
    public static void main(String[] args) {
     ArrayList<phone> ph = new ArrayList<>();
     phone c1 = new phone("Prakriti","123456789");
     phone c2 = new phone("Rohan","987654321");
     phone c3 = new phone("Radhika","877654321");
     ph.add(c1);
     ph.add(c2);
     ph.add(c3);
     for(phone p:ph){
     System.out.println("name"+p.getName());
    } }
}