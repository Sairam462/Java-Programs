class x{}
class y extends x {}
class z extends y {}
class test
{
public static void main(String args[])
{
x x1 = new y();
y y1 = new z();
y y2 = new y();


System.out.println(x1 instanceof x);
System.out.println(x1 instanceof z);
System.out.println(y1 instanceof z);
System.out.println(y2 instanceof x);
System.out.println(x1 instanceof y);
System.out.println(y1 instanceof y);
}
}
