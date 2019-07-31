package lab8.asd;

import java.util.List;

public class SinglePrice implements Model {
    @Override
    public long getRevenue(List<Flight> flights) {
        long revenue = 0;
        for (Flight fight:flights){
            revenue +=((fight.totalPassenger * baseTicketPrice) - fixCostToFly);
        }
        return revenue;
    }
}
