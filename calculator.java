

public class calculator {

    public static void main(String[] args) {
        System.out.println("Enter Numbers");
        Scanner sc=new Scanner(System.in);
        Scanner sa=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sa.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplocation");
        System.out.println("4.Division");
        System.out.println("Enter Your Choice");
        Scanner SM=new Scanner(System.in);
        int M=SM.nextInt();
        if(M==1)
        {
            int c=a+b;
            System.out.println("Addition is"+c);
        }
        if(M==2)
        {
            int d=a-b;
            System.out.println("Subtraction is "+d);
        }
        if(M==3)
        {
            int e=a*b;
            System.out.println("Multiplication is"+e);
        }
        if(M==4)
        {
            int f=a/b;
            System.out.println("Division is "+f);
        }
        else
        {
            System.out.println("Enter Numbers between 1 and 4");
        }
    }
    }


