import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        for (int i = 5; i < n; i++){
            if (i%5==0) {
                int j=i+5;
                System.out.print(j+", ");
                System.out.print(j+1+", ");
            }
        }
        ob.close();
    }
}
