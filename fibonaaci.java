import java.util.*;
public class fibonaaci {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int x=0,y=1,sum,range;
        System.out.print("Enter the range : ");
        range=ob.nextInt();
        System.out.println("Your fibonacci series := ");
        for (int i = 1; i <= range; i++){
            System.out.println(x+" ");
            sum=x+y;
            x=y;
            y=sum;
        }
        ob.close();
    }
}
