import java.util.Scanner;

public class exp3b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();
        for (int i = 100; i >= n; i-=10) {
            System.out.println(i);
        }
    }    
}
