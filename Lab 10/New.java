import java.util.Scanner;

class NoTriangleException extends Exception {
    NoTriangleException(String s) {
        super(s);
    }
}

class triangle {
    double a, b, c;

    triangle(double a1, double b1, double c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    void area() {
        double ar, s = (a + b + c) / 2;
        s = s * (s - a) * (s - b) * (s - c);
        ar = sqrt(s);
        System.out.println("Area of triangle is " + ar);
    }

    void perimeter() {
        double pr = a + b + c;
        System.out.println("Perimeter of triangle is " + pr);
    }

    double sqrt(double num) {
        double t;
        double sqrtroot = num / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (num / t)) / 2;
        } while ((t - sqrtroot) != 0);
        return sqrtroot;
    }

}

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        triangle t = new triangle(s1, s2, s3);
        try {

            if ((s1 + s2) <= s3)
                throw new NoTriangleException("Triangle not possible");
            else if ((s1 + s3) <= s2)
                throw new NoTriangleException("Triangle not possible");
            else if ((s2 + s3) <= s1)
                throw new NoTriangleException("Triangle not possible");
            else {
                t.area();
                t.perimeter();
            }

        } catch (NoTriangleException e) {
            System.out.println(e);
            System.out.println("NoTriangle Exception caught and handled. ");

        } finally {
            System.out.println("This is the end of the program");
        }

    }
}