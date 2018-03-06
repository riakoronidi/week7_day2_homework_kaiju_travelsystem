import java.util.ArrayList;

public class Vehicle {

    private double travelCost;
    private ArrayList<ITravel> vehicles;
    private ArrayList<Traveller> travellers;

    public Vehicle(double travelCost) {
        this.travelCost = travelCost;
        this.vehicles = new ArrayList<>();
        this.travellers = new ArrayList<>();
    }

    public double getTravelCost() {
        return travelCost;
    }

    public void move(ITravel vehicle){
        vehicles.add(vehicle);
    }

    public int vehicleCount(){
        return vehicles.size();
    }

    public int travellerCount(){
        return travellers.size();
    }

    public void addTraveller(Traveller traveller){
        travellers.add(traveller);
    }
}
