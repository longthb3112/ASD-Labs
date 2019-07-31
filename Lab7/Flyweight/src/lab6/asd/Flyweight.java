package lab6.asd;

import java.awt.*;

public interface Flyweight {
    Customer createCustomer(int customerId, String firstName, String lastName);
}
