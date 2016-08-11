package chapt4;
import java.util.*;

/** The first thinking in Java example program.
 * Displays a string and today's date.
 * @author Анна
 * @version 1.0
 */
public class HelloDate {
    /**
     * Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
	System.out.println("Hello, it's: ");
	System.out.println(new Date());
    }
}
