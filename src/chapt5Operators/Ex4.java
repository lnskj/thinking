package chapt5Operators;

import java.util.Random;

public class Ex4 {

    public static void main(String[] args) {
	Random rand = new Random();
	int i = rand.nextInt(100);
	for (int k = 0; k < 10; k++)
	    System.out.print(i + ", ");
	System.out.println();
	Random rand1 = new Random(47);
	i = rand1.nextInt(100);
	for (int k = 0; k < 10; k++)
	    System.out.print(i + ", ");
    }

}
