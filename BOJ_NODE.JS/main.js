function solution(a,b,c) {
    let answer ="Yes", max;
    let sum = a+b+c;
    if(a > b) max = a;
    else max = b;
    if(c > b) max = c;
    if((sum-max) < max) answer = "NO";

    return answer;
}

console.log(solution(13,33,17));