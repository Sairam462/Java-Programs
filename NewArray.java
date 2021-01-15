import java.util.Scanner;
public class NewArray {

    public static void main(String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter No Of Elements");
        int n = Sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = Sc.nextInt();
        }
        for(int i:a)
            System.out.println(i);

	    }
}
