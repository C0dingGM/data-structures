import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        // Create a print queue of strings (using a linked list)
        Queue<String> jobs = new LinkedList<>();

        //Add some jobs

        jobs.add("Joe: Quarter 2 Expense Report");
        jobs.add("Cathy: Top Secret Document");

        System.out.println("Printing: " + jobs.remove());

        //Add some more jobs
        jobs.add("Cathy: Really Top Secret Document");
        jobs.add("Joe: Grocery list");
        jobs.add("Cathy: Can I get fired for this");

        System.out.println("Printing: " + jobs.remove());


        jobs.add("Boss: Cathy termination letter");

        //Print out the rest of the jobs
        while (jobs.size() > 0){
            System.out.println("Printing: " + jobs.remove());
        }
        



        
    }
}
