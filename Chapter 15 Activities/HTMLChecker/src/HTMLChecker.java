import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/HTMLChecker/src/TagSample3.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here
            Stack<String> check = new Stack<>();
            boolean isValid = true;
            while(in.hasNext()){
                String tag = in.next();
                if (openTag(tag)){
                    check.push(tag);
                }else if (closeTag(tag)){
                    if (check.isEmpty()){
                        
                        isValid = false;
                        break;
                    }

                    String open = check.pop();
                    if (!equalTag(tag, open)){
                        isValid = false;
                        break;
                    }

                }
            }
            if (isValid){
                System.out.println("The HTML is valid");
            }else{
                System.out.println("Invalid HTML");
            }
            


        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

        
    }
    public static boolean openTag(String a){
        return (!a.startsWith("</"));
    }
    public static boolean closeTag(String a){
        return (a.startsWith("</"));
    }
    public static boolean equalTag(String close, String open){
        close = close.substring(2);
        open = open.substring(1);

        return (close.equals(open));
    }
}
