package lab6.asd;

import java.awt.*;

public class Customer {
    public Customer(int customerId, String firstName, String lastName, CustomImage locationMap) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.locationMap = locationMap;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", locationMap=" + locationMap +
                '}';
    }

    private int customerId;
    private String firstName;
    private String lastName;

    //city map with a red dot representing residence location
    private CustomImage locationMap;
}
