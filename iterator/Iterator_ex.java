import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
class Address1{
    private String street;
    private String city;
    private String state;
    private String zipCode;
    public Address1(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    @Override
    public String toString() {
        return street+" , "+city+" , "+state+" - "+zipCode;
    }
}

public class Iterator_ex{
    public static void main(String[] args) {
        Map<String,Address1> addressBook = new HashMap<>();
        addressBook.put("Alice", new Address1("123 main st","New york","ny","1001"));
        addressBook.put("Alice2", new Address1("456 main st","loss angeles","ny","7656"));
        addressBook.put("Alice3", new Address1("789 main st","Bhubaneswar","in","5465"));
        Iterator<Map.Entry<String,Address1>> iterator = addressBook.entrySet().iterator();
        System.out.println("Address book:");
        while(iterator.hasNext()){
            Map.Entry<String,Address1> entry = iterator.next();
            System.out.println("Name: "+entry.getKey()+" ,Address: "+entry.getValue());
        }
    }
}

