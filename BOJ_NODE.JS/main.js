function solution(str) {
    let answer = "YES";
    str.toUpperCase();
    let len = str.length;
    for(let i = 0; i < Math.floor(len / 2); i++) {
        if(str[i] !== str[len-i-1]) return answer = "NO";
    }
    return answer;
}
str ="goOoG";
console.log(solution(str));