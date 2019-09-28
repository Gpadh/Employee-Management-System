package ems;

public class FTEmployee extends EmployeeInfo {

    protected double salary;

    public FTEmployee(int num, String fN, String lN, String gender, String workL, double dR, double sL) {
        super(num, fN, lN, gender, workL, dR);
        salary = sL;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calcAnnualNetIncome(EmployeeInfo toBeAdded) {
        double deduction = toBeAdded.getDeductRate();
        return (salary * (1 - deduction));
    }

}
