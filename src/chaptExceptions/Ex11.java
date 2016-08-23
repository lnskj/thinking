package chaptExceptions;

//Repeat the previous exercise, but inside the catch 
//clause, wrap g( )’s exception in a RuntimeException.

public class Ex11 {

	static void f() {
		try {
			try {
				g();
			} catch(GException ge) {
				System.out.println("Caught GException in f inner try");
				ge.printStackTrace();
				throw new HException("from f(), inner try");
			}
		} catch(HException he) {
			System.out.println("Caught HException in f() outer try");
			he.printStackTrace(System.out);
		}
	}
	static void g() throws GException {
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		f();
	}	

}
