package lab10.asd;

public interface Mediator {
    void updateUI(int x,int y, int color);
    void sendMessage();
    void addPlayer(Player player);
}
