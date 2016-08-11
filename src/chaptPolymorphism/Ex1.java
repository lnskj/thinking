package chaptPolymorphism;

public class Ex1 {

    public static void main(String[] args) {
	Person pers = new Person();
	Unicycle1 uc = new Unicycle1();
	pers.ride(uc);
	Bicycle1 bc = new Bicycle1();
	pers.ride(bc);
	Tricycle1 tc = new Tricycle1();
	pers.ride(tc);
    }

}

class Cycle {
    static int WHEELS;
    Cycle() {
	WHEELS = 0;
    }
}

class Unicycle extends Cycle1 {
    Unicycle() {
	WHEELS = 1;
    }
}

class Bicycle extends Cycle1 {
    Bicycle() {
	WHEELS = 2;
    }
}

class Tricycle extends Cycle1 {
    Tricycle() {
	WHEELS = 3;
    }
}

class Person {
    public void ride(Cycle1 c) {
	System.out.println("I ride with " + c.WHEELS + " wheel(s)");
    }
}