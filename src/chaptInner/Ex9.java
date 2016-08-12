package chaptInner;

//Create an interface with at least one method, 
//and implement that interface by defining 
//an inner class within a method, which returns 
//a reference to your interface.

public class Ex9 {
    public Int9 doSmth() {
	class Inner implements Int9 {
	    public void meth() {
		System.out.println("Inner.meth()");
	    }
	}
	return new Inner();
    }

    public static void main(String[] args) {
	Ex9 e = new Ex9();
	Int9 i = e.doSmth();
	i.meth();
    }

}

interface Int9 {
    void meth();
}