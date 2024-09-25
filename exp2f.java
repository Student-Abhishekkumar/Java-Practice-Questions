import java.util.*;

public class exp2f {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n=ob.nextInt();
        int n1=n,n2=n;
        int b=n1%10,a=n2/10;

        String[] single_digits=new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] two_digits=new String[]{"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens_multiple=new String[]{"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};

        if (a==1){
            System.out.println(two_digits[b+1]);
        }
        else if (b==0){
            System.out.println(tens_multiple[a]);
        }
        else{
            System.out.println(tens_multiple[a]+"-"+single_digits[b]);
        }
        ob.close();
    }
}
