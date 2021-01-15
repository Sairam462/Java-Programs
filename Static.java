public class Static {
    static int a =10;
     Static()
     {
         a++;
         System.out.println(a);
     }
    public static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();
        Static obj4 = new Static();
    }
}