package lab10.asd;

public abstract class Player {
    protected int color;
    Mediator mediator;
    abstract void receive();
    abstract void play(int x,int y);
}
