public class Plane extends Air{

    private String airline;
    private double tax;
    private Traveller traveller;


    public Plane(double travelCost, String airline, double tax) {
        super(travelCost);
        this.airline = airline;
        this.tax = tax;
        this.traveller = new Traveller("Ria", 100.00);
    }

    public String getAirline() {
        return airline;
    }

    public double getTicketSum() {
//        sum of ticket cost is the travel cost + tax
        return getTravelCost() + this.tax;
    }


    public double returnCashRefund() {
        return traveller.getCash() - getTicketSum();
    }

}
