package lab11.asd;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Root root = new Root();
        root.setName("Topic");


        Node rightNode1 = new Node();
        rightNode1.setName("Right A");
        rightNode1.setSide(SIDE.RIGHT);

        Node child1 = new Node();
        child1.setName("Right E");


        Node rightNode2 = new Node();
        rightNode2.setName("Right B");
        rightNode2.setSide(SIDE.RIGHT);

        Node leftNode1 = new Node();
        leftNode1.setName("Left C");
        leftNode1.setSide(SIDE.LEFT);

        Node leftNode2 = new Node();
        leftNode2.setName("Left D");
        leftNode2.setSide(SIDE.LEFT);

        Node child2 = new Node();
        child2.setName("Left F");

        rightNode1.addChild(child1);
        leftNode1.addChild(child2);

        root.getChilds().addAll(Arrays.asList(rightNode1,rightNode2,leftNode1,leftNode2));

        root.accept(new DisplayNodeVistor());

        leftNode1.accept(new DisplayNodeVistor());


    }
}
