
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
public class Bank_New
{
    String Acc_No;
    String Name;
    long Amount;
    int Age;
    String Village;
    static Scanner SC = new Scanner(System.in);
    void open()
    {
        System.out.println("Enter A/c Number ::");
        Acc_No = SC.next();
        System.out.println("Enter Customer Name ::");
        Name = SC.next();
        System.out.println("Enter Amount to be Deposit ::");
        Amount = SC.nextLong();
        System.out.println("Enter Your Age::");
        Age = SC.nextInt();
        System.out.println("Enter Your Village::");
        Village = SC.next();

    }
    void show()
    {
        if (Age >= 18) {
            System.out.println("Hiiii Mr/Mrs."+Name+"  :)");
            System.out.println("-------------------------");
            System.out.println("Account Number: " + Acc_No + "\nName : " + Name + "\nAmount Deposited ::" + Amount+"\nAge: "+Age+" \nVillage :"+Village);
            System.out.println("Account Opened on  "+LocalDateTime.now());
            System.out.println("-------------------------");
        }
        else {
            System.out.println("You are Not Authorized For Using :(");
        }

    }
    void Withdraw()
    {
        int amt;
        System.out.println("Enter Amount to be Withdrwan ::");
        amt = SC.nextInt();
        if(Amount>=amt)
        {
            System.out.println("-------------------------");
            System.out.println(amt+ " was debited in your Ac");
            Amount = Amount - amt;
            System.out.println("Balance is "+Amount);
            System.out.println("-------------------------");
        }
        else
        {
            System.out.println("Insufficient Balance :(");
        }
    }
    void Deposit()
    {

        System.out.println("Enter Amount to be Deposit ::");
        int amt = SC.nextInt();
        Amount = Amount+amt;
        System.out.println("-------------------------");
        System.out.println("Amount in Your A/c is "+Amount);
        System.out.println("-------------------------");
    }
    public static void main(String args[]) {
        Bank_New D = new Bank_New();
        D.open();
        int choice;
        do {
            System.out.println("-------------------   Enter Choice   ----------------");
            System.out.println("-----------");
            System.out.println(" 1.Show A/c \n 2.Withdrwal \n 3.Deposit \n 4.Exit ");
            System.out.println("-----------");
            choice = SC.nextInt();
            switch (choice) {
                case 1: {
                    D.show();
                    System.out.println("**********************    Thanks For Banking With US :)    *************************************");
                    break;
                }
                case 2: {
                    D.Withdraw();
                    System.out.println("*************************************    Thanks for Banking With US :)   *************************************");

                    break;
                }
                case 3: {
                    D.Deposit();
                    System.out.println("*************************************   Thanks For Banking With US :)     *************************************");
                    break;

                }
                case 4: {
                    System.out.println("**********    Bye :(    ******");
                    break; 
                }
            }
        }
        while (choice != 4);
    }
}