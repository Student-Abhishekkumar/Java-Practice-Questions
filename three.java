
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int age,month,year,date,birth_year;
        System.out.print("Enter your current age : ");
        age=ob.nextInt();
        System.out.print("Enter current month : ");
        month=ob.nextInt();
        System.out.print("Enter current year : ");
        year=ob.nextInt();
        System.out.print("Enter current date : ");
        date=ob.nextInt();

        birth_year=year-age;
    }
}
