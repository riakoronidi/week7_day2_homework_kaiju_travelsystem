import java.util.ArrayList;

public abstract class Vehicle {

    private double travelCost;
    private ArrayList<ITravel> vehicles;

    public Vehicle(double travelCost) {
        this.travelCost = travelCost;
        this.vehicles = new ArrayList<>();
    }

    public double getTravelCost() {
        return travelCost;
    }
}
