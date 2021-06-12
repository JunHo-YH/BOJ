function solution(n, k, card) {
    let answer;
    let tmp = new Set(); // 중복제거 되는 Set자료구조
    // console.log(tmp)
    for(let i = 0; i < n-2; i++) {
        for(let j = i+1; j < n-1; j++) {
            for(let k = j+1; k < n; k++) {
                tmp.add(card[i] + card[j] + card[k]);
            }
        }
    }
    let a = Array.from(tmp); // 내림차순 정렬
    console.log(a)
    answer = a[k-1]

    return answer;
}
    let arr=[13, 15, 34, 23, 45, 65, 33, 11, 26, 42];
console.log(solution(10, 3, arr));

