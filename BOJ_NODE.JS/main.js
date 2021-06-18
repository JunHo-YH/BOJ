function solution(m, arr) {
    let answer = 0;
    let sum = 0;
    let lt = rt = 0;
    for(let i = 0; i < arr.length; i++) {
        if(sum === m) {
            answer++;
            rt++;
        }else if(sum > m) {
            sum -= arr[lt++];
        }
        else {
            sum += arr[rt++] ;
        }
    }
    return answer;
}


let a=[1, 2, 1, 3, 1, 1, 1, 2];
console.log(solution(6, a));