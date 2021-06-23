package array;

public class Rev {
    // public static void reverse(int arr[]){
    //     int temp=0;
    //     for(int i=0; i<(arr.length)/2; i++){
    //         temp = arr[i];
    //         arr[i] = arr[arr.length - (i+1)];
    //         arr[arr.length - (i+1)] = temp;
    //     }
    // }
    //-----------------------------------------------------------------------
    // static void shiftRightByOne(int arr2[]){
    //     for(int i=0; i<arr2.length-1; i++){
    //         int temp = arr2[i];
    //         arr2[i] = arr2[arr2.length-1];
    //         arr2[arr2.length-1] = temp; 

    //     }


    //     }
    //-------------------------------------------------------------------
    static void shiftLeftByOne(int arr1[]){
        for(int i=1; i< arr1.length; i++ ){
             int temp1 = arr1[0];
             arr1[0] = arr1[i];
             arr1[i] = temp1;
        }
    }
    
     static void print(int arr1[]){
         for(int i=0; i<arr1.length; i++){
             System.out.print(arr1[i]+ " ");
         }
         System.out.println();
     }
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int arr1[] = {1,2,3,4,5,6};
        print(arr1);
         
        int k = 1;
        for(int i=0; i<k; i++){
        shiftLeftByOne(arr1);

        }
        print(arr1);
        


        
        
    }
    
}
