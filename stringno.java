import java.util.Scanner;

public class stringno {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n,l=0,temp=1,fac=1;
        System.out.println("Enter your number : ");
        n=ob.nextInt();
        
        for (int i = 1; i <=n; i++) {
            fac=fac*i;
        }
        System.out.println("Fac of "+n+" is :"+fac);
        
        // while (temp<=n) {
        //     l++;
        //     temp*=10;           // l*10=10,100
        // }
        // System.out.println("lenght "+l);

    }
}
