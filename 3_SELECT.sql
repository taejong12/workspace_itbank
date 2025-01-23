-- 전체 데이터 조회 : SELECT * FROM [테이블명];
SELECT * FROM department;

-- 특정 컬럼 조회 : SELECT [열이름] FROM [테이블명];
SELECT dept_id FROM department;

-- 여러 컬럼 조회 : SELECT [열이름],[열이름],... FROM [테이블명];
SELECT dept_id, dept_name FROM department;

-- 조건을 이용한 조회 : SELECT * FROM [테이블명] WHERE [조건];
SELECT * FROM department WHERE dept_id=1;
SELECT * FROM department WHERE dept_id>1;

INSERT INTO department(dept_id, dept_name) VALUES(4, '수학과');
INSERT INTO student VALUES('1291001','900424', 3, 1);
INSERT INTO student VALUES('1291002','900305', 3, 2);
INSERT INTO student VALUES('1291003','900424', 1, 3);
INSERT INTO student VALUES('1291004','991021', 4, 1);
INSERT INTO student VALUES('1291005','930504', 2, 2);
INSERT INTO student VALUES('1291006','970105', 2, 3);
INSERT INTO student VALUES('1291007','961101', 3, 1);
INSERT INTO student VALUES('1291008','920214', 2, 2);
INSERT INTO student VALUES('1291009','931224', 4, 3);
INSERT INTO student VALUES('1291010','980824', 1, 1);
INSERT INTO student VALUES('1291011','970625', 1, 2);
INSERT INTO student VALUES('1291012','940721', 2, 3);

SELECT * FROM student;

SELECT * FROM department;
-----------------------------------------------------------
SELECT * FROM student WHERE year > 2;

SELECT DISTINCT dept_id, year FROM student WHERE year > 2;
SELECT DISTINCT year FROM student WHERE year > 2;
SELECT DISTINCT year FROM student;

SELECT stu_id, year FROM student;
SELECT stu_id, year+1 FROM student;

-------------------------------------------------------
-- Quiz
SELECT * FROM student WHERE dept_id=2;

-- 전체 문자열이 숫자로 되어 있으면 숫자로 처리가 가능하다.
SELECT * FROM student WHERE resident_id > 950000;
---------------------------------------------------------
-- 데이터 정렬 : ORDER BY [컬럼명] [ASC|DESC]
SELECT * FROM student;

-- 오름차순 : ASC
SELECT * FROM student ORDER BY stu_id ASC;
-- 내림차순 : DESC
SELECT * FROM student ORDER BY stu_id DESC;

SELECT * FROM student ORDER BY dept_id, year ASC;
SELECT * FROM student ORDER BY dept_id ASC, year DESC;

-- 별칭 사용 : 컬럼명 as 별칭
-- 별칭에서는 문자열 표시는 작은 따옴표를 사용하지 않는다.
SELECT stu_id as 학번, year as 학년 FROM student;

-- 문자열 연결 : 문자열 || 문자열 || 컬럼명
SELECT stu_id || '학번 : ' || year || '학년' FROM student;

-- 연산 : + , - , * , / 
-- AS 연산자는 생략이 가능
SELECT year + 10 as 더하기, year - 10 as 빼기,
    year * 10 as 곱하기, year / 10 as 나누기 FROM student;
    
SELECT year + 10 더하기, year - 10 빼기,
    year * 10 곱하기, year / 10 나누기 FROM student;

-- = : 같다 
-- <>, != : 같지 않다.
SELECT * FROM student WHERE dept_id <> 1;
SELECT * FROM student WHERE dept_id != 1;

-- >, <, >=, <= 
SELECT * FROM student WHERE dept_id < 2;
SELECT * FROM student WHERE dept_id > 2;
SELECT * FROM student WHERE dept_id <= 2;
SELECT * FROM student WHERE dept_id >= 2;

-- BETWEEN a and b : a ~ b 까지
SELECT * FROM student WHERE dept_id BETWEEN 1 and 3;
SELECT * FROM student WHERE dept_id >= 1 and dept_id <= 3;

-- IN(값1, 값2,...) : 값들이 같은지 비교
SELECT * FROM student WHERE dept_id IN (1,3);

-- IS NULL : null 값 인지 비교 
SELECT * FROM department WHERE office IS NULL;

-- LIKE 값 : 값과 같은 값이 포함되어 있는지 ...
SELECT * FROM department;
SELECT * FROM department WHERE dept_name LIKE '전%';
SELECT * FROM department WHERE dept_name LIKE '%전%';
SELECT * FROM department WHERE dept_name LIKE '%전';
SELECT * FROM department WHERE dept_name LIKE '%부';
SELECT * FROM department WHERE dept_name LIKE '_학_';
SELECT * FROM department WHERE dept_name LIKE '%학%';








