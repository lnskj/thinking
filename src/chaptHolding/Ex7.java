package chaptHolding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Create a class, then make an initialized array of 
//objects of your class. Fill a List from your array. 
//Create a subset of your List by using subList( ), 
//then remove this subset from your List

public class Ex7 {

    public static void main(String[] args) {
	Mall[] arr = {new Mall(1), new Mall(2), new Mall(3), new Mall(4), new Mall(5)};
	List<Mall> mallList = new ArrayList<>();
	Collections.addAll(mallList, arr);
	System.out.println(mallList);
	List<Mall> subList = mallList.subList(1, 4);
	System.out.println(subList);
	mallList.removeAll(subList);
	System.out.println(mallList);
    }

}

class Mall {
    int number;
    Mall(int i) {
	number = i;
    }
    public String toString() {
	return "Mall #" + number;
    }
}