
import java.util.Scanner;
public class Greater
{
        public static void main(String args[])
        {
                System.out.println("Enter Three Numbers");
                Scanner A= new Scanner(System.in);
                Scanner B= new Scanner(System.in);
                Scanner C= new Scanner(System.in);
                int a = A.nextInt();
                int b = B.nextInt();
                int c = C.nextInt();
                if(a>b && a>c)
                {
                        System.out.println(a+"is Greater");
                }
                if(b>a && b>c)
                {
                        System.out.println(b+"is Greater");
                }
                if(c>a && c>b)
                {
                        System.out.println(c+"is Greater");
                }
                else
                {
                        System.out.println("Three are Equal");
                }


          }
}