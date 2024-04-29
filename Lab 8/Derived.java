class Base {
    int x;
    
    Base(int x) {
        this.x = x;
        System.out.println("Base class constructor called.");
    }
}

class Derived extends Base {
    int y;
    Derived(int x, int y) {
        super(x);
        this.y = y;
        System.out.println("Derived class constructor called.");
    }

    public static void main(String[] args) {
        Derived obj = new Derived(10, 20);
        System.out.println("x: " + obj.x);
        System.out.println("y: " + obj.y);
    }
}