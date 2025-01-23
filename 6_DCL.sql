-- DCL 

-- 사용자 생성
-- CREATE USER c##계정명 IDENTIFIED BY 비밀번호;
CREATE USER c##user01 IDENTIFIED BY 1234;

-- GRANT : 권한 부여
-- CONNECT : 접근 권한
-- RESOURCE : 테이블, 뷰, 시퀀스 등 객체를 생성할 수 있는 권한
GRANT CONNECT, RESOURCE TO c##user01;

-- GRANT DBA TO 계정명 : 데이터베이스 관리자 권한 

-- INSERT, SELECT, UPDATE, DELETE : 각 권한을 따로 부여 할 수 있다.
-- GRANT SELECT ON [테이블명] TO [계정명]

-- GRANT CREATE SESSION TO [계정명] : 데이터베이스 연결 권한
-- GRANT CREATE TABLE TO [계정명] : 테이블 생성 권한

-- 사용자 확인
SELECT username, account_status FROM dba_users
    WHERE username = 'C##USER01';

-- 사용자 잠금
ALTER USER c##user01 ACCOUNT LOCK;

-- 사용자 잠금 해제
ALTER USER c##user01 ACCOUNT UNLOCK;

-- REVOKE : 권한 회수
REVOKE CONNECT, RESOURCE FROM c##user01;

-- 사용자 삭제
DROP USER c##user01;
---------------------------------------------------------

-- TCL
-- 트랜잭션 : 하나의 기능을 완료 또는 롤백 
-- commit : 완료
-- rollback : 되돌리기
commit;
select * from department;
INSERT INTO department VALUES('5', '건축과', '203호');
select * from department;
commit;
INSERT INTO department VALUES(6, '전자공학', '503호');
select * from department;
rollback;
select * from department;

ALTER USER C##TJPost DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;