package chaptHolding;

import java.util.LinkedList;
import java.util.ListIterator;

//Create an empty LinkedList<Integer>. Using a Listlterator, 
//add Integers to the List by always inserting them 
//in the middle of the List.

public class Ex14 {
    public static void addInMiddle(LinkedList<Integer> list, Integer[] arr) {
	for(int i = 0; i < arr.length; i++) {
	    ListIterator<Integer> it = list.listIterator(list.size()/2);
	    it.add(arr[i]);
	}
    }

    public static void main(String[] args) {
	LinkedList<Integer> list = new LinkedList<>();
	Integer[] arr = {1,2,3,4,5,6,7,8,9};
	addInMiddle(list, arr);
	System.out.println(list);
    }

}
