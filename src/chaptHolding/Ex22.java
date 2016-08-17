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
	ListIterator<String> it = words.listIterator();
/*	while(it.hasNext()) {
			String s = (String)it.next();
			int count = 0;			
			for(int i = 0; i < words.size(); i++) {
				if(s.equals(words.get(i))) count++;
			}
			Word w = new Word(s, count);
			wordObjects.add(w);
		}*/
	int ind = 0;
	String compared = words.get(0);
	while (it.hasNext()) {
	    int count = 0;
	    for (int i = ind; i < words.size(); i++) {
		if (compared.equals(words.get(i))) {
		    count++;
		    continue;
		} else {
		    ind = i;
		    Word w = new Word(compared, count);
		    wordSet.add(w);
		    compared = words.get(i);
		    break;
		}
	    }
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