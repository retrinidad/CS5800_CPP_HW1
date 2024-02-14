public class Instructor {
    private String FirstName;
    private String LastName;
    private String OfficeNumber;

    Instructor(String FirstName, String LastName, String OfficeNumber){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.OfficeNumber = OfficeNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getOfficeNumber() {
        return OfficeNumber;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setOfficeNumber(String OfficeNumber) {
        this.OfficeNumber = OfficeNumber;
    }
}
