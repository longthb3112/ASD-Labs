package lab6.asd;

import java.util.ArrayList;
import java.util.List;

public class CustomerDB {
    public static List<Customer> Customers = new ArrayList<Customer>(){
        { new Customer("1","0123456");}
        { new Customer("2","0123457");}
        { new Customer("3","0123458");}
    };
}
