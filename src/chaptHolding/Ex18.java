package chaptHolding;

import java.util.*;

//Fill a HashMap with key-value pairs. 
//Print the results to show ordering by hash code. 
//Extract the pairs, sort by key, and place 
//the result into a LinkedHashMap. Show that 
//the insertion order is maintained.

public class Ex18 {

    public static void main(String[] args) {
	Map<String, Gerbil> gerbils = new HashMap<>();
	gerbils.put("Fuzzy", new Gerbil(1));
	gerbils.put("Gypsy", new Gerbil(2));
	gerbils.put("Spot", new Gerbil(3));
	gerbils.put("Ginger", new Gerbil(4));
	
	System.out.println("1: " + gerbils);
	
	Map<String, Gerbil> lhmgerbils = new LinkedHashMap<>();
	
	Set<String> names = new TreeSet<String>(gerbils.keySet());
	Iterator<String> it = names.iterator();
	while (it.hasNext()) {
	    String s = it.next();
	    lhmgerbils.put(s, gerbils.get(s));	    
	}
	
	System.out.println("2: " + lhmgerbils);
    }

}
