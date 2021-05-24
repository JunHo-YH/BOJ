function solution(A, B) {
    for(let i = 0; i < A.length; i++) {
        if(A[i] === 1) {
            console.log(answer = B[i] === 1 ? "D" : B[i] === 2 ? "B" : "A"); 
        }else if(A[i] === 2) {
            console.log(answer = B[i] === 2 ? "D" : B[i] === 1 ? "A" : "B");
        }else {
            console.log(answer = B[i] === 3 ? "D" : B[i] === 1 ? "B" : "A");
        }
    }
}
let A = [2,3,3,1,3];
let B = [1,1,2,2,3];
solution(A,B);