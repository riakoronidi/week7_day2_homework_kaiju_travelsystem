public class Boat extends Water {

    private String name;

    public Boat(double travelCost, String name) {
        super(travelCost);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
