import java.util.*;
public class classprime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,c=0;
        System.out.println("Enter a number : ");
        n=in.nextInt();
        for (int i = 0; i < n; i++){
            if (n%i==0) {
                c+=1;
            }
        }
        if (c==2){
            System.out.println("Prime no.");
        }else{
            System.out.println("Not prime no.");
        }
        in.close();
    }
}
