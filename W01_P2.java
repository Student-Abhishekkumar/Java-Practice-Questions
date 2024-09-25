import java.util.Scanner;
public class W01_P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input an integer
        //System.out.print("Input an integer: ");

        // Read the integer from the user
        long n = input.nextLong();

        // Calculate and display the sum of the digits
        System.out.print("The sum of the digits is: " + sumDigits(n));
        input.close();
    }
    // Calculate the sum of the digits by defining a sumDigits() function
    // This should return the sum
    public static int sumDigits(long k){
        int sum=0;
        while (k!=0){
            sum+=k%10;
            k=k/10;
        }
        return sum;
    }

}
