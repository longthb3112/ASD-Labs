package lab11.asd;

public class Node extends Composite {
    @Override
    public void accept(NodeVistor nodeVistor) {
        nodeVistor.visit(this);
    }

    @Override
    public SIDE getSide() {
        return side;
    }

    @Override
    public String getName() {
        return name;
    }
}

