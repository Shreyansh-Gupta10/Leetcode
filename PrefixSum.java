import java.util.ArrayList;

public class PrefixSum {
    // public static ArrayList<Integer> Prefix_Sum(int arr[]){
    //     int sum = 0;
    //     ArrayList<Integer> list = new ArrayList<Integer>();
    //     for(int i=0; i<arr.length; i++){
    //         sum = sum+arr[i];
    //         list.add(sum);
    //     }
         
    //     return list;
    // }

    //============================================Another method

    static void Prefix_Sum(int arr[]){
        int Prefixsum[] = new int[arr.length+1];
        Prefixsum[0] = 0;
        for(int i=1; i<arr.length+1; i++){
            Prefixsum[i] = Prefixsum[i-1] + arr[i-1];
        }
        for(int a:Prefixsum){
            System.out.print(a+ " ");
        }
    }
         
    
    public static void main(String[] args) {
        int arr[] = {2,5,3,8,5,7,9};
        Prefix_Sum(arr);

    }
}
