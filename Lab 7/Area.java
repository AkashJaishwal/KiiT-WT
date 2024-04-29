public class Area {
    public static void main(String[] args) {
        
        double circleArea = area(5);
        System.out.println("Area of circle: " + circleArea);

        double rectangleArea = area(4, 6);
        System.out.println("Area of rectangle: " + rectangleArea);
    }

    
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    
    public static double area(double length, double width) {
        return length * width;
    }
}