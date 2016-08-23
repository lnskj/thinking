package chaptExceptions;

/*Modify Exercise 9 by adding a finally clause. Verify 
that your finally clause is executed, even if a 
NullPointerException is thrown.*/

public class Ex13 {

	public static void main(String[] args) {
		int i = 2;
		try {
			switch (i) {
			case 1:
				Ex9.f(1);
				break;
			case 2:
				g();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
	}
	
	public static void g() {
		throw new NullPointerException("NPE");
	}

}
