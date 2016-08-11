package chaptPolymorphism;

import java.util.Random;

//Modify Exercise 12 so that one of the member objects is a shared object
//with reference counting, and demonstrate that it works properly

public class Ex14 {

    public static void main(String[] args) {
	Shared shared = new Shared();
	RandomGenerator1 rg = new RandomGenerator1(shared);
	Rodent1 rod[] = new Rodent1[5];
	for (int i = 0; i < rod.length; i++) {
	    rod[i] = rg.next();
	}
	for (Rodent1 x : rod) {
	    x.eat();
	    x.sleep();
	}
	for (Rodent1 r : rod)
	    r.dispose();
    }

}

class RandomGenerator1 {
    private Shared shared;
    private Random rand = new Random(47);

    RandomGenerator1(Shared shared) {
	this.shared = shared;
    }

    public Rodent1 next() {
	switch (rand.nextInt(10)) {
	default:
	case 0:
	    return new Mouse1(shared);
	case 1:
	    return new Gerbil1(shared);
	case 2:
	    return new Hamster1(shared);
	}
    }
}

class Rodent1 {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Rodent1(Shared shared) {
	System.out.println("Creating " + this);
	this.shared = shared;
	this.shared.addRef();
    }

    protected void dispose() {
	System.out.println("disposing " + this);
	shared.dispose();
    }

    public String toString() {
	return "Rodent " + id;
    }

    public void eat() {
    }

    public void sleep() {
    }
}

class Mouse1 extends Rodent1 {

    Mouse1(Shared shared) {
	super(shared);
	System.out.println("Mouse");
    }

    @Override
    public void eat() {
	System.out.println("Mouse.eat()");
    }

    @Override
    public void sleep() {
	System.out.println("Mouse.sleep()");
    }

}

class Gerbil1 extends Rodent1 {

    Gerbil1(Shared shared) {
	super(shared);
	System.out.println("Gerbil");
    }

    @Override
    public void eat() {
	System.out.println("Gerbil.eat()");
    }

    @Override
    public void sleep() {
	System.out.println("Gerbil.sleep()");
    }
}

class Hamster1 extends Rodent1 {
    Hamster1(Shared shared) {
	super(shared);
	System.out.println("Hamster");
    }

    @Override
    public void eat() {
	System.out.println("Hamster.eat()");
    }

    @Override
    public void sleep() {
	System.out.println("Hamster.sleep()");
    }
}

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
	System.out.println("Creating " + this);
    }

    public void addRef() {
	refcount++;
    }

    protected void dispose() {
	if (--refcount == 0) {
	    System.out.println("Disposing " + this);
	}
    }

    public String toString() {
	return "Shared " + id;
    }
}