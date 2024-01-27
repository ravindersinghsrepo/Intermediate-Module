#include<bits/stdc++.h>
using namespace std;
int reverseArray(vector<int>&vec,int i , int j){
    int start = i ; 
    int end =j;
    while(start<end){
        int temp = vec[start];
        vec[start] = vec[end];
        vec[end] = temp;
        start++;
        end--;
    }
}
int main(){
    vector<int>vec = {1,2,3,4,5,6,7};
    //1 reverse an array between range
    reverseArray(vec,0,vec.size()-1);
    //2

}