package chaptHolding;

import java.util.*;

// Fill a PriorityQueue (using offer( )) with Double 
//values created using java.util.Random, then remove 
//the elements using poll( ) and display them.

public class Ex28 {

    public static void main(String[] args) {
	PriorityQueue<Double> pq = new PriorityQueue<>();
	Random rand = new Random();
	for(int i = 0; i < 10; i++) {
	    pq.offer(rand.nextDouble());
	}
	while (pq.peek() != null) {
	    System.out.print(pq.remove()+ " ");
	}
    }

}
