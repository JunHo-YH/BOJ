function solution(a, b, c) {
    answer = '';
    if(a > b) answer = a;
    else answer = b;
    if(c > answer) answer = c;

    if(answer === a) {
        if(answer < b + c) {
            return answer = "Yes";
        }else {
            return answer = "NO";
        }
    } else if(answer === b) {
        if(answer < a + c) {
            return answer = "Yes";
        }else {
            return answer = "NO";
        }
    }else {
        if(answer < b + c) {
            return answer = "Yes";
        }else {
            return answer = "NO";
        }
    }
    return answer;
}
console.log(solution(13,33,17));