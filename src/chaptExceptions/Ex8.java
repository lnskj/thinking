package chaptExceptions;

/*Write a class with a method that throws an exception 
of the type created in Exercise 4. Try compiling it 
without an exception specification to see what the compiler 
says. Add the appropriate exception specification. 
Try out your class and its exception inside a try-catch clause.*/

public class Ex8 {

	public static void main(String[] args) {
		Ex8 ex = new Ex8();
		try {
			ex.f();
		} catch (MyException e) {
			System.out.println("Catch");
		}
	}
	
	public void f() throws MyException {
		throw new MyException();
	}

}
