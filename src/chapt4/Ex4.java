package chapt4;

public class Ex4 {

    public static void main(String[] args) {
	DataOnly data = new DataOnly();
	
	int k = data.i = 47;
	double m = data.d = 1.1;
	boolean n = data.b = false;
	
	System.out.println(k);
	System.out.println(m);
	System.out.println(n);
    }

}


class DataOnly {
    int i;
    double d;
    boolean b;

}