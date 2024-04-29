abstract class student{
    int roll=21052935;
    int reg=3344;
    abstract void course();
}
class kiitian extends student{
    void course(){
        System.out.println("The roll is " + roll);
        System.out.println("The regno is " + reg);
        System.out.println("The Branch is CSE");
    }
}
public class Q1 {
    public static void main(String[] args) {
        kiitian k = new kiitian();
        k.course();
    }
}