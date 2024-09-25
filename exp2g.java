import java.util.Scanner;

public class exp2g {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=ob.nextInt();
        int sq=(int)Math.sqrt(n);

        if ((sq*sq)==n) {
            System.out.println("Perfect square");
        }else{
            System.out.println("Not a perfect square");
        }
        ob.close();
    }
}
