import java.util.Scanner;

public class exp3c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            if (i%2==0) {
                System.out.println(i);
            }else{
                i*=-1;
                System.out.println(i+" ");
                i*=-1;
            }
        }
        sc.close();
    }
}
