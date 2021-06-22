function solution(n, k) {
    let answer;
    let queue = Array.from({length: n}, (v, i) => i+1);
    while(queue.length !== 1) {
        for(let i = 1; i < k; i++) queue.push(queue.shift());
        queue.shift(); // 3을 외치면 제외 !
    }
    answer = queue.shift();
    return answer;
}

console.log(solution(8, 3));