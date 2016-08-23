package chaptExceptions;

//Define an object reference and initialize it 
//to null. Try to call a method through this 
//reference. Now wrap the code in a try-catch 
//clause to catch the exception.

public class Ex2 {

	public static void main(String[] args) {
		Object obj = null;
		try {
			obj.getClass();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}

}
