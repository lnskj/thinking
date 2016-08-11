package chaptInner;

//Write a class named Outer that contains an inner class named Inner. 
//Add a method to Outer that returns an object of type Inner. 
//In main( ), create and initialize a reference to an Inner.

public class Ex1 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi = o.createInner();
		System.out.println(oi);
	}

}

class Outer {
	class Inner {
		public String toString() {
			return "Inner";
		}
	}
	
	public Inner createInner() {
		return new Inner();
	}
}