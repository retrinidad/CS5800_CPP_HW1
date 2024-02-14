public class CommissionEmployee extends Employee{
    private String CommissionRate;
    private String GrossSales;

    CommissionEmployee(String FirstName, String LastName, String SSNumber, String CommissionRate, String GrossSales){
        super(FirstName, LastName, SSNumber);
        this.CommissionRate = CommissionRate;
        this.GrossSales = GrossSales;
    }
    public void setCommissionRate(String CommissionRate) {
        this.CommissionRate = CommissionRate;
    }

    public void setGrossSales(String GrossSales) {
        this.GrossSales = GrossSales;
    }

    public String getCommissionRate() {
        return CommissionRate;
    }

    public String getGrossSales() {
        return GrossSales;
    }
}
