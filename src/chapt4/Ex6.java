package chapt4;

public class Ex6 {

    public static void main(String[] args) {
	String str = "hello";
	System.out.println(storage(str));
    }
    
    static int storage (String s) {
	return s.length() * 2;
    }

}
