package lab4.asd;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        GiftItem item1 = new GiftItem("1", "git 1", "gift description 1", "Bag");
        GiftItem item2 = new GiftItem("2", "git 2", "gift description 2", "Box");
        GiftItem item3 = new GiftItem("3", "git 3", "gift description 3", "Wrap");
        GiftPack pack = new GiftPack(new Address(), "Business");
        pack.addItem(item1);
        pack.addItem(item2);
        pack.addItem(item3);

        System.out.println("total cost : " + pack.getCost());
    }
}
