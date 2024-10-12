public class assignment {
    public static void printArr(int[][]arr){
        int n = arr.length ; 
        int m = arr[0].length ; 
        for(int i = 0 ;i < arr.length ;i++){
            for(int j = 0 ; j<arr[0].length ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public void transposeMatrix(int [][]A){
        int n = A.length ;
        int m = A[0].length ; 

        for(int i = 0 ;i< A.length;i++){
            for(int j = 0 ;  j < A[0].length ; j++){
                if(i==j) break ; 
                int temp = A[i][j]; 
                A[i][j] = A[j][i]; 
                A[j][i] = temp ;
            }
        }
        return ; 
    }
    
    public void rowreverseArray(int[][]A){
        int n= A.length ; 
        int m = A[0].length ; 
        for(int i = 0 ; i < n ;i++){ 
            for(int j = 0 ; j < m/2 ;j++){ // this could be handled in a better way 
                int temp = A[i][j] ; 
                A[i][j] = A[i][m-1-j]; 
                A[i][m-1-j] = temp ; 
            }
        }
        /*
         *  for(int i = 0 ; i< n ;i++){
         *     int start  = 0 ; 
         *     int end = m-1 ; 
         *     while(start<end){
         *     int temp = A[i][start] ; 
         *     A[i][start] = A[i][end]; 
         *     A[i][end]= temp ; 
         *     start++ ; 
         *      end -- ;    
         *     }
         *  }
         * 
         */
    }
    
    public static int[][] diagonal(int[][] A) {
        int n = A.length ;
        int m = A[0].length ; 
        int[][]ans = new int[2 * n -1][n];
        int rowPtr= 0 , colPtr= 0 ; 
        for(int j = 0 ; j < m ;j++){
            int row = 0;
            int col = j ; 
            while(col>=0){
                ans[rowPtr][colPtr] = A[row][col];
                colPtr++; 
                col--;
                row++;
            }
            rowPtr++;
            colPtr = 0 ;
        }
        
        for(int i = 1 ; i < n ;i++){
            int row =  i ; 
            int col = m-1 ; 
            while(row <= n-1){
                ans[rowPtr][colPtr] =A[row][col];
                colPtr++;
                row++; 
                col--;
            }
            rowPtr++;
            colPtr = 0 ;
        }
        printArr(ans);
        return A;
        // return ans; 
    }
    
    public int[] colSum(int[][] A) {
        int n = A.length ; 
        int m = A[0].length ; 
        int[]ans = new int[m];
        for(int j = 0 ; j < m ;j++){
            int sum = 0; 
            for(int i = 0 ; i< n ;i++){
                sum+=A[i][j];
            }
            ans[j] = sum;
        }
        return ans;
    }
    
    public int mainDiagonalSum(final int[][] A) {
        int n = A.length ; 
        int sum = 0 ; 
        for(int i = 0 ; i<n ;i++){
            sum+=A[i][i];
        }
        return sum ;
    }
    
    public int[][] transposeNonSqaureArray(int[][] A) {
        int n = A.length ; 
        int m = A[0].length ; 
        int ans[][] = new int [m][n]; 
        for(int i = 0 ; i < A.length ;i++){
            for(int j = 0 ; j < A[0].length ;j++){
                ans[j][i] = A[i][j];
            }
        }
        return ans ; 
    }
    
    public void rotate90(int[][] A) {
        int n = A.length ;
        int m = A[0].length ; 
        transposeMatrix(A);
        rowreverseArray(A);
    }
    
    public static void main(String[]args){
        int[][]arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} ,
            };
        diagonal(arr);

    }
}
