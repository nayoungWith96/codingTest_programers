package yny._20240821;

import java.util.Scanner;

/**
 * packageName    : YNY
 * fileName       : 대소문자바꿔서출력하기
 * author         : User
 * date           : 2024-08-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-21        User       최초 생성
 */
public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";

        for(int i=0; i < a.length(); i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
                b += Character.toLowerCase(c); //소문자 -> 대문자 바꿈
            } else{
                b += Character.toUpperCase(c); //대문자 -> 소문자 바꿈
            }
        }
        System.out.println(b);
    }
}
