//Find Largest of 2 Numbers
public class q3 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 15;

        if (num1 > num2) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}