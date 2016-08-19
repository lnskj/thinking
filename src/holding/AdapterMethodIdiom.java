package holding;

import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}

	public Iterable<T> reversed() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					int current = size() - 1;

					public boolean hasNext() {
						return current > -1;
					}

					public T next() {
						return get(current--);
					}
				};
			}
		};
	}
}

public class AdapterMethodIdiom {

	public static void main(String[] args) {
		ReversibleArrayList<String> ra1 = new ReversibleArrayList(
				Arrays.asList("To be or not to be".split(" ")));
	// Grabs the ordinary iterator via iterator():
		for (String s : ra1)
			System.out.print(s + " ");
		System.out.println();
	// Hand it the Iterable of your choice
		for (String s : ra1.reversed())
			System.out.print(s + " ");
	}

}
