import java.util.Scanner;
public class CElsius
{
    public static void main(String args[])
    {
        System.out.println("Enter The Celsius");
        Scanner SC=new Scanner(System.in);
        double Celsius = SC.nextDouble();
        double Farenhiet;
        Farenhiet=(9/5)*Celsius +32;
        System.out.println("Farenhiet is "+Farenhiet);
    }
}