import java.util.*;
/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map<String, String> gradeBook = new HashMap<>();
        List<String> names = new ArrayList<>();

        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                in.nextLine();
                System.out.println("Name of student");
                String name = in.nextLine();

                System.out.println("\nGrade of student");
                String grade = in.nextLine();

                gradeBook.put(name, grade);





            } else if (input.equals("R"))
            {
                in.nextLine();
                System.out.println("Name of student");
                String name = in.nextLine();
                gradeBook.remove(name);
                
            } else if (input.equals("M"))
            {
                in.nextLine();
                System.out.println("Name of student");
                String name = in.nextLine();

                System.out.println("\nNew Grade of student");
                String grade = in.nextLine();
                if (gradeBook.containsKey(name)){
                    gradeBook.put(name, grade);
                }
                else{
                    System.out.println("\nName not found\n");
                }

            } else if (input.equalsIgnoreCase("P"))
            {

                for (String name: gradeBook.keySet()){
                    names.add(name);
                }
                Collections.sort(names);
                for (String name: names){
                    System.out.println(name + ": " + gradeBook.get(name));
                }
            } else
            {
                done = true;
            }
        }
    }
}
