function solution() {
    /* 
    <<정규식 표현>>
str.replace(/A/gi, '#');   모든 A를 #으로 바꾼다.

※나누기(/)표시안에 넣는 텍스트의 따옴표는 없어야 한다는 점
g : 전체 모든 문자열을 변경 global
i : 영문 대소문자를 무시, 모두 일치하는 패턴 검색 ignore




※ 공백제거 정규식
https://webisfree.com/2014-08-29/[javascript]-%EA%B3%B5%EB%B0%B1(%EB%B9%88%EA%B3%B5%EA%B0%84)-%EB%AC%B8%EC%9E%90-%EC%A0%9C%EA%B1%B0%ED%95%98%EA%B8%B0-%EC%97%86%EC%95%A0%EA%B8%B0-%EC%A0%95%EA%B7%9C%ED%91%9C%ED%98%84%EC%8B%9D-%EC%82%AC%EC%9A%A9

<<안정적인 초기화>>
Number.MAX_SAFE_INTEGER;

<<최솟값>>
Math.min(a, b, c);
Math.min(...arr);
Math.min.apply(null, arr);

<< 총합 구하기_reduce>>
let sum = arr.reduce((a,b)=>a+b, 0); // 총합 구하기

<<배열>>
특정 원소 제거
arr.splice(idx,1);

문자를 기준으로 배열 만들기
str.split(find)

<<문자열 자르기>>
str.substr(idx,뽑아낼 개수);
str.substring(idx, idx+1);
str.slice(idx, idx+1);

<<문자 찾기>>
str.indexOf('k',어디부터(생략가능));
ex) str.indexOf('k',1) => 1번 인덱스부터 k의 위치를 반환해라
<<소수점>>
Math.ceil();
Math.round();
Math.floor();

<<대소문자 변환>>
x.toUpperCase();


<<ASCII>
대문자 : 65 ~ 90
소문자 : 97 ~ 122
서로 바꾸려면 String.fromCharCode(num +-32);
※charCodeAt(): 아스키 번호로 변환
    
    */


};
console.log(solution());

