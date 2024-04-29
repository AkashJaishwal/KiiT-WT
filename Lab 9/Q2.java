interface Employee {
    double earnings(double basic); 
    double deductions(double basic); 
    double bonus(double basic); 
}


class Manager implements Employee {
    
    public double earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public double deductions(double basic) {
        double pf = 0.12 * basic;
        return pf;
    }

    
    public double bonus(double basic) {
        
        throw new UnsupportedOperationException("Not implemented in Manager class");
    }
}


class Substaff extends Manager {
    
    public double bonus(double basic) {
        double bonus = 0.5 * basic;
        return bonus;
    }
}


public class Q2 {
    public static void main(String[] args) {
        double basicSalary = 443344; 

        
        Substaff substaff = new Substaff();

        double earnings = substaff.earnings(basicSalary);
        double deductions = substaff.deductions(basicSalary);
        double bonus = substaff.bonus(basicSalary);

        System.out.println("Earnings: " + earnings);
        System.out.println("Deductions: " + deductions);
        System.out.println("Bonus: " + bonus);
    }
}