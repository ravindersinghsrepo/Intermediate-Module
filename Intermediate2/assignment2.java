import java.util.Arrays;

public class assignment2 {
    public int elementRemoval(int[] A) {
        int n = A.length ; 
        int minSum = 0 ; 
        Arrays.sort(A);
        for(int i = 0 ; i < A.length ;i++){
            minSum+=(n * A[i]);
            n--;
        }
        return minSum ; 
    }
    public int kthsmallest(final int[] A, int B) {
        Arrays.sort(A);
        return A[B-1];
    }
    
    public static void main(String[]args){
        
    }   
}
