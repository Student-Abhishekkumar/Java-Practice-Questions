import java.util.Scanner;
public class exp2a {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter value of a: ");
        a = ob.nextInt();

        System.out.print("Enter value of b: ");
        b = ob.nextInt();

        System.out.print("Enter value of c: ");
        c = ob.nextInt();

        // Finding the smallest value using ternary operator
        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

        // Checking for equal values using ternary operator
        String equalCheck = (a == b && b == c) ? "All values are the same."
                        : (a == b && a < c) ? "a and b are equal and smallest: " + a
                        : (b == c && b < a) ? "b and c are equal and smallest: " + b
                        : (a == c && a < b) ? "a and c are equal and smallest: " + a
                        : "The smallest value is: " + smallest;

        System.out.println(equalCheck);

        ob.close();
    }
}
