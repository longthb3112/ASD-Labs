package lab6.asd;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerFlyweightFactory {
    public static List<CustomerFlyweight> byImages = new ArrayList<CustomerFlyweight>();
    public static CustomerFlyweight getInsance(CustomImage locationMap){
        CustomerFlyweight temp = null;
        for(CustomerFlyweight customerFlyweight:byImages){
            if(customerFlyweight.locationMap.equals(locationMap)){
                temp = customerFlyweight;
                break;
            }
        }
        if(temp == null){
            temp = new CustomerFlyweight(locationMap);
            byImages.add(temp);
        }
        return temp;
    }

}
