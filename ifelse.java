import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name;
        name=ob.next();
        System.out.print("Enter your Age : ");
        int x=ob.nextInt();
        
        System.out.print("\n=========================\n");
        if (x<20) {
            System.out.print("Name : "+name);
            System.out.print("\nDescription : Child");
        }else{
            System.out.print("Name : "+name);
            System.out.print("\nDescription : Child");
        }
    }
}