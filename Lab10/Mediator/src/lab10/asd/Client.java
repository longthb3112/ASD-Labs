package lab10.asd;

public class Client extends Player{

    public Client(int color,Mediator mediator) {
        this.color = color;
        this.mediator = mediator;
    }

    @Override
    void receive() {
        System.out.println("Client saw view changed!!!");
    }

    @Override
    void play(int x,int y) {
        mediator.updateUI(x,y,color);
    }
}
