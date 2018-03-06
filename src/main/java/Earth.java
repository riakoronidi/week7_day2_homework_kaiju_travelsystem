public class Earth extends Vehicle implements ITravel{

    public Earth(double travelCost) {
        super(travelCost);
    }

    @Override
    public String move(String movement) {
        return movement + " drives on the road";
    }
}
