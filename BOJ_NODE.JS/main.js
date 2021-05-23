function solution(n) {
    let sum = 0;
    for(var i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}
console.log(solution(10));