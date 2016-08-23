package chaptExceptions;

/*Create your own resumption-like behavior using 
a while loop that repeats until an exception 
is no longer thrown.*/

public class Ex5 {

	public static void main(String[] args) {
		int i = 0;
		String s = null;
		while(true) {
			if (i++ == 5) s = "j";
			try {
				System.out.println(s.length());
				return;
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
	}

}
