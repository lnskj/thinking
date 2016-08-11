package chapt7Initialization;

public class Ex9 {

    public static void main(String[] args) {
	MyClass mc = new MyClass();
    }

}

class MyClass {
    int i;
    
    MyClass(int var) {
	i = var;
	System.out.println("Hello " + i);
    }
    
    MyClass() {
	this(9);
    }
}