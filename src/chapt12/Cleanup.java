package chapt12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cleanup {
    volatile int a;
    public static void main(String ... args) {
	System.out.println(1.0/0.0);
	try {
	    InputFile in = new InputFile("test.tx");
	    try {
		String s;
		while ((s = in.getLine()) != null)
		    System.out.println(s);
	    } catch (Exception e) {
		System.out.println("Перехвачено Exception in main");
		e.printStackTrace();
	    } finally {
		in.dispose();
	    }
	} catch (Exception e) {
	    System.out.println("Ошибка при конструировании InputFile");
	    
	}
    }

}

class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception {
	try {
	    in = new BufferedReader(new FileReader(fname));
	    //Остальной код, способный возбуждать исключения
	} catch (FileNotFoundException e) {
	    System.out.println("Could not open " + fname);
	    //Файл не открыт, закрывать не нужно
	    throw e;
	} catch (Exception e) {
	    //При других исключениях необходимо закрыть файл
	    try {
		in.close();
	    } catch (IOException e2) {
		System.out.println("Ошибка при выполнении in.close()");
	    }
	    throw e; 
	} finally {
	    //Здесь файл не закрывается!
	}
    }
    
    public String getLine() {
	String s;
	try {
	    s = in.readLine();
	} catch (IOException e) {
	    throw new RuntimeException("Ошибка при выполнении readLine()");
	}
	return s;
    }
    
    public void dispose() {
	try {
	    in.close();
	    System.out.println("dispose() успешен");
	} catch (IOException e2) {
	    throw new RuntimeException("Ошибка при выполнении in.close()");
	}
    }
}