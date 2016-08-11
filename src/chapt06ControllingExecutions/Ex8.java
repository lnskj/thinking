package chapt06ControllingExecutions;

public class Ex8 {
    
    public static void main (String[] args) {
	for (int i = 0; i < 10; i++) {
	    switch (i) {
	    	case 3:
	    	    System.out.println("3");
	    	    break;
	    	case 5:
	    	    System.out.println("5");
	    	default:
	    	    System.out.println("default");
	    	    break;
	    	case 7:
	    	    System.out.println("7");
	    }
	}
    }
}
