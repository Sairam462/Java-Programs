
public class SIZE {
    int a= Integer.SIZE/8;
    float b=Float.SIZE/8;
    double c=Double.SIZE/8;
    char d=Character.SIZE/8;
    byte e=Byte.SIZE/8;
    long g=Long.SIZE/8;
    short h=Short.SIZE/8;
    SIZE()
    {
        System.out.println("For Int "+a);
        System.out.println("Float "+b);
        System.out.println("Double "+c);
        System.out.println("Char "+d);
        System.out.println("Byte "+e);
        System.out.println("Long "+g);
        System.out.println("Short "+h);
    }
    public static void main(String[] args) {
        SIZE obj = new SIZE();
      }
}