import java.util.*;
public class reverseoddadd {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n,r=0,x=0,sum=0;
        System.out.print("Enter the value of n : ");
        n=ob.nextInt();
        
        if (n%2!=0) { 
            while (n%2!=0){
                x=n%10;
                n=n/10;
                r=(r*10)+x;
            }
            System.out.println("reverse : "+r);
        }else{
            while (n!=0) {
                x=n%10;
                n=n/10;
                sum+=x;
            }
            System.out.println("Sum = "+sum);
        }
    }   
}
