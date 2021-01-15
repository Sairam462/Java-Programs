
public class Instance {
     int a =10;
     Instance()
     {
         a++;
         System.out.println(a);
     }
    public static void main(String[] args) {
       Instance obj1 = new Instance();
        Instanceobj2 = new Instance();
        Instance obj3 = new Instance();
       Instance obj4 = new Instance();
    }
}