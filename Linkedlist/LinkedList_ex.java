import java.util.*;
public class LinkedList_ex {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.add("David");
        System.out.println("Initial LinkedList: " + list);
       
        list.addFirst("Zara");
        list.addLast("Edward");
        System.out.println("After addFirst and addLast: " + list);
      
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
      
        list.remove("Charlie");
        System.out.println("After removing 'Charlie': " + list);
       
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst and removeLast: " + list);
      
        System.out.println("Contains 'Alice'? " + list.contains("Alice"));
       
        System.out.println("Size of LinkedList: " + list.size());
      
        System.out.println("Is LinkedList empty? " + list.isEmpty());
       
        Object[] array = list.toArray();
        System.out.println("Array representation: " + Arrays.toString(array));
        Iterator<String> iterator = list.iterator();
        System.out.println("Iterating through LinkedList:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
