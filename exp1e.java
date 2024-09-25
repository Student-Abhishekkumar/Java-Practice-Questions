public class exp1e {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        System.out.println("Before Swaping a,b : "+a+","+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After Swapping a,b : "+a+","+b);
    }
}
