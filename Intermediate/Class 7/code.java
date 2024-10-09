import java.util.*;
import java.util.concurrent.Flow.Subscriber;

public class code { 
    //O(n^3)
    public static void printAllSubarrays(int []arr){

        for(int i = 0; i < arr.length ;i++){
            for(int j = i ; j <arr.length ;j++){
                for(int k = i ; k <= j ;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    //O(n^3)
    public static void printSumOfAllSubarrays1(int[]arr){
        int n = arr.length ; 
        for(int i = 0 ; i < arr.length ;i++){
            for(int j = i ; j <arr.length ;j++){
                int sum = 0; 
                for(int k = i ; k <= j ;k++){
                    sum+=arr[k];
                }
                System.out.println(sum);
            }
        }
    }

    // O(n^2)
    public static void printSumOfAllSubarrays2(int[]arr){
        int n = arr.length ; 
        for(int i = 0 ; i < arr.length ;i++){
            int sum = 0 ; 
            for(int j = i ; j < arr.length ;j++){
                sum = arr[j] + sum;
                System.out.println(sum);
            }
        }
    }

    //O(n^2) and SC-O(n)
    public static void optimisedSumOfAllSubarrays(int[]arr){
        int pf [] = new int [arr.length] ;
        pf[0] = arr[0] ; 
        for(int i = 1 ; i < arr.length ;i++){
            pf[i] = pf[i-1] + arr[i];
        } 
        for(int i = 0 ; i < arr.length ;i++){
            int sum = 0 ; 
            for(int j =  i ; j<arr.length ; j++){
                if(i==0){
                    sum = pf[j];
                }else{
                    sum = pf[j]- pf[i-1]; 
                }
                System.out.println(sum);
            }
        }
    }
    
    public static void getMaxSubarraySumOfLenK(int[]arr , int k ){
        if(arr.length==0 || k ==0 ){
            System.out.println("Invalid Input");
            return ; 
        }
        int start = 0 , end = k-1 , maxSum = Integer.MIN_VALUE ;
        while(end < arr.length){
            int sum = 0 ; 
            for(int i = start ; i <= end ;i++){
                sum+=arr[i];
            }
            start++; end++;
            maxSum = Math.max(maxSum, sum);

        }
        System.out.println(maxSum);
    }
    
    public static void getMaxSubarraySumOfLenK2(int []arr , int k ){
        int end = 0 , start =0 , sum = 0 ;
        while(end < k){
            sum+=arr[end];
            end++;
        } 
        int maxSum = sum ;
        while (end<arr.length){
            sum+=arr[end];
            sum-=arr[start];
            maxSum = Math.max(sum , maxSum);
            end++;
            start++;
        }
        System.out.println(maxSum);
    }
    public static void main(String args[]){
       int arr[] = {1,2,3}; 
    // printAllSubarrays(arr);
        // printSumOfAllSubarrays1(arr);
        // printSumOfAllSubarrays2(arr);
        // optimisedSumOfAllSubarrays(arr);
        getMaxSubarraySumOfLenK(new int[]{-3,4,-2,5,3,-2,8,2,-1,4}, 5);
    }
}
