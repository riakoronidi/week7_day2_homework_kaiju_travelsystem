public class Bus extends Earth{

    private String number;

    public Bus(double travelCost, String number) {
        super(travelCost);
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String move(String movement) {
        return "Bus " + movement + " goes through city centre";
    }
}
