package chaptHolding;

import java.util.*;

import net.mindview.util.TextFile;

//Modify Exercise 16 so that you keep a count 
//of the occurrence of each vowel.

public class Ex20 {

    public static void main(String[] args) {
	Set<String> words = new TreeSet<String>(new TextFile("src/holding/SetOperations.java", "\\W+"));
	System.out.println(words);
	System.out.println();
	System.out.println(vowelsCounter(words));
    }
    
    public static Map<Character, Integer> vowelsCounter(Set<String> st) {
	Set<Character> vowels = new TreeSet<Character>();
	Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
	int allVowels = 0;
	
	Map<Character, Integer> vowelMap = new TreeMap<>();
	for (String s : st) {
	    for (Character v : s.toCharArray()) {
		if (vowels.contains(v)) {
		    Integer count = vowelMap.get(v);
		    vowelMap.put(v, count != null ? count+1 : 1);
		    allVowels++;
		}
	    }
	}
	System.out.println(allVowels);
	return vowelMap;
    }
}