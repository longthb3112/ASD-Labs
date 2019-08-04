package lab11.asd;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements Component {
    private List<Composite> childs  = new ArrayList<>();
    protected SIDE side;
    protected String name;
    @Override
    public abstract void accept(NodeVistor nodeVistor);

    @Override
    public abstract SIDE getSide();

    @Override
    public abstract String getName();

    public List<Composite> getChilds(){
        return this.childs;
    }

    public void setSide(SIDE side) {
        this.side = side;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addChild(Composite composite){
        this.childs.add(composite);
    }
}
