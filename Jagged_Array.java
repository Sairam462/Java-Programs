import java.util.Scanner;
public class Jagged_Array
{
  public static void main(String args[])
{
      int m,n;
      Scanner Sc = new Scanner(System.in);
      int rows,cols;
      int a[][] = new int [2][];
      System.out.println("Enter No.of Cols in 1st Rows"); 
      m = Sc.nextInt();
      a[0] = new int[m];
      
      System.out.println("Enter No.of Cols in 2nd Rows");
       n= Sc.nextInt();
      a[1] = new int[n]; 
      for(int i=0;i<a.length;i++)
      {
         for(int j=0;j<a.length;j++)
          {
              a[i][j]=Sc.nextInt();
          }
      }
     for(int i=0;i<a.length;i++)
      { 
        for(int j=0;j<a.length;j++)
        {
          System.out.println(a[i][j]);
         }
       }
 }

}