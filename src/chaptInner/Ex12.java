package chaptInner;

//Repeat Exercise 7 using an anonymous inner class.

public class Ex12 {
    public static void main(String[] args) {
	Outer12 o = new Outer12();
    }
}

class Outer12 {
    private int i = 7;
    private void doSmth() {
	System.out.println("Ex12.doSmth()");
    }
    
    public Outer12 getObject() {
	return new Outer12() {
	    {
		System.out.println(super.i / 2);
		doSmth();
	    }
	};
    }
}