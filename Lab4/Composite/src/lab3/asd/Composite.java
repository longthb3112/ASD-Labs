package lab3.asd;

public class Composite extends Component{
    String value;
    public Composite(String value,String title) {
        super(title);
        this.value = value;
    }
    public void print() {
        System.out.println( "Composite value=" + value );
        for (Component item : getList()){
            item.print();
        }
    }
}
