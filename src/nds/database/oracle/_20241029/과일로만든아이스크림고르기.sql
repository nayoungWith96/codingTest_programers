-- 과일로 만든 아이스크림 고르기

-- CREATE TABLE
CREATE TABLE FIRST_HALF (
    SHIPMENT_ID NUMBER NOT NULL,
    FLAVOR VARCHAR2(100) NOT NULL,
    TOTAL_ORDER NUMBER NOT NULL,
    CONSTRAINT FIRST_HALF_PK1 PRIMARY KEY (FLAVOR)
);

CREATE TABLE ICECREAM_INFO (
	FLAVOR VARCHAR(100) NOT NULL,
	INGREDIENT_TYPE VARCHAR(100) NOT NULL,
	CONSTRAINT ICECREAM_INFO_FK1 FOREIGN KEY (FLAVOR) REFERENCES FIRST_HALF(FLAVOR) 
);

-- INSERT DATA
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (101, 'chocolate', 3200);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (102, 'vanilla', 2800);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (103, 'mint_chocolate', 1700);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (104, 'caramel', 2600);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (105, 'white_chocolate', 3100);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (106, 'peach', 2450);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (107, 'watermelon', 2450);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (108, 'mango', 2900);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (109, 'strawberry', 3100);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (110, 'melon', 3150);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (111, 'orange', 2900);
INSERT INTO FIRST_HALF (SHIPMENT_ID, FLAVOR, TOTAL_ORDER) 
VALUES (112, 'pineapple', 2900);

INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('chocolate','sugar_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('vanilla','sugar_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('mint_chocolate','sugar_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('caramel','sugar_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('white_chocolate','sugar_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('peach','fruit_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('watermelon','fruit_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('mango','fruit_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('strawberry','fruit_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('melon','fruit_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('orange','fruit_based');
INSERT INTO ICECREAM_INFO (FLAVOR, INGREDIENT_TYPE)
VALUES ('pineapple','fruit_based');

-- SELECT 문제
/*
 * 상반기 아이스크림 총주문량이 3,000보다 높은 
 * 아이스크림 맛은 chocolate, strawberry, melon, white_chocolate입니다. 
 * 이 중에 아이스크림의 주 성분이 과일인 아이스크림 맛은 strawberry와 melon이고 
 * 총주문량이 큰 순서대로 아이스크림 맛을 조회하면 melon, strawberry 순으로 조회되어야 합니다. 
 * 따라서 SQL 문을 실행하면 다음과 같이 나와야 합니다.
 * */

SELECT F.FLAVOR
FROM FIRST_HALF F LEFT JOIN ICECREAM_INFO I 
ON F.FLAVOR = I.FLAVOR
WHERE F.TOTAL_ORDER > 3000
AND I.INGREDIENT_TYPE LIKE 'fruit_based'
ORDER BY F.TOTAL_ORDER DESC;
