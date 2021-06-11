function solution(arr) {
    let answer = Number.MIN_SAFE_INTEGER;
    let n = arr.length;
    let sum1 = sum2 = 0;
    for(let i = 0; i < n; i++) {
        sum1 = sum2 = 0;
        for(let k = 0; k < n; k++) {
            sum1 += arr[i][k]; // 행의 합
            sum2 += arr[k][i]; // 열의 합
        }
        answer = Math.max(answer, sum1, sum2);
    };
    sum1 = sum2 = 0;
    for(let i = 0; i < n; i++) {
        sum1 += arr[i][i]; // 왼오 대각선 합
        sum2 += arr[i][n-1-i] // 오왼 대각선 합
    }
    answer = Math.max(answer, sum1, sum2);
    return answer;
}
    
let arr=[[10, 13, 10, 12, 15], 
         [12, 39, 30, 23, 11],
         [11, 25, 50, 53, 15],
         [19, 27, 29, 37, 27],
         [19, 13, 30, 13, 19]];
console.log(solution(arr));