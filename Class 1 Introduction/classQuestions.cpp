#include<bits/stdc++.h>
using namespace std;

// Function returns Number of factors
// TC:O(sqrt(n));
// SC:O(1)
int getNumberOfFactors(int num){
    if(num==1){
        cout<<num;
        return num;
    }
    int count = 0 ; 
    int n = sqrt(num);
    for(int i = 1 ; i <= n ;i++){
        if(num%i==0){
            if(num/i == i){
                count++;
            }else{
                count+=2;
            }
        }
    }
    cout<<count;

    return count;
}

void printIfPrime(int num){
    if(num==1){
        cout<<"Not a prime";
        return;
    }
    int count = getNumberOfFactors(num) ; 
    if(count==2){
        cout<<"Prime";
    }else{
        cout<<"Not prime";
    }
    return;
}

int main(){
    int num = 24 ;
    //1
    int count = getNumberOfFactors(num);
    
    //2 
    printIfPrime(num);

    //3

    return 1;
}