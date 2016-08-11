package chaptPolymorphism;

public class Ex10 {

    public static void main(String[] args) {
	BaseClass obj = new DerivedClass();
	obj.meth1();
    }

}

class BaseClass {
    public void meth1() {
	System.out.println("BaseClass.meth1()");
	meth2();
    }

    public void meth2() {
	System.out.println("BaseClass.meth2()");
    }
}

class DerivedClass extends BaseClass {
    @Override
    public void meth2() {
	System.out.println("DerivedClass.meth2()");
    }
}