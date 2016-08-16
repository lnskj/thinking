package chaptHolding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//Change Exercise 9 in the Polymorphism chapter 
//to use an ArrayList to hold the Rodents and 
//an Iterator to move through the sequence of Rodents

class Rodent {
	private String name = "Rodent";
	protected void eat() { System.out.print("Rodent.eat()"); }
	protected void run() { System.out.print("Rodent.run()"); }
	protected void sleep() { System.out.print("Rodent.sleep()"); }
	public String toString() { return name; }
}

class Mouse extends Rodent {
	private String name = "Mouse";
	protected void eat() { System.out.print("Mouse.eat()"); }
	protected void run() { System.out.print("Mouse.run()"); }
	protected void sleep() { System.out.print("Mouse.sleep()"); }
	public String toString() { return name; }
}

class Rat extends Rodent {
	private String name = "Rat";
	protected void eat() { System.out.print("Rat.eat()"); }
	protected void run() { System.out.print("Rat.run()"); }
	protected void sleep() { System.out.print("Rat.sleep()"); }
	public String toString() { return name; }
}

class Squirrel extends Rodent {
	private String name = "Squirrel";
	protected void eat() { System.out.print("Squirrel.eat()"); }
	protected void run() { System.out.print("Squirrel.run()"); }
	protected void sleep() { System.out.print("Squirrel.sleep()"); }
	public String toString() { return name; }
}

class RandomRodentGenerator {
	private Random rand = new Random();
	public Rodent nextRodent() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse();
			case 1: return new Rat();
			case 2: return new Squirrel();			
		}
	}
}

public class Ex10 {
	private static RandomRodentGenerator gen = new RandomRodentGenerator();
	
	
	public static void main(String[] args) {
	    ArrayList<Rodent> rodents = new ArrayList<>();
	    for (int i = 0; i < 10; i++) {
		rodents.add(gen.nextRodent());
	    }
	    
	    Iterator<Rodent> it = rodents.iterator();
	    
	    while(it.hasNext()) {
		Rodent r = it.next();
		System.out.print(r + ": ");
		r.eat();
		r.run();
		r.sleep();
		System.out.println();
	    }
	}
}