package lab11.asd;

import java.util.List;

public class Root extends Composite {

    @Override
    public void accept(NodeVistor vistor) {
        vistor.visit(this);
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
