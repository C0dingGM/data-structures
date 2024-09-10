import java.util.*;

/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        Set<Integer> nums = new HashSet<Integer>();
        for (int i = 2; i <= n; i++){
            nums.add(i);
        }
        for (int i = 2; i <= n; i++){
            for (int x = 2; x <=9; x++){
                if (i % x == 0 && i != x){
                    nums.remove(i);
                }
            }
        }
        System.out.println(nums);

        

        // Your work goes here
       







    }
}

