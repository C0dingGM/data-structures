import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Modify Worked Example 15.1.
 */
public class StringLengthMap
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "Chapter 15 Activities/StringLengthMap/src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {
        
            // Create your map here
            Map<Integer, Set<String>> wordMap = new HashMap<Integer, Set<String>>();

            while (in.hasNext())
            {
                String word = clean(in.next());
                Integer len = word.length();

                // Update the map here
                // Modify Worked Example 15.1
                if (wordMap.get(len) == null){
                    wordMap.put(len, new HashSet<>(Arrays.asList(word)));  
                    }else{
                        wordMap.get(len).add(word);
                    }
                


            }

            // Print the strings, in increasing order of their length
            // Use this format: 1: i, a, i

            for (Integer key: wordMap.keySet()){
                List<String> words = new ArrayList<>(wordMap.get(key));
                Collections.sort(words);
                System.out.println (key + ": " + words );
    
             }
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
