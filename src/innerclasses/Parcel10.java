package innerclasses;

public class Parcel10 {
    public Destination destination(String dest, float price) {
	return new Destination() {
	    private int cost;
	    //Instance initialization for each object
	    {
		cost = Math.round(price);
		if (cost > 100)
		    System.out.println("Over budget!");
		System.out.println("Inside instance initializer");
	    }
	    private String label = dest;
	    public String readLabel() { return label; }
	};
    }
    public static void main(String[] args) {
	Parcel10 p = new Parcel10();
	Destination d = p.destination("Tasmania", 101.395f);
    }

}
