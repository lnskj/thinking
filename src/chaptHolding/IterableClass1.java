package chaptHolding;

import java.util.Iterator;

public class IterableClass1 implements Iterable<String>{
    
    protected String[] words;
    public IterableClass1(String s) {
	words = s.split(" ");
    }
    
    public Iterator<String> iterator() {
	return new Iterator<String>() {
	    private int index = 0;
	    public boolean hasNext() {
		return index < words.length;
	    }
	    public String next() {
		return words[index++];
	    }
	};
    }

    public static void main(String[] args) {
	IterableClass1 ic = new IterableClass1("And that is how " +
"we know the Earth to be banana-shaped."); 
	for (String s : ic) 
	    System.out.print(s + " ");
    }

}
