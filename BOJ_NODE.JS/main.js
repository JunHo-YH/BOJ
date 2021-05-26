function solution(str) {
    let answer = "Yes";
    str = str.toLowerCase().replace(/[^a-z]/g, '');
    if(str.split('').reverse().join('') !== str) return "NO"; 
    return answer;
}
let str = "found7, time: study; Yduts; emit, 7Dnuof";
console.log(solution(str));