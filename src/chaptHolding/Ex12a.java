package chaptHolding;

import java.util.*;

//Create and populate a List<Integer>. Create 
//a second List<Integer> of the same size as the first, 
//and use ListIterators to read elements from the first 
//List and insert them into the second in reverse order. 
//(You may want to explore a number of different
//ways to solve this problem.)

public class Ex12a {

    public static void main(String[] args) {
	List<Integer> li1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	List<Integer> li2 = new ArrayList<Integer>(Arrays.asList(6,7,8,9,10));
	System.out.println("li1: " + li1);
	System.out.println("li2: " + li2);
	
	ListIterator<Integer> it1 = li1.listIterator();
	ListIterator<Integer> it2 = li2.listIterator();
	
	while(it1.hasNext()) {
	    it1.next();
	}
	
	while(it2.hasNext()) {
	    it2.next();
	    it2.set(it1.previous());
	}
	
	System.out.println("li1: " + li1);
	System.out.println("li2: " + li2);
    }

}
