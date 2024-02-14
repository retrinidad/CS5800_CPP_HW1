public class Employee{

    private String FirstName;
    private String LastName;
    private String SSNumber;

    Employee(String FirstName,String LastName, String SSNumber){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.SSNumber = SSNumber;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    public void setSSNumber(String SSNumber) {
        this.SSNumber = SSNumber;
    }
    public String getFirstName() {
        return FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getSSNumber() {
        return SSNumber;
    }
}