class Shape {
    double area;
    void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    double radius;
    void calculateArea(double radius) {
        this.radius = radius;
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    void calculateArea(double length, double width) {
        this.length = length;
        this.width = width;
        area = length * width;
    }
}

public class Area {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea(10);
        c.showArea();
        
        Rectangle r = new Rectangle();
        r.calculateArea(5,8);
        r.showArea();
    }
}