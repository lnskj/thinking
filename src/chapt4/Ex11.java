package chapt4;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
	AllTheColorsOfTheRainbow rain = new AllTheColorsOfTheRainbow();
	rain.changeTheHueOfTheColor();
    }

}

class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    boolean f = true;

    void changeTheHueOfTheColor() {
	while (f) {
	    Scanner in = new Scanner(System.in);
	    int newHue = in.nextInt();
	    switch (newHue) {
	    case 1:
		System.out.println("Red");
		f = false;
		break;
	    case 2:
		System.out.println("Orange");
		f = false;
		break;
	    case 3:
		System.out.println("Yellow");
		f = false;
		break;
	    case 4:
		System.out.println("Green");
		f = false;
		break;
	    case 5:
		System.out.println("Light blue");
		f = false;
		break;
	    case 6:
		System.out.println("Dark blue");
		f = false;
		break;
	    case 7:
		System.out.println("Purple");
		f = false;
		break;
	    default:
		System.out.println("There is no such color");
		break;
	    }
	}
    }
}