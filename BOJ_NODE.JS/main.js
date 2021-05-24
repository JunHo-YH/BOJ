function solution(str) {
    let answer = "";
    for(let x of str) {
        let num = x.charCodeAt(); //아스키 번호로 변환
        if(num >= 97 && num <= 122) answer += String.fromCharCode(num-32);
        else answer += x;
        // if(x === x.toLowerCase()) answer += x.toUpperCase();
        // else answer += x;
    }
    return answer;
}
let str = "ItisTimeToStudy";
console.log(solution(str));
