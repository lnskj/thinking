package chaptInner;

public class Ex10 {
	
	public Int10 doSmth() {
		int i = 10;
		if (i > 5) {
			class Inner implements Int10 {
				public void meth() {
					System.out.println("Inner.meth()");
				}
			}
			return new Inner();
		}
		return null;		
	}

	public static void main(String[] args) {
		Ex10 e = new Ex10();
		Int10 i = e.doSmth();
		i.meth();
	}

}

interface Int10 {
	void meth();
}