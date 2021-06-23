package array;

// import java.util.HashMap;

public class hash {      //Find the Duplicate => default hash = [0,0,0,0,0,0 up to length of array]
    // public int findDuplicate(int[] arr) {
    //     int hash[] = new int[arr.length];
            
    //     for(int i=0; i<arr.length; i++){
    //         if(hash[arr[i]] != 0){
    //             return arr[i];
    //         }
    //         else{
    //             hash[arr[i]]++;
    //         }
    //     }
    //     return 0;
            
    // }
    
    public static void canPartition(int[] arr) {
        int max = arr[0];
        int sum = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            sum = sum+arr[i];
        }
        int a = sum-max;
        if(a == max){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

     
    }
    public static void main(String[] args) {
        int arr[] = {1,6,11,5};
        canPartition(arr);
    }
}
             
//-----------------------------------------------Find all the Duplicates
    // public ArrayList<Integer> findDuplicates(int[] arr) {
    //     ArrayList<Integer> list = new ArrayList<Integer>();
    //     int hash[] = new int[arr.length+1];
        
    //     for(int i=0; i<arr.length; i++){
    //         if(hash[arr[i]] != 0){
    //             list.add(arr[i]);
    //         }
    //         else{
    //             hash[arr[i]]++;
    //         }
    //     }
    //     return list;
        
        
    // }

     
     
         