function solution(str, alph) {
    let answer = 0;
    for(let x of str) {
        if(x === alph) answer++;
    }
    return answer;
}
let str = "COMPUTERPROGRAMMING";
let alph = "R";
console.log(solution(str, alph));