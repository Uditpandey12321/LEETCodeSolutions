class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int n = arr.length;
        int count =0;
        int i, j, mul;
        for(i=0;i<n;i++){
            if(arr[i]<k){
                count++;
            }
            mul = arr[i];
            for(j=i+1;j<n;j++){
                mul = mul * arr[j];
                if(mul < k){
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }
}