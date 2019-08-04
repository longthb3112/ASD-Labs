package lab11.asd;

public interface Component {
    void accept(NodeVistor nodeVistor);
    SIDE getSide();
    String getName();
}
