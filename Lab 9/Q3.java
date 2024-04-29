interface Motor {
    int capacity = 6;

    void run();

    void consume();
}

class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming electricity.");
    }
}

public class Q3 {
    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine();

        System.out.println("Motor capacity of washing machine: " + washingMachine.capacity);

        washingMachine.run();
        washingMachine.consume();
    }
}