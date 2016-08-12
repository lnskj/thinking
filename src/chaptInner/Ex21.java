package chaptInner;

//Create an interface that contains a nested class 
//that has a static method that calls the methods of 
//your interface and displays the results. Implement 
//your interface and pass an instance of your 
//implementation to the method

public interface Ex21 {
    public void f();
    public static class Nested {
	public static void g() {
	    new Nested2().f();
	}
	public static void main(String[] args) {
	    g();
	}
    }
    public static class Nested2 implements Ex21 {
	public void f() {
	    System.out.println("Nested2.f()");
	}
    }

}
