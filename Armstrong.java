import java.util.Scanner;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int a=Sc.nextInt();
        int t=a;
        int r;
        int sum=0;
        while(a>0)
        {
            r=a%10;
            a=a/10;
            sum=sum+ r*r*r;
        }
        if(t==sum)
        {
            System.out.println("It is an Armstrong Number");
        }
        else
        {
            System.out.println("It is not an Armstrong Number");
        }
    }
}