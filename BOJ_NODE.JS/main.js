function solution(str) {
    let answer = "YES";
    let stack = [];
    if(str.length % 2 === 1) return "NO";
    for(let x of str) {
        if(x === '(') stack.push(x);
        else {
            if(stack.length === 0) return "NO";
            stack.pop();
        } 
        if(stack.length > 0) return "NO";
    }


    return answer;
}
let a="(()(()))(()";
console.log(solution(a));