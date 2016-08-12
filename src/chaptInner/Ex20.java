package chaptInner;

//Create an interface containing a nested class. 
//Implement this interface and create an instance 
//of the nested class

public interface Ex20 {
    public void g();
    
    public static class Nested implements Ex20 {
	public void g() {
	    System.out.println("Nested.g()");
	}
	public static void main(String[] args) {
	    Nested n = new Nested();
	    n.g();
	}
    }
}
