
import java.util.*;
public class Arrylist
{
    public static void main(String[] args)
    {
        // Creating an ArrayList
        ArrayList< Integer> list = new ArrayList< Integer>();
        // add element in the list
        list.add(1);
        list.add(2);
        list.add(3);
        // Displaying Arraylist
        System.out.println(list);



        // check if an arrylist is emty
        System.out.println("list is emty : " + list.isEmpty());

        // check size of Arrylist
        System.out.println("size of Arrylist is :" + list.size());

        // get element of particular index

        int element = list.get(0);
        System.out.println("element at index o is :" + element);

        // set element at particular index
        int i  = list.set(1,4);
        System.out.println("list is " + list);

        //Remove element from arry
        list.remove(2);
        System.out.println("list is:" + list);



    }
}