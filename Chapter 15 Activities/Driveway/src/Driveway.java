import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */
    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street;

    /**
      * Constructor.
    */
    public Driveway()
    {
        // Complete the constructor
        driveway = new Stack<>();
        street = new Stack<>();


    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
        // Complete this method
       driveway.add(licensePlate);
       print();

    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        // Complete this method
        int car;
      if (driveway.contains(licensePlate)){
        car = driveway.pop();
        while(driveway.size() > 0){
          if(car == licensePlate){
            break;
          }
          street.add(car);
          car = driveway.pop();
          
        }

        
        

      }else{
        System.out.println("The car does not exist");
      }

      print();
        


    }

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
        System.out.println("In Driveway, starting at first in (one license plate per line):");
        // Print the cars in the driveway here
        if (driveway.size() == 0){
          System.out.println("No cars");
        }else{
          for (int car: driveway){
            System.out.print(car + ", ");
          }
          System.out.println();
  
        }
        

        System.out.println("In Street, starting at first in (one license plate per line):");
        // Print the cars in the street here
        if (street.size() == 0){
          System.out.println("No Cars");
        }else{
          for (int car: street){
            System.out.println(car + ", ");
          }
          System.out.println();
        }
        System.out.println();
        

        while(street.size() > 0){
          driveway.add(street.pop());
        }

    }
}
