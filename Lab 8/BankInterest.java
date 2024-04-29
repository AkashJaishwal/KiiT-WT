// Define an interface for calculating interest
interface InterestCalculator {
    double calculateInterest(double principal, double rate, int time);
}

// Implement the interface for simple interest
class SimpleInterestCalculator implements InterestCalculator {
    @Override
    public double calculateInterest(double principal, double rate, int time) {
        return principal * rate * time / 100;
    }
}

// Implement the interface for compound interest
class CompoundInterestCalculator implements InterestCalculator {
    @Override
    public double calculateInterest(double principal, double rate, int time) {
        return principal * Math.pow(1 + rate / 100, time) - principal;
    }
}

// Use the interest calculators
public class BankInterest {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        int time = 2;
        
        InterestCalculator simpleInterest = new SimpleInterestCalculator();
        double simpleInterestAmount = simpleInterest.calculateInterest(principal, rate, time);
        System.out.println("Simple interest: " + simpleInterestAmount);
        
        InterestCalculator compoundInterest = new CompoundInterestCalculator();
        double compoundInterestAmount = compoundInterest.calculateInterest(principal, rate, time);
        System.out.println("Compound interest: " + compoundInterestAmount);
    }
}
















