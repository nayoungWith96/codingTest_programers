package YNY._20240827;

/**
 * packageName    : YNY._20240827
 * fileName       : 공배수
 * author         : User
 * date           : 2024-08-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-29        User       최초 생성
 */
public class 공배수 {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n == 0 && number % m == 0){
            return 1;
        }else{
            return 0;
        }

    }
}
