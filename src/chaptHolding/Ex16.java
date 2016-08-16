package chaptHolding;

import java.util.*;
import net.mindview.util.*;

//Create a Set of the vowels. Working from UniqueWords.Java, 
//count and display the number of vowels in each input word, 
//and also display the total number of vowels in the input file.

public class Ex16 {

    public static void main(String[] args) {
	Set<String> vowels = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
	Collections.addAll(vowels, "A E I O U Y".split(" "));
	System.out.println(countVowelsInFile("src/holding/SetOperations.java"));
    }

    public static int countVowelsInWord(String word) {
	Set<String> vowels = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
	Collections.addAll(vowels, "A E I O U Y".split(" "));
	int numberOfVowels = 0;
	String[] letters = word.split("");
	for (int i = 0; i < letters.length; i++) {
	    if (vowels.contains(letters[i])) {
		numberOfVowels++;
	    }
	}
	System.out.print(word + ": " + numberOfVowels + ", ");
	return numberOfVowels;
    }

    public static int countVowelsInFile(String file) {
	int numberVowelsInFile = 0;
	Set<String> words = new TreeSet<String>(
		new TextFile(file, "\\W+"));
	Iterator<String> it = words.iterator();
	while(it.hasNext()) {
	    String word = it.next();
	    numberVowelsInFile += countVowelsInWord(word);
	}
	System.out.println();

	return numberVowelsInFile;
    }

}
