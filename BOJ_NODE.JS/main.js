function solution(day, cars) {
    let ban = 0;
    for(let x of cars) {
        if(x % 10 === day) ban++;
    }
    return ban;
}
day = 0;
cars = [12,20,54,30,87,91,30];
console.log(solution(day, cars));