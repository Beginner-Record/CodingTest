//가장 짧은 문자거리
//설명
//
//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//
//문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장짧은문자거리 {

    static int[] solution(String s , char c){
        int[] answer;
        answer = new int[s.length()];
        int p = 1000;
        for (int i = 0 ; i < answer.length ; i++){
            if(s.charAt(i) == c ) p = 0;
            else p += 1;
            answer[i] = p;
        }

        p = 1000;
        for (int i = answer.length-1 ; i >=0  ; i--){
            if(s.charAt(i) == c ) p = 0;
            else if(answer[i] > p) p += 1;
            answer[i] = Math.min(answer[i], p);

        }

        return answer;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        String s = stringTokenizer.nextToken();
        char c = stringTokenizer.nextToken().charAt(0);

        for(int i : solution(s, c)) {
            System.out.print(i+ " ");
        }
    }
}
