package chaptHolding;

import java.util.*;

//Write a method that uses an Iterator to step 
//through a Collection and print the toString( ) 
//of each object in the container. Fill all the 
//different types of Collections with objects 
//and apply your method to each container.

public class Ex11 {
    
    public static void fill(Collection<One> items) {
	for (int i = 0; i < 10; i++) {
	    items.add(new One(i));
	}
    }
    public static void print(Iterator<One> it) {
	while(it.hasNext()) {
	    System.out.print(it.next() + " ");
	}
	System.out.println();
    }
    public static void process(Collection<One> items) {
	fill(items);
	Iterator<One> it = items.iterator();
	print(it);
    }

    public static void main(String[] args) {
	Collection<One> items1 = new ArrayList<One>();
	System.out.println("ArrayList");
	process(items1);
	
	Collection<One> items2 = new LinkedList<One>();
	System.out.println("LinkedList");
	process(items2);
	
	Collection<One> items3 = new HashSet<One>();
	System.out.println("HashSet");
	process(items3);
	
	/*Collection<One> items4 = new TreeSet<One>();
	System.out.println("TreeSet");
	process(items4);*/
    }

}

class Number{
    protected int id;
    public Number(int i) {
	id = i;
    }
}

class One extends Number {
    public One(int i) {
	super(i);
    }
    public String toString() {
	return "One #" + super.id;
    }
}