public class Static {
    private static int objectCount = 0;
    private int objectNumber;

    public Static () {
        objectCount++;
        objectNumber = objectCount;
        System.out.println("This is " + objectNumber + "th object created");
    }
}