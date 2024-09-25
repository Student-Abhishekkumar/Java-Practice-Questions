import java.util.Scanner;

public class exp2d {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number : ");
        float n=ob.nextInt();
        if (n>0){
            System.out.println("Number is positive.");
        }else{
            System.out.println("Number is negative.");
        }
        ob.close();
    }
}
