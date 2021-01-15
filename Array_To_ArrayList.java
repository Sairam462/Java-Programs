

import java.lang.reflect.Array;
import java.util.ArrayList;

//WTP for creating a Integer type array list Store the Element of a array list into a Array
public class Array_To_ArrayList
{
    public static void main(String args[])
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(5);
                arrayList.add(10);
                arrayList.add(11);
                arrayList.add(12);
                Integer[] arr = new Integer[arrayList.size()];
                for(int i=0;i<arrayList.size();i++)
                    arr[i] = arrayList.get(i);
                for(int i:arr)
                    System.out.println(i);
    }
}