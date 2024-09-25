// import java.util.*;
// public class find_age_of_aperson {
//     public static void main(String[] args) {
//         int age,year=2004;
//         age=2024-year;
//         System.out.println(("Your age is : "+age));
//     }
// }

import java.util.*;
class find_age_of_aperson {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        String name;
        int age,year;
        System.out.print("Enter your name : ");
        name = in.nextLine();
        System.out.print("Enter your birth year : ");
        year=in.nextInt();
        age=2024-year;
        System.out.println("Nmane : "+name);
        System.out.println("Age : "+age);
    }
}
