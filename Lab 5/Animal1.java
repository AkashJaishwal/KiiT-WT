class Animal {
    String name;
    String type;

    void in(String n, String t) {
        name = n;
        type = t;
    }

    void out() {
        System.out.println(name + " " + type);
    }
}

public class Animal1 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal lion = new Animal();
        Animal dog = new Animal();
        Animal cow = new Animal();

        a1.in("Cow", "Domastic");
        a2.in("Lion", "Wild");
        lion.in("Lion", "Carnivoure");
        dog.in("Dog", "Omnivore");
        cow.in("Cow", "Herbivour");

        a1.out();
        a2.out();
        lion.out();
        dog.out();
        cow.out();

    }
}