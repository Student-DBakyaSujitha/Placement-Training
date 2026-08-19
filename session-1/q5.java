//Find Smallest of 3 Numbers
public class q5 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5, num3 = 8;

        if (num1 <= num2 && num1 <= num3) {
            System.out.println("The smallest number is: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("The smallest number is: " + num2);
        } else {
            System.out.println("The smallest number is: " + num3);
        }
    }
}