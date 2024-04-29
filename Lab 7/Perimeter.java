class Shape{
    double r;
    int l;
    int b;

    Shape(double i){
        r = i;
        System.out.println("Perimeter of circle: "+ 2*3.14*r);
    }
    Shape(int i, int j){
        l = i;
        b = j;
        System.out.println("Perimeter of circle: "+ 2*(l+b));
    }
}
public class Perimeter {
    public static void main(String[] args) {
        Shape s1 = new Shape(4.3);
        Shape s2 = new Shape(4,5);
    }
}