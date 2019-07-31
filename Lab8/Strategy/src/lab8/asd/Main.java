package lab8.asd;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Flight> fightList = new ArrayList<>();
        fightList.add(new Flight(200));
        fightList.add(new Flight(240));

        FlightCalculation singleCalculation = new FlightCalculation(new SinglePrice());
        System.out.println("Single calculation revenue: " + singleCalculation.calculatePrice(fightList));

        FlightCalculation twoClassesCalculation = new FlightCalculation(new TwoClasses());
        System.out.println("Two classes calculation revenue: " + twoClassesCalculation.calculatePrice(fightList));

        FlightCalculation multiClassCalculation = new FlightCalculation(new MultiClass());
        System.out.println("Multi class calculation revenue: " + multiClassCalculation.calculatePrice(fightList));
    }
}
