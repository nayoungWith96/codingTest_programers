package nds._20240829;

/**
 * packageName    : nds._20240829
 * fileName       : 주사위게임2
 * author         : ehdtka
 * date           : 2024-08-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-29        ehdtka       최초 생성
 */
public class 주사위게임2 {

    public static void main(String[] args) {
        System.out.println(solution(2, 6, 1));
        System.out.println(solution(5, 3, 3));
        System.out.println(solution(4, 4, 4));
    }

    public static int solution(int a, int b, int c) {
        int answer = 0;

        if ((a >= 1 && a <= 6) && (b >= 1 && b <= 6) && (c >= 1 && c <= 6)) {

            if (a != b && b != c && a != c) {
                answer = a + b + c;
            } else if (a != b || b != c) {
                answer = a + b + c;
                answer *= (a*a) + (b*b) + (c*c);
            } else if (a == b && b == c) {
                answer = a + b + c;
                answer *= (a*a) + (b*b) + (c*c);
                answer *= (a*a*a) + (b*b*b) + (c*c*c);
            }

        } else {
            System.out.println("1~6");
        }

        return answer;
    }
}
