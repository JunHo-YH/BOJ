function solution(s) {
    let n = s.length;
    let answer = Array.from({length:n}, ()=>1);
    for(let i = 0; i < n; i++) {
        for(k = 0; k < n; k++) {
            if(s[i] < s[k]) answer[i]++;
        }
    }

    return answer;
}
let score = [92,92,92,100,76];
console.log(solution(score));