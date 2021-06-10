function solution(arrA, arrB) {
    let answer = [];
    for(let i = 0; i < arrA.length; i++) {
        for(let k = i; k === i; k++) {
            if(arrA[i] === arrB[k]) answer.push("D");
            else if(arrA[i] === 1 && arrB[k] === 3) answer.push("A");
            else if(arrA[i] === 2 && arrB[k] === 1) answer.push("A");
            else if(arrA[i] === 3 && arrB[k] === 2) answer.push("A");
            else answer.push("B");

        }
    }
    return answer;
}
let arrA = [2,3,3,1,3];
let arrB = [1,1,2,2,3];
console.log(solution(arrA,arrB))