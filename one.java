
public class one {
    public static void main(String[] args) {
        System.out.println("Leap year : ");
        for (int i = 1900; i < 2020; i+=4) {
            if ((i%4==0 & i%100!=0) || (i%400==0)){
                System.out.print(i+" ");
            }
        }
    }
}
