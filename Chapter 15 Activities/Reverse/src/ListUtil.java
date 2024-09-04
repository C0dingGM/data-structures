import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
         ListIterator <String> iterator = strings.listIterator();
         ListIterator <String> iterator1 = strings.listIterator();
      
         while (iterator.hasNext()){
            iterator.next();
         }
         for (int i = 0; i < strings.size()/2; i++){
            
            
            String x = iterator1.next();
            String n = iterator.previous();

            iterator.set(x);
            iterator1.set(n);

         }        
        
    }
}