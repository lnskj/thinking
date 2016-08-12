package chaptInner;

public class Ex18 {
    
    public static class Some {
	public static void f() {
	    System.out.println("In Some");
	}
    }

    public static void main(String[] args) {
	Some s = new Some();
	Some.f();
    }

}
