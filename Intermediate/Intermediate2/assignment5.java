public class assignment5 {
    public static String getReversedString(String s){
        char arr[]= s.toCharArray();
        int i = 0 ; 
        int j = arr.length ; 
        while(i<j){
            char ch =  arr[i];
            arr[i] = arr[j];
            arr[j] = ch ; 
            i++; 
            j--;
        }
        return new String(arr);
    }
    public String transformTheString(String A) {
        StringBuilder sb = new StringBuilder();
        int y = 2 ; 
        while(y>0){
            for(int i = 0 ;i < A.length() ;i++){
                if(!(A.charAt(i)<97)){
                    if(A.charAt(i)=='a'||A.charAt(i)=='e'||A.charAt(i)=='i'||A.charAt(i)=='o'||A.charAt(i)=='u'){
                        sb.append('#');
                    }else{
                        sb.append(A.charAt(i));
                    }
                }
            }
            y--;
        }
        return sb.toString(); 
    }

    public int isAlphaNum(char[] A) {
        for(int i =0 ; i<A.length ;i++){
            char ch = A[i];
            if(!((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')||(ch>='0'&& ch<='9'))){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[]){

    }
}
