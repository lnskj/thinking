package chaptHolding;

import java.util.*;

//Fill a LinkedHashMap with String keys and objects 
//of your choice. Now extract the pairs, sort them 
//based on the keys, and reinsert them into the Map.

public class Ex24 {

    public static void main(String[] args) {
	Map<String,Integer> map = new LinkedHashMap<>();
	map.put("ten", 10);
	map.put("nine", 9);
	map.put("eight", 8);
	map.put("seven", 7);
	map.put("six", 6);
	map.put("five", 5);
	map.put("four", 4);
	map.put("three", 3);
	map.put("two", 2);
	map.put("one", 1);
	map.put("zero", 0);
	System.out.println("1: " + map);
	
	Set<String> sortedKeys = new TreeSet<>();
	sortedKeys.addAll(map.keySet());
	Map<String,Integer> sortedMap = new LinkedHashMap<>();
	
	for (String s : sortedKeys) {
	    sortedMap.put(s, map.get(s));
	}
	
	System.out.print("2: " + sortedMap);
    }

}
