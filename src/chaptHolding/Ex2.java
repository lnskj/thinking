package chaptHolding;

import java.util.*;

//Modify SimpleCollection.java to use a Set for c

/*public class SimpleCollection {
    public static void main(String[] args) {
	Collection<Integer> c = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++)
	    c.add(i); // Autoboxing
	for (Integer i : c)
	    System.out.print(i + ", ");
    }
}*/

public class Ex2 {

    public static void main(String[] args) {
	Set<Integer> c = new HashSet<>();
	for (int i = 0; i < 10; i++) {
	    c.add(i);
	}
	for (Integer i : c) 
	    System.out.print(i + ", ");
	
    }

}
