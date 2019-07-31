package lab6.asd;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int NUMBER_OF_USER = 10;
        List<CustomImage> images = new ArrayList<>();
        for(int j=0;j<NUMBER_OF_USER;j++){
            images.add(new CustomImage(1));
        }

        for (int i = 0; i < NUMBER_OF_USER; i++) {
            CustomerFlyweight customerFlyweight = CustomerFlyweightFactory.getInsance(images.get(i));
            System.out.println(customerFlyweight.createCustomer(i,"fistName","lastname"));
        }
    }

}
