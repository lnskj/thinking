package chapt4EvrthIsAnObj;

public class DefaultInitialization {
    
    int i;
    char c;
    
    public void printNoParam() {
	System.out.println("i=" + i + ", c=" + c);
    }
    public void printParam(int i1, char c1) {
	System.out.println("i=" + i1 + ", c=" + c1);
    }

    public static void main(String[] args) {
	DefaultInitialization di = new DefaultInitialization();
	System.out.println("printNoParam:");
	di.printNoParam();
	//System.out.println("printParam:");
	//!!!you can't use non-static fields in static methods
	//di.printParam(i, c);
	System.out.println("i=" + di.i + ", c=" + di.c);
    }

}
