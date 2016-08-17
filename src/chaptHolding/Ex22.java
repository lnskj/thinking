package chaptHolding;
// !!! first word doesn't add!

import java.util.*;
import net.mindview.util.TextFile;

//Modify the previous exercise so that it uses 
//a class containing a String and a count field 
//to store each different word, and a Set of 
//these objects to maintain the list of words.

public class Ex22 {

    public static void main(String[] args) {
	List<String> words = new ArrayList<String>(
		new TextFile("src/holding/SetOperations.java", "\\W+"));
	Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
	System.out.println("Sorted words to count: " + words);
	System.out.println();
	
	Set<Word> wordSet = new HashSet<>();
	ListIterator<String> it = words.listIterator(1);
	while(it.hasNext()) {
	    int prev = it.previousIndex();
	    String s = it.next();
	    
	    String sprev = words.get(prev);
	    int count = 0;
	    if (s.equals(sprev)) {
		count++;
		continue;
	    }
	    for (int i = 0; i < words.size(); i++) {
		if (s.equals(words.get(i))) count++;		
	    }
	    Word w = new Word(s,count);
	    wordSet.add(w);
	}
	System.out.println("Word count: " + wordSet);
    }

}

class Word {
    String word;
    int count;

    public Word(String s, int i) {
	word = s;
	count = i;
    }

    public String toString() {
	return word + ": " + count;
    }
}