import java.util.*;
public class oddfinder {
    public static void main(String[] args) {
        int start,end,i;
        Scanner ob=new Scanner(System.in);
        System.out.print("Print the start number : ");
        start=ob.nextInt();
        System.out.print("Enter the end number : ");
        end=ob.nextInt();

        if (start<end){       
            System.out.println("Odd : ");
            for ( i = start; i <= end; i++) {
                if (i%2!=0){
                    System.out.println(i);
                }
            }
        }else if(start>end){
            System.out.println("Odd : ");
            for ( i = start; i >= end; i--){
                if (i%2!=0){
                    System.out.println(i);
                }
            }    
        }else{
            System.out.println("Both values are same.");
        } 
    }
}
