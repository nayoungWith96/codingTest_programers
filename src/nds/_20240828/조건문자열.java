package nds._20240828;

/**
 * packageName    : nds._20240828
 * fileName       : 조건문자열
 * author         : ehdtka
 * date           : 2024-08-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-28        ehdtka       최초 생성
 */
public class 조건문자열 {

    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if ((n >= 1 && n <= 100) && (m >= 1 && m <= 100)) {

            if (ineq.equals(">")) {
                if (eq.equals("=")) {
                    answer = n >= m ? 1 : 0;
                } else {
                    answer = n > m ? 1 : 0;
                }
            } else {
                if (eq.equals("=")) {
                    answer = n <= m ? 1 : 0;
                } else {
                    answer = n < m ? 1 : 0;
                }
            }

        } else {
            System.out.println("정수는 1~100");
            return 0;
        }

        return answer;
    }
}
