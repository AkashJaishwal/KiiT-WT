public class Eacharry {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=11;
        arr[1]=10;
        arr[2]=12;
        arr[3]=14;
        arr[4]=17;
        
        for (int num : arr) {
            if (num > 10) {
                System.out.println(num);
            }
        }
    }
}