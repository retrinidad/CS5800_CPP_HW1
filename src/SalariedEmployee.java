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

    public void Print(){
        System.out.println("First Name: " + this.getFirstName() + " Last Name: " + this.getLastName() + " SSN: " + this.getSSNumber() + " Weekly Salary: " + WeeklySalary);
    }
}
