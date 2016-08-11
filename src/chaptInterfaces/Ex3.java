package chaptInterfaces;

//Create a base class with an abstract print( ) method that is overridden
//in a derived class. The overridden version of the method prints the value 
//of an int variable defined in the derived class. At the point of definition 
//of this variable, give it a nonzero value. In the base-class constructor, 
//call this method. In main( ), create an object of the derived
//type, and then call its print( ) method. Explain the results.

public class Ex3 {

    public static void main(String[] args) {
	//! Base b = new Base();
	Base o = new Derived();
	o.print("Hello");
    }

}

abstract class Base {
    abstract public void print(String s);
}

class Derived extends Base {
    public void print(String s) {
	System.out.println(s);
    }
}