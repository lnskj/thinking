package chaptHolding;

import java.util.*;

//Take the Gerbil class in Exercise 1 and put it 
//into a Map instead, associating each Gerbil’s name 
//(e.g. "Fuzzy" or "Spot") as a String (the key) 
//for each Gerbil (the value) you put in the table. 
//Get an Iterator for the keySet( ) and use it to move
//through the Map, looking up the Gerbil for each key 
//and printing out the key and telling the Gerbil to hop()

public class Ex17 {

    public static void main(String[] args) {
	Map<String, Gerbil> gerbils = new HashMap<>();
	gerbils.put("Fuzzy", new Gerbil(1));
	gerbils.put("Gypsy", new Gerbil(2));
	gerbils.put("Spot", new Gerbil(3));
	gerbils.put("Ginger", new Gerbil(4));
	
	Set<String> keys = new HashSet<String>(gerbils.keySet());
	Iterator<String> it = keys.iterator();
	while (it.hasNext()) {
	    String key = it.next();
	    Gerbil g = gerbils.get(key);
	    System.out.print(key + ": ");
	    g.hop();
	}
	
    }

}
