package chapt5Operators;

public class Ex5 {

    public static void main(String[] args) {
	Dog spot = new Dog ("Spot", "Ruff!");
	System.out.println(spot.name + " says: " + spot.says);
	Dog scruffy = new Dog ("Scruffy", "Wurf!");
	System.out.println(scruffy.name + " says: " + scruffy.says);
	
	Dog dog;
	dog = spot;
	System.out.println();
	System.out.println("dog==spot: " + (dog == spot));
	System.out.println("dog.equals(spot): " + (dog.equals(spot)));
	System.out.println("dog==scruffy: " + (dog==scruffy));
	System.out.println("dog.equals(scruffy): " + (dog.equals(scruffy)));
    }

}


class Dog {
    String name;
    String says;
    Dog (String n, String s) {
	name = n;
	says = s;
    }
}