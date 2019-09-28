package ems;


public class EmployeeInfo
{


    // Attributes

    protected int employeeNumber;
    protected String firstName;
    protected String lastName;
    protected String gender;
    protected String workLocation;
    protected double deductRate;


    // Constructors

    public EmployeeInfo (int employeeNumber, String fN, String lN, String gD, String wL, double dR) {
	this.employeeNumber = employeeNumber;
	firstName = fN;
	lastName = lN;
	gender = gD;
	workLocation = wL;
	deductRate = dR;
    }
    
    public EmployeeInfo () {
	employeeNumber = 0;
	firstName = null;
	lastName = null;
	gender = null;
	workLocation = null;
	deductRate = 0;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public double getDeductRate() {
        return deductRate;
    }

}

