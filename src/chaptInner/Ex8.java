package chaptInner;
//Determine whether an outer class has access 
//to the private elements of its inner class.

public class Ex8 {
	int x;
	class Inner {
		private int i = 12;
	}
	public void meth() {
		Inner in = new Inner();
		x = in.i;
	}

	public static void main(String[] args) {
		Ex8 e = new Ex8();
		System.out.println(e.x);
		e.meth();
		System.out.println(e.x);
	}

}
