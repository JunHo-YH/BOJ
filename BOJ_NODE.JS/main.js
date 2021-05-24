function solution(str) {
    let answer ="";
    let mid = Math.floor(str.length / 2) // 몫만 출력
    if(str.length %2 === 1) answer = s.substr(mid, 1);
    else answer = str.substr(mid-1, 2);
    return answer;
}
let str = "good";
console.log(solution(str));