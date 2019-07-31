package lab8.asd;

import java.util.List;

public interface Model {
     long baseTicketPrice = 300;
     long fixCostToFly = 50000;
    long getRevenue(List<Flight> flights);
}
