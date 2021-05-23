function solution(student) {
    answer = student / 12;
    if(student % 12 >= 1) {
        parseInt(answer++);

    }
    return parseInt(answer);
}

console.log(solution(178))