package YNY._20240826;

/**
 * packageName    : YNY._20240826
 * fileName       : 더크게합치기
 * author         : User
 * date           : 2024-08-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-28        User       최초 생성
 */
public class 더크게합치기 {
    public int solution(int a, int b) {
        int answer = 0;
        String stra = Integer.toString(a); // 정수를 문자열로 바꾸고
        String strb = Integer.toString(b); // 정수를 문자열로 바꾸고

        String ab = stra + strb;
        String ba = strb + stra; // 계산하고

        int numAB = Integer.parseInt(ab);
        int numBA = Integer.parseInt(ba); //다시 또 정수로 바꿔서기

        // 더 큰 값 반환
        return Math.max(numAB, numBA); //뭔가 쉬우면서도 어려움......
    }
}
