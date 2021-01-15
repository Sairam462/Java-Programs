
import java.util.Scanner;
public class New_One
{
    String Acc_No;
    String Name;
    long Amount;
    static Scanner SC = new Scanner(System.in);
    void open()
    {
        System.out.println("Enter A/c Number");
        Acc_No = SC.next();
        System.out.println("Enter Customer Name");
        Name = SC.next();
        System.out.println("Enter Amount to be Deposit");
        Amount = SC.nextLong();
    }
    void show()
    {
        System.out.println("Details are "+Acc_No+" , "+Name+" , "+Amount);
    }
    void Withdraw()
    {
        int amt;
        System.out.println("Enter Amount to be Withdrwan ");
        amt = SC.nextInt();
        if(Amount>=amt)
        {
            System.out.println(amt+ " was debited in your Ac");
            Amount = Amount - amt;
            System.out.println("Balance is "+Amount);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    void Deposit()
    {
        System.out.println("Enter Amount to be Deposit");
        int amt = SC.nextInt();
        Amount = Amount+amt;
        System.out.println("Amount in Your A/c is "+Amount);
    }
    public static void main(String args[]) {
        Main D = new Main();
        D.open();
        int choice;
        do {
            System.out.println("Enter Choice");
            System.out.println(" 1.Show A/c \n 2.Withdrwan \n 3.Deposit \n 4.Exit \n");
            choice = SC.nextInt();
            switch (choice) {
                case 1:
                    D.show();
                    break;
                case 2:
                    D.Withdraw();
                    break;
                case 3:
                    D.Deposit();
                    break;
                case 4:
                    System.out.println("Bye :)");
                    break;
            }
        }
        while (choice != 5);
    }
}