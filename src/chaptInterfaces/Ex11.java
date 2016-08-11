package chaptInterfaces;

import java.util.Arrays;
import interfaces.interfaceprocessor.StringProcessor;
import interfaces.interfaceprocessor.Apply;

//Create a class with a method that takes a String argument 
//and produces a result that swaps each pair of characters in 
//that argument. Adapt the class so that it works with 
//interfaceprocessor.Apply.process( )

public class Ex11 {

    public static void main(String[] args) {
	char[] c = {'a','b','c','d','e','f','g'};
	Swap swap = new Swap();
	Apply.process(swap, c);
    }

}

class Swap extends StringProcessor {
    char[] arr;

    public String process (Object input) {
	char c;
	arr = (char[])input;
	for (int i = 0; i < arr.length-1; i++) {
	    c = arr[i];
	    arr[i]=arr[i+1];
	    arr[i+1]=c;
	    i++;
	}
	return Arrays.toString(arr);
    }
}