package chaptExceptions;

import exceptions.*;

/*Show that WithFinally.java doesn’t fail by throwing a
RuntimeException inside the try block.*/

public class Ex15 {
	static Switch sw = new Switch();
	static String s = null;

	public static void main(String[] args) {
		try {
			sw.on();
			s.length();
			// Code that can throw exceptions...
			OnOffSwitch.f();
		} catch (OnOffException1 e) {
			System.out.println("OnOffException1");
		} catch (OnOffException2 e) {
			System.out.println("OnOffException2");
		} finally {
			sw.off();
		}
	}
}
