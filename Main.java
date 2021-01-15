package com.company;
import java.util.Scanner;
public class T_Array
{
  public static void main(String args[])
  {
   int rows,cols,i,j;
   Scanner Sc = new Scanner(System.in);
      System.out.println("Enter No of Rows");
       rows = Sc.nextInt();
         System.out.println("Enter No of Cols");
       cols = Sc.nextInt();
int[][] a = new int[rows][cols];
    for(i=0;i<rows;i++)
{
   for(j=0;j<cols;j++)
{
   a[i][j] = Sc.nextInt();
}
}
 for(i=0;i<rows;i++)
{
 for(j=0;j<cols;j++)
{
  System.out.println(a[i][j]);
}
}
}
}
   