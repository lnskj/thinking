package chaptInner;

//Create a class with a non-default constructor (one with arguments) 
//and no default constructor (no "no-arg" constructor). 
//Create a second class that has a method that returns a reference 
//to an object of the first class. Create the object that you return by
//making an anonymous inner class that inherits from the first class.

public class Ex15 {
    
    public Some getSome(int i, Arg a) {
	return new Some(i, a) {};
    }

    public static void main(String[] args) {
	Ex15 e = new Ex15();
	Arg a = new Arg();
	Some s = e.getSome(15, a);
    }

}

class Some {
    Arg a;
    
    public Some(int i, Arg a) {
	this.a = a;
	System.out.println("Creating Some(" + i + ")");
    }
}

class Arg {
    Arg() {
	System.out.println("Creating Arg()");
    }
}