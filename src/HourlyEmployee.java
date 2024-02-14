public class HourlyEmployee extends Employee{
    private String Wage;
    private String NumberHoursWorked;

    HourlyEmployee(String FirstName,String LastName, String SSNumber, String Wage, String NumberHoursWorked){
        super(FirstName, LastName, SSNumber);
        this.Wage = Wage;
        this.NumberHoursWorked = NumberHoursWorked;
    }
    public void setWage(String Wage) {
        this.Wage = Wage;
    }

    public void setNumberHoursWorked(String NumberHoursWorked) {
        this.NumberHoursWorked = NumberHoursWorked;
    }

    public String getWage() {
        return Wage;
    }

    public String getNumberHoursWorked() {
        return NumberHoursWorked;
    }
}
