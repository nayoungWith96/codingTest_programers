-- 서울에 위치한 식당 목록 출력하기

-- CREATE TABLE

CREATE TABLE REST_INFO (
	REST_ID	VARCHAR(5) NOT NULL,
	REST_NAME VARCHAR(50) NOT NULL,
	FOOD_TYPE VARCHAR(20),
	VIEWS NUMBER,
	FAVORITES NUMBER,
	PARKING_LOT	VARCHAR(1),
	ADDRESS	VARCHAR(100),
	TEL	VARCHAR(100)
);

CREATE TABLE REST_REVIEW(
REVIEW_ID VARCHAR(10) NOT NULL,
REST_ID	VARCHAR(10),
MEMBER_ID VARCHAR(100),
REVIEW_SCORE NUMBER,
REVIEW_TEXT	VARCHAR(1000),
REVIEW_DATE	DATE
);

-- INSERT DATA

INSERT INTO REST_INFO(REST_ID, REST_NAME, FOOD_TYPE, VIEWS, FAVORITES, PARKING_LOT, ADDRESS,TEL)
VALUES ('00028', '대우부대찌개', '한식', 52310, 10, 'N', '경기도 용인시 처인구 남사읍 처인성로 309', '031-235-1235');
INSERT INTO REST_INFO(REST_ID, REST_NAME, FOOD_TYPE, VIEWS, FAVORITES, PARKING_LOT, ADDRESS,TEL)
VALUES ('00039', '광주식당', '한식', 23001, 20, 'N', '경기도 부천시 산업로8번길 60', '031-235-6423');
INSERT INTO REST_INFO(REST_ID, REST_NAME, FOOD_TYPE, VIEWS, FAVORITES, PARKING_LOT, ADDRESS,TEL)
VALUES ('00035', '삼촌식당', '일식', 532123, 80, 'N', '서울특별시 강서구 가로공원로76가길', '02-135-1266');

INSERT INTO REST_REVIEW(REVIEW_ID, REST_ID, MEMBER_ID, REVIEW_SCORE, REVIEW_TEXT, REVIEW_DATE)
VALUES ('R000000065', '00028', 'soobin97@naver.com', 5, '부찌 국물에서 샤브샤브 맛이나고 깔끔', '2022-04-12');
INSERT INTO REST_REVIEW(REVIEW_ID, REST_ID, MEMBER_ID, REVIEW_SCORE, REVIEW_TEXT, REVIEW_DATE)
VALUES ('R000000066', '00039', 'yelin1130@gmail.com', 5, '김치찌개 최곱니다.', '2022-04-12');
INSERT INTO REST_REVIEW(REVIEW_ID, REST_ID, MEMBER_ID, REVIEW_SCORE, REVIEW_TEXT, REVIEW_DATE)
VALUES ('R000000067', '00028', 'yelin1130@gmail.com', 5, '햄이 많아서 좋아요', '2022-04-22');
INSERT INTO REST_REVIEW(REVIEW_ID, REST_ID, MEMBER_ID, REVIEW_SCORE, REVIEW_TEXT, REVIEW_DATE)
VALUES ('R000000068', '00035', 'ksyi0316@gmail.com', 5, '숙성회가 끝내줍니다.', '2022-04-15');
INSERT INTO REST_REVIEW(REVIEW_ID, REST_ID, MEMBER_ID, REVIEW_SCORE, REVIEW_TEXT, REVIEW_DATE)
VALUES ('R000000069', '00035', 'yoonsy95@naver.com', 4, '비린내가 전혀없어요.', '2022-04-16');

-- SELECT 문제
/*
 * REST_INFO와 REST_REVIEW 테이블에서 서울에 위치한 
 * 식당들의 식당 ID, 식당 이름, 음식 종류, 즐겨찾기수, 주소, 리뷰 평균 점수를 조회하는 SQL문을 작성해주세요. 
 * 이때 리뷰 평균점수는 소수점 세 번째 자리에서 반올림 해주시고 
 * 결과는 평균점수를 기준으로 내림차순 정렬해주시고, 
 * 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬해주세요.
 * */

SELECT I.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS, ROUND(AVG(R.REVIEW_SCORE),2) AS SCORE
FROM REST_INFO I 
JOIN REST_REVIEW R ON I.REST_ID = R.REST_ID
WHERE I.ADDRESS LIKE '서울%'
GROUP BY I.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS
ORDER BY SCORE DESC, FAVORITES DESC;

/*
 * 처음에 LEFT JOIN을 했는데 오답이었다. 이해가 부족 한 것 같다.
 * */