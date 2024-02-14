public class BaseEmployee extends Employee{
    private String BaseSalary;

    BaseEmployee(String FirstName,String LastName, String SSNumber, String BaseSalary){
        super(FirstName, LastName, SSNumber);
        this.BaseSalary = BaseSalary;
    }
    public void setBaseSalary(String BaseSalary) {
        this.BaseSalary = BaseSalary;
    }

    public String getBaseSalary() {
        return BaseSalary;
    }
}
