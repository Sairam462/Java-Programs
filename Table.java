

import java.util.Scanner;

public class Table
        {
                public static void main(String args[])
                {
                        System.out.println("Enter Which Table You want");
                        Scanner M= new Scanner(System.in);
                        int a =  M.nextInt();
                        for(int i=1;i<=20;i++)
                        {
                                int c=a*i;
                                System.out.println(a+"x"+i+"="+c);
                        }
                }
        }