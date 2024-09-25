
import java.util.Scanner;

public class javaerptest {
    public static void main(String[] args){
        int n,np=0,nn=0,count_p=0,count_n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n : ");
        for (int i = 0; i < 20; i++) {
            n=sc.nextInt();
            if (n>0) {
                np+=n;
                count_p+=1;
            }else if (n<0) {
                nn+=n;
                count_n+=1;
            }else{
                break;
            }
        }
        System.out.println("sum of positive no's : "+np);
        System.out.println("sum of negative no's : "+nn);
        System.out.println("sum of both positive and negative : "+(np+nn));
        System.out.println("total count of positive no's : "+count_p);
        System.out.println("total count of negative no's : "+count_n);
        sc.close();
    }
}
