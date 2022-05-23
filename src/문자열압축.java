//문자열 압축
//설명
//
//알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//
//문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//
//단 반복횟수가 1인 경우 생략합니다.
//
//
//입력
//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 줄에 압축된 문자열을 출력한다.
//
//
//KKHSSSSSSSE
//KKKKKDDDDDKDDDKKSKKFJKKKKSLSSSSKFKSSSS

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문자열압축 {

    static String solution(String str) {
        String answer = "";
        int tmp = 1;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                answer += chars[i];
                if (chars[i] == chars[i - 1]) answer += tmp;
            } else if (chars[i] != chars[i + 1]) {
                answer += chars[i];
                if (tmp != 1) answer += tmp;
                tmp = 1;
            } else {
                tmp++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        System.out.println(solution(str));
    }
}
