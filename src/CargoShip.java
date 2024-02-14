public class CargoShip extends Ship{
    private int Tonnage;
    CargoShip(String ShipName, String YearBuilt, int Tonnage){
        super(ShipName,YearBuilt);
        this.Tonnage = Tonnage;
    }

    public void setTonnage(int Tonnage) {
        this.Tonnage = Tonnage;
    }

    public int getTonnage(){
        return this.Tonnage;
    }

    @Override
    public void PrintShip() {
        System.out.println("ShipName: " + getShipName());
        System.out.println("Tonnage: " + getTonnage());
    }
}
