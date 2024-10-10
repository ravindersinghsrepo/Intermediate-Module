// import java.util.*;

public class class1 {
    public static void printArr(int[][]arr){
        
        for(int i = 0 ;i < arr.length ;i++){
            for(int j = 0 ; j < arr[0].length ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void printSumOfEachRow(int[][]arr){
        int n = arr.length ; 
        int m = arr[0].length ; 
        for(int i = 0 ; i < n ;i++){
            int sum = 0 ; 
            for(int j = 0 ; j < m ;j++){
                sum+=arr[i][j];
            }
            System.out.println(sum);
        }
        return ;
    }
    
    public static void printColmWiseSum(int[][]arr){
        int n = arr.length ; 
        int m = arr[0].length ; 
        for(int col = 0 ; col < m ;col++){
            int sum = 0 ;
            for(int row = 0 ; row < n ; row++){
                sum+= arr[row][col];
            }
            System.out.println(sum);
        }
        return ; 
    }
    
    public static void printPrincipleDiagonal(int[][]arr){
        int n = arr.length ; 
        for(int i = 0 ; i < n ;i++){
            System.out.println(arr[i][i]) ;
        }
    }

    public static void printAntiDiagonal(int[][]arr){
        int m = arr[0].length ; 
        int i = 0 ; 
        int j = m-1 ; 
        while(j>=0){
            System.out.println(arr[i][j]) ;
            i++ ; j-- ; 
        }
        return ; 
    }

    public static void printAllDiagonalsRtoL(int[][]arr){
        int n = arr.length ; 
        int m = arr[0].length ; 
        int j ;
        for(j = 0 ; j < m ;j++){ // printing the first half diagonals
            int i = 0 ; 
            int col = j ;
            while(col>=0){
                System.out.println(arr[i][col]); 
                i++;
                col--;
            }
        }
        int nextCol;

        for(int row = 1 ; row < n ;row++){
            nextCol = j-1;
            int newrow = row ;
            while(newrow<n){
                System.out.println(arr[newrow][nextCol]);
                newrow++;
                nextCol--;
            }
        }
        return ;
    }
    
    public static void transposeSqArray(int[][]arr){
        int n = arr.length ; 
        int m = arr[0].length ; 
        for(int i = 0 ;i < n ; i++){
            for(int j = 0 ; j < m ;j++){
                if(i>j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp ; 
                }
                if(i==j){
                    break;
                }
            }
        }
        printArr(arr);
        return ;
    }
    
    public static void main(String[]args){
        
        // int[][]arr = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9} ,
        //     {4, 5, 6}
        // };

        // int[][]arr2 = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9} ,
            
        // };
        // printSumOfEachRow(arr);
        // printColmWiseSum(arr) ; 
        // printPrincipleDiagonal(arr2) ; 
        // printAntiDiagonal(arr2) ;
        // printAllDiagonalsRtoL(arr);
        // transposeSqArray(arr2);
        // rotate an array to 90 degree clockwise 
    }
}
