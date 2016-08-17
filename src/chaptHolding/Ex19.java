package chaptHolding;

import java.util.*;

//Repeat the previous exercise with 
//a HashSet and LinkedHashSet.

public class Ex19 {

    public static void main(String[] args) {
	Set<String> names = new HashSet<String>();
	Collections.addAll(names, "Fuzzy, Gypsy, Spot, Ginger".split(", "));
	System.out.println("1: " + names);
	
	Set<String> names2 = new TreeSet<String>();
	names2.addAll(names);
	System.out.println("2: " + names2);
	
	Set<String> names3 = new LinkedHashSet<String>();
	Iterator<String> it = names2.iterator();
	while(it.hasNext()) {
	    String s = it.next();
	    System.out.println("Adding " + s);
	    names3.add(s);
	}
	System.out.println("3: " + names3);
    }

}
