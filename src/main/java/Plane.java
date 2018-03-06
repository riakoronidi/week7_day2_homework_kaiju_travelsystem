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
        return getTravelCost() + this.tax;
    }
}
