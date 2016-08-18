package chaptHolding;

import java.util.PriorityQueue;

//Create a simple class that inherits from Object 
//and contains no members, and show that you cannot 
//successfully add multiple elements of that class 
//to a PriorityQueue. This issue will be fully explained 
//in the Containers in Depth chapter.

public class Ex29 {

    public static void main(String[] args) {
	PriorityQueue<Ex29> pq = new PriorityQueue<>();
	for (int i = 0; i < 10; i++) {
	    pq.offer(new Ex29());
	}
    }

}
