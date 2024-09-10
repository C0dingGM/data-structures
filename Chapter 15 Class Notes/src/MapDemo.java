import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        // The Map interface is generic
        /*
         * The first type given is the type of the key
         * The second type given is the type of the value
         */

         Map<String, Color> favColors = new HashMap<>();

         //Add element to the map using the put method
         favColors.put("Henry", Color.BLUE);
         favColors.put("Jack", Color.RED);
         favColors.put("Priya", Color.GREEN);

         //Can put different element of the same value
         favColors.put("Dr. Miller", Color.GREEN);

         //By putting in a key that exists, changes the value

         favColors.put("Jack", Color.MAGENTA);

         //Create a set of the keys in a map
         Set<String> keys = favColors.keySet();

         for (String key: keys){
            System.out.println(keys + " (" + key.hashCode()+ "): " + favColors.get(key));

         }



    }
}
