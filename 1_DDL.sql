-- 테이블 생성 : CREATE TABLE
CREATE TABLE department (
    dept_id number not null,
    dept_name varchar2(50) not null,
    office varchar2(20),
    PRIMARY KEY(dept_id)
);

CREATE TABLE department (
    -- not null : 데이터의 공란을 허용하지 않음
    -- PRIMARY KEY : 테이블의 유일한 값을 가진 컬럼
    -- number : 숫자형 데이터 타입(정수, 실수)
    dept_id number not null PRIMARY KEY,
    -- varchar2 : 문자열의 가변 길이 데이터 타입
    -- 한글은 1글자당 3byte 를 사용함
    dept_name varchar2(50) not null,
    office varchar2(20)
);

-- 주석 
-- 명령문 마지막에는 반드시 ; 을 사용 해야 한다.


CREATE TABLE student (
    stu_id varchar2(10) not null,
    resident_id varchar2(14) not null,
    dept_id number not null,
    -- CONSTRAINT [제약조건이름] : 제약조건
    -- PRIMARY KEY(컬럼명) 
    -- FOREIGN KEY(컬럼명) REFERENCES [다른테이블명](컬럼명)
    CONSTRAINT pk_student PRIMARY KEY(stu_id),
    CONSTRAINT fk_student FOREIGN KEY(dept_id)
    REFERENCES department(dept_id)
    );
    
-- 테이블 수정 : ALTER TABLE 
-- ADD [컬럼명] [데이터타입] [옵션] : 테이블에 컬럼 추가
ALTER TABLE department ADD test varchar2(10);

-- MODIFY [컬럼명] [데이터타입] [옵션] : 테이블에 컬럼 수정
ALTER TABLE department MODIFY test number not null;

ALTER TABLE department MODIFY test date null;

-- DROP COLUMN [컬럼명] : 테이블에 컬럼 삭제
ALTER TABLE department DROP COLUMN test;


-- 테이블 삭제 : DROP TABLE [테이블명]
DROP TABLE department;

-- 외래키로 주키가 등록된 테이블은 삭제가 되지 않는다.
-- 만일 삭제를 하려면 제약 조건을 삭제 해야 한다.
ALTER TABLE student DROP CONSTRAINT fk_student;

DROP TABLE department;







