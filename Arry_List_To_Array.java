
import java.lang.reflect.Array;
import java.util.ArrayList;

//WTP for creating a Integer type array list Store the Element of a array list into a Array
public class Arry_List_To_Array
{
    public static void main(String args[])
    {
       Integer[] arr = new Integer[5];
       for(int i=0;i<5;i++)
           arr[i] = i+1;
       ArrayList<Integer> obj = new ArrayList<Integer>();
       for(int i=0;i<5;i++)
       {
           obj.add(arr[i]);
       }
       System.out.println(obj);
    }
}