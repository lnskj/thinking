package chaptHolding;

import java.util.*;

import net.mindview.util.TextFile;

//Using a Map<String,Integer>, follow the form of
//UniqueWords.java to create a program that counts 
//the occurrence of words in a file. Sort the results 
//using Collections.sort( ) with a second argument of
//String.CASE_INSENSITIVE_ORDER (to produce an alphabetic 
//sort), and display the result.

public class Ex21 {

    public static void main(String[] args) {
	String filepath = "src/holding/SetOperations.java";
	System.out.println(countWords(filepath));
    }
    
    public static Map<String,Integer> countWords (String filepath) {
	List<String> words = new LinkedList<String>(
		new TextFile(filepath, "\\W+"));
	Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
	System.out.println(words);
	System.out.println();
	
	Map <String, Integer> wordsMap = new LinkedHashMap<>();
	for (String word : words) {
	    Integer count = wordsMap.get(word);
	    wordsMap.put(word, count != null ? count+1 : 1);
	}
	
	
	return wordsMap;
    }

}
