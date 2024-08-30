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
         LinkedList <String> result = new LinkedList<>();

         while (iterator.hasNext()){
            String n = iterator.next();
            
         }
         for(int i = strings.size()-1; i >= 0; i--){
            String n = iterator.previous();
            result.add(n);
         }

        System.out.println("My answer:" + result);
        
    }
}