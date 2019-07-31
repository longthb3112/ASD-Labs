package lab8.asd;

public class Originator {
    private User externalizedState;
    User getExternalizedState() {
        return externalizedState;
    }
    void setExternalizedState(User externalizedState) {
        this.externalizedState = externalizedState;
    }
    public Memento saveStateToMemento() {
        return new Memento(externalizedState);
    }
    public void getStateFromMemento(Memento Memento) {
        externalizedState = Memento.getState();
    }
}
