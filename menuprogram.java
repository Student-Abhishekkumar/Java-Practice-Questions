import java.util.*;
public class menuprogram{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int sub1,sub2,sub3,sub4,avg,choice;
        System.out.print("Enter marks of sub1 : ");   
        sub1=ob.nextInt();  
        System.out.print("Enter marks of sub2 : ");     
        sub2=ob.nextInt();  
        System.out.print("Enter marks of sub3 : ");     
        sub3=ob.nextInt();  
        System.out.print("Enter marks of sub4 : ");
        sub4=ob.nextInt();  
        
        avg=(sub1+sub2+sub3+sub4)/4;

        System.out.println("\n1. Medical \n2. Engineering \n3. Commerce \n4. Arts");
        System.out.print("\nPlease choose which stream do you want choose : ");
        choice=ob.nextInt();

        switch (choice) {
            case 1:
                if (avg>=80){
                    System.out.println("You are eligible."+"\nYour's Average marks : "+avg);
                }else{
                    System.out.println("You are not eligible."+"\nYour's Average marks : "+avg);
                }
                break;
        
            case 2:
                if (avg>=70){
                    System.out.println("You are eligible."+"\nYour's Average marks : "+avg);
                }else{
                    System.out.println("You are not eligible."+"\nYour's Average marks : "+avg);
                }
                break;
        
            case 3:
                if (avg>=60){
                    System.out.println("You are eligible."+"\nYour's Average marks : "+avg);
                }else{
                    System.out.println("You are not eligible."+"\nYour's Average marks : "+avg);
                }
                break;

        
            case 4:
                if (avg>=40){
                    System.out.println("You are eligible."+"\nYour's Average marks : "+avg);
                }else{
                    System.out.println("You are not eligible."+"\nYour's Average marks : "+avg);
                }
                break;
        
            default:
                System.out.println("Please choose an appropriate number.");
                break;
        }
    }
}