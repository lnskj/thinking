package chaptHolding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Modify innerclasses/Sequence.java so that Sequence 
//works with an Iterator instead of a Selector

public class Ex9 {
    private Collection<Object> items = new ArrayList<Object>();

    public void add(Object x) {
	items.add(x);
    }
    public Iterator<Object> iterator() {
	return items.iterator();
    }

    public static void main(String[] args) {
	Ex9 sequence = new Ex9();
	for (int i = 0; i < 6; i++) {
	    sequence.add(new Integer(i));
	}
	Iterator it = sequence.iterator();
	while(it.hasNext()) {
	    Integer integer = (Integer) it.next();
	    System.out.print(integer + " ");
	}
	System.out.println();
	
    }

}