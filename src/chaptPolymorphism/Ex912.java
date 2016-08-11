package chaptPolymorphism;

import java.util.Random;

public class Ex912 {

    public static void main(String[] args) {
	RandomGenerator rg = new RandomGenerator();
	Rodent rod[] = new Rodent[6];
	for (int i = 0; i < 6; i++) {
	    rod[i] = rg.next();
	}
	for (Rodent x : rod) {
	    x.eat();
	    x.sleep();
	}
	//Gerbil g = new Gerbil();
    }

}

class RandomGenerator {
    private Random rand = new Random();

    public Rodent next() {
	switch (rand.nextInt(5)) {
	default:
	case 0:
	    return new Mouse();
	case 1:
	    return new Gerbil();
	case 2:
	    return new Hamster();
	}
    }
}

class Rodent {
    Rodent() {
	System.out.println("Rodent");
    }

    public void eat() {
    }

    public void sleep() {
    }
}

class Mouse extends Rodent {
    Mouse() {
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

class Gerbil extends Rodent {

    Hamster h = new Hamster();
    Mouse m = new Mouse();
    Rodent r = new Rodent();

    Gerbil() {
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

class Hamster extends Rodent {
    Hamster() {
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