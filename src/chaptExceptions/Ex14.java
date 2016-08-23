package chaptExceptions;

import exceptions.*;

/*Show that OnOffSwitch.java can fail by throwing a
RuntimeException inside the try block.*/

public class Ex14 {

	private static Switch sw = new Switch();

	public static void f() throws OnOffException1, OnOffException2 {
	}

	public static void main(String[] args) {
		String s = null;
		try {
			sw.on();
			s.length();
			// Code that can throw exceptions...
			f();
			sw.off();
		} catch (OnOffException1 e) {
			System.out.println("OnOffException1");
			sw.off();
		} catch (OnOffException2 e) {
			System.out.println("OnOffException2");
			sw.off();
		}
	}

}
