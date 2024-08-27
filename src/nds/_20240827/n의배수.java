package nds._20240827;

/**
 * packageName    : nds._20240827
 * fileName       : n의배수
 * author         : ehdtka
 * date           : 2024-08-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-27        ehdtka       최초 생성
 */
public class n의배수 {

    public static void main(String[] args) {
        int num1 = solution(98, 2);
        int num2 = solution(34, 3);
        System.out.println(num1);
        System.out.println(num2);
    }

    public static int solution(int num, int n) {
        int answer = 0;

        if ((num >= 2 && num <= 100) && (n >= 2 && n <= 9)) {

            return answer = num % n == 0 ? 1 : 0;

        } else {
            System.out.println("1번정수는 2~100 2번정수는 2~9");
            return 0;
        }

    }
}
