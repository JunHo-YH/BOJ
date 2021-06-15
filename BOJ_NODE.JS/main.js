function solution(arr) {
    let answer = 0, max = Number.MIN_VALUE;
    for(let x of arr) {
        let sum = 0, tmp = x;
        while(tmp) {
            sum += (tmp % 10);
            tmp = Math.floor(tmp / 10);
        }
        if(sum > max) {
            max = sum;
            answer = x;
        }else if(sum === max) {
            if(x > answer) answer = x;
        }
    }



    return answer;
}


let arr=[128, 460, 603, 40, 521, 137, 123];
console.log(solution(arr));