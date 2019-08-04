package lab10.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mediator mediator = new ConcreteMediator();
        Client client1 = new Client(1,mediator);
        Client client2 = new Client(2,mediator);
        client1.play(2,2);

        client2.play(2,3);
        client2.play(3,2);
        client2.play(2,1);
        client2.play(1,2);

        client2.play(3,1);
        client2.play(1,1);
        client2.play(1,3);
        client2.play(3,3);

        client1.play(2,4);
        client1.play(4,2);
        client1.play(2,0);
        client1.play(0,2);


        client1.play(4,0);
        client1.play(0,0);
        client1.play(0,4);
        client1.play(4,4);
    }
}
