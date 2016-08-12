package chaptInner;

//Implement reverseSelector( ) in Sequence.java

public class Ex22 {
    
    public static void main(String[] args) {
	Sequence sequence = new Sequence(10);
	for (int i = 0; i < 10; i++)
	    sequence.add(Integer.toString(i));
	Selector revSelector = sequence.reverseSelector();
	while (!revSelector.end()) {
	    System.out.print(revSelector.current() + " ");
	    revSelector.next();
	}
	/*Selector selector = sequence.selector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();
	}*/
    }
}

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
	items = new Object[size];
    }

    public void add(Object x) {
	if (next < items.length) items[next++] = x;
    }

    private class SequenceSelector implements Selector {
	private int i = 0;

	public boolean end() {
	    return i == items.length;
	}

	public Object current() {
	    return items[i];
	}

	public void next() {
	    if (i < items.length) i++;
	}
    }
    
    public Selector selector() {
	return new SequenceSelector();
    }
    
    private class ReverseSequenceSelector implements Selector {
	
	private int i = items.length-1;

	@Override
	public boolean end() {
	    return i == -1;
	}

	@Override
	public Object current() {
	    return items[i];
	}

	@Override
	public void next() {
	    if (i > -1) i--;
	}
	
    }
    
    public Selector reverseSelector() {
	return new ReverseSequenceSelector();
    }
}