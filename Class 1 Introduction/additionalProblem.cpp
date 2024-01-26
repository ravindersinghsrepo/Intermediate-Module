#include<bits/stdc++.h>
using namespace std;
bool checkIfperfectNumber(int num){
    if(num==1){
        return false;
    }
    int sum = 0 ; 
    for(int i = 1 ; i * i <=num ;i++){
        if(num%i==0){ // case where num ==1 fails here si added edge case in starting 
            // yes its  factor 
            if(num/i==i){
                sum+=i;
            }else{
                sum+=i;
                if(num/i<num){
                    sum+=num/i;
                }
            }
        }
    }
    return num==sum;
}
int main(){
    // perfect number 
    //    check if a number is sum of its proper divisors less than it 

    // fisrt find proper divisors 
    // proper divisors are factors 
    //:. take the sum of factors less than th enumber itself 
    checkIfperfectNumber(6);
}