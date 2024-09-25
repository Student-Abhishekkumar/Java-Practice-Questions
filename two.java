
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter your current age : ");
        int year_old=ob.nextInt();

        System.out.print("Enter current year : ");
        int year=ob.nextInt();
        
        int age=year-year_old;
        System.out.print("Your birth year is : "+age);
        ob.close();
    }
}
