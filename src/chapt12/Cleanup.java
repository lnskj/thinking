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
		System.out.println("����������� Exception in main");
		e.printStackTrace();
	    } finally {
		in.dispose();
	    }
	} catch (Exception e) {
	    System.out.println("������ ��� ��������������� InputFile");
	    
	}
    }

}

class InputFile {
    private BufferedReader in;
    public InputFile(String fname) throws Exception {
	try {
	    in = new BufferedReader(new FileReader(fname));
	    //��������� ���, ��������� ���������� ����������
	} catch (FileNotFoundException e) {
	    System.out.println("Could not open " + fname);
	    //���� �� ������, ��������� �� �����
	    throw e;
	} catch (Exception e) {
	    //��� ������ ����������� ���������� ������� ����
	    try {
		in.close();
	    } catch (IOException e2) {
		System.out.println("������ ��� ���������� in.close()");
	    }
	    throw e; 
	} finally {
	    //����� ���� �� �����������!
	}
    }
    
    public String getLine() {
	String s;
	try {
	    s = in.readLine();
	} catch (IOException e) {
	    throw new RuntimeException("������ ��� ���������� readLine()");
	}
	return s;
    }
    
    public void dispose() {
	try {
	    in.close();
	    System.out.println("dispose() �������");
	} catch (IOException e2) {
	    throw new RuntimeException("������ ��� ���������� in.close()");
	}
    }
}