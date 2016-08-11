package chaptInner;

public class Ex5 {
	public static void main(String[] args) {
		Outer2 o = new Outer2();
		Outer2.Inner oi = o.new Inner();
	}
}

class Outer2 {
	class Inner {
		Inner() {
			System.out.println("Outer.Inner");
		}
	}
}