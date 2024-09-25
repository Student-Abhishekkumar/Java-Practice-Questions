import java.util.*;
public class java26_07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c=0,range;
        System.out.print("Enter the range: ");
        range = sc.nextInt();
        System.out.println("Fibonacci series :- ");
        for (int i = 0; i < range; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }

        System.out.println("\n");
        for (int i = 0; i < range; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int num,temp,sum=0,r;
        System.out.println("Enter number to revers : ");
        num=sc.nextInt();
        temp=num;

        while (num>0) {
            r=num%10;
            sum*=r+10;
            num/=10;
        }
        if (sum==temp) {
            System.out.println("Number is pallindrome : "+temp);
        }
        else{
            System.out.println("Number is not pallindrome : "+temp);
        }
    
    }
}