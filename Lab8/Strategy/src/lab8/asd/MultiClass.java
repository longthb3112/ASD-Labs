package lab8.asd;

import java.util.List;

public class MultiClass implements Model {
    @Override
    public long getRevenue(List<Flight> flights) {
        long revenue = 0;
        for (Flight fight:flights){
            long firstClassPassengerCost = (long) ((fight.totalPassenger/10) * 4 * baseTicketPrice);
            long businessClassPassengerCost = (long) ((fight.totalPassenger/5) * 1.5 * baseTicketPrice);
            long coachPassengerCost = (long) ((fight.totalPassenger*7/10) * 0.75 * baseTicketPrice);
            revenue += firstClassPassengerCost + businessClassPassengerCost + coachPassengerCost - (fixCostToFly * 1.2);
        }
        return revenue;
    }
}
