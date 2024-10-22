

public class classcode{

    public static int[] getReversedArray(int [] arr){
        int i = 0 , j = arr.length-1 ;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++ ; 
            j--;
        }
        return arr ;
    }
    public static void reversetheArray(int []arr , int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            start++ ; 
            end--;
        }
    }
    public static int[] getleftRotatedArray(int[]x, int k){
        int j = k ; 
        while(j>0){
            int elem = x[x.length-1];
            for(int i = x.length-1 ;i>0 ;i--){
                x[i] = x[i-1];
            }
            x[0] = elem;
            j--;
        }
        return x;
    }

    // TC->O(N) , here order of reversing the array is important , if we use the last reversal first we will not acheive the desired output
    public static int [] getleftRotatedArrayOptimized(int [] arr , int k){
        int n = arr.length ; 
        reversetheArray(arr, 0 , n-k-1);
        reversetheArray(arr, n-k , n-1);
        reversetheArray(arr, 0, n-1);
        return arr;
    }

    public static void main(String agrs[]){
        // This file has array class 1 code
        int arr[] ={5 , 2, 3, -1, 6, 1, 2};
        
        // printing out an array on concole 
        // for(int i = 0 ; i < arr.length ;i++){
        //     System.out.println(arr[i]);
        // }

        // tc of accessing an array element is o(1)

        // reverse the given array 
        // int ans1 [] = getReversedArray(arr);

        // if we have a scenario where we have to reverse the array between certain indexes only we send i , j from the function call and modify the function defination also s.t start = i and end = j


        // left rotate an array by k times
        // int ans2[] = getleftRotatedArray(arr, 3); // tc => o(kn)

        // optimize this solution 
        // by the use of reverse function 
        int ans3[] = getleftRotatedArrayOptimized(arr, 4);

        for(int i = 0 ; i < ans3.length ;i++){
            System.out.println(ans3[i]);
        }
    }
}