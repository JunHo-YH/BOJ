function solution(m, arr1) {
    let answer = 0, lt = 0, sum = 0;
    for(let rt = 0; rt < arr1.length; rt++) {
        sum += arr1[rt];
        if(sum === m) answer++;
        while(sum >= m) {
            sum -= arr1[lt++];
            if(sum === m) answer++;
        }
    }

    return answer;
};

let a = [1,2,1,3,1,1,1,2]
console.log(solution(6, a));