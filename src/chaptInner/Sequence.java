package chaptInner;

//Create a class that holds a String, and has a toString( ) 
//method that displays this String. Add several instances 
//of your new class to a Sequence object, then display them.

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    private StringHolder str1;
    private StringHolder str2;
    
    private class StringHolder {
	    private String str;
	    StringHolder (String str) {
		this.str = str;
	    }
	    public String toString() {
		return str;
	    }
	}
    
    public void printString() {
	System.out.println(str1);
	System.out.println(str2);
    }

    public Sequence(int size) {
	items = new Object[size];
	str1 = new StringHolder("String1");
	str2 = new StringHolder("String2");
    }
    
    public Sequence(String s1, String s2) {
	str1 = new StringHolder(s1);
	str2 = new StringHolder(s2);
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

    public static void main(String[] args) {
	Sequence sequence = new Sequence(10);
	for (int i = 0; i < 10; i++)
	    sequence.add(Integer.toString(i));
	Selector selector = sequence.selector();
	while (!selector.end()) {
	    System.out.print(selector.current() + " ");
	    selector.next();
	}
	Sequence seq = new Sequence("Happy", "day");
	seq.printString();
    }
}