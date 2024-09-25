public class largest1and2 {
    public static void main(String[] args) {
        int lar=0,slar=0;
        int[] A=new int[]{1,2,453,4,15,6,7,1097};

        for (int i = 0; i < A.length; i++) {
            if (A[i]>lar){
                slar=lar;
                lar=A[i];
            }
            if (A[i]>slar && A[i]!=lar) {
                slar=A[i];
            }
        }
        System.out.println("Large : "+lar+"\nSecond Large : "+slar);
    }
}
