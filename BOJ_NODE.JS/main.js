function solution (arr) {
    let answer = "";
    let len = Number.MIN_SAFE_INTEGER;
    for(let x of arr) {
        if(x.length > len) {
            len = x.length;
            answer = x;
        }
    }
    

    return answer;
}
let arr = ['teacher', 'time', 'student', 'beautiful', 'good'];
console.log(solution(arr));