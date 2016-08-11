package chapt7Initialization;

public class Ex5 {

    public static void main(String[] args) {
	Dog d = new Dog();
	d.bark(3);
	d.bark(3.0);
    }

}

class Dog {
    
    public void bark(int i) {
	System.out.println("Bark!");
    }
    
    public void bark(double d) {
	System.out.println("Howl!");
    }
}