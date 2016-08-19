package chaptHolding;

//Modify polymorphism/shape/RandomShapeGenerator.java to
//make it Iterable. You’ll need to add a constructor that 
//takes the number of elements that you want the iterator 
//to produce before stopping. Verify that it works.

import java.util.*;
import polymorphism.shape.*;

public class Ex31 {
	public static void main(String[] args) {
		RandomShapeGenerator1 rsg = new RandomShapeGenerator1(6);
/*		Iterator<Shape> it = rsg.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}*/
		for (Shape s : rsg) {
			System.out.println(s);
		}
	}
}

class RandomShapeGenerator1 implements Iterable<Shape> {
	private Random rand = new Random();
	private int numberOfElements;

	public RandomShapeGenerator1(int i) {
		numberOfElements = i;
	}

	@Override
	public Iterator<Shape> iterator() {
		return new Iterator<Shape>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < numberOfElements;
			}

			@Override
			public Shape next() {
				index++;
				switch (rand.nextInt(5)) {
				default:
				case 0:
					return new Circle();
				case 1:
					return new Square();
				case 2:
					return new Triangle();
				case 3:
					return new Rectangle();
				}
			}

		};
	}

}