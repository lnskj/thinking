package chaptInner;

public class Ex11 {
	
	public static void main(String[] args) {
		Outer4 e = new Outer4();
		
		Int11 i1 = e.getInner();
		i1.meth();
		
		Outer4.Inner2 i2 = e.new Inner2();
		i2.meth();
		
		Int11 i4 = e.new Inner2();
		i4.meth();
		
		//Inner i = e.new Inner2(); 
		//Int11 i3 = e.new Inner();		
	}

}

interface Int11 {
	public void meth();
}

class Outer4 {
	private class Inner implements Int11 {
		private Inner() {
			System.out.println("Inner()");
		}
		public void meth() {
			System.out.println("Inner.meth()");
		}
	}
	public class Inner2 extends Inner {
		@Override 
		public void meth() {
			System.out.println("Inner2.meth()");
		}
	}
	
	public Int11 getInner() {
		return new Inner();
	}
}