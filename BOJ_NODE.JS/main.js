function solution(str) {
    let answer = "";

    for(let i = 0; i < str.length; i++) {
        if(i === str.indexOf(str[i])) answer +=str[i];
    };
    return answer;
}

let str = "ksekkset"
console.log(solution(str));