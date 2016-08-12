package chaptInner;

//Create an interface U with three methods. Create a class A 
//with a method that produces a reference to a U by building 
//an anonymous inner class. Create a second class B that contains 
//an array of U. B should have one method that accepts and stores
//a reference to a U in the array, a second method that sets 
//a reference in the array (specified by the method argument) 
//to null, and a third method that moves through the array and calls
//the methods in U. In main( ), create a group of A objects and 
//a single B. Fill the B with U references produced by the A objects. 
//Use the B to call back into all the A objects. Remove some of 
//the U references from the B.

interface U {
    void one();
    void two();
    void three();
}

class A {
    public U u() {
	return new U() {
	    @Override
	    public void one() {
		System.out.println("A.u().one()");
	    }
	    @Override
	    public void two() {
		System.out.println("A.u().two()");
	    }
	    @Override
	    public void three() {
		System.out.println("A.u().three()");
	    }
	};
    }
}

class B {
    private int next = 0;
    private U[] items;
    
    public B(int size) {
	items = new U[size];
    }
    public int length() {
	return items.length;
    }
    public void add(U u) {
	if (next < items.length) items[next++] = u;
    }
    public void delete(int i) {
	if (i > 0 && i < items.length) {
	    items[i] = null;
	    System.out.println("items[" + i + "] is null");
	}
	else System.out.println("Wrong argument " + i);
    }
    public void call() {
	for (U x : items) {
	    x.one();
	    x.two();
	    x.three();
	}
    }
}
public class Ex23 {

    public static void main(String[] args) {
	A a = new A();
	B b = new B(5);
	for (int i = 0; i < b.length(); i++) {
	    b.add(a.u());
	}
	b.call();
	//b.delete(3);
	b.delete(8);
	b.call();
    }

}

