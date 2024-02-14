public class SalariedEmployee extends Employee{
    private String WeeklySalary;

    SalariedEmployee(String FirstName,String LastName, String SSNumber, String WeeklySalary){
        super(FirstName, LastName, SSNumber);
        this.WeeklySalary = WeeklySalary;
    }

    public void setWeeklySalary(String WeeklySalary){
        this.WeeklySalary = WeeklySalary;
    }
    public String getWeeklySalary() {
        return WeeklySalary;
    }
}
