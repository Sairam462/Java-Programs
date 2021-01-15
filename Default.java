
public class Default {
    int a;
    float b;
    double c;
    char d;
    byte e;
    boolean f;
    long g;
    short h;
    Default()
    {
        System.out.println("For Int "+a);
        System.out.println("Float "+b);
        System.out.println("Double "+c);
        System.out.println("Char "+d);
        System.out.println("Byte "+e);
        System.out.println("Boolean "+f);
        System.out.println("Long "+g);
        System.out.println("Short "+h);
    }
    public static void main(String[] args) {
        Default obj = new Default();
      }
}