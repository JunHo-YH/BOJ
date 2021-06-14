function solution(str) {
    let answer;
    let sH = new Map(); // Map 자료구조
    for(let x of str) {
        if(sH.has(x)) sH.set(x, sH.get(x)+1);
        else sH.set(x, 1);
    }

    let max = Number.MIN_SAFE_INTEGER;
    for(let [key, val] of sH) {
        if(val > max) {
            max = val;
            answer = key;
        }
    }


    return answer;  
}

let str="BACBACCACCBDEDE";
console.log(solution(str));