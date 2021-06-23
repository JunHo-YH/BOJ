function solution(arr) {
    let answer;
    let sArr = Array.from(arr).sort((a,b) => a - b);

    sArr = sArr.join(' ');
    console.log(sArr);

    return answer;
}

let arr=[13, 5, 11, 7, 23, 15];
console.log(solution(arr));