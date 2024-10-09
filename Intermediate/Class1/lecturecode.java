import java.util.Scanner;

public class lecturecode{
    
    public static int getCountOfFactor(int x){
        int count = 0; 
        for(int i = 1 ; i * i <= x;i++){
            if(x%i==0){
                if(x/i == i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        }
        return count ;
    }
    
    public static String checkIfPrime(int x){
        boolean ans = false ;
        if(getCountOfFactor(x)==2){
            ans=true;
        }
        return (ans ?"Prime" : "Not Prime") ;
    }
    
    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans1 = getCountOfFactor(n); 
        System.out.println("Count of factors: "+ans1);
        String ans2 = checkIfPrime(n);
        System.out.println("Number " + n + "is :"+ans2);
        scn.close();
    }
}