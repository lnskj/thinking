package chaptInner;

public class Ex7 {
	
	private int i = 7;
	private void meth() {
		System.out.println("Ex7.meth()");
	}
	class Inner {
		void modifyInt() {
			meth();
			System.out.println(i/2);
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