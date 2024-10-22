package DSA_Revision.Intermediate.Intermediate1.Class1;

import java.util.*;

public class assignmentCode {
    public static boolean checkIfPerfectNumber(int x){
        boolean ans= false ; 
        int sum = 0 ; 
        for(int i = 1 ; i * i <=x ; i++){
            if(x%i==0){
                if(i<x) sum+= i;
                if(x/i < x) sum+= (x/i);
            }
        }
        if(sum==x) ans = true;
        return ans ;
    }

    public static int countFactor(int x){
        int count = 0 ; 
        for(int i =1 ; i* i <=x ;i++){
            if(x%i==0){
                
                if(x/i == i){
                    count+=2 ;
                }else{
                    count++;
                }
            }
        }
        return count ;
    }

    public static int checkIfPrime(int x){
        int ans = countFactor(x);
        return ans==2?1:0;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans1 = checkIfPerfectNumber(n);
        System.out.println(ans1);
    }
}
