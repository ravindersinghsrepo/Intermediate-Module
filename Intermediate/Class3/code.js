let arr = [1,2,3,4,5,6]


// for in loop  -> i is index in this 
for(let i in arr){
    // console.log(arr[i])
}


// for of loop , elem is the element in the array
for(let elem of arr)
    console.log(elem)


// reverse the given array 

function getReversedArray(x){
    let i = 0 , j = x.length-1;
    while(i<j){
        let temp = x[i];
        x[i] = x[j];
        x[j] = temp ;
        i++ ; j-- ;
    }
    console.log(x);
}

getReversedArray(arr)


// right rotate an array 
// we do this with the help of slice and concat method 

function righRotateArray(arr , k){
    let n = arr.length; 
    if(n==0) return ;
    k = k% n ; // for large value of k (i.e greater than n)
    return arr.slice(n-k).concat(arr.slice(0,n-k));
}

arr = [5 , 2 ,3 , -1 ,6 , 1 ,2];
console.log(righRotateArray(arr , 14));

// we can also solve this with the help of reverse function of described in the java file 
