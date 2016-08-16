package chaptHolding;

import java.util.ArrayList;
import java.util.Iterator;

// Modify Exercise l so it uses an Iterator to move 
//through the List while calling hop( )

public class Ex8 {

    public static void main(String[] args) {
	ArrayList<Gerbil1> list = new ArrayList<>();
	for (int i = 0; i < 5; i++) {
	    list.add(new Gerbil1(i));
	}
	Iterator<Gerbil1> it = list.iterator();
	for (Gerbil1 g : list)
	    g.hop(it);
    }

}

class Gerbil1 extends Gerbil {
    
    public Gerbil1(int i) {
	super(i);
    }
    
    public void hop(Iterator<Gerbil1> it) {
	while (it.hasNext()) {
	    Gerbil1 g = it.next();
	    System.out.println(g.gerbilNumber + " : " + g + " ");
	}
    }
}