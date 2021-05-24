function solution(arr) {
    let answer = [];
    let sum = 0;
    for(let x of arr) {
        if(x % 2 === 1) {
            sum += x;
            answer.push(x);
        }
    }

    console.log(sum);
    console.log(Math.min(...answer));



}

let arr = [12,77,38,41,53,92,85];
solution(arr);