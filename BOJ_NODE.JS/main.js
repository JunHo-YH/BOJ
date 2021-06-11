function solution(str) {
    let answer="Yes";
    str = str.toUpperCase().replace(/[^A-Z]/g,'');
    let len = str.length;
    // str = str.replace(/[^A-Z]/g,'');// 정규식으로 문자열만 남기기
    // if(str.split('').reverse().join('') !== str) return "NO";
    for(let i = 0; i < Math.floor(len / 2); i++) {
        if(str[i] !== str[len -i -1]) return "NO";
    }
    
    return answer;
}
let str="found7, time: study; Yduts; emit, 7Dnuof";
console.log(solution(str));