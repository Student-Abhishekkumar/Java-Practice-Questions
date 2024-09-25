import java.util.*;

public class exp2b{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int choice,widthdraw,deposit,balance=100000;
        
        while (true){
            System.out.println("\nAutomated teller machine :-");
            System.out.println("1. Widhdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice : ");
            choice = ob.nextInt();
            switch (choice) {
                case 1:
                System.out.print("Enter the money you want to widthdraw : Rs.");
                    widthdraw=ob.nextInt();
                    if (widthdraw>balance){
                        System.out.println("Insufficient Balance.");
                        break;
                    }
                    balance=balance-widthdraw;
                    System.out.print("Your widthdrawn money = Rs."+widthdraw+"\nYour balnce = Rs."+balance);
                    break;

                case 2:
                    System.out.print("Enter how much you want to deposit : Rs");
                    deposit=ob.nextInt();
                    balance+=deposit;
                    System.out.print("\nYour balance = Rs."+balance);
                    break;

                case 3:
                    System.out.println("Your Balance : "+balance);
                    System.out.println(" ");
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Damm !!! ERROR Ahhhhhhhhhh...................");
                    break;
            }
            ob.close();
        }
    }
        
}
