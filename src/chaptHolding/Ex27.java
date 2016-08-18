package chaptHolding;

import java.util.*;

//Write a class called Command that contains 
//a String and has a method operation( ) that 
//displays the String. Write a second class 
//with a method that fills a Queue with Command 
//objects and returns it. Pass the filled Queue 
//to a method in a third class that consumes 
//the objects in the Queue and calls their 
//operation( ) methods.

public class Ex27 {

    public static void main(String[] args) {
	Queue<Command> queue = new Second().fillQueue();
	Third t = new Third();
	while(queue.peek() != null) {
	    t.consumer(queue.remove());
	}
    }

}

class Command {
    private String str;
    Command(String str) {
	this.str = str;
    }
    public void operation() {
	System.out.print(str + " ");
    }
    
}

class Second {
    private Queue<Command> queue = new LinkedList<Command>();
    
    public Queue<Command> fillQueue() {
	for (int i = 0; i < 10; i++)
	    queue.offer(new Command("Com"+i));
	return queue;
    }
}

class Third {
    public void consumer(Command com) {
	com.operation();
    }
}