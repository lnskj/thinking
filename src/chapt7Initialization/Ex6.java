package chapt7Initialization;

public class Ex6 {

    public static void main(String[] args) {
	Dog2 d = new Dog2();
	d.bark(3, "Bark!");
	d.bark("Howl!", 6);
    }

}

class Dog2 {
    
    public void bark (int i, String s) {
	for (int j = 0; j < i; j++) {
	    System.out.print(s + " ");
	}
    }
    
    public void bark (String s, int i) {
	for (int j = 0; j < i; j++) {
	    System.out.print(s + " ");
	}
    }
}