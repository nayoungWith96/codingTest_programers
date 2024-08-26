package nds._20240826;

/**
 * packageName    : nds
 * fileName       : 두수의연산값비교하기
 * author         : ehdtka
 * date           : 2024-08-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-26        ehdtka       최초 생성
 */
public class 두수의연산값비교하기 {

    public static void main(String[] args) {
        int a = solution(2, 91);
        int b = solution(91, 2);

        System.out.println(a);
        System.out.println(b);

    }

    public static int solution(int a, int b) {
        int answer = 0;
        int num1;
        int num2;
        if ((a >= 1 && a <= 10000) && (b >= 1 && b <= 10000)) {
            num1 = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
            num2 = 2 * a * b;

            if (num1 > num2 || num1 == num2) {
                return num1;
            } else {
                return num2;
            }
        } else {
            System.out.printf("정수는 사이에 입력해주세요 1~10000");
            return 0;
        }
    }
}
