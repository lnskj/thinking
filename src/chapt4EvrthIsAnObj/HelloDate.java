package chapt4EvrthIsAnObj;

import java.util.*;

/** 
 * The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author Анна
 * @author a.alenskaja@gmail.com
 * @version 4.0
 *
 */
public class HelloDate {

    /**
     * Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exseptions thrown
     */
    public static void main(String[] args) {
	System.out.print("Hello, it's: ");
	System.out.println(new Date());
    }

}
