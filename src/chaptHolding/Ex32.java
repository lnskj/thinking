package chaptHolding;

import typeinfo.pets.*;
import java.util.*;

//Following the example of MultilterableClass, 
//add reversed() and randomized() methods to 
//NonCollectionSequence.java, as well as making
//NonCollectionSequence implement Iterable, and 
//show that all the approaches work in foreach statements.

public class Ex32 extends PetSequence implements Iterable<Pet> {

	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}
		};
	}

	public Iterable<Pet> reversed() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>() {
					private int current = pets.length - 1;

					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public Pet next() {
						return pets[current--];
					}

				};
			}
		};
	}
	
	public Iterable<Pet> randomized() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}

	public static void main(String[] args) {
		Ex32 pets = new Ex32();
		for (Pet p : pets)
			System.out.print(p + " ");
		System.out.println();
		for (Pet p : pets.reversed())
			System.out.print(p + " ");
		System.out.println();
		for (Pet p : pets.randomized())
			System.out.print(p + " ");
		
	}

}

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}