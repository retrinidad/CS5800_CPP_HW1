public class Ship {
    private String ShipName;
    private String YearBuilt;

    Ship(String ShipName, String YearBuilt){
        this.ShipName = ShipName;
        this.YearBuilt = YearBuilt;
    }
    public String getShipName() {
        return this.ShipName;
    }

    public String getYearBuilt(){
        return this.YearBuilt;
    }

    public void setShipName(String ShipName){
        this.ShipName = ShipName;
    }

    public void setYearBuilt(String YearBuilt){
        this.YearBuilt = YearBuilt;
    }

    public void PrintShip(){
        System.out.println("ShipName: " + getShipName());
        System.out.println("YearBuilt: " + getYearBuilt());
    }
}
