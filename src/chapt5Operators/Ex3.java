package chapt5Operators;

public class Ex3 {

    public static void main(String[] args) {
	SomeClass sc = new SomeClass();
	sc.f = 1f;
	System.out.println("1: sc.f = " + sc.f);
	meth(sc);
	System.out.println("2: sc.f = " + sc.f);
    }
    
    public static void meth (SomeClass s) {
	s.f = 4.6f;
    }

}

class SomeClass {
    float f;
}
