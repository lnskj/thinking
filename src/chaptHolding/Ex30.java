package chaptHolding;

import java.util.*;
import holding.InterfaceVsIterator;
import typeinfo.pets.*;

//Modify CollectionSequence.java so that it 
//does not inherit from AbstractCollection, but 
//instead implements Collection.

public class Ex30 {

    public static void main(String[] args) {
	CollectionSequence c = new CollectionSequence();
	InterfaceVsIterator.display(c);
	InterfaceVsIterator.display(c.iterator());
    }

}

class CollectionSequence implements Collection<Pet> {
    private ArrayList<Pet> pets = Pets.arrayList(8);

    @Override
    public boolean add(Pet e) {
	return pets.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
	return pets.addAll(c);
    }

    @Override
    public void clear() {
	pets.clear();
    }

    @Override
    public boolean contains(Object o) {
	return pets.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
	return pets.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
	return pets.isEmpty();
    }

    @Override
    public Iterator<Pet> iterator() {
	return new Iterator<Pet>() {
	    private int index = 0;
	    
	    @Override
	    public boolean hasNext() {
		return index < pets.size();
	    }

	    @Override
	    public Pet next() {
		return pets.get(index++);
	    }
	    
	};
    }

    @Override
    public boolean remove(Object o) {
	return pets.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
	return pets.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
	return pets.retainAll(c);
    }

    @Override
    public int size() {
	return pets.size();
    }

    @Override
    public Object[] toArray() {
	return pets.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
	return pets.toArray(a);
    }
    
}