package chaptHolding;

//Starting with Statistics.java, create a program 
//that runs the test repeatedly and looks to see 
//if any one number tends to appear more than 
//the others in the results.

import java.util.*;

public class Ex23 {

    public static void main(String[] args) {
	Map<Integer,Integer> map = Statistics1.countMaxInMap(20000);
	Statistics1.countMaxInMap(map);
    }
}

class Statistics1 {
    public Map<Integer, Integer> stats() {
	Random rand = new Random();
	Map<Integer, Integer> m = new HashMap<Integer, Integer>();
	for (int i = 0; i < 10000; i++) {
	    // Produce a number between 0 and 20:
	    int r = rand.nextInt(20);
	    Integer freq = m.get(r);
	    m.put(r, freq == null ? 1 : freq + 1);
	}
	return m;
    }

    public static Map<Integer, Integer> countMaxInMap(int times) {
	Map<Integer, Integer> winners = new HashMap<>(times);
	for (int i = 0; i < times; i++) {
	    Map<Integer, Integer> m = new Statistics1().stats();
	    Integer maxAppearance = 0;
	    Integer winner = 0;
	    for (Integer x : m.keySet()) {
		Integer compared = m.get(x);
		if (compared > maxAppearance) {
		    maxAppearance = compared;
		    winner = x;
		}
	    }
	    winners.put(winner, maxAppearance);
	}
	return winners;
    }

    public static void countMaxInMap(Map<Integer, Integer> map) {
	Integer maxAppearance = 0;
	Integer winner = 0;
	for (Integer x : map.keySet()) {
	    Integer compared = map.get(x);
	    if (compared > maxAppearance) {
		maxAppearance = compared;
		winner = x;
	    }
	}
	System.out.println(winner + ": " + maxAppearance + " times");
    }
}
