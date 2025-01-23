-- DML : 데이터 조작어 
-- select(검색), insert into(삽입), update(수정), delete from(삭제)

-- DML 은 DDL로 정의된 테이블이 존재해야 데이터를 입력할 수 있다.
DROP TABLE student;
DROP TABLE member;
DROP TABLE department;

CREATE TABLE department(
    dept_id number not null PRIMARY KEY,
    dept_name varchar2(50) not null,
    office varchar2(50)
);


-- 데이터 입력(삽입)
-- insert into [테이블명](컬럼목록) values(데이터 목록)
-- 오라클에서 문자열은 작은따옴표(') 를 사용한다.
INSERT INTO department(dept_id, dept_name, office)
    values (1, '컴퓨터 공학부', '302호');
INSERT INTO department values(2, '전기전자공학부', '403호');
INSERT INTO department values(3, '데이터 싸이언스', '303호');
INSERT INTO department(dept_id, dept_name) 
    values(4, '수학과');

CREATE TABLE student (
    stu_id varchar2(10) not null,
    resident_id varchar2(10) not null,
    dept_id number not null,
    year char(1)
);

INSERT INTO student values('1292001', '900424', 3, '1');
INSERT INTO student values('1292002', '900305', 3, '2');
INSERT INTO student values('1292003', '991021', 4, '3');

ALTER TABLE student MODIFY stu_id varchar2(10) PRIMARY KEY;
ALTER TABLE student MODIFY dept_id number 
    REFERENCES department(dept_id);

----------------------------------------------------------
-- Quiz1
CREATE TABLE test_member (
    id varchar2(10) not null PRIMARY KEY,
    pw varchar2(10) not null,
    name varchar2(15) not null,
    birth date not null,
    gender char(1) not null,
    email varchar2(20) 
);

INSERT INTO test_member values('bae', 'bae1234', '배수지', 
    '2000.03.12', 'W', 'bae@it-kys.com');
INSERT INTO test_member(id, pw, name, birth, gender)
    values('you', 'you1234', '유재석', '1997.07.18', 'M');
INSERT INTO test_member values('kang', 'kang1234', '강호동', 
    '1992.11.30', 'M', 'kang@it-kys.com');
INSERT INTO test_member(id, pw, name, birth, gender)
    values('park', 'park1234', '박보영', '1995.08.14', 'W');

ALTER TABLE test_member MODIFY birth varchar2(12);
ALTER TABLE test_member ADD birth1 varchar2(12) default '2000.01.01';
UPDATE test_member set birth1 = birth;
ALTER TABLE test_member DROP COLUMN birth;


-- 데이터 수정 : update [테이블명] set [컬럼]=값 where [조건]
-- where [조건] 이 없으면 모든 레코드에 적용 된다.
UPDATE student SET year = year + 1;

-- where [컬럼]=값 : 컬럼의 값에 해당하는 데이터만 선택
UPDATE department set dept_name='컴퓨터 과학부'  
    where dept_id = 1;

-- 데이터 삭제 : DELETE FROM [테이블명] where [조건]
-- where [조건] 은 동일하게 선택된 컬럼의 값만 삭제
-- 조건이 없으면 모든 레코드가 삭제된다.
-- 외래키가 적용 될 경우 삭제가 불가능 하다. 
-- 먼저 외래키로 지정된 데이터를 삭제하면 삭제 가능하다.
DELETE FROM department WHERE dept_id = 4;
DELETE FROM student;
DELETE FROM department WHERE dept_id = 4;

------------------------------------------------------
-- Quiz2
ALTER TABLE test_member DROP COLUMN gender;
ALTER TABLE test_member ADD gender int default 0;

UPDATE test_member set gender=1 where id='you' or id='kang';
UPDATE test_member set gender=2 where id='bae' or id='park';

-- 답
UPDATE test_member set gender=gender-1;
UPDATE test_member set gender=2 where id='you';
UPDATE test_member set email='you@it-kys.com' where id='you';
UPDATE test_member set gender=2, email='you123@it-kys.com'
    WHERE id='you';
UPDATE test_member SET gender=1 WHERE gender=0;
UPDATE test_member SET pw='1111', gender=0 WHERE id='kang';
DELETE FROM test_member WHERE pw='park1234';






