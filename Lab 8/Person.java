class Account{
    int acc_no;
    int balance;
    void disp(){
        System.out.println("The account no is: " + acc_no);
        System.out.println("The account balance is: " + balance);
    }
}
public class Person extends Account{
    String name;
    int aadhar_no;
    Person(){};
    Person(String n,int a,int ac,int b){
        name=n;
        aadhar_no=a;
        acc_no=ac;
        balance=b;
    }
    void disp(){
        System.out.println("The account name is: " + name);
        System.out.println("The aadhar no is: " + aadhar_no);
        System.out.println("The account no is: " + acc_no);
        System.out.println("The account balance is: " + balance);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ram",123456,2003,3000);
        Person p2 = new Person("Shyam",654321,2004,3000);
        p1.disp();
        p2.disp();
    }
    
}