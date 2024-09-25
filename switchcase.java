import java.util.*;
public class switchcase {
    public static void main(String[] args){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int button = ob.nextInt();

        switch (button) {
            case 1:
                System.out.println("YOu have pressed 1.");
                System.out.println("Enter 1 : ");
                int l=ob.nextInt();
                switch (l) {
                    case 1:
                        System.out.println("Hello");
                        break;
                
                    default:
                        System.out.println("oops");
                        break;
                }
                break;
            
            case 2:
                System.out.println("You pressed 2.");
                break;

            case 3:
                System.out.println("You pressed 3.");
                break;

            case 4:
                System.out.println("You pressed 4.");
                break;

            case 5:
                System.out.println("You pressed 5.");
                break;
        
            default:
                System.out.println("Thanku.");
                break;
        }
    }
}
