package chaptPolymorphism;

//Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
//Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast
//them to an array of Cycle. Try to call balance( ) on each element of the array and observe
//the results. Downcast and call balance( ) and observe what happens

public class Ex17 {

    public static void main(String[] args) {
	Cycle1[] arr = {new Unicycle1(), new Bicycle1(), new Tricycle1()};
	for (Cycle1 x : arr) {
	    //x.balance();
	}
	((Unicycle1)arr[0]).balance();
	//!((Bicycle1)arr[0]).balance();
	((Bicycle1)arr[1]).balance();
    }

}

class Cycle1 {
    static int WHEELS;
    Cycle1() {
	WHEELS = 0;
    }
}

class Unicycle1 extends Cycle1 {
    Unicycle1() {
	WHEELS = 1;
    }

    void balance() {
	System.out.println("Unicycle.balance()");
    }
}

class Bicycle1 extends Cycle1 {
    Bicycle1() {
	WHEELS = 2;
    }
    
    void balance() {
	System.out.println("Bicycle.balance()");
    }
}

class Tricycle1 extends Cycle1 {
    Tricycle1() {
	WHEELS = 3;
    }
}