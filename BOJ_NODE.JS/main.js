function solution(str) {
    let answer = "YES";
    str = str.toUpperCase();
    if(str.split('').reverse().join('') !== str) return "NO";
    return answer;
}
str ="goooG";
console.log(solution(str));