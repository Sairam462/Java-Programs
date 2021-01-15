import java.util.Scanner;
public class Jagged
{
      public static void main(String args[])
     {
         Scanner Sc = new Scanner(System.in);
         System.out.println("Enter Rows ::");
         int n = Sc.nextInt();
         int a[][] = new int[n][];
         for(int i=0;i<n;i++)
         {
          	System.out.println("Enter Columns ::");
 		int m = Sc.nextInt();
		a[i] = new int[m];
		System.out.println("Enter Elements Of Array ::");
		for(int j=0;j<n;j++)
		{
			a[i][j] = Sc.nextInt();
		}
	}
	for(int ar[]:a)
		for(int i:ar)
	System.out.println(i+" ");
     System.out.println();
for(int i=0;i<a.length;i++)
{
   for(j=0;j<a.length;j++)
{
   int sum=0;
   sum = sum = a[i][j];
}
}
System.out.println("Sum of Rows ::"+sum);

    }
}