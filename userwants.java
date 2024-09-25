import java.util.*;
public class userwants {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n,small=0,large=0,i;
        System.out.print("Enter how many values you want to take : ");
        n=ob.nextInt();
        int[] arr= new int[n];
        for (i = 0; i < n; i++){
            arr[i]=ob.nextInt();
        }
        for (int j = 0; j <= arr[i]; j++){
            small=large=arr[0];
            if (arr[j]>large){
                large=arr[j];
            }else{
                if (arr[j]<small){
                    small=arr[j];
                }else{
                    System.out.println("How it even possible.");
                }
            }
        }
        String arrString=Arrays.toString(arr);
        System.out.println("Array : "+arrString);
        System.out.println("Large : "+small);
        System.out.println("Large : "+large);
    }
}
