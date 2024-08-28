package nds._20240827;

/**
 * packageName    : nds._20240827
 * fileName       : 공배수
 * author         : ehdtka
 * date           : 2024-08-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-27        ehdtka       최초 생성
 */
public class 공배수 {

    public static void main(String[] args) {
        System.out.println(solution(60,2,3));
        System.out.println(solution(55,10,5));
    }

    public static int solution(int number, int n, int m) {

        if ((number >= 10 && number <= 100) && (n >= 2 && n <= 10) && (m >= 2 && m <= 10)) {

            return number % m == 0 && number % n == 0? 1 : 0;

        } else {
            System.out.println("1번 정수 = 10~100 2번,3번 정수 = 2~10");
            return 0;
        }

    }
}
