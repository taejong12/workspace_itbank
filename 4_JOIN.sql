-- JOIN : 테이블과 테이블의 공통된 컬럼을 이용하여 테이블을 연결하는 방식

-- 곱집합
SELECT * FROM student,department;

-- Equi JOIN : 동등 조인
-- 조인 조건에 정확히 일치하는 경우에 결과를 출력
SELECT * FROM student, department 
    WHERE student.dept_id = department.dept_id;

SELECT * FROM student s, department d
    WHERE s.dept_id = d.dept_id;
    
CREATE TABLE teacher (
    name varchar2(20) not null,
    office varchar2(50) not null
);

INSERT INTO teacher VALUES('홍길동', '302호');
INSERT INTO teacher VALUES('이순신', '403호');
INSERT INTO teacher VALUES('유관순', '303호');

SELECT * FROM student s, department d, teacher t
    WHERE s.dept_id = d.dept_id and d.office = t.office;

SELECT * FROM department WHERE office IS NULL;

-- Outer JOIN : 외부 조인
-- 조인 조건을 만족하지 않는 레코드도 모두 출력
-- 대신 데이터의 양이 적은 쪽에 (+) 기호를 사용
-- student(12) department(4) teacher(3)`
SELECT * FROM student s, department d, teacher t
    WHERE s.dept_id = d.dept_id and d.office = t.office(+);

-- Self JOIN : 자체 조인
-- 자기 자신의 테이블을 이용하여 조인 하는 방식
SELECT s1.stu_id, s1.year, s2.dept_id FROM student s1, student s2
    WHERE s1.dept_id = s1.dept_id;
    
-- 집합 연산자
-- UNION : 중복된 행을 한번만 출력
SELECT dept_id FROM student
    UNION
        SELECT dept_id FROM department;

-- UNION ALL : 중복된 행을 전부 출력
SELECT dept_id FROM student
    UNION ALL
        SELECT dept_id FROM department;

-- INTERSECT : 중복된 행만 출력
SELECT dept_id FROM student
    INTERSECT
        SELECT dept_id FROM department;
        
-- MINUS : 첫번째 SELECT 결과값에 두번째 SELECT 결과값을 뺀 결과 출력
SELECT dept_id FROM student
    MINUS
        SELECT dept_id FROM department;      

--------------------------------------------------------------
-- Quiz
SELECT stu_id, resident_id, dept_id+1 
    FROM student WHERE dept_id=2;

SELECT s.stu_id 학번, d.dept_name 학과명, d.office 호수
    FROM student s, department d
        WHERE stu_id < 1291007 and s.dept_id = d.dept_id;