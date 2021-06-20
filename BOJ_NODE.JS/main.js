function solution(str) {
    let answer;
    let stack = [];
    for(let x of str) {
        if(x === ')') {
            while(stack.pop() !== '('); // )이전의 (까지 제거
        } else stack.push(x);
    }
    answer = stack.join('');
    return answer;
}
let str="(A(BC)D)EF(G(H)(IJ)K)LM(N)";
console.log(solution(str));