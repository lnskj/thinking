package chapt5Operators;

import java.util.Random;

public class Ex7 {

    public static void main(String[] args) {
	Random rand = new Random();
	int i1 = rand.nextInt(100);
	int i2 = rand.nextInt(100);
	if (i1 > i2) System.out.println("tails!");
	else System.out.println("heads!");
    }

}
