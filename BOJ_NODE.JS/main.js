function solution(numbers, hand) {
    var answer = [];
    let phone = [[1,2,3], [4,5,6], [7,8,9],["*",0,"#"]];

    let currPos = {ax:phone[3][0], ay:phone[3][2]};
    console.log(currPos);
    let ax = [-1, 0, 1, 0]; // 행 탐색
    let ay = [0, 1, 0, -1]; // 열 탐색
    // for(let x of numbers) {
    //     if(x === 1 || x === 4 || x === 7) answer.push("L");
    //     else if(x === 3 || x === 6 || x === ) answer.push("R");
    //     else {
    //         for(let i = 0; i < numbers.length; i++) {
                
    //         }
    //     }
    // }


    return answer;
}

let numbers = [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5];
let hand = "right";
console.log(solution(numbers, hand));