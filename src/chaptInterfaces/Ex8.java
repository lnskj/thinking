package chaptInterfaces;
import static net.mindview.util.Print.print;

//In polymorphism.Sandwich.java, create an interface 
//called FastFood (with appropriate methods) and change 
//Sandwich so that it also implements FastFood

public class Ex8 {

    public static void main(String[] args) {
	Sandwich s = new Sandwich();
    }

}

class Meal {
    Meal() {
	print("Meal()");
    }
}

class Bread {
    Bread() {
	print("Bread()");
    }
}

class Cheese {
    Cheese() {
	print("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
	print("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
	print("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
	print("PortableLunch()");
    }
}

interface Fastfood {
    void createFood();
}
class Sandwich extends PortableLunch implements Fastfood {
    private Bread b;
    private Cheese c;
    private Lettuce l;
    
    public Sandwich() {
	print("Sandwich()");
	createFood();
    }
    
    @Override
    public void createFood() {
	b = new Bread();
	c = new Cheese();
	l = new Lettuce();
    }
    
}
/*public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public Sandwich() {
	print("Sandwich()");
    }

    public static void main(String[] args) {
	new Sandwich();
    }
}*/