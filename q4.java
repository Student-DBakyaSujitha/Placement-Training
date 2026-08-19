//Find largest among 3 numbers
public class q4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        System.out.println("The largest number is: " + largest);
    }
}
