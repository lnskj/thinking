package chaptPolymorphism;

//Following the example in Transmogrify.java, create a Starship class
//containing an AlertStatus reference that can indicate three different 
//states. Include methods to change the states
public class Ex16 {

    public static void main(String[] args) {
	Starship ship = new Starship();
	for (int i = 0; i < 7; i++) {
	    ship.change();
	}
    }

}

class Starship {
    private AlertStatus[] states = {new ReadyStatus(), new SteadyStatus(), new GoStatus()};
    private int currentState = 0;
    private AlertStatus state = states[currentState];
    public void change() {
	if (currentState < states.length-1)
	    currentState++;
	else currentState = 0;
	state = states[currentState];
	state.alert();
    }
}

class AlertStatus {
    protected void alert() {}
}

class ReadyStatus extends AlertStatus {
    @Override
    public void alert() {
	System.out.println("Ready");
    }
}

class SteadyStatus extends AlertStatus {
    @Override
    public void alert() {
	System.out.println("Steady");
    }
}

class GoStatus extends AlertStatus {
    @Override
    public void alert() {
	System.out.println("GO");
    }
}