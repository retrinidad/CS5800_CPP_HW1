public class Question_2 {
    public static void main(String[] args) {
        Ship FirstShip = new Ship("First","2000");
        CruiseShip SecondShip = new CruiseShip("Second", "2005",100);
        CargoShip ThirdShip = new CargoShip("Third","2010", 50);
        Ship Array[] = {FirstShip, SecondShip, ThirdShip};

        for(int i = 0; i < Array.length; i++){
            Array[i].PrintShip();
        }
    }
}
