package chaptInner;
import innerclasses.Ex6Int;

public class Ex6 {
	protected class Inner implements Ex6Int {
		public Inner() {
			// TODO Auto-generated constructor stub
		}

		public void printMessage() {
			System.out.println("Ex6.Inner");
		}
	}

	public static void main(String[] args) {
		Ex6 e = new Ex6();
		Ex6.Inner ei = e.new Inner();
		ei.printMessage();
	}

}
