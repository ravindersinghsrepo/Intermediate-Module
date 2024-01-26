#include<bits/stdc++.h>
using namespace std ; 
// count number of factors
int countFactors(int num){
    int countf = 1 ; 
    int n = sqrt(num);
    for(int i = 2 ; i <= n ;i++){
        if(num%i==0){
            if(num/i == i){
                countf++;
            }else{
                countf+=2;
            }
        }
    }
    return countf;
}

// check if a number if prime 
bool checkIfprime(int num){
    if(num==1){
        return false ;
    }
    int countf= countFactors(num) ; 
    if(countf==2){
        return true;
    }

    return false;
}
int countNumberOfPrimes(int num){
    int countP = 0; 
    for(int i = 2 ; i <=num ; i++){
        if(checkIfprime(i)){
            countP++;
        }
    }
    return countP;
}
int main(){
    //1 -> count no of factors -> already done in class questions 
    //2-> check if the number given is prime 
    //3 -> count the number of prime numbers before a given number (including the number)

}