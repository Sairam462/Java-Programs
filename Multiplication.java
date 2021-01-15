import java.util.Scanner;
public class Multiplication
{
     public static void main(String args[])
      {
         Scanner Sc = new Scanner(System.in);
         int[][] a[] = new int[3][3][3];
         int[][] b[] = new int[3][3][3];
        for(int i=0;i<a.length;i++)
          {
             for(int j=0;j<a.length;j++)
            { 
               for(int k=0;k<a.length;k++)
              {
                  a[i][j][k] = Sc.nextInt();
              }
           }
         }
   for(int i=0;i<b.length;i++)
          {
             for(int j=0;j<b.length;j++)
            { 
               for(int k=0;k<b.length;k++)
              {
                  b[i][j][k] = Sc.nextInt();
              }
           }
         }
   System.out.println(a[i][j][k]);
System.out.println(b[i][j][k]);
}
}