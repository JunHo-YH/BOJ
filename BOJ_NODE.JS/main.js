function solution(s) {
    let answer = 0, score=0;;
    for(let x of s) {
        if(x === 1) {
            score++;
            answer += score;
        }else {
            score = 0;
        }
    }

    return answer;
}
let score = [1,0,1,1,1,0,0,1,1,0];
console.log(solution(score));