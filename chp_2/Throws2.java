public class Throws2{
    public static void main(String[] args) {
      try {
        methord1();
      } catch (IllegalAccessException e) {
        System.out.println("OutSide: "+e);
      }
    }

    static void methord1() throws IllegalAccessException{
        System.out.println("Inside");
        throw new IllegalAccessException("error");
    }
}