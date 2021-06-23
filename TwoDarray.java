public class TwoDarray {
    static void isUpperMat(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i>j){
                    if(arr[i][j] == 0){
                        System.out.println("true");
                    }
                    else{
                        System.out.println("false");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] ={{1,2,3},
                      {0,4,5},
                      {0,7,6}};
        isUpperMat(arr);  
    }

     
   
}
