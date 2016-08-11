package chapt5Operators;

public class Ex2 {

    public static void main(String[] args) {
	ContainingFloat cf1 = new ContainingFloat();
	ContainingFloat cf2 = new ContainingFloat();
	cf1.number = 9.4f;
	cf2.number = 0.85f;
	System.out.println("1: cf1.number=" + cf1.number + ", cf2.number=" + cf2.number);
	cf1.number = cf2.number;
	System.out.println("2: cf1.number=" + cf1.number + ", cf2.number=" + cf2.number);
	cf2.number = 6.4f;
	System.out.println("3: cf1.number=" + cf1.number + ", cf2.number=" + cf2.number);
	cf1 = cf2;
	System.out.println("4: cf1.number=" + cf1.number + ", cf2.number=" + cf2.number);
	cf1.number = 4.01f;
	System.out.println("5: cf1.number=" + cf1.number + ", cf2.number=" + cf2.number);
    }

}

class ContainingFloat {
    float number;
}