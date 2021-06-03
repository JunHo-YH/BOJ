function solution(str) {
    let answer = 0;
    for(let x of str) {
        let num = x.charCodeAt(); // ASCII 번호로 치환
        if(num >= 65 && num <= 90) answer++;
        // if(x === x.toUpperCase()) answer++;
    }
    return answer;
}
let str = "KoreaTimeGood";
console.log(solution(str));