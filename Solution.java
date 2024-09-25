class Solution {
    // public String largestNumber(int[] nums) {
    //     for(int i=nums.length; i>=0; i--){
            
    //     }
    // }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] a={2,25};
        int[] b=new int[a.length];
        // s.largestNumber(A);
        for (int i = a.length; i>0; i--) {
            b[i]=a[i];
        }
    }
}