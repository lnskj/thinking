package holding;

import java.util.*;

//Adding groups of elements to Collection objects.

public class AddingGroups {
    public static void main(String[] args) {
	Collection<Integer> collection = new ArrayList<Integer>(
		Arrays.asList(1, 2, 3, 4, 5));
	Integer[] moreInts = { 6, 7, 8, 9, 10 };
	collection.addAll(Arrays.asList(moreInts));
	// Runs significantly faster, but you can’t
	// construct a Collection this way:
	Collections.addAll(collection, 11, 12, 13, 14, 15);
	Collections.addAll(collection, moreInts);
	// Produces a list "backed by" an array:
	List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
	list.set(1, 99); // OK -- modify an element
	// list.add(21); // Runtime error because the
	// underlying array cannot be resized.
	for (Integer x : collection) {
	    System.out.print(x + " ");
	}
	System.out.println();
	for (Integer x : list) {
	    System.out.print(x + " ");
	}
	System.out.println();
	Collection<Bubble> bubbles = new ArrayList<>();
	Collections.addAll(bubbles, new Bubble(1), new Bubble(2), new Bubble(3));
	Bubble[] arr = {new Bubble(4), new Bubble(5), new Bubble(6)};
	bubbles.addAll(Arrays.asList(arr));
	for (Bubble b : bubbles) {
	    System.out.print(b + " ");
	}
	
    }
}

class Bubble {
    int number;
    Bubble(int i) {
	number = i;
    }
    public String toString() {
	return "Bubble #" + number;
    }
}