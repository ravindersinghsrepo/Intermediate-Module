import java.util.* ; 
public class class3 {
    public static void printArr(int[]arr){
        for(int i = 0 ; i< arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
    public static void getMinCostOfRemovingAll(int[]arr){
        int n = arr.length ; 
        int totalMinSum = 0 ; 
        Arrays.sort(arr);
        int mult = n ;
        for(int i = 0 ; i<n ;i++){
            totalMinSum += (mult * arr[i]);
            System.out.println(mult * arr[i]);
            mult--;
        }
        System.out.println(totalMinSum);
    }
    public static void main(String []args){
        int arr[] = { -3 ,  1  ,  3  , 5};
        getMinCostOfRemovingAll(arr);
    }
}
