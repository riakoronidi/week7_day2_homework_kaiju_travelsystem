public class Car extends Earth {

    private String model;

    public Car(double travelCost, String model) {
        super(travelCost);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getPetrol() {
        return "Petrol for this journey cost £" + getTravelCost();
    }
}
