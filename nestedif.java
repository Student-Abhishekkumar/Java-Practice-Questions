import java.util.*;
public class nestedif {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a,b,c;

        System.out.print("Enter value of a : ");
        a=ob.nextInt();
        
        System.out.print("Enter value of b : ");
        b=ob.nextInt();
        
        System.out.print("Enter value of c : ");
        c=ob.nextInt();
        
// 1 values are small.                                 A ,B ,C  or  A, B ,C
        if (a<b && (b<c || b==c)){                  // 10,20,30 or 10,20,20
            System.out.println("a is small"+a);
        }else{
            if (b<c && (c<a || c==a)){              // 30,10,20 or 30,10,30
                System.out.println("b is small"+b);
            }
            else{
                if (c<a && (a<b || a==b)){          // 20,30,10 or 20,20,10
                System.out.println("c is small"+c);
                }
            }
        }
        
// more then 1 value is small.
        if (a==b && b==c){
            System.out.println("All values are same.");
        }
        else{ 
            if (a==c && a<b){
                System.out.println("A and B is equal and small."+a);
            }
            else{
                if (b==c && b<a){
                    System.out.println("B and C is equal and small."+b);
                }
                else{
                    if (c==b && c<a){
                        System.out.println("A and C is equal and small."+c);
                    }
                }
            }
                                            
        } 
    }
}          
