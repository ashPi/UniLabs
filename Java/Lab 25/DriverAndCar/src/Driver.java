/**
 *
 * @author s4et0
 */
public class Driver {
    private String person;
    private int age;
    private String licenceStatus;
    private int penaltyPoints;
    private String insuranceStatus;

    public Driver(String person, int age, String licenceStatus, int penaltyPoints, String insuranceStatus) {
        this.person = person;
        this.age = age;
        this.licenceStatus = licenceStatus;
        this.penaltyPoints = penaltyPoints;
        this.insuranceStatus = insuranceStatus;
    }
    
    public Driver() {
        this.person = "Not assigned";
        this.age = 0;
        this.licenceStatus = "none";
        this.penaltyPoints = 0;
        this.insuranceStatus = "none";
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLicenceStatus() {
        return licenceStatus;
    }

    public void setLicenceStatus(String licenceStatus) {
        this.licenceStatus = licenceStatus;
    }

    public int getPenaltyPoints() {
        return penaltyPoints;
    }

    public void setPenaltyPoints(int penaltyPoints) {
        this.penaltyPoints = penaltyPoints;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }
    
    @Override
    public String toString() {
        String contents = getPerson() + ", Age: " + getAge() + ", has a " + getLicenceStatus() + " licence with " + getPenaltyPoints() + " penalty points. \nThe driver has ";
        if(getInsuranceStatus().equals("none")) {
            contents+= "no";
        }
        else {
            contents+= getInsuranceStatus();
        }
        contents+= " insurance. \nThe driver`s legal status is: " + (isLegal() ? "legal" : "illegal") + ".\n";
        return contents;
    }

    public String info() {
        return "Driver{" + "person=" + person + ", age=" + age + ", licenceStatus=" + licenceStatus + ", penaltyPoints=" + penaltyPoints + ", insuranceStatus=" + insuranceStatus + '}';
    }
    
    
    public boolean isLegal() {
        boolean legal = false;
        if(!getLicenceStatus().equals("none") && getPenaltyPoints() < 12) {
            legal = true;
        } 
        return legal;
    }
    
    
}
