package chapt4;

public class Ex8 {

    public static void main(String[] args) {
	Incrementable1 inc1 = new Incrementable1();
	inc1.i++;
	Incrementable1 inc2 = new Incrementable1();
	inc2.i++;
	System.out.println(Incrementable1.i);
    }

}

class Incrementable1 {
    static int i = 0;
}