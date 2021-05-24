function solution(arr) {
    let answer;
    answer = arr.filter((v,i) => {
        if(arr.indexOf(v) === i) return v;
    });
    
    return answer;
}
let arr = ["good", "time", "good", "time", "student"];
console.log(solution(arr));