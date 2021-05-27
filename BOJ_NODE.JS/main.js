function solution(str) {
    let answer = str[0], cnt = 1;

    for(let i = 1; i < str.length; i++) {
        if(str[i] === str[i-1]) {
            cnt++
        }else {
            if(cnt > 1){
                answer+= cnt;
            }
            cnt=1;
        }
        answer += str[i]
    }
    
    return answer;
}
let str = "KKHSSSSSSSE";
console.log(solution(str));