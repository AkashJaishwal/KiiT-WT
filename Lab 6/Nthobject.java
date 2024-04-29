class B{
    private int count;
    B(int i){
        count=i;
        System.out.println("This is " + count + "th object created\n");
    }
}
public class Nthobject {
    public static void main(String[] args) {
        B a1=new B(1);
        B a2=new B(2);
        B a3=new B(3);
    }
}