package lab8.asd;

import java.util.List;

public class FlightCalculation {
    private Model model;

    public FlightCalculation(Model model) {
        this.model = model;
    }

    public void setModel(Model model){
        this.model = model;
    }
    public long calculatePrice(List<Flight> flights){
        return model.getRevenue(flights);
    }
}
