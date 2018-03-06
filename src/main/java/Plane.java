public class Plane extends Air{
    private String airline;
    private double tax;

    public Plane(double travelCost, String airline, double tax) {
        super(travelCost);
        this.airline = airline;
        this.tax = tax;
    }

    public String getAirline() {
        return airline;
    }

    public double getTicketSum() {
//        sum of ticket cost is the travel cost + tax
        return getTravelCost() + this.tax;
    }
}
