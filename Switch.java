

import java.util.Scanner;

public class Switch
        {
             public static void main(String args[])
             {
                     System.out.println("Enter Your Choice");
                     Scanner day= new Scanner(System.in);
                     int a = day.nextInt();
                     switch (a)
                     {
                             case 1:
                             {
                                     System.out.println("Monday");
                                     break;
                             }
                             case 2:
                             {
                                     System.out.println("Tuesday");
                                     break;
                             }
                             case 3:
                             {
                                     System.out.println("Wednesday");
                                     break;
                             }
                             case 4:
                             {
                                     System.out.println("Thursday");
                                     break;
                             }
                             case 5:
                             {
                                     System.out.println("Friday");
                                     break;
                             }
                             case 6:
                             {
                                     System.out.println("Saturday");
                                     break;
                             }
                             default:
                             {
                                     System.out.println("Enter Valid Number");
                                     break;
                             }
                     }
             }
        }