public class Q1{
    public static void main(String[] args) {
    Pair<String,Integer> pair = new Pair<>("Example",42);
    Pair<Integer,Double> pair1 = new Pair<>(7,4.5);
    System.out.println(pair.getKey()+" "+pair.getValue());
    System.out.println(pair1.getKey()+" "+pair1.getValue());
    }
}
class Pair <K,V>{
   private K key;
   private V value;
   public Pair (K key,V value){
    this.key=key;
    this.value=value;
   }
   public K getKey(){
    return key;
   }
   public V getValue(){
    return value;
   }
   public void setKey(K key){
    this.key=key;
   }
   public void setValue(V value){
    this.value=value;
   }
}