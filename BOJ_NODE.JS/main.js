function solution(str) {
    let answer = "";
    for(let x of str) {
        let num = x.charCodeAt(); // ASCII NUMBER
        if(num >= 97 && num <= 122) answer += String.fromCharCode(num - 32);
        else answer += x;
    }

    return answer;
}
let str = "ItisTimeToStudy";
console.log(solution(str));