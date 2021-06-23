public class leetcode {
    // class Solution {//=================================== sort colours.
    //     public void sortColors(int[] arr) {
    //         int i=0, j=arr.length-1, ptr=0;
    //         for(;ptr<=j;){
    //             if(arr[ptr] == 2){
    //                 int temp = arr[j];
    //                 arr[j] = arr[ptr];
    //                 arr[ptr] = temp;
    //                 j--;
    //             }
    //             else if(arr[ptr] == 0){
    //                 int temp = arr[i];
    //                 arr[i] = arr[ptr];
    //                 arr[ptr] = temp;
    //                 i++;
    //                 ptr++;
    //             }
    //             else{
    //                 ptr++;
    //             }
    //         }
    //     }
    // }

    // //========================================================== find duplicates.
    // class Solution {
    //     public int findDuplicate(int[] arr) {
    //         int hash[] = new int[arr.length];
            
    //         for(int i=0; i<arr.length; i++){
    //             if(hash[arr[i]] != 0){
    //                 return arr[i];
    //             }
    //             else{
    //                 hash[arr[i]]++;
    //             }
    //         }
    //         return 0;
            
    //     }
    // }

    // //===============================================================find all duplicates
    // class Solution {
    //     public ArrayList<Integer> findDuplicates(int[] arr) {
    //         ArrayList<Integer> list = new ArrayList<Integer>();
    //         int hash[] = new int[arr.length+1];
            
    //         for(int i=0; i<arr.length; i++){
    //             if(hash[arr[i]] != 0){
    //                 list.add(arr[i]);
    //             }
    //             else{
    //                 hash[arr[i]]++;
    //             }
    //         }
    //         return list;
            
            
    //     }
    // }

    // //================================================================== two sum=>elem in arr whose sum = target.
    // class Solution {
    //     public int[] twoSum(int[] arr, int target) {
            
    //         HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
            
    //         for(int i=0; i<arr.length; i++){
    //             int diff = target - arr[i];
    //             if(hash.containsKey(diff)){
    //                 return new int[]{i,hash.get(diff)}; 
    //             }
    //             else{
    //                 hash.put(arr[i],i);
    //             }
    //         }
    //         return null;
    //     }
    // }
    //------------------------------------pivotIndex.
    // public static int pivotIndex(int arr[]){
    //     int rightsum = 0;
    //     for(int i=0; i<arr.length; i++){
    //         rightsum += arr[i];
    //     }
    //     int leftsum = 0;
    //     int pivot = 0;
    //     for(int i=0; i<arr.length; i++){
    //         leftsum = leftsum + pivot;
    //         pivot = arr[i];
    //         rightsum = rightsum - pivot;
    //         if(leftsum == rightsum){
    //             return i;
    //         }
    //     }
         
    //     return -1;

    //============================================continuous array sum = k in b/w array.
    //======================================return how many such array exist.
    static void ContinuousArray(int arr[], int k ){
        int prefixsum[] = new int[arr.length+1];
        prefixsum[0] = 0;
        for(int i=1; i<arr.length+1; i++){
            prefixsum[i] = prefixsum[i-1] + arr[i-1];
        }
        int count = 0;
        for(int i=0; i<prefixsum.length; i++){
            for(int j=i+1; j<prefixsum.length; j++){
                if(prefixsum[j] - prefixsum[i] == k){
                    count++;
                }
                 
            }
        }

        System.out.println(count);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3};
        ContinuousArray(arr,3);  
    }
}

    

