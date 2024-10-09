const printSumOfAllSubarrays=(...arr)=>{
    let n = arr.length ; 
    if(n===0) return ; 
    for(let i = 0 ; i < arr.length ;i++){
        let sum = 0 ; 
        for(let j = i ; j < arr.length ;j++){
            sum+=arr[j] ; 
            console.log(sum);
        }
    }
}
// printSumOfAllSubarrays(1,2,3);

const printMaxSumOfSubarrays = (...arr)=>{
    if(arr.lenth === 0)
        return ; 

    let maxSum = Number.MIN_VALUE ; 
    for(let i = 0 ; i < arr.length ;i++){
        let sum = 0 ;
        for(let j = i ; j < arr.length ;j++){
            sum+=arr[j] ;
            maxSum = Math.max(maxSum  , sum);
        }
    }
    console.log(maxSum);
}
// printMaxSumOfSubarrays(1,2,3) ; 

const getSumOfAllSubarrays = (...arr)=>{
    if(arr.length===0) return ;
    let n = arr.length 
    let totalSum = 0 ;
    for(let i = 0 ; i < arr.length ;i++){
        let occurance = (i+1) * (n-i) ; 
        totalSum += occurance * arr[i] ; 
    }
    return totalSum ; 
}
// console.log(getSumOfAllSubarrays(1,2,3))

const printSubarrayWithKIndices = (n , k)=>{
    let j =  0 ; 
    while(j< k-1){
        j++
    }
    let i = 0;
    while(j<n){
        console.log(i+" "+j);
        j++ ; 
        i++ ;
    }

}
printSubarrayWithKIndices(8 ,3); 

