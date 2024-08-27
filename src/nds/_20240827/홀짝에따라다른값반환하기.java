package nds._20240827;

/**
 * packageName    : nds._20240827
 * fileName       : 홀짝에따라다른값반환하기
 * author         : ehdtka
 * date           : 2024-08-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-27        ehdtka       최초 생성
 */
public class 홀짝에따라다른값반환하기 {

    public static void main(String[] args) {

        System.out.println(solution(7));
        System.out.println(solution(10));

    }

    public static int solution(int n) {

        if (n >= 1 && n <= 100) {

            int answer = 0;

            if (n % 2 == 0) {
                while (n >= 2) {
                    answer += n * n;
                    n = n - 2;
                }
            } else {
                while (n >= 1) {
                   answer += n;
                   n = n - 2;
                }
            }

            return answer;

        } else {
            System.out.println("입력 정수는 1~100");
            return 0;
        }

    }

}
