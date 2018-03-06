public class Water extends Vehicle implements ITravel {

    public Water(double travelCost) {
        super(travelCost);
    }

    @Override
    public String move(String movement) {
        return movement + " sails in the water";
    }

}
