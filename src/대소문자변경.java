//대소문자 변환
//설명
//
//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//
//문자열은 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

//65~90 대문자 아스키코드
//97~122 소문자 아스키코드

import java.util.Scanner;

public class 대소문자변경 {

    static String solution(String str){
        String answer = "";

        for(char t : str.toCharArray()){
            if(t >= 65 && t <= 90) answer += (char)(t +32);
            else answer += (char)(t-32);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
