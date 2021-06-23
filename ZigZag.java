package array;

import java.util.ArrayList;

public class ZigZag {         //============ZigZag=> <><><>
    // static void zigzag(int arr[]){
    //     int flag = 0;
    //     for(int i=0; i<arr.length-1; i++){
    //         if(flag == 0){
    //             if(!(arr[i] < arr[i+1])){
    //                 int temp = arr[i];
    //                 arr[i] = arr[i+1];
    //                 arr[i+1] = temp;
    //             }
    //             flag = 1;
    //         }
    //         else if(flag == 1){
    //             if(!(arr[i] > arr[i+1])){
    //                 int temp = arr[i];
    //                 arr[i] = arr[i+1];
    //                 arr[i+1] = temp;
    //             }
    //             flag = 0;
    //         }
    //     }
    // }
    //---------------------------------------------------- to find leaders max method.
    // static ArrayList<Integer> pairsSumIsK(int arr[], int k){
    //     ArrayList<Integer> list = new ArrayList<Integer>();
    //     // boolean leader = true;
    //     int max = arr[arr.length-1];
    //     list.add(max);
    //     for(int i=arr.length-2; i>=0; i--){
    //         if(arr[i] > max){
    //             list.add(arr[i]);
    //             max = arr[i]; 
    //         } 
    //     }
    //     return list;
    // }
    //=========================================================== to find leaders.

    //     for(int i=0; i<arr.length; i++){
    //         leader = true;
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[i] < arr[j]){
    //                 leader=false;
    //                 break;
    //             }
    //         }
    //         if(leader == true){
    //             list.add(arr[i]);
    //         }
    //     }
    // return list;
    // }
    //========================================Missing no. in first n natural no.
    // static void missingnum(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         if(!(arr[i] == i+1)){
    //             System.out.println("Missing no. is "+(i+1));
    //             break;
    //         }
             
    //     }
    // }
    //===================================================sort{2,1,4,5,7,6,8}
    static void sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(!(arr[i] < arr[i+1])){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

    }

    // static void missingnums(int arr[]){
    //     for(int i=0; i<arr.length-1; i++){
    //        int diff = arr[i+1] - arr[i];
    //         if(!(diff == 1)){
    //             System.out.println("Missing terms are: "+ (i+2));
    //         }
    //     }
    // }

     
     
    //========================================================first n natural no. sum technique method to find missing term .
    // static void missingnum(int arr[]){
    //     int sum = 0;
    //     for(int i=0; i<arr.length; i++){
    //         sum += arr[i];
    //     }
    //     int sumofn;
    //     int n = arr.length+1;
    //     sumofn = (n*(n+1))/2;
    //     System.out.println("Missing num is:"+ (sumofn - sum));
        
    // }
    //================================================================Xor method to find missing term
    // static void missingterm(int arr[]){
    //     int result1= 0;
    //     for(int i=1; i<= arr.length +1; i++){
    //         result1 = result1 ^ i;
    //     }
    //     int result2 = 0;
    //     for(int i=0; i<arr.length; i++){
    //         result2 = result2 ^ arr[i];
    //     }
    //     int result = result1 ^ result2;
    //     System.out.println("Missing term is:"+result);
    // }
    //=========================================================to find pairs whose sum = k.
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         if((arr[i] + arr[j]) == k){
        //             list.add(arr[i]);
        //             list.add(arr[j]);
        //         }
        //     }
             
        // }
        // return list;
    // }
    // static void printlist(ArrayList<Integer>list){
    //     for(int a:list){
    //         System.out.print(a+ " ");
    //     }
    //     System.out.println();
    // }
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[] = {2,6,78,9,3,32,5,56,21,4};
        // int arr[] = {1,2,4,5,6,7};
        int arr[] = {2,0,2,1,1,0};
        print(arr);
        // ArrayList<Integer> list = pairsSumIsK(arr,8);
        // printlist(list);
        // missingnum(arr);
        for(int i = 0; i<arr.length; i++){
            sort(arr);
        }
        print(arr);
        // missingterm(arr);


    }
    
}
