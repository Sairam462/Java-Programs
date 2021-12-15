import java.util.Scanner;
public class New_Bank
{
    public String Acc_No;
    public String Name;
    public double Amount;
    Scanner KB = new Scanner(System.in);

    public void OpenAcc()
    {
        System.out.println("Enter The Account Number");
        String Acc_No = KB.next();
        String Name = KB.next();
        double Amount = KB.nextDouble();
    }

    public void Show()
    {
        System.out.println(Acc_No + " , " + Name + " , " + Amount);
    }

    public void Deposit()
    {
        int amt;
        System.out.println("Enter Amount to be Deposited");
        amt = KB.nextInt();
        Amount = Amount + amt;
    }

    public void Withdrawl() {
        int amt;
        System.out.println("Enter Amount to be Withdrwal");
        amt = KB.nextInt();
        if (Amount >= amt) {
            Amount = Amount - amt;
        } else {
            System.out.println("Not Sufficient Balance");
        }
    }
        public boolean Search(String Acc_No)
        {
            if (Acc_No.equals(acc))
            {
                {
                    Show();
                    return (true);
                }

                return (false);
            }

        }


}
public class Bank {
    public static void main(String args[]) {
        Scanner KB = new Scanner(System.in);
        System.out.println("How Many Accounts want to Input");
        int n = KB.nextInt();
        Main c[] = new c[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = new Main();
            c[i].OpenAcc();
        }
        int ch;
        do {
            System.out.println("1.Show All \n 2.Search by Account \n 3.Deposit \n 4. Withdrwal \n 5.Exit");
            ch = KB.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < c.length; i++) {
                        c[i].Show();
                    }
                case 2:
                    System.out.println("Enter Account Number");
                    String acc = KB.next();
                    boolean found = false;
                    for (int i = 0; i < c.length; i++) {
                        found = c[i].Search(acc);
                        if (found) {
                            break;
                        } else {
                            System.out.println("Account Number Not Found");
                        }

                    }
                case 3:
                    System.out.println("Account Number");
                    acc = KB.next();
                    boolean found = false;
                    for (int i = 0; i < c.length; i++) {
                        found = c[i].Search(acc);
                        if (found) {
                            c[i].Deposit();
                        } else {
                            System.out.println("Account Number Not Found");
                        }

                    }
                case 4:
                    System.out.println("Account Number");
                    acc = KB.next();
                    boolean found = false;
                    for (int i = 0; i < c.length; i++) {
                        found = c[i].Search(acc);
                        if (found) {
                            c[i].Withdrawl();
                        } else {
                            System.out.println("Account Number Not Found");
                        }

                    }
                case 5:
                    System.out.println("Good Bye :))");

            }
        }
        while (ch != 5);
    }
}