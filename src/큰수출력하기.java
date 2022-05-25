//큰 수 출력하기
//설명
//
//N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//
//(첫 번째 수는 무조건 출력한다)
//
//
//입력
//첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
//
//
//출력
//자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
//
//

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 큰수출력하기 {

    static String solution(int n, String[] str){
        String answer = str[0]+" ";

        for(int i = 1 ; i < n ; i++){
            if( Integer.parseInt(str[i-1]) < Integer.parseInt(str[i]) ) answer += str[i]+" ";
        }

        return answer;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String s = bufferedReader.readLine();
        String[] str = s.split(" ");
        System.out.println(solution(n, str));
    }
}
