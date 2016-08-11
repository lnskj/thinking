package chapt06ControllingExecutions;

public class Ex9 {

    public static void main(String[] args) {
	fibonacci(50);
    }

    public static void fibonacci (int a) {
	int i[] = {0,1,1};
	System.out.print("1, 1");
	
	do {
	    i[0] = i[1];
	    i[1] = i[2];
	    System.out.print(", " + (i[2] = i[0] + i[1]));
	} while (i[2] < a);
    }
}
