public class Q4 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        }

        try {
            int[] arr = {1, 2, 3, 4, 5};
            
            int value = arr[4];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}