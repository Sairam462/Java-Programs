
import java.util.Scanner;

public class SumOfNumbers
{
        public static void main (String[] args)
        {
                System.out.println("Enter The Number");
                Scanner A = new Scanner(System.in);
                int n =A.nextInt();
                int sum=0;
                for(int i=1;i<=n;i++)
                {
                        System.out.println(i);
                        sum=sum+i;
                }
                System.out.println("Sum For First "+n+" is "+sum);
        }
}