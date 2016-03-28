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

UPDATE MEMBER SET password ='1' , addr = '도쿄'
WHERE id = 'choi';


SELECT * FROM Member;

SELECT * FROM Member
WHERE id = 'choi';


DELETE FROM Member WHERE id = 'choi';