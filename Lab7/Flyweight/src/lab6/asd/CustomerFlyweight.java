package lab6.asd;


public class CustomerFlyweight implements Flyweight{
    CustomImage locationMap;
    public CustomerFlyweight(CustomImage locationMap){
        this.locationMap = locationMap;
    }

    @Override
    public Customer createCustomer(int customerId, String firstName, String lastName) {
            return new Customer(customerId,firstName,lastName,this.locationMap);
    }
}
