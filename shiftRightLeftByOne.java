package array;

public class shiftRightLeftByOne {
    // static void shiftRightByK(int arr[], int k){
    //     int temp[] = new int[k];
    //     for(int i=arr.length-k, j=0; i<arr.length; i++, j++ ){
    //         temp[j] = arr[i];
    //     } 
    //     for(int i= arr.length-k-1; i>=0; i--){
    //         arr[i+k] = arr[i];
    //     }
    //     for(int i=0; i<k; i++){
    //         arr[i] = temp[i];
    //     }
    // }
    static void shiftLeftByK(int arr[], int k){
        int temp[] = new int[k];
        for(int i=0, j=0; i<k; i++, j++ ){
            temp[j] = arr[i];
        } 
        for(int i=k; i<arr.length; i++){
            arr[i-k] = arr[i];
        }
        for(int i=arr.length-k,j=0; i<arr.length; i++, j++){
            arr[i] = temp[j];
        }
    }
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        print(arr);
        shiftLeftByK(arr, 4);
        print(arr);
    }
    
}
