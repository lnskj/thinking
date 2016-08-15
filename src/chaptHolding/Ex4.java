package chaptHolding;

import java.util.*;

//Create a generator class that produces character 
//names (as String objects) from your favorite movie 
//(you can use Snow White or Star Wars as a fallback) 
//each time you call next( ), and loops around to the 
//beginning of the character list when it runs out
//of names. Use this generator to fill an array, 
//an ArrayList, a LinkedList, a HashSet, a LinkedHashSet, 
//and a TreeSet, then print each container.

public class Ex4 {
    static NameGenerator ng = new NameGenerator();

    public static void main(String[] args) {
	Collection<String> arrL = new ArrayList<>(); 
	handleCollection(arrL);
	Collection<String> linkedL = new LinkedList<>();
	handleCollection(linkedL);
	Collection<String> hashS = new HashSet<>();
	handleCollection(hashS);
	Collection<String> lhS = new LinkedHashSet<>();
	handleCollection(lhS);
	Collection<String> treeS = new TreeSet<>();
	handleCollection(treeS);
	
    }
    public static Collection<String> fill(Collection<String> c) {
	for (int i = 0; i < 5; i++) {
	    c.add(ng.next());
	}
	return c;
    }
    public static void handleCollection(Collection<String> c) {
	fill(c);
	System.out.println(c);
    }

}

class NameGenerator {
    private int current = 0;
    private String[] names = {"Jess","Nick","Coach"};
    public String next() {
	if (current == names.length)
	    current = 0;
	return names[current++];
    }
}