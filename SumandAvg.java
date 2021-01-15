public class SumandAvg
{
        public static void main(String args[])
        {
                System.out.println("Enter 5 Numbers");
                Scanner S = new Scanner(System.in);
                Scanner T = new Scanner(System.in);
                Scanner U = new Scanner(System.in);
                Scanner V = new Scanner(System.in);
                Scanner W = new Scanner(System.in);
                int a = S.nextInt();
                int b = T.nextInt();
                int c = U.nextInt();
                int d = V.nextInt();
                int e = W.nextInt();
                int sum = a+b+c+d+e;
                float avg = sum/5;
                System.out.println("Sum is "+sum);
                System.out.println("Average is "+avg);


        }
}