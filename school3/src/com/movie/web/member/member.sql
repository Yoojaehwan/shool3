SELECT * FROM TEST;
CREATE TABLE Member(
	 id VARCHAR2(30) PRIMARY KEY,
	 name VARCHAR2(30) NOT NULL,
	 password VARCHAR2(30) NOT NULL, 
	 addr VARCHAR2(100) NOT NULL,
	 birth NUMBER  NOT NULL
);

INSERT INTO Member(id, name, password, addr, birth)
VALUES ('hong', '홍길동', '1', '서울', 800101);
INSERT INTO Member(id, name, password, addr, birth)
VALUES ('kim', '김유신', '1', '경기', 900224);
INSERT INTO Member(id, name, password, addr, birth)
VALUES ('lee', '이순신', '1', '부산', 880909);
INSERT INTO Member(id, name, password, addr, birth)
VALUES ('cha', '차두리', '1', '대전', 820115);
INSERT INTO Member(id, name, password, addr, birth)
VALUES ('park', '박지성', '1', '인천', 810221);
INSERT INTO Member(id, name, password, addr, birth)
VALUES ('kim2', '김유신', '1', '제주', 981210);
INSERT INTO Member(id, name, password, addr, birth)
VALUES ('yoo', '유아인', '1', '강릉', 860205);

UPDATE MEMBER SET subject ='java/jsp/sql/spring' , major = 'computer' WHERE id = 'lee';
UPDATE MEMBER SET subject ='java/jsp/sql/spring' , major = 'computer' WHERE id = 'cha';
UPDATE MEMBER SET subject ='java/jsp/sql/spring' , major = 'computer' WHERE id = 'park';
UPDATE MEMBER SET subject ='java/jsp/sql/spring' , major = 'info' WHERE id = 'kim2';
UPDATE MEMBER SET subject ='java/jsp/sql/spring' , major = 'info' WHERE id = 'yoo';
UPDATE MEMBER SET subject ='java/jsp/sql/spring' , major = 'security' WHERE id = 'kim';
UPDATE MEMBER SET subject ='java/jsp/sql/spring' , major = 'security' WHERE id = 'hong';



SELECT * FROM Member;

SELECT * FROM Member
WHERE id = 'choi';


DELETE FROM Member WHERE id = 'choi';





-- DDL 테이블 수정


--1. 컬럼추가
ALTER TABLE Member ADD subject varchar2(100); -- java/sql/spring
ALTER TABLE Member ADD major varchar2(20); 

--2. 컬럼 수정(이름)
ALTER TABLE Member  RENAME COLUMN password TO passl

--3. 컬럼 수정(타입)
ALTER TABLE Member MODIFY birth DATE;