import java.util.*;
public class assignmentcode {

    // TC->O(nlogn) , sc->O(1)
    public static int hasGoodPair(int[]arr , int k){
        Arrays.sort(arr);
        int i = 0 , j = arr.length-1 ; 
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum<k){
                i++;
            }else if(sum>k){
                j--;
            }else{
                return 1;
            }
        }
        return 0;
    }
    
    // tc->O(N)
    public static int getSecondLargest(int[]ar){
        int largest = ar[0] ; 
        int secondLargest = -1;
        for(int i = 1 ; i < ar.length ;i++){
            if(ar[i]>largest){
                secondLargest = largest ; 
                largest = ar[i];
            }else if(ar[i]!=largest && ar[i]>secondLargest){
                secondLargest = ar[i];
            }
        }
        return secondLargest ;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4} ; 
        int arr2[] = {7,1,8,9,9,2,3,8,6} ; 
        // int ans = hasGoodPair(arr,7);
        // System.out.print(ans);
        // int ans1 = getSecondLargest(arr2);
        // System.out.print(ans1);

        for(int i = 0  ; i < arr.length ; i++){
            for(int j = i ; j< arr.length ; j++){
                for(int k = i ; k<=j ; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
