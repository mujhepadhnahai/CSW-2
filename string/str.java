

public class str{
    public static void main(String[] args){
        String a = "ava";
        String b = "ava";
        boolean ne=a==b;
        System.out.println("Compare using == +"+ne);
        String c = new String("ava");
        String d = new String("ava");
        boolean e=c==d;
        System.out.println("compare using ==  for"+"objects"+e);
        boolean f = c.equals(d);
        System.out.println("compare using ==  for"+"objects"+f);
        b=b.concat("h");
        System.out.println(b);
        b=b.concat(null);
        System.out.println(b);
    }
}