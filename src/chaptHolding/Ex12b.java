package chaptHolding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Ex12b {

    public static void main(String[] args) {
	List<Integer> li1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	List<Integer> li2 = new ArrayList<Integer>(Arrays.asList(6,7,8,9,10));
	System.out.println("li1: " + li1);
	System.out.println("li2: " + li2);
	
	ListIterator<Integer> it1 = li1.listIterator(li1.size());
	ListIterator<Integer> it2 = li2.listIterator();
	
	while(it2.hasNext()) {
	    it2.next();
	    it2.set(it1.previous());
	}
	
	System.out.println("li1: " + li1);
	System.out.println("li2: " + li2);
    }

}
