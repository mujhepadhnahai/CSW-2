public class q1{
    public void msg(String m){
        System.out.println(m);

    }
    public static void main(String args[]){
           q1 a = new q1();
           a.msg("normal obj");
           new q1().msg("Anonymous obj");  
        
    }
}