import java.util.*;

        class Linkedlist {
            public static void main(String[] args){

                // create linkedlist
                LinkedList< Integer> list = new LinkedList<>();

                // Add elements to LinkedList
                list.add(1);
                list.add(2);
                list.add(3);
                System.out.println("LinkedList: " + list);

                // add element in Linkedlist
                 list.add(1,4);
                System.out.println("list is " + list);

                // get element from linkedlist

                Integer element = list.get(1);
                System.out.println("element is:"+element);

                // set element
                list.set(2,5);
                System.out.println("updated list is :" +list);

                // Remove element from Linkedlist
                Integer a =list.remove(1);
                System.out.println("removed element is  :" +a);

                System.out.println("updated Linkedlist is:" +list);

                // Add element at beginning of the Linkedlist
                list.addFirst(7);
                System.out.println("updated list is:" +list);

                // Add element at Last of the Linkedlist
                list.addLast(10);
                System.out.println("updated list is:" +list);




            }
        }
