package chaptInner2;
import chaptInner.Ex6;
import innerclasses.Ex6Int;

public class Ex6Derived extends Ex6 {
	public Ex6Int getInner() {
		return new Ex6.Inner();
	}

	public static void main(String[] args) {
		Ex6Derived ed = new Ex6Derived();
		Ex6Int ei = ed.getInner();
		ei.printMessage();
	}

}
