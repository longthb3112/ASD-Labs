package lab3.asd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Component root = new Composite("<html></html>","root");
        root.addItem(new Leaf("<body></body>","leaf"));
        root.print();
    }
}
