import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //Create a to do list
        // The WorkOrder class has a priority and description
        Queue<WorkOrder> toDo = new PriorityQueue<>();
        Queue<WorkOrder> toDo1 = new LinkedList<>();

        toDo.add(new WorkOrder(3, " Water plants"));
        toDo.add(new WorkOrder(2, " Make Dinner"));
        toDo.add(new WorkOrder(1, " Conquer World"));
        toDo.add(new WorkOrder(9, " Play Video Games"));
        toDo.add(new WorkOrder(1, " Study for the chapter 15 test"));

        

        System.out.println(toDo);

        while (toDo.size() > 0){
            System.out.println(toDo.remove());;
        }

    }
}
