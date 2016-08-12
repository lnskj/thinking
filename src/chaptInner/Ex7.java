package chaptInner;

//Create a class with a private field and a private method. 
//Create an inner class with a method that modifies the 
//outer-class field and calls the outer-class method. In a 
//second outer-class method, create an object of the inner 
//class and call its method, then show the effect on 
//the outer-class object.

public class Ex7 {

    private int i = 7;

    private void meth() {
	System.out.println("Ex7.meth()");
    }

    class Inner {
	void modifyInt() {
	    meth();
	    System.out.println(i / 2);
	}
    }

    public void meth2() {
	Inner i = new Inner();
	i.modifyInt();
    }

    public static void main(String[] args) {
	Ex7 o = new Ex7();
	o.meth2();
    }
}