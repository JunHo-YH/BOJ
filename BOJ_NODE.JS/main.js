function solution(score) {
    let n = score.length;
    let answer = Array.from({length:n}, ()=>1); // [1, 1, 1, 1, 1] 초기화
    for(let i = 0; i < n; i++) {
        for(let k = 0; k < n; k++) {
            if(score[i] < score[k]) answer[i]++;
        }
    }

    return answer;
}
    
let score = [87,89,92,100,76];
console.log(solution(score));