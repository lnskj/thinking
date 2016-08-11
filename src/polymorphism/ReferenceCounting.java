package polymorphism;

//Cleaning up shared member objects.
import static net.mindview.util.Print.*;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
	print("Creating " + this);
    }

    public void addRef() {
	refcount++;
    }

    protected void dispose() {
	if (--refcount == 0)
	    print("Disposing " + this);
    }

    public String toString() {
	return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
	print("Creating " + this);
	this.shared = shared;
	this.shared.addRef();
    }

    protected void dispose() {
	print("disposing " + this);
	shared.dispose();
    }

    public String toString() {
	return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
	Shared shared = new Shared();
	Composing[] composing = { new Composing(shared), new Composing(shared),
		new Composing(shared), new Composing(shared),
		new Composing(shared) };
	for (Composing c : composing)
	    c.dispose();
	Shared shared1 = new Shared();
	Composing[] composing1 = { new Composing(shared1), new Composing(shared1),
		new Composing(shared1), new Composing(shared1),
		new Composing(shared1) };
	for (Composing c : composing1)
	    c.dispose();
    }
}
