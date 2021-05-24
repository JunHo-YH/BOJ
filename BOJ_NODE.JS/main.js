function solution(str) {
    let answer = "";
    answer = str.replace(/A/g, '#')
    return answer;

}
let str = "BANANA";
console.log(solution(str))