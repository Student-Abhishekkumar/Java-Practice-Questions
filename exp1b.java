import java.util.*;
public class exp1b {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a,square,cube;
        System.out.print("Enter your number : ");
        a=ob.nextInt();
        square=a*a;
        cube=a*a*a;
        System.out.println("Square : "+square+"\nCube : "+cube);
        ob.close();
    }
}
