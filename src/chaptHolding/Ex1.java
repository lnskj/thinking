package chaptHolding;

import java.util.ArrayList;

//Create a new class called Gerbil with an int gerbilNumber 
//that’s initialized in the constructor. Give it a method 
//called hop( ) that displays which gerbil number this is, 
//and that it’s hopping. Create an ArrayList and add Gerbil 
//objects to the List. Now use the get( ) method to move 
//through the List and call hop( ) for each Gerbil.

public class Ex1 {

    public static void main(String[] args) {
	ArrayList<Gerbil> list = new ArrayList<>();
	for (int i = 0; i < 5; i++) {
	    list.add(new Gerbil(i));
	}
	for (Gerbil g : list)
	    g.hop();
    }

}

class Gerbil {
    private int gerbilNumber;
    
    public Gerbil(int i) {
	gerbilNumber = i;
    }
    
    public void hop() {
	System.out.println("Gerbil #" + gerbilNumber + 
		" is hopping");
    }
}