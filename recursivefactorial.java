// import java.util.*;
// import java.io.*;
// public class exp3a {

//     public static void main(String[] args) {
//         try{
//             PrintWriter writer = new PrintWriter(System.out);
//             writer.write(9+97);
//             writer.close();
//         }catch(Exception e){
//             System.out.println(e);
//         }

//     }
// }

public class recursivefactorial{
    int n;
    int factorial(int n){
        if (n==0) {
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }

    public static void main(String[] args) {
        recursivefactorial r=new recursivefactorial();
        int n=5;
        System.out.println(r.factorial(n));
        System.out.println("Factorial of "+n+":"+r.factorial(5));
    }

}