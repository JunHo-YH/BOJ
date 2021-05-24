function solution(arr) {
    let sum = 0;
    let oddArr = [];
    arr.forEach(num => {
        if(num % 2 == 1 ) {
            sum += num;
            oddArr.push(num);
        };
    });
    console.log(sum);
    console.log(Math.min(...oddArr));
};
let arr = [12,77,38,41,53,92,85];
solution(arr);