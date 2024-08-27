import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /* The addLast method can be used to populate a list*/
        LinkedList <String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha"); 
        staff.addLast("Peter");
        staff.addLast("Gamora");


        System.out.println(staff);

        //The list is currently: TNPG

        //The list iterator method creates a new list Iterator that is postitioned at the head of the list

        //The / is used o represet the iterator pos

        ListIterator <String> iterator = staff.listIterator(); // /TNPG

        /*
         * The next method  advances the iterator over the next element in the list
         */
        iterator.next(); // T/NPG

        /*
         * The next method also returns the element that the iterator passes over
         */
        String avenger = iterator.next();
        System.out.println(avenger);

        /*
         * The add method inserts an element at the iterator posititon
         * The iterator is then positioned after the element that was added
         */

         iterator.add("Steve"); // TNS/PG
         iterator.add("Clint"); // TNSC/PG
         System.out.println(staff);

         /*
          * The remove method removes the element returned by the last call to next
          * or previous and any adds in between "next" and "remove" will result in an error
          */
          iterator.next(); // TNSCP/G
          iterator.remove(); // peter is removed // TNSC/G
          System.out.println(staff);

          /*
           * The set method updates the element retunred by the last call
           * to next or previous
           */

           iterator.previous(); // TNS/CG
           iterator.set("T'Challa");
           System.out.println(staff);


           /*
            * The hasNext method is used to determine if there s a next node after the iteratpr . 
            * The hasNext method is often used in the condition of a while loop
            */

            iterator = staff.listIterator(); // /TNSTG

            while (iterator.hasNext()){
                String n = iterator.next();
                if (n.equals("Natasha")){
                    iterator.remove(); // T/STG
                }
            }// TSTG/

            System.out.println(staff);
             
            /*
             * Enahanced for loop wors with linked lists
             */
            for (String n: staff) {
                System.out.print(n + " ");
            }   

            System.out.println();


            /*
             * Concurrent modification exception
             * 
             * Can't modify a linked list whule using an teration UNLESS iterator is ued to do modification
             */

             iterator = staff.listIterator(); // /TSTG

             while (iterator.hasNext()){
                String n = iterator.next();
                if (n.equals("Tony")){
                    //staff.remove("Tony") will give problem because not using iterator : Concurrent modification error

                }
             }

             /*
              * Enhanced for loop automaticall creates an iterator
              * Can;t add or remove when using enhance for loop
              */

              for (String n: staff){
                if (n.equals("Tony")){
                    n.add("Bruce");
                }
              }
              System.out.println(staff);

           
            

    }
}
