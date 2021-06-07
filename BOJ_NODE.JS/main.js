function solution(arr) {
    let answer = 1;
    let tall = arr[0];
    for(let i = 1; i < arr.length; i++) { 
        if(arr[i] > tall) {
            tall = arr[i]; // 가장 큰 키 갱신
            answer++;
        }        
    } 
    
    return answer;
}
let arr = [130,135,148,140,145,150,150,153];
console.log(solution(arr));