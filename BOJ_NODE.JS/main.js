function solution(str) {
    let answer = "";
    // console.log(str.indexOf('k', 1));
    for(let i = 0; i < str.length; i++) {
        console.log(str[i], i, str.indexOf(str[i]));
        if(str.indexOf(str[i]) === i) answer += str[i];
    }
    return answer;
}
let str = "ksekkset";
console.log(solution(str));