import java.util.Scanner;

public class exp2c {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter value of a: ");
        a = ob.nextInt();

        System.out.print("Enter value of b: ");
        b = ob.nextInt();

        System.out.print("Enter value of c: ");
        c = ob.nextInt();

        // Finding the largest value
        if (a > b && a > c) {
            System.out.println("a is largest: " + a);
        } else if (b > a && b > c) {
            System.out.println("b is largest: " + b);
        } else if (c > a && c > b) {
            System.out.println("c is largest: " + c);
        } else {
            // Checking for equal values
            if (a == b && b == c) {
                System.out.println("All values are the same.");
            } else if (a == b && a > c) {
                System.out.println("a and b are equal and largest: " + a);
            } else if (b == c && b > a) {
                System.out.println("b and c are equal and largest: " + b);
            } else if (a == c && a > b) {
                System.out.println("a and c are equal and largest: " + a);
            }
        }

        ob.close();
    }
}