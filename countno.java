import java.util.*;
public class countno {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter your value : ");
        n=ob.nextInt();
        while (n!=0){
            n=n/10;
            count+=1;
        }
        System.out.println("Your value : "+count);
    }
}
