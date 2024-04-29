import java.util.Scanner;

class NumberProcessor {

    public static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }

    public static void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("The entered number is negative");
        } else {
            double result = (double) number * 2;
            System.out.println("The double value of the entered number is: " + result);
        }
    }

}

public class Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        try {
            NumberProcessor.ProcessInput(number);
        } catch (NumberProcessor.NegativeNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }

}