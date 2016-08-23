package chaptExceptions;

/*Create three new types of exceptions. Write a class 
with a method that throws all three. In main( ), call 
the method but only use a single catch clause that will
catch all three types of exceptions.*/

public class Ex9 {

	public static void main(String[] args) {
		try {
			f(-1);
			f(0);
			f(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void f(int i) throws Exc1,Exc2,Exc3 {
		if (i < 0)
			throw new Exc1("Exc1");
		else if (i == 0) 
			throw new Exc2("Exc2");
		else if (i > 0) 
			throw new Exc3("Exc3");
	}
}

class Exc1 extends Exception {
	public Exc1(String s) {
		super(s);
	}
}

class Exc2 extends Exception {
	public Exc2(String s) {
		super(s);
	}
}

class Exc3 extends Exception {
	public Exc3(String s) {
		super(s);
	}
}