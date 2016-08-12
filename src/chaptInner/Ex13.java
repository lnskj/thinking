package chaptInner;

//Repeat Exercise 9 using an anonymous inner class.

public class Ex13 {
    
    public Int13 y() {
	return new Int13() {
	    public void f() {
		System.out.println("In Ex13");
	    }
	};
    }

    public static void main(String[] args) {
	Ex13 e = new Ex13();
	Int13 i = e.y();
	i.f();
    }

}

interface Int13 {
    void f();
}