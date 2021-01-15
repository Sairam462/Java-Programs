class Parent{}
class child extends Parent{}
class  child1 extends child {}
class test
{
public static void main(String args[])
{
Parent x1 = new child();
child1 y1 = new child();
child y2 = new child1();


System.out.println(x1 instanceof Parent);
System.out.println(x1 instanceof child1);
System.out.println(y1 instanceof child1);
System.out.println(y2 instanceof Parent);
System.out.println(x1 instanceof child);
System.out.println(y1 instanceof child);
}
}
