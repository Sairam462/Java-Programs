public class Sqr
{
        public static void main(String args[])
        {
                System.out.println("Enter Number");
                Scanner C = new Scanner(System.in);
                float c=C.nextInt();
                float a= c*c;
                float b=c*c*c;
                System.out.println("Square Root is "+a);
                System.out.println("Cube Root is "+b);
        }
}