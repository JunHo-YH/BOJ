function solution(arr) {
    let answer, max = Number.MIN_SAFE_INTEGER;
    for(let x of arr) {
        let sum = x.toString().split('').reduce((a,b)=>a + Number(b), 0)
        console.log(sum)
    }
    return answer;
}
let arr = [128,460,603,40,521,137,123];
console.log(solution(arr));