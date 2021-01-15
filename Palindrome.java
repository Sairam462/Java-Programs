import java.util.Scanner;

public class Palindrome
{
    public static void main(String args[])
    {
        System.out.println("Enter Number");
        Scanner Sc = new Scanner(System.in);
        int n=Sc.nextInt();
        int r;
        int s=0;
        int t = n;
        while (n>0)
        {
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        System.out.println("reverse of "+t+" is "+s);
        if(t==s)
        {
            System.out.println(+t+" is a Palindrome with "+s);
        }
        else
        {
            System.out.println(+t+" is not a Palindrome");
        }
    }
}