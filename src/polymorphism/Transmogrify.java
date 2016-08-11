package polymorphism;

public class Transmogrify {

    public static void main(String[] args) {
	Stage stage = new Stage();
	stage.perform();
	stage.change();
	stage.perform();
    }

}

class Actor {
    void act() {}
}

class HappyActor extends Actor {
    @Override
    void act() {
	System.out.println("Happy actor");
    }
}

class SadActor extends Actor {
    @Override
    void act() {
	System.out.println("Sad actor");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() {
	actor = new SadActor();
    }
    void perform() {
	actor.act();
    }
}