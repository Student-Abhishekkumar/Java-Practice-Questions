
import java.util.*;
import Numberp.numberp;

public class test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        numberp obj=new numberp();

        int n;
        System.out.println("Enter a number : ");
        n=in.nextInt();
        if (obj.isPrime(n)) {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
