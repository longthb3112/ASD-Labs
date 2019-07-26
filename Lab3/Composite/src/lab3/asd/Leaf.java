package lab3.asd;

public class Leaf extends Component {
    private String value;
    public Leaf(String value, String title) {
        super(title);
        this.value = value;
    }

    @Override
    public void addItem(Component item) {
        System.out.println("can't add child");
    }

    public void print() {
        System.out.println( "Leaf value=" + value );
    }
}
