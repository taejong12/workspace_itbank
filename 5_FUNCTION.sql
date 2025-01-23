-- 내장함수
-- 오라클에서 데이터를 편리하게 조작할 수 있도록 제공하는 함수

-- 1. 단일행 함수
-- 문자 타입 함수
-- LOWER, UPPER : 전체 문자열을 소문자 또는 대문자로 변환
SELECT LOWER('ABCD'), UPPER('abcd') FROM DUAL;

-- DUAL 테이블 : 더미 테이블로 테스트 용도의 테이블(데이터는 없음)
-- INITCAP : 첫 문자는 대문자로 변환
SELECT INITCAP('abcd efg') FROM DUAL;

-- SUBSTR(시작위치, 문자갯수)
-- 문자열의 일부분을 선택 : 오라클은 1부터 시작
SELECT SUBSTR('ABCDEFG', 1, 4) FROM DUAL;
SELECT SUBSTR('ABCDEFG', 2, 4) FROM DUAL;

-- REPLACE('문자열', '찾는문자열', '변경할문자열')
-- 문자열에서 찾는 문자열을 변경할 문자열로 대체함
-- 찾는 문자열이 문자열에서 여러 번 반복되더라도 같은 문자열은 다 변경 된다.
SELECT REPLACE('ABCDABCD', 'AB', 'ZY') FROM DUAL;

-- CONCAT : 문자열 연결
SELECT CONCAT('AB','CD'), 'AB'||'CD' FROM DUAL;

-- LENGTH : 문자열의 길이 반환
SELECT LENGTH('ABCD') FROM DUAL;

-- INSTR : 찾는 문자열의 위치값 반환
-- 찾는 문자열의 제일 첫 위치값만 반환
SELECT INSTR('ABCDABCD', 'A') FROM DUAL;

-- LPAD, RPAD : 왼쪽 또는 오른쪽에 특정 문자로 빈자리를 채움
SELECT LPAD('ABCD', 6, '*'), RPAD('ABCD', 6, '*') FROM DUAL;

-- LTRIM, RTRIM
-- 왼쪽 또는 오른쪽 공백 또는 특정 문자를 제거 할 수 있다.
SELECT LTRIM(' 홍길동 ', ' '), LTRIM('ABCDE', 'A'),
    RTRIM(' 홍길동 ', ' '), RTRIM('ABCDE', 'E'),
        TRIM(' 홍길동 ') FROM DUAL;

-- 숫자 타입 함수
-- ROUND : 소수점 자리 반올림 
-- TRUNC : 소수점 자리 버림
SELECT ROUND(12.345678, 1), ROUND(12.345678, 2), 
    ROUND(12.345678, 3), ROUND(12.345678, 4),
    TRUNC(12.345678, 1), TRUNC(12.345678, 2), 
    TRUNC(12.345678, 3), TRUNC(12.345678, 4) FROM DUAL;

-- MOD : 나눈 후 나머지 값 
SELECT MOD(10, 3), MOD(15,2), MOD(5,4) FROM DUAL;

-- CEIL, FLOOR : 정수형으로 올림하거나 버림
SELECT CEIL(15.1), CEIL(15.9), FLOOR(15.1), FLOOR(15.9),
    ROUND(15.1, 0), ROUND(15.9, 0), TRUNC(15.9, 0) FROM DUAL;

-- SIGN : 양수면 1, 음수면 -1, 0 이면 0
SELECT SIGN(10), SIGN(-10), SIGN(0) FROM DUAL;

-- POWER : 거듭제곱 
SELECT POWER(2,3), POWER(3,3) FROM DUAL;

-- SQRT : 제곱근
SELECT SQRT(4), SQRT(2) FROM DUAL;

-- 날짜 타입 함수a
SELECT SYSDATE FROM DUAL; -- 시스템의 날짜
SELECT SYSDATE + 10 FROM DUAL;
SELECT SYSDATE - 10 FROM DUAL;
SELECT SYSDATE - TO_DATE('2025.01.01') FROM DUAL;
SELECT SYSDATE + 4/24 FROM DUAL;

-- MONTHS_BETWEEN(date, date) : date 간의 월 수 
SELECT MONTHS_BETWEEN(SYSDATE, TO_DATE('2025.2.01')) FROM DUAL;

-- ADD_MONTHS(date, 개월수) : 월을 날짜에 더해 준다.
SELECT ADD_MONTHS(SYSDATE, 5) FROM DUAL;

-- NEXT_DAY : 다음 돌아오는 요일
-- 1: 일요일 ~ 7 : 토요일
SELECT NEXT_DAY(SYSDATE, 3) FROM DUAL;

-- LAST_DAY : 월의 마지막 일자 출력
SELECT LAST_DAY(SYSDATE) FROM DUAL;

-- ROUND : 날짜를 가장 가까운 연도 또는 월로 반올림
SELECT ROUND(SYSDATE, 'MONTH') FROM DUAL;
SELECT ROUND(SYSDATE, 'YEAR') FROM DUAL;
SELECT ROUND(TO_DATE('2024.12.10'), 'MONTH') FROM DUAL;
SELECT ROUND(TO_DATE('2024.12.10'), 'YEAR') FROM DUAL;


SELECT TRUNC(SYSDATE, 'MONTH') FROM DUAL;
SELECT TRUNC(SYSDATE, 'YEAR') FROM DUAL;
SELECT TRUNC(TO_DATE('2024.12.10'), 'MONTH') FROM DUAL;
SELECT TRUNC(TO_DATE('2024.12.10'), 'YEAR') FROM DUAL;

-- 데이터 변환 함수
-- TO_CHAR() : 문자열 변환 함수
-- TO_NUMBER() : 문자열을 숫자로 변환 함수
-- TO_DATE() : 문자열을 날짜로 변환 함수
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY.MM.DD') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'YYYY"년" MM"월" DD"일"') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'HH24"시" MI"분" SS"초"') FROM DUAL;
SELECT SYSDATE, TO_CHAR(SYSDATE, 'AM HH12"시" MI"분" SS"초"') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'DAY'), TO_CHAR(SYSDATE, 'DY') FROM DUAL;

SELECT TO_CHAR(12345, '99999999') FROM DUAL;
SELECT TO_CHAR(12345, '09999999') FROM DUAL;
SELECT TO_CHAR(12345, '$9999999') FROM DUAL;
SELECT TO_CHAR(12345, '$0999999') FROM DUAL;
SELECT TO_CHAR(12345, 'L9999999') FROM DUAL;
SELECT TO_CHAR(12345, 'L0999999') FROM DUAL;
SELECT TO_CHAR(12345, '999999.99') FROM DUAL;
SELECT TO_CHAR(12345, '099999.99') FROM DUAL;
SELECT TO_CHAR(12345, '99,999,999') FROM DUAL;
SELECT TO_CHAR(12345, '09,999,999') FROM DUAL;

-- 숫자 변환 함수에서 문자열에 숫자가 아닌 문자가 포함되면 에러가 발생
SELECT '123'+123, TO_NUMBER('123')+123 FROM DUAL;
SELECT '1.23'+ 10, TO_NUMBER('1.23') + 10 FROM DUAl;

-- 날짜 변환 함수는 문자열을 날짜 변환
SELECT TO_DATE('2025-01-01') FROM DUAL;
SELECT TO_DATE('2025/01/01') FROM DUAL;
SELECT TO_DATE('20250101') FROM DUAL;

-- NVL(컬럼, 값) : 지정한 값으로 null 값을 치환 해 주는 함수
SELECT year, NVL(year, 3) FROM student;
SELECT dept_id, dept_name, 
    NVL(office, '지정안됨') FROM department;

-- NVL2(컬럼, 값1, 값2) 
-- null 값이 아니면 면 값1로 치환, null이면 값2로 치환
SELECT dept_id, dept_name, office,
    NVL2(office, 'Y', 'N') 배정 FROM department;
    
-- DECODE(컬럼, 컬럼의 특정값, 치환값, 기본값) 
-- 컬럼에서 특정값의 조건이 맞으면 치환값으로 치환되고
-- 그렇지 않으면 기본값으로 치환 된다.
SELECT stu_id, year, DECODE(year, 3, '졸업반', '새내기') 
    FROM student;
    
-- CASE WHEN THEN : switch case 같은 형태 
-- 마지막에는 반드시 END 붙여야 한다.
SELECT stu_id, resident_id, dept_id,
CASE 
    WHEN dept_id=1 THEN '컴퓨터 공학부'
    WHEN dept_id=2 THEN '전기전자 공학부'
    WHEN dept_id=3 THEN '데이터 사이언스'
    ELSE '수학과'
END FROM student;

-------------------------------------------------------
CREATE TABLE agelist (
    name varchar2(50),
    age number
);

INSERT INTO agelist VALUES('홍길동', 20);
INSERT INTO agelist VALUES('이순신', 22);
INSERT INTO agelist VALUES('아이유', 19);
INSERT INTO agelist VALUES('유재석', 20);
INSERT INTO agelist VALUES('강호동', 24);

-- RANK : 공동 순위가 있고 공동 순위의 수만큼 다음 등수가 결정 
-- DENSE_RANK : 공동 순위가 있고 바로 다음 등수가 결정
-- ROW_NUMBER : 공동 순위 없이 출력
SELECT name,
    RANK() OVER(ORDER BY age DESC) AS RANK나이순,
    DENSE_RANK() OVER(ORDER BY age DESC) AS DENSE나이순,
    ROW_NUMBER() OVER(ORDER BY age DESC) AS ROW나이순
    FROM agelist;
    
----------------------------------------------------------------
-- 2. 그룹 함수
-- 그룹함수는 한 행에 대한 결과값이 아니라 그룹을 형성해서 그 그룹에 대한
-- 결과값을 나타내주는 함수

-- count() : 테이블의 행의 수를 반환
SELECT count(*) FROM student;
SELECT count(stu_id) FROM student;
SELECT count(*) FROM department;
SELECT count(office) FROM department;

-- sum() : 컬럼의 데이터의 합산 반환
SELECT sum(year) FROM student;
SELECT sum(stu_id) FROM student;

-- avg() : 컬럼의 데이터의 평균값 반환
SELECT avg(year) FROM student;
SELECT avg(stu_id) FROM student;

-- max() : 컬럼의 데이터 중 제일 큰 값 반환
SELECT max(year) FROM student;
SELECT max(dept_name) FROM department;

-- min() : 컬럼의 데이터 중 제일 작은 값 반환
SELECT min(year) FROM student;
SELECT min(dept_name) FROM department;

-- stddev : 표준 편차를 반환
SELECT stddev(year) FROM student;
SELECT stddev(stu_id) FROM student;

-- variance : 분산 값을 반환
SELECT variance(year) FROM student;
SELECT variance(stu_id) FROM student;

-- GROUP BY 절
-- 그룹화 할 컬럼을 지정하는 것
-- ORDER BY [열이름]; 만 쓸 경우 자동으로 ASC (오름차순)
SELECT dept_id, count(dept_id) FROM student
    GROUP BY dept_id ORDER BY dept_id;

SELECT dept_id, year, count(dept_id) from student
    GROUP BY dept_id, year ORDER BY dept_id;

-- HAVING 절 : 그룹화 함수의 조건을 추가 할 수 있다.
SELECT dept_id, year, count(dept_id) from student
    GROUP BY dept_id, year HAVING year=2 
        ORDER BY dept_id;
---------------------------------------------------------
DROP TABLE customer;
CREATE TABLE customer (
    cus_id number not null PRIMARY KEY,
    cus_name varchar2(50) not null,
    cus_price number not null,
    cus_purchase number not null
);

-- SEQUENCE : 자동으로 값(정수)을 생성
-- CREATE SEQUENCE [시퀀스 이름]
-- START WITH [숫자] : 시작 값
-- INCREMENT BY [숫자] : 증가 값
-- MINVALUE [숫자] : 최소값
-- MAXVALUE [숫자] : 최대값
-- CYCLE : 최대값에 도달하면 다시 최소값으로 순환(NO CYCLE)
-- CACHE [숫자] : 성능 최적화 (NO CACHE)

CREATE SEQUENCE my_sequence;
SELECT my_sequence.currval FROM dual;
SELECT my_sequence.nextval FROM dual;

CREATE SEQUENCE cus_seq 
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 100;

INSERT INTO customer VALUES(cus_seq.nextval, '홍길동', 10000, 2);
INSERT INTO customer VALUES(cus_seq.nextval, '이순신', 5000, 1);
INSERT INTO customer VALUES(cus_seq.nextval, '홍길동', 15000, 3);
INSERT INTO customer VALUES(cus_seq.nextval, '김유신', 8000, 1);
INSERT INTO customer VALUES(cus_seq.nextval, '김유신', 6000, 3);
INSERT INTO customer VALUES(cus_seq.nextval, '이순신', 18000, 5);
INSERT INTO customer VALUES(cus_seq.nextval, '홍길동', 15000, 2);
INSERT INTO customer VALUES(cus_seq.nextval, '김유신', 20000, 5);
INSERT INTO customer VALUES(cus_seq.nextval, '홍길동', 7000, 1);
INSERT INTO customer VALUES(cus_seq.nextval, '이순신', 4000, 1);

SELECT * FROM customer;

--------------------------------------------------------
Quiz
1. 모든 총 금액 출력
2. 홍길동의 총 합계 금액 출력
3. cus_purchase 의 합이 많은 순으로 출력
4. 사람들마다 cus_puschase 합이 낮은 순으로 출력
5. 이름 순으로 금액 합계 출력
--------------------------------------------------------
1.
SELECT SUM(cus_price) FROM customer;
2.
SELECT SUM(cus_price) FROM customer WHERE cus_name='홍길동';
SELECT SUM(cus_price) FROM customer GROUP BY cus_name 
    HAVING cus_name='홍길동';
3.
SELECT cus_name, SUM(cus_purchase) FROM customer  
    GROUP BY cus_name ORDER BY sum(cus_purchase) desc;
4. 
SELECT cus_name, SUM(cus_purchase) FROM customer  
    GROUP BY cus_name ORDER BY sum(cus_purchase);
SELECT cus_name, SUM(cus_price) FROM customer  
    GROUP BY cus_name ORDER BY sum(cus_price);

5. 
SELECT cus_name, SUM(cus_price) FROM customer  
    GROUP BY cus_name ORDER BY cus_name;