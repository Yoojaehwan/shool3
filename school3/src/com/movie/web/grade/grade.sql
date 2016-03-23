--시퀀스 생성
CREATE SEQUENCE score_seq
START WITH 1
INCREMENT BY 1;


drop SEQUENCE score_seq;

CREATE TABLE Grade(
	 score_seq NUMBER PRIMARY KEY,
	 id VARCHAR2(30) NOT NULL,
	 java NUMBER NOT NULL , 
	 sql NUMBER NOT NULL,
	 jsp NUMBER NOT NULL ,
	 spring NUMBER NOT NULL
);

ALTER TABLE Grade RENAME hak TO examseq;


INSERT INTO Grade(score_Seq, id, java, sql, jsp, spring)
VALUES (score_Seq.NEXTVAL, 'hong', 60, 100, 70, 60);
INSERT INTO Grade(score_Seq, id, java, sql, jsp, spring)
VALUES (score_Seq.NEXTVAL, 'kim', 69, 40, 70, 40);
INSERT INTO Grade(score_Seq, id, java, sql, jsp, spring)
VALUES (score_Seq.NEXTVAL, 'lee', 60, 56, 80, 90);
INSERT INTO Grade(score_Seq, id, java, sql, jsp, spring)
VALUES (score_Seq.NEXTVAL, 'cha', 45, 95, 42, 80);
INSERT INTO Grade(score_Seq, id, java, sql, jsp, spring)
VALUES (score_Seq.NEXTVAL, 'park', 70, 65, 30, 100);
INSERT INTO Grade(score_Seq, id, java, sql, jsp, spring)
VALUES (score_Seq.NEXTVAL, 'kim2', 30, 20, 30, 70);
INSERT INTO Grade(score_Seq, id, java, sql, jsp, spring)
VALUES (score_Seq.NEXTVAL, 'hong', 20, 20, 20, 10);



SELECT * FROM Grade;

SELECT * FROM Grade
WHERE id = 'kim2';
TRUNCATE TABLE Grade;

DROP TABLE Grade CASCADE CONSTRAINT;