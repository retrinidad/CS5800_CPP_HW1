public class CruiseShip extends Ship{
    private int MaxNumberOfPassengers;

    CruiseShip(String ShipName, String YearBuilt, int MaxNumberOfPassengers){
        super(ShipName, YearBuilt);
        this.MaxNumberOfPassengers = MaxNumberOfPassengers;
    }
    public void setMaxNumberOfPassengers(int MaxNumberOfPassengers) {
        this.MaxNumberOfPassengers = MaxNumberOfPassengers;
    }

    public int getMaxNumberOfPassengers() {
        return this.MaxNumberOfPassengers;
    }

    @Override
    public void PrintShip() {
        System.out.println("ShipName: " + getShipName());
        System.out.println("MaxNumberOfPassengers: " + getMaxNumberOfPassengers());
    }
}
