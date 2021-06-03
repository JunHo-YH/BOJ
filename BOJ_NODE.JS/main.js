function solution(str, find) {
    let answer = 0;
    for(let x of str) {
        if(x === find) answer++;
    }
    return answer;
}
let str = "COMPUTERPROGRAMMING";
let find = "R";
console.log(solution(str,find));