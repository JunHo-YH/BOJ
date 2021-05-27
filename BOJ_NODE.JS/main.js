function solution(arr) {
    let nArr = arr;
    let answer = 0, sum  = 0;
    let sArr = [];
    let cnt = 0;
    for(let i = 0; i < arr.length; i++) {
        while(arr[i] > 0) {
            sum += arr[i] % 10;
            arr[i] /= 10;

        }  
        sArr.push(parseInt(sum));
        for(let x of sArr) {
            if(x === Math.max(...sArr)) {
                cnt++
            }
            
        }    
           
        sum = 0;
    }
    console.log("================");
    if(cnt >= 2) {
        first = sArr.indexOf(Math.max(...sArr))
        last = sArr.lastIndexOf(Math.max(...sArr))
        // answer = arr[first] > arr[last] ? arr[first] : arr[last]
        console.log(nArr[0])
    }
    return answer;

}
let arr = [128,460,603,40,521,137,123];
console.log(solution(arr));