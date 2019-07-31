package lab8.asd;

import java.util.List;

public class TwoClasses implements Model {
    @Override
    public long getRevenue(List<Flight> flights) {
        long revenue = 0;
        for (Flight fight:flights){
            long businessPassengerCost = (long) ((fight.totalPassenger/3) * 1.5 * baseTicketPrice);
            long coachPassengerCost = (long) ((fight.totalPassenger*2/3) * 0.75 * baseTicketPrice);
            revenue += businessPassengerCost + coachPassengerCost - (fixCostToFly*1.1);
        }
        return revenue;
    }
}
