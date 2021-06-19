function compareMaps(map1, map2) {
    if(map1.size !== map2.size) return false;
    for(let [key, val] of map1) {
        if(!map2.has(key) || map2.get(key) !== val) return false;
    }
    return true;
}
function solution(s, t) {
    let answer = 0;
    let th = new Map();
    let sh = new Map();
    for(let x of t) {
        if(th.has(x)) th.set(x, th.get(x)+1);
        else th.set(x, 1);
    }
    let len = t.length - 1; // 왜?
    for(let i = 0; i < len; i++) {
        if(sh.has(s[i])) sh.set(s[i], sh.get(s[i]) + 1);
        else sh.set(s[i], 1);
    }
    let lt = 0;
    for(let rt = len; rt < s.length; rt++) {
        if(sh.has(s[rt])) sh.set(s[rt], sh.get(s[rt]) + 1);
        else sh.set(s[rt], 1);
        if(compareMaps(sh, th)) answer++;
        sh.set(s[lt], sh.get(s[lt]) - 1);
        if(sh.get(s[lt]) === 0) sh.delete(s[lt]);
        lt++;
    }    


    return answer;
}

let a="bacaAacba";
let b="abc";
console.log(solution(a, b));