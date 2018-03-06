public class Air extends Vehicle implements ITravel {

    public Air(double travelCost) {
        super(travelCost);
    }

    @Override
    public String move(String movement) {
        return "Airline " + movement + " flies in the air";
    }
}
