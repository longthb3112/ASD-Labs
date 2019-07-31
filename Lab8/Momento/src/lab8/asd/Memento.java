package lab8.asd;

public class Memento {
    private User state;
    public Memento(User state) {
        this.state = state;
    }
    User getState() {
        return state;
    }
}
