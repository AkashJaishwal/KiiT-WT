class TwoD {
    int l = 4;
    int b = 5;
    int a = l * b;

    void print() {
        System.out.println("For 2D");
        System.out.println("The are is " + a);
        System.out.println("The Cost is " + a * 40);
    }
}

public class ThreeD extends TwoD {
    int h = 6;
    int a1 = l * b * h;

    void print() {
        System.out.println("\nFor 3D");
        System.out.println("The are is " + a1);
        System.out.println("The Cost is " + a1 * 60);
    }

    public static void main(String[] args) {
        TwoD obj1 = new TwoD();
        ThreeD obj2 = new ThreeD();

        obj1.print();
        obj2.print();
    }
}