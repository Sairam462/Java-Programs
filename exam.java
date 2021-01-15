import java.util.Scanner;
public class exam
{
   public static void main(String args[])
     {
         Scanner Sc = new Scanner(System.in);
         System.out.println("Enter Rows ::");
         int n = Sc.nextInt();
         int a[][] = new int[m][];
 	 int b[][] = new int[n][];
         for(int i=0;i<m;i++)
         {
          	System.out.println("Enter Columns ::");
 		int m = Sc.nextInt();
		a[i] = new int[m];
		System.out.println("Enter Elements Of Array ::");
		for(int j=0;j<m;j++)
		{
			a[i][j] = Sc.nextInt();
		}
	 }
	for(int i=0;i<n;i++)
         {
          	System.out.println("Enter Columns ::");
 		int n = Sc.nextInt();
		a[i] = new int[n];
		System.out.println("Enter Elements Of Array ::");
		for(int j=0;j<n;j++)
		{
			a[i][j] = Sc.nextInt();
		}
	 }
     for(int i=0; i<a.length; i++) 
        { 
              for (int j=0; j<a[i].length; j++) 
                System.out.print(a[i][j] + " "); 
              System.out.println(); 
        } 
    
         for(int i=0; i<b.length; i++) 
        { 
            for (int j=0; j<b[i].length; j++) 
              {
                System.out.print(b[i][j] + " "); 
	      }
        } 

         System.out.println(); 
    } 
}
