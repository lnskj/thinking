package innerclasses;

public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
	public void howdy() {
	    System.out.println("Hello f()!");
	}
	public static void main(String[] args) {
	    new Test().howdy();
	}
    }

}
