package chaptInner;

//Modify interfaces/HorrorShow.java to implement
//DangerousMonster and Vampire using anonymous classes

interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

public class Ex14 {
    
    public DangerousMonster getMonster() {
	return new DangerousMonster() {
	    public void menace() {
		System.out.println("Ex14.menace()");
	    }
	    public void destroy() {
		System.out.println("Ex14.destroy()");
	    }
	};
    }
    
    public Vampire getVampire() {
	return new Vampire() {
	    public void menace() {
		System.out.println("Vampire.menace()");
	    }
	    public void destroy() {
		System.out.println("Ex14.destroy()");
	    }
	    public void kill() {
		System.out.println("Ex14.kill()");
	    }
	    public void drinkBlood() {
		System.out.println("Ex14.drinkBlood()");
	    }
	};
    }

    public static void main(String[] args) {
	Ex14 e = new Ex14();
	DangerousMonster dm = e.getMonster();
	dm.menace();
	dm.destroy();
	Vampire v = e.getVampire();
	v.menace();
	v.drinkBlood();
    }

}
