import java.util.Scanner;

public class exp3e {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value f n : ");
        int fac=1,n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fac*=i;
        }
        System.out.println("Factorial of "+n+" is "+fac);
    }
}
