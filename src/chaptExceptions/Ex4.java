package chaptExceptions;

/*Create your own exception class using the extends 
keyword. Write a constructor for this class that 
takes a String argument and stores it inside the 
object with a String reference. Write a method 
that displays the stored String. Create a try-catch 
clause to exercise your new exception*/

public class Ex4 {

	public static void main(String[] args) {
		try {
			throw new MyException("my exception");
		} catch (MyException e) {
			e.display();
		}
	}

}

class MyException extends Exception {
	String str;
	public MyException(String s) {
		str = s;
	}
	public MyException() {}
	public void display() {
		System.out.println(str);
	}
}