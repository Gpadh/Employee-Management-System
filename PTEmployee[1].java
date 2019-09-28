package ems;


public class PTEmployee extends EmployeeInfo {
	
	protected double hourlyWage;
	protected int hoursPerWeek;
	protected int weeksPerYear;
	
	
        public PTEmployee(int num, String fN, String lN, String gender, String workL, double dR, double hourlyWage, int hoursPerWeek, int weeksPerYear){
            super(num, fN, lN, gender, workL, dR);
            this.hourlyWage = hourlyWage;
            this.hoursPerWeek = hoursPerWeek;
            this.weeksPerYear = weeksPerYear;
        }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public int getWeeksPerYear() {
        return weeksPerYear;
    }
        
        public double calcAnnualNetIncome(EmployeeInfo toBeAdded){
            double deduction = toBeAdded.getDeductRate();
            return(hourlyWage * hoursPerWeek * weeksPerYear * (1 - deduction));
        }
        
	

	
}
