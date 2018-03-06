public class Air extends Vehicle implements ITravel {

    public Air(double travelCost) {
        super(travelCost);
    }

    @Override
    public String move(String movement) {
        return movement + " flies in the air";
    }
}
