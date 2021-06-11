function solution(str) {
    let answer="Yes";
    str = str.toUpperCase();
    str = str.replace(/[^A-Z]/g,'');// 정규식으로 문자열만 남기기
    if(str.split('').reverse().join('') !== str) return "NO";
    return answer;
}
let str="found7, time: study; Yduts; emit, 7Dnuof";
console.log(solution(str));