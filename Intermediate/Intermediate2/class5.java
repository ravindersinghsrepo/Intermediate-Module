import java.util.*;

public class class5{
    public static String toggleCase(String st){
        if(st.length()==0) return "";

        StringBuilder ans = new StringBuilder();;
        for(int i = 0 ;i < st.length() ;i++){
            if(st.charAt(i)<'a'){ // uppercase
                ans.append((char)(st.charAt(i)+32));
            }else{
                ans.append((char)(st.charAt(i)-32));
            }
        }
        return ans.toString();
    }
    public static boolean isPalindrome(String s, int start , int end){
        if(s.length()==0){
            return false; 
        }
        StringBuilder sb = new StringBuilder(s);
        boolean result = false; 
        while(start<end){
            if(sb.charAt(start)==sb.charAt(end)){
                result = true; 
                start++ ; end--; 
            }else{
                return false ;
            }
        }
        return result ;
    }

    public static int expandAndGiveLength(String s , int p1 , int p2){
        int first = p1 , last = p2; 
        while(first>=0 && last<s.length() && s.charAt(first)==s.charAt(last)){
            first--; 
            last++;
        }
        return last-first -1; 
    }

    public static int getLongestPalindSubStr(String s){
        int maxLen = Integer.MIN_VALUE ;
        for(int i = 0 ;i < s.length() ;i++){
            maxLen = Math.max(maxLen , expandAndGiveLength(s, i, i));
        }
        for(int i = 0 ;i < s.length()-1 ;i++){
            if(s.charAt(i)==s.charAt(i+1));
            maxLen = Math.max(maxLen , expandAndGiveLength(s, i, i+1)) ;
        }
        return maxLen ;
    }
    public static void main(String []args){

        System.out.println(toggleCase("abcdeLJKJLK"));
        System.out.println(isPalindrome("wkjnwkjnitkinlsknlwke" , 7 , 11));
        System.out.println(getLongestPalindSubStr("jgkugccbbccjhvjh")); //TC->O(n2)
    }
}