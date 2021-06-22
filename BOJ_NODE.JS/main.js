function solution(str) {
    let answer = 0;
    let stack = [];
    for(let i = 0; i < str.length; i++) {
        if(str[i] === '(') stack.push(str[i]);
        else {
            stack.pop();
            if(str[i-1] === '(') answer += (stack.length);
            else answer += 1;
        }
    }
    return answer;
}

let a="()(((()())(())()))(())";
console.log(solution(a));