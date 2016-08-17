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
	List<String> words = new ArrayList<String>(new TextFile(
		"src/holding/SetOperations.java", "\\W+"));
	Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
	System.out.println("Sorted words to count: " + words);
	System.out.println();

//      List<String> words - список слов
	Set<Word> wordSet = new HashSet<>();
	String compared = words.get(0);
	int count = 0;
	for (String x : words) {
	    if (compared.equals(x)) {
		count++;
	    } else {
		wordSet.add(new Word(compared,count));
		count = 1;
		compared = x;
	    }
	}
	
	System.out.println("Word count: " + wordSet);
    }

}

class Word {
    private String word;
    int count;

    public Word(String s, int i) {
	word = s;
	count = i;
    }
    public void incrementCount() {
	count++;
    }

    public String toString() {
	return word + ": " + count;
    }
}