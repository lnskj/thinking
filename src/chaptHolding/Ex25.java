package chaptHolding;

//Create a Map<String,ArrayList<Integer>>. Use net.mindview.TextFile 
//to open a text file and read it in a word at a time (use "\\W+" as
//the second argument to the TextFile constructor). Count the words 
//as you read them in, and for each word in the file, record in the 
//ArrayList<Integer> the word count associated with that word—this is, 
//in effect, the location in the file where that word was found.

import java.util.*;
import net.mindview.util.TextFile;

public class Ex25 {

	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> map = new 
				LinkedHashMap<String, ArrayList<Integer>>();
		List<String> words = new ArrayList<String>(new 
				TextFile("src/holding/SetOperations.java", "\\W+"));
		Collections.sort(words);
		System.out.println("Words in file: " + words);
		int position = 0;
		for (String s : words) {
			if (map.containsKey(s)) {
				map.get(s).add(position);
				map.put(s, map.get(s));
			} else {
				ArrayList<Integer> positions = new ArrayList<Integer>();
				positions.add(position);
				map.put(s, positions);
			}
			position++;
		}
		System.out.println("Map: " + map);
	}
	
}
