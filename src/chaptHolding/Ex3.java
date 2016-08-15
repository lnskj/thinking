package chaptHolding;

import java.util.ArrayList;

//Modify innerclasses/Sequence.java so that you 
//can add any number of elements to it.

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Ex3 {
    private ArrayList<Object> items;

    public Ex3() {
	items = new ArrayList<>();
    }

    public void add(Object x) {
	items.add(x);
    }

    private class SequenceSelector implements Selector {
	private int i = 0;

	public boolean end() {
	    return i == items.size();
	}

	public Object current() {
	    return items.get(i);
	}

	public void next() {
	    if (i < items.size()) i++;
	}
    }

    public Selector selector() {
	return new SequenceSelector();
    }

    public static void main(String[] args) {
	Ex3 sequence = new Ex3();
	for (int i = 0; i < 10; i++)
	    sequence.add(Integer.toString(i));
	Selector selector = sequence.selector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();
	}
    }

}
